/**
 * WFSPlugIn.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * (c) 2007 by lat/lon GmbH
 *
 * @author Ugo Taddei (taddei@latlon.de)
 *
 * This program is free software under the GPL (v2.0)
 * Read the file LICENSE.txt coming with the sources for details.
 */
package de.latlon.deejump.wfs.plugin;

import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Collection;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.deegreewfs.datatypes.QualifiedName;
import org.deegreewfs.framework.util.StringTools;
import org.deegreewfs.model.spatialschema.JTSAdapter;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jump.feature.FeatureCollection;
import com.vividsolutions.jump.task.TaskMonitor;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.WorkbenchException;
import com.vividsolutions.jump.workbench.model.LayerManager;
import com.vividsolutions.jump.workbench.model.StandardCategoryNames;
import com.vividsolutions.jump.workbench.plugin.EnableCheck;
import com.vividsolutions.jump.workbench.plugin.EnableCheckFactory;
import com.vividsolutions.jump.workbench.plugin.MultiEnableCheck;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.plugin.ThreadedBasePlugIn;
import com.vividsolutions.jump.workbench.ui.LayerViewPanel;
import com.vividsolutions.jump.workbench.ui.WorkbenchFrame;
import com.vividsolutions.jump.workbench.ui.plugin.PersistentBlackboardPlugIn;

import de.latlon.deejump.wfs.client.AbstractWFSWrapper;
import de.latlon.deejump.wfs.data.JUMPFeatureFactory;
import de.latlon.deejump.wfs.i18n.I18N;
import de.latlon.deejump.wfs.jump.WFSLayer;
import de.latlon.deejump.wfs.jump.WFSLayerListener;
import de.latlon.deejump.wfs.ui.WFSDialog;
import de.latlon.deejump.wfs.ui.WFSPanel;

/**
 * JUMP plug-in providing a GUI for complex filter operations. Whole process is controlled by a
 * FeatureResearchDialog. This contains two panel, one for attribute-based (re-)search and the other
 * allowing the user to choose the spatial operation to be performed (when he has selected a
 * geometry on the map view).
 * 
 * @author <a href="mailto:taddei@lat-lon.de">Ugo Taddei</a>
 * 
 */
public class WFSPlugIn extends ThreadedBasePlugIn {

    private static Logger LOG = Logger.getLogger( WFSPlugIn.class );

    private WFSDialog rd;

    private String wfsUrl;

    @Override
    public void initialize( PlugInContext context )
                            throws Exception {
        WorkbenchContext wbcontext = context.getWorkbenchContext();

        // only active if there's a map panel
        MultiEnableCheck mec = createEnableCheck( wbcontext );

        wbcontext.getWorkbench().getFrame().getToolBar("Plugin").addPlugIn( getIcon(), this, mec, wbcontext );

        // also create menu item
        /*
         * Disabled due to incompatibility to Vivid solutions JUMP1.2 SH, 2007-05-08
         * context.getFeatureInstaller().addMainMenuItem(this, new String[] { MenuNames.LAYER },
         * getName(), false, getIcon(), mec);
         */
    }

    @Override
    public synchronized boolean execute( PlugInContext context )
                            throws Exception {

        if ( rd == null ) {
            rd = new WFSDialog( context.getWorkbenchContext(), context.getWorkbenchFrame(),
                                I18N.getString( "WFSResearchPlugIn.mainDialogTitle" ),
                                createUrlList( context.getWorkbenchContext() ) );
        }

        LayerViewPanel lvPanel = (LayerViewPanel) context.getLayerViewPanel();
        WFSPanel pnl = rd.getWFSPanel();
        // get selected geometry(ies)
        Collection<?> geoCollec = lvPanel.getSelectionManager().getFeatureSelection().getSelectedItems();
        // then make GML out of it
        org.deegreewfs.model.spatialschema.Geometry selectedGeom;

        try {
            selectedGeom = getSelectedGeoAsGML( geoCollec );
        } catch ( WorkbenchException e ) {
            e.printStackTrace();
            JOptionPane.showMessageDialog( context.getWorkbenchFrame(), e.getMessage(), "Error",
                                           JOptionPane.ERROR_MESSAGE );
            return false;
        }

        // get the view envelope to perform BBOX operations
        Envelope env = lvPanel.getViewport().getEnvelopeInModelCoordinates();
        pnl.setEnvelope( env );

        // sets set selected geometry
        // this geometry is used for spatial filter operations
        pnl.setComparisonGeometry( selectedGeom );
        rd.setVisible( true );
        if ( !rd.canSearch() ) {
            return false;
        }
        wfsUrl = pnl.getWfService().getGetFeatureURL();

        return true;
    }

