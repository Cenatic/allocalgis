/**
 * ConectoresAutenticacion.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * ConectoresAutenticacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ieci.tecdoc.sgm.catalogo.ws.server;

public class ConectoresAutenticacion  extends ieci.tecdoc.sgm.core.services.dto.RetornoServicio  implements java.io.Serializable {
    private ieci.tecdoc.sgm.catalogo.ws.server.ConectorAutenticacion[] conectoresAutenticacion;

    public ConectoresAutenticacion() {
    }

    public ConectoresAutenticacion(
           java.lang.String errorCode,
           java.lang.String returnCode,
           ieci.tecdoc.sgm.catalogo.ws.server.ConectorAutenticacion[] conectoresAutenticacion) {
        super(
            errorCode,
            returnCode);
        this.conectoresAutenticacion = conectoresAutenticacion;
    }


    /**
     * Gets the conectoresAutenticacion value for this ConectoresAutenticacion.
     * 
     * @return conectoresAutenticacion
     */
    public ieci.tecdoc.sgm.catalogo.ws.server.ConectorAutenticacion[] getConectoresAutenticacion() {
        return conectoresAutenticacion;
    }


    /**
     * Sets the conectoresAutenticacion value for this ConectoresAutenticacion.
     * 
     * @param conectoresAutenticacion
     */
    public void setConectoresAutenticacion(ieci.tecdoc.sgm.catalogo.ws.server.ConectorAutenticacion[] conectoresAutenticacion) {
        this.conectoresAutenticacion = conectoresAutenticacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConectoresAutenticacion)) return false;
        ConectoresAutenticacion other = (ConectoresAutenticacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conectoresAutenticacion==null && other.getConectoresAutenticacion()==null) || 
             (this.conectoresAutenticacion!=null &&
              java.util.Arrays.equals(this.conectoresAutenticacion, other.getConectoresAutenticacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getConectoresAutenticacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConectoresAutenticacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConectoresAutenticacion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConectoresAutenticacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ws.catalogo.sgm.tecdoc.ieci", "ConectoresAutenticacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conectoresAutenticacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.ws.catalogo.sgm.tecdoc.ieci", "conectoresAutenticacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ws.catalogo.sgm.tecdoc.ieci", "ConectorAutenticacion"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://server.ws.catalogo.sgm.tecdoc.ieci", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
