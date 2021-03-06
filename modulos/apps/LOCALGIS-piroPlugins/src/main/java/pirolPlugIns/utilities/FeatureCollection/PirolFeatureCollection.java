/**
 * PirolFeatureCollection.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 22.09.2005 for PIROL
 *
 * CVS header information:
 *  $RCSfile: PirolFeatureCollection.java,v $
 *  $Revision: 1.1 $
 *  $Date: 2009/07/03 12:31:55 $
 *  $Source: /usr/cvslocalgis/.CVSROOT/localgisdos/core/src/pirolPlugIns/utilities/FeatureCollection/PirolFeatureCollection.java,v $
 */
package pirolPlugIns.utilities.FeatureCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import pirolPlugIns.utilities.CollectionsTools;
import pirolPlugIns.utilities.FeatureCollectionTools;
import pirolPlugIns.utilities.metaData.MetaDataMap;
import pirolPlugIns.utilities.metaData.ObjectContainingMetaInformation;

import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jump.feature.Feature;
import com.vividsolutions.jump.feature.FeatureCollection;
import com.vividsolutions.jump.feature.FeatureDataset;
import com.vividsolutions.jump.feature.FeatureSchema;

/**
 * 
 * Class that wraps a FeatureDataset and adds methods to get and set meta information objects. 
 *
 * @author Ole Rahn
 * <br>
 * <br>FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck,
 * <br>Project: PIROL (2005),
 * <br>Subproject: Daten- und Wissensmanagement
 * 
 * @version $Revision: 1.1 $
 * @see pirolPlugIns.utilities.metaData.MetaInformationHandler#createPirolFeatureCollection(FeatureCollection)
 *
 */
public class PirolFeatureCollection implements FeatureCollection, ObjectContainingMetaInformation {

    private static final long serialVersionUID = 1997134887214940597L;
    
    protected FeatureCollection featureDataSet = null;
    protected MetaDataMap metaInformation = null;
    
    protected PirolFeatureCollectionRole[] roles = null;
    
    public PirolFeatureCollection(FeatureCollection featureDataSet, PirolFeatureCollectionRole initRole){
        this.featureDataSet = featureDataSet;
        
        this.roles = new PirolFeatureCollectionRole[PirolFeatureCollectionRole.numOfExistentRoles];
        this.roles[0] = initRole;
    }

    /**
     * Constructor - for java2xml, only!!
     *
     */
    public PirolFeatureCollection(){ }
    
    /**
     * for java2xml
     */
    public Collection getXmlRoles(){
        ArrayList rolesForXml = new ArrayList();
        CollectionsTools.addArrayToList(rolesForXml, this.roles);
        return rolesForXml;
    }
    
    /**
     * for java2xml
     */
    public void addXmlRole(PirolFeatureCollectionRole role){
        this.addRole(role);
    }
    
    /**
     * for java2xml
     */
    public FeatureCollection getFeatureDataSet() {
        return featureDataSet;
    }

    /**
     * for java2xml
     */
    public void setFeatureDataSet(FeatureCollection featureDataSet) {
        this.featureDataSet = featureDataSet;
    }

    public void addRole(PirolFeatureCollectionRole role){
        for (int i=0; i<this.roles.length; i++){
            if (this.roles[i]==null){
                this.roles[i] = role;
                return;
            } else if (this.roles[i].equalsRole(role)){
                return;
            }
        }
    }
    
    public void removeRole(PirolFeatureCollectionRole role){
        int removedRoleIndex = -1;
        for (int i=0; i<this.roles.length; i++){
            if (this.roles[i]==null){
                return;
            } else if (this.roles[i].equalsRole(role)){
                this.roles[i] = null;
                removedRoleIndex = i;
                return;
            } else {
                if (removedRoleIndex>-1 && i > removedRoleIndex){
                    this.roles[i-1] = this.roles[i];
                    this.roles[i] = null;
                }
            }
        }
    }

    public PirolFeatureCollectionRole[] getRoles() {
        return roles;
    }

    /**
     * Check if this FeatureCollection has a role like the given one
     *@param role the role to check for
     *@return the role if this FeatureCollection has a role like the given one, else null
     *
     *@see PirolFeatureCollectionRole#ROLE_STANDARD
     *@see PirolFeatureCollectionRole#ROLE_APPGRID
     *@see PirolFeatureCollectionRole#ROLE_OUTLINE
     */
    public PirolFeatureCollectionRole getRole(PirolFeatureCollectionRole role) {
        for (int i=0; i<this.roles.length && this.roles[i]!=null; i++){
            if (this.roles[i].equalsRole(role)){
                return this.roles[i];
            }
        }
        return null;
    }
    
    /**
     * Check if this FeatureCollection has a role with the given ID
     *@param roleId id of the role type to check for
     *@return the role if this FeatureCollection has a role with the given ID, else null
     *
     *@see PirolFeatureCollectionRole#ROLE_STANDARD
     *@see PirolFeatureCollectionRole#ROLE_APPGRID
     *@see PirolFeatureCollectionRole#ROLE_OUTLINE
     */
    public PirolFeatureCollectionRole getRole(int roleId) {
        for (int i=0; i<this.roles.length && this.roles[i]!=null; i++){
            if (this.roles[i].equalsRole(roleId)){
                return this.roles[i];
            }
        }
        return null;
    }

    public MetaDataMap getMetaInformation() {
        return metaInformation;
    }

    public void setMetaInformation(MetaDataMap metaInformation) {
        this.metaInformation = metaInformation;
    }



    public void invalidateEnvelope(boolean simpleInvalidation){
        
        if (FeatureDataset.class.isInstance(featureDataSet)){
            ((FeatureDataset)featureDataSet).invalidateEnvelope();
        }
        
        if (simpleInvalidation) return;
        
        this.featureDataSet.getEnvelope().setToNull();
        
        Feature[] features = FeatureCollectionTools.FeatureCollection2FeatureArray(this.featureDataSet);
        for (int i=0; i<features.length; i++){
            features[i].getGeometry().geometryChanged();
        }
        
//        throw new UnsupportedOperationException("the wrapped FeatureCollection does not support this operation: " + this.featureDataSet.getClass().getName());
    }
    
    public void add(Feature feature) {
    add(feature,false);
    }
    public void add(Feature feature,boolean quietly) {
        this.invalidateEnvelope(true);
        featureDataSet.add(feature);
    }

    public void addAll(Collection features) {
        this.invalidateEnvelope(true);
        featureDataSet.addAll(features);
    }

    public void clear() {
        this.invalidateEnvelope(true);
        featureDataSet.clear();
    }

    public boolean equals(Object arg0) {
        return featureDataSet.equals(arg0);
    }

    public Envelope getEnvelope() {
        this.invalidateEnvelope(true);
        return featureDataSet.getEnvelope();
    }

    public List getFeatures() {
        this.invalidateEnvelope(true);
        return featureDataSet.getFeatures();
    }

    public FeatureSchema getFeatureSchema() {
        return featureDataSet.getFeatureSchema();
    }

    public int hashCode() {
        return featureDataSet.hashCode();
    }

    public boolean isEmpty() {
        return featureDataSet.isEmpty();
    }

    public Iterator iterator() {
        this.invalidateEnvelope(true);
        return featureDataSet.iterator();
    }

    public List query(Envelope envelope) {
        return featureDataSet.query(envelope);
    }
    
    public Collection remove(Envelope env) {
        this.invalidateEnvelope(true);
        return featureDataSet.remove(env);
    }
    public void remove(Feature env) {
    remove(env,false);
    }
    public void remove(Feature feature, boolean quietly) {
        this.invalidateEnvelope(true);
        featureDataSet.remove(feature);
    }

    public void removeAll(Collection features) {
        this.invalidateEnvelope(true);
        featureDataSet.removeAll(features);
    }

    public int size() {
        return featureDataSet.size();
    }

    public String toString() {
        return featureDataSet.toString();
    }
    
    public Feature[] toArray(){
        return FeatureCollectionTools.FeatureCollection2FeatureArray(this.featureDataSet);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        
        for (int i=0; i<this.roles.length && this.roles[i]!=null; i++){
            this.roles[i].clearRam();
        }
    }
    
    /**
     * the PirolFeatureCollection is a wrapper for other feature collections
     * in some cases one might want to work with the original FC. Therefor you can use this method.
     *@return the feature collection wrapped by this PirolFeatureCollection
     */
    public FeatureCollection getWrappee(){
        return this.featureDataSet;
    }

	/* (non-Javadoc)
	 * @see com.vividsolutions.jump.feature.FeatureCollection#queryIterator(com.vividsolutions.jts.geom.Envelope)
	 */
	public Iterator queryIterator(Envelope envelope)
	{
	
	return featureDataSet.queryIterator(envelope);
	}

    
}