    public void run( TaskMonitor monitor, PlugInContext context )
                            throws Exception {
        WorkbenchFrame wbframe = context.getWorkbenchFrame();
        WorkbenchContext wbcontext = context.getWorkbenchContext();

        monitor.report( I18N.getString( "WFSSearch.searching" ) );

        WFSPanel panel = rd.getWFSPanel();
        String request = panel.getRequest();
        String crs = panel.getGMLGeometrySRS();

        org.deegreewfs.model.feature.FeatureCollection dfc;
        dfc = JUMPFeatureFactory.createDeegreeFCfromWFS( panel.getWfService(), request, panel.getFeatureType() );

        monitor.report( "Parsing feature collection (size = " + dfc.size() + ")" );
        QualifiedName ftName = panel.getFeatureType();
        AbstractWFSWrapper wfs = panel.getWfService();

        FeatureCollection dataset;

        if ( wfs.getGeometryProperties( ftName.getLocalName() ).length == 0 ) {
            LOG.info( "No geometry was found, using default point at (0, 0)." );
            Point point = new GeometryFactory().createPoint( new Coordinate( 0, 0 ) );
            dataset = JUMPFeatureFactory.createFromDeegreeFC( dfc, point, wfs, ftName, false );
        } else {
            dataset = JUMPFeatureFactory.createFromDeegreeFC( dfc, null, wfs, ftName, false );
        }

        monitor.report( "Adding Layer" );

        if ( dfc != null ) {

            LayerManager layerManager = context.getLayerManager();
        	//GeopistaLayerManager layerManager = new GeopistaLayerManager();

            QualifiedName geoQN = panel.getChosenGeoProperty();

            if ( geoQN == null ) {
                geoQN = new QualifiedName( "GEOMETRY" );
                LOG.warn( "Could not determine the qualified name of the geometry property. Setting it to 'GEOMETRY'." );
            }
            geoQN = new QualifiedName( ftName.getPrefix(), geoQN.getLocalName(), ftName.getNamespace() );

            String displayName = AbstractWFSWrapper.WFS_PREFIX + ":" + ftName.getLocalName();
            WFSLayer layer = new WFSLayer( displayName, layerManager.generateLayerFillColor(), dataset, layerManager,
                                           ftName, geoQN, crs, wfs );

            synchronized ( layerManager ) {
                WFSLayerListener listener = new WFSLayerListener( displayName );
                layer.setLayerListener( listener );
                layerManager.addLayerListener( listener );
                layer.setServerURL( this.wfsUrl );
                
                
                
                layerManager.addLayer( StandardCategoryNames.SYSTEM, layer );
                layer.setEditable( true );
            }

            if ( dataset.size() == JUMPFeatureFactory.getMaxFeatures() ) {
                wbframe.warnUser( I18N.getString( "WFSPlugin.maxnumber" ) + " " + JUMPFeatureFactory.getMaxFeatures() );
            }

        } else {

            showMessageDialog( wbframe, I18N.getString( "WFSPlugin.nodata" ), "Info", WARNING_MESSAGE );

        }

        String[] urls = panel.getWFSList().toArray( new String[] {} );
        PersistentBlackboardPlugIn.get( wbcontext ).put( WFSDialog.WFS_URL_LIST, StringTools.arrayToString( urls, ',' ) );
    }

    /**
     * Make a GMLGeometry out of geometries inside a collection
     * 
     * @param geoCollec
     *            the Collection containing geometries
     * @return the geometries encoded as GML
     * @throws Exception
     *             if something went wrong when building or wrapping the geometries
     */
    private org.deegreewfs.model.spatialschema.Geometry getSelectedGeoAsGML( Collection<?> geoCollec )
                            throws Exception {

        if ( geoCollec.size() == 0 ) {
            return null;
        }

        GeometryFactory gf = new GeometryFactory();
        Geometry geo = gf.buildGeometry( geoCollec );
        if ( geo instanceof GeometryCollection ) {
            throw new WorkbenchException( I18N.getString( "WFSResearchPlugIn.invalideGeomType" ) );
        }
        org.deegreewfs.model.spatialschema.Geometry geoObj = JTSAdapter.wrap( geo );

        return geoObj;
    }

    @Override
    public String getName() {
        return "WFS";
    }

    /**
     * @return the icon
     */
    public ImageIcon getIcon() {
        return new ImageIcon( WFSPlugIn.class.getResource( "wfs.png" ) );
    }

    private MultiEnableCheck createEnableCheck( final WorkbenchContext workbenchContext ) {
        EnableCheckFactory checkFactory = new EnableCheckFactory( workbenchContext );

        MultiEnableCheck mec = new MultiEnableCheck();
        mec.add( checkFactory.createWindowWithLayerViewPanelMustBeActiveCheck() );
        mec.add( new EnableCheck() {
            public String check( JComponent component ) {
                component.setToolTipText( getName() );
                return null;
            }
        } );

        return mec;
    }

    private String[] createUrlList( WorkbenchContext workbenchContext ) {

        String urls = (String) PersistentBlackboardPlugIn.get( workbenchContext ).get( WFSDialog.WFS_URL_LIST );
        String[] urlList = ( urls == null ) ? null : urls.split( "," );

        if ( urlList == null ) {
            urlList = new String[4];

            urlList[0] = "http://pamod-app1.c.ovd.interhost.com:8080/localgis-wfsg-sample/services";
            urlList[1] = "http://pamod-pre.c.ovd.interhost.com:8080/localgis-wfsg-sample/services";
            urlList[2] = "http://demo.deegree.org/deegree-wfs/services";
            urlList[3] = "http://demo.intevation.de/geoserver/wfs";

        }

        return urlList;
    }

}
