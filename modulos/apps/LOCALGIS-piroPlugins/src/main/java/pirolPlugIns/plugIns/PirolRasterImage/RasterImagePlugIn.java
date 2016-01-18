/**
 * RasterImagePlugIn.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/* * The Unified Mapping Platform (JUMP) is an extensible, interactive GUI  * for visualizing and manipulating spatial features with geometry and attributes. *  * Code is based on code from com.vividsolutions.jump.workbench.ui.plugin.wms.AddWMSQueryPlugIn.java * and on code from e-mail  * Message-ID: <5369d92b041105233553cb5ae8@mail.gmail.com> * Date: Fri, 5 Nov 2004 23:35:15 -0800 * From: Jonathan Aquino <jonathan.aquino@gmail.com> * To: JUMP Users Discussion <jump-users@lists.jump-project.org> * Subject: [jump-users] BeanShell to create an image layer from a file or URL	!!! gif/jpeg/png * * $Id: RasterImagePlugIn.java,v 1.1 2009/07/03 12:31:31 miriamperez Exp $Revision: 1.1 $ */package pirolPlugIns.plugIns.PirolRasterImage;import java.awt.Point;import java.awt.geom.NoninvertibleTransformException;import java.io.File;import java.io.FileNotFoundException;import java.io.IOException;import javax.swing.JFileChooser;import javax.swing.JPopupMenu;import javax.swing.filechooser.FileFilter;import pirolPlugIns.i18n.PirolPlugInMessages;import pirolPlugIns.plugIns.StandardPirolPlugIn;import pirolPlugIns.utilities.Properties.PropertiesHandler;import pirolPlugIns.utilities.RasterImageSupport.GeoTiffConstants;import pirolPlugIns.utilities.RasterImageSupport.RasterImageLayer;import pirolPlugIns.utilities.RasterImageSupport.RasterImageLayerRendererFactory;import pirolPlugIns.utilities.debugOutput.DebugUserIds;import pirolPlugIns.utilities.debugOutput.PersonalLogger;import pirolPlugIns.utilities.metaData.MetaInformationHandler;import com.sun.media.jai.codec.FileSeekableStream;import com.sun.media.jai.codec.TIFFDirectory;import com.sun.media.jai.codec.TIFFField;import com.vividsolutions.jts.geom.Coordinate;import com.vividsolutions.jts.geom.Envelope;import com.vividsolutions.jump.workbench.WorkbenchContext;import com.vividsolutions.jump.workbench.model.Category;import com.vividsolutions.jump.workbench.model.LayerManager;import com.vividsolutions.jump.workbench.model.Layerable;import com.vividsolutions.jump.workbench.model.StandardCategoryNames;import com.vividsolutions.jump.workbench.plugin.PlugInContext;import com.vividsolutions.jump.workbench.ui.GUIUtil;import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;import com.vividsolutions.jump.workbench.ui.renderer.RenderingManager;import com.vividsolutions.jump.workbench.ui.wizard.WizardDialog;import com.vividsolutions.jump.workbench.ui.wizard.WizardPanel;public class RasterImagePlugIn extends StandardPirolPlugIn {    private String imageFileName = "";    private String cachedLayer = PirolPlugInMessages.getString("default-layer-name");        protected WorldFileHandler worldFileHandler = null;    protected static PersonalLogger logger = new PersonalLogger(DebugUserIds.USER_Ole);        protected PropertiesHandler properties = null;    protected static String propertiesFile = "RasterImage.properties";    protected String lastPath = null;    public static String KEY_PATH = "path";    protected String KEY_ALLWAYSACCEPT_TWF_EXT = "allwaysCheckForTWFExtension";    protected boolean allwaysLookForTFWExtension = true;    protected String KEY_ZOOM_TO_INSERTED_IMAGE = "zoomToImage";    protected boolean zoomToInsertedImage = true;        protected static PlugInContext plugInContext = null;        public RasterImagePlugIn() {        super(logger);    }        public static String getPropertiesFile() {        return propertiesFile;    }    private boolean addImage(WorkbenchContext context, Envelope envelope, Point imageDimensions) {        String newLayerName = context.getLayerManager().uniqueLayerName(cachedLayer);        String catName = StandardCategoryNames.WORKING;        try {           catName = ((Category) context.createPlugInContext()                    .getLayerNamePanel().getSelectedCategories().toArray()[0])                    .getName();        } catch (RuntimeException e1) {            logger.printDebug(e1.getMessage());        }                int layersAsideImage = context.getLayerManager().getLayerables(Layerable.class).size();                RasterImageLayer rLayer = new RasterImageLayer(newLayerName, (LayerManager)context.getLayerManager(), this.imageFileName, null, envelope);                // #################################                MetaInformationHandler mih = new MetaInformationHandler(rLayer);                mih.addMetaInformation(PirolPlugInMessages.getString("file-name"), this.imageFileName);        mih.addMetaInformation(PirolPlugInMessages.getString("resolution"), imageDimensions.x + " (px) x " + imageDimensions.y + " (px)");        mih.addMetaInformation(PirolPlugInMessages.getString("real-world-width"), new Double(envelope.getWidth()));        mih.addMetaInformation(PirolPlugInMessages.getString("real-world-height"), new Double(envelope.getHeight()));                // ###################################                context.getLayerManager().addLayerable( catName, rLayer );        if (zoomToInsertedImage || layersAsideImage==0){            logger.printDebug("zooming to image, layers: " + layersAsideImage);	        try {	            context.getLayerViewPanel().getViewport().zoom(envelope);	        } catch (NoninvertibleTransformException e) {	            logger.printDebug(e.getMessage());	        }        }        return true;    }    public void initialize(PlugInContext context) throws Exception {        plugInContext = context;                RasterImageLayer.setWorkbenchContext(context.getWorkbenchContext());                if (context.getWorkbenchContext().getLayerViewPanel() == null)            logger.printWarning("rendering manager is NULL");                RenderingManager.putRendererForLayerable(RasterImageLayer.class, new RasterImageLayerRendererFactory(context.getWorkbenchContext()));                        context.getWorkbenchFrame().getNodeClassToPopupMenuMap().put(RasterImageLayer.class, RasterImageContextMenu.getInstance(context));                        FeatureInstaller featureInstaller = context.getFeatureInstaller();                featureInstaller.addMainMenuItem(this, new String[] { PirolPlugInMessages.getString("layer") }, PirolPlugInMessages.getString("add-raster-layer"), false, null, null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$        JPopupMenu layerNamePopupMenu = context.getWorkbenchContext().getWorkbench().getFrame().getCategoryPopupMenu();        layerNamePopupMenu.addSeparator();                PasteRasterImageLayersPlugIn pasteRasterImagePlugIn = new PasteRasterImageLayersPlugIn();        featureInstaller.addPopupMenuItem(layerNamePopupMenu, pasteRasterImagePlugIn, PirolPlugInMessages.getString("paste-raster-layer") + "...", false, null, pasteRasterImagePlugIn.createEnableCheck(context.getWorkbenchContext()));        featureInstaller.addPopupMenuItem(layerNamePopupMenu, this, PirolPlugInMessages.getString("add-raster-layer") + "...", false, null, null);                layerNamePopupMenu.addSeparator();    }    public boolean execute(final PlugInContext context)    throws Exception {        reportNothingToUndoYet(context);                JFileChooser fileChooser = new JFileChooser();        this.properties = new PropertiesHandler(RasterImagePlugIn.propertiesFile);        try {            this.properties.load();            this.lastPath = this.properties.getProperty(RasterImagePlugIn.KEY_PATH);            this.allwaysLookForTFWExtension = this.properties.getPropertyAsBoolean(this.KEY_ALLWAYSACCEPT_TWF_EXT, this.allwaysLookForTFWExtension);            this.zoomToInsertedImage = this.properties.getPropertyAsBoolean(this.KEY_ZOOM_TO_INSERTED_IMAGE, this.zoomToInsertedImage);                    } catch (FileNotFoundException e) {            e.printStackTrace();        } catch (IOException e) {            e.printStackTrace();        }        if (this.lastPath != null) {            fileChooser.setCurrentDirectory(new File(this.lastPath));        }        fileChooser.setMultiSelectionEnabled(false);        fileChooser.setFileFilter(new FileFilter() {            public String getDescription() {                return PirolPlugInMessages.getString("supported-image-extensions-text");            }            public boolean accept(File f) {                if ((f.exists() && f.isFile() && (                f.getName().toLowerCase().endsWith(".gif") ||                f.getName().toLowerCase().endsWith(".jpg") ||                f.getName().toLowerCase().endsWith(".tif") ||                f.getName().toLowerCase().endsWith(".tiff") ||                f.getName().toLowerCase().endsWith(".png")                )) || f.isDirectory()                ) {                    return true;                }                return false;            }        });        fileChooser.showOpenDialog(context.getWorkbenchFrame());                if (fileChooser.getSelectedFile() == null || !fileChooser.getSelectedFile().exists())           return false;        this.properties.setProperty(RasterImagePlugIn.KEY_PATH, fileChooser.getSelectedFile().getPath());                this.properties.store(" " + this.KEY_ZOOM_TO_INSERTED_IMAGE + PirolPlugInMessages.getString("RasterImagePlugIn.28") + this.KEY_ALLWAYSACCEPT_TWF_EXT + PirolPlugInMessages.getString("RasterImagePlugIn.29") + RasterImagePlugIn.KEY_PATH + PirolPlugInMessages.getString("RasterImagePlugIn.30"));                String selectedFilename = fileChooser.getSelectedFile().getPath();        this.imageFileName = selectedFilename;        this.cachedLayer = selectedFilename.substring(selectedFilename               .lastIndexOf(File.separator) + 1, selectedFilename               .lastIndexOf("."));                boolean imageAdded = false;                Point imageDimensions = RasterImageLayer.getImageDimensions(context.getWorkbenchContext(), selectedFilename);        Envelope env = this.getGeoReferencing(selectedFilename, this.allwaysLookForTFWExtension, imageDimensions, context);                        if (env != null){            imageAdded = this.addImage(context.getWorkbenchContext(), env, imageDimensions);        }                return this.finishExecution(context, imageAdded);    }        protected Envelope getGeoReferencing(String fileName, boolean allwaysLookForTFWExtension, Point imageDimensions, PlugInContext context) throws IOException{        double minx, maxx, miny, maxy;        Envelope env = null;                this.worldFileHandler = new WorldFileHandler(fileName, allwaysLookForTFWExtension);                if (imageDimensions == null){            logger.printError("can not determine image dimensions");            return null;        }                if (this.worldFileHandler.isWorldFileExistentForImage()!=null) {            logger.printDebug(PirolPlugInMessages.getString("worldfile-found"));            env = this.worldFileHandler.readWorldFile(imageDimensions.x, imageDimensions.y);        }                    if (env == null) {                        boolean isGeoTiff = false;                         if ( fileName.toLowerCase().endsWith(".tif") || fileName.toLowerCase().endsWith(".tiff") ) {                logger.printDebug("checking for GeoTIFF");                                Coordinate tiePoint = null, pixelOffset = null, pixelScale = null;                double[] doubles = null;                                FileSeekableStream fileSeekableStream = new FileSeekableStream(fileName);                TIFFDirectory tiffDirectory = new TIFFDirectory(fileSeekableStream, 0);                                TIFFField[] availTags = tiffDirectory.getFields();                                for (int i=0; i<availTags.length; i++){                    if (availTags[i].getTag() == GeoTiffConstants.ModelTiepointTag){                        doubles = availTags[i].getAsDoubles();                                                if (doubles.length != 6){                            logger.printError("unsupported value for ModelTiepointTag (" + GeoTiffConstants.ModelTiepointTag + ")");                            break;                        }                                                if (doubles[0]!=0 || doubles[1]!=0 || doubles[2]!=0){                            if (doubles[2]==0)                                pixelOffset = new Coordinate(doubles[0],doubles[1]);                            else                                pixelOffset = new Coordinate(doubles[0],doubles[1],doubles[2]);                        }                                                if (doubles[5]==0)                            tiePoint = new Coordinate(doubles[3],doubles[4]);                        else                            tiePoint = new Coordinate(doubles[3],doubles[4],doubles[5]);                                                logger.printDebug("ModelTiepointTag (po): " + pixelOffset);                        logger.printDebug("ModelTiepointTag (tp): " + tiePoint);                    } else if (availTags[i].getTag() == GeoTiffConstants.ModelPixelScaleTag){                        // Karteneinheiten pro pixel x bzw. y                                                doubles = availTags[i].getAsDoubles();                                                if (doubles[2]==0)                            pixelScale = new Coordinate(doubles[0],doubles[1]);                        else                            pixelScale = new Coordinate(doubles[0],doubles[1],doubles[2]);                                                logger.printDebug("ModelPixelScaleTag (ps): " + pixelScale);                    } else {                        logger.printDebug("tiff field: " + availTags[i].getType() + ", "+ availTags[i].getTag()  + ", "+ availTags[i].getCount());                    }                                    }                                fileSeekableStream.close();                                if (tiePoint!=null && pixelScale!=null){                    isGeoTiff = true;                    Coordinate upperLeft = null, lowerRight = null;                                        if (pixelOffset==null){                        upperLeft = tiePoint;                    } else {                        upperLeft = new Coordinate( tiePoint.x - (pixelOffset.x * pixelScale.x), tiePoint.y - (pixelOffset.y * pixelScale.y));                    }                                        lowerRight = new Coordinate( upperLeft.x + (imageDimensions.x * pixelScale.x), upperLeft.y - (imageDimensions.y * pixelScale.y));                                        logger.printDebug("upperLeft: " + upperLeft);                    logger.printDebug("lowerRight: " + lowerRight);                                        env = new Envelope(upperLeft, lowerRight);                }                            }                        if (!isGeoTiff || env==null){                logger.printDebug(PirolPlugInMessages.getString("no-worldfile-found"));                WizardDialog d = new WizardDialog(                       context.getWorkbenchFrame(),                       PirolPlugInMessages.getString("RasterImagePlugIn.34")                               + this.worldFileHandler.getWorldFileName()                               + PirolPlugInMessages.getString("RasterImagePlugIn.35"),                       context.getErrorHandler());                d.init(new WizardPanel[] { new RasterImageWizardPanel() });                //Set size after #init, because #init calls #pack. [Jon Aquino]                d.setSize(500, 400);                GUIUtil.centreOnWindow(d);                d.setVisible(true);                                if (!d.wasFinishPressed()) {                    logger.printWarning("user canceled");                    return null;                }                                minx = Double.parseDouble((String) d                       .getData(RasterImageWizardPanel.MINX_KEY));                maxx = Double.parseDouble((String) d                       .getData(RasterImageWizardPanel.MAXX_KEY));                miny = Double.parseDouble((String) d                       .getData(RasterImageWizardPanel.MINY_KEY));                maxy = Double.parseDouble((String) d                       .getData(RasterImageWizardPanel.MAXY_KEY));                    env = new Envelope(minx, maxx, miny, maxy);            }            // creating world file            this.worldFileHandler = new WorldFileHandler(fileName, this.allwaysLookForTFWExtension);            this.worldFileHandler.writeWorldFile(env, imageDimensions.x, imageDimensions.y);        }                return env;    }    /**     * @inheritDoc     */    public String getIconString() {        return null;    }    public static PlugInContext getPlugInContext() {        return plugInContext;    }}