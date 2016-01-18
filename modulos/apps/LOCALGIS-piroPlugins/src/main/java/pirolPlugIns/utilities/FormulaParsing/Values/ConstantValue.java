/**
 * ConstantValue.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 23.06.2005 for PIROL
 *
 * CVS header information:
 *  $RCSfile: ConstantValue.java,v $
 *  $Revision: 1.1 $
 *  $Date: 2009/07/03 12:32:06 $
 *  $Source: /usr/cvslocalgis/.CVSROOT/localgisdos/core/src/pirolPlugIns/utilities/FormulaParsing/Values/ConstantValue.java,v $
 */
package pirolPlugIns.utilities.FormulaParsing.Values;

import pirolPlugIns.utilities.FormulaParsing.FormulaValue;

import com.vividsolutions.jump.feature.Feature;

/**
 * A simple value class that just stores a constant value.
 *
 * @author Ole Rahn
 * <br>
 * <br>FH Osnabr&uuml;ck - University of Applied Sciences Osnabr&uuml;ck,
 * <br>Project: PIROL (2005),
 * <br>Subproject: Daten- und Wissensmanagement
 * 
 * @version $Revision: 1.1 $
 * 
 */
public class ConstantValue extends FormulaValue {
    
    protected double value;

    public ConstantValue(double value) {
        super();
        this.value = value;
    }
    
    /**
     *@param feature in this case we don't need the feature...
     *@return the constant value
     */
    public double getValue(Feature feature) {
        return this.value;
    }
    
    /**
     * @inheritDoc
     */
    public boolean isFeatureDependent() {
        return false;
    }
    
    /**
     * @inheritDoc
     */
    public String toString(){
        return "" + this.value;
    }

}
