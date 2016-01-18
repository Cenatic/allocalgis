/**
 * URLsPlano.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * URLsPlano.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.localgis.model.ot;

public class URLsPlano  implements java.io.Serializable {
    private java.lang.String urlGuiaUrbana;

    private java.lang.String urlMapServer;

    public URLsPlano() {
    }

    public URLsPlano(
           java.lang.String urlGuiaUrbana,
           java.lang.String urlMapServer) {
           this.urlGuiaUrbana = urlGuiaUrbana;
           this.urlMapServer = urlMapServer;
    }


    /**
     * Gets the urlGuiaUrbana value for this URLsPlano.
     * 
     * @return urlGuiaUrbana
     */
    public java.lang.String getUrlGuiaUrbana() {
        return urlGuiaUrbana;
    }


    /**
     * Sets the urlGuiaUrbana value for this URLsPlano.
     * 
     * @param urlGuiaUrbana
     */
    public void setUrlGuiaUrbana(java.lang.String urlGuiaUrbana) {
        this.urlGuiaUrbana = urlGuiaUrbana;
    }


    /**
     * Gets the urlMapServer value for this URLsPlano.
     * 
     * @return urlMapServer
     */
    public java.lang.String getUrlMapServer() {
        return urlMapServer;
    }


    /**
     * Sets the urlMapServer value for this URLsPlano.
     * 
     * @param urlMapServer
     */
    public void setUrlMapServer(java.lang.String urlMapServer) {
        this.urlMapServer = urlMapServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof URLsPlano)) return false;
        URLsPlano other = (URLsPlano) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.urlGuiaUrbana==null && other.getUrlGuiaUrbana()==null) || 
             (this.urlGuiaUrbana!=null &&
              this.urlGuiaUrbana.equals(other.getUrlGuiaUrbana()))) &&
            ((this.urlMapServer==null && other.getUrlMapServer()==null) || 
             (this.urlMapServer!=null &&
              this.urlMapServer.equals(other.getUrlMapServer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUrlGuiaUrbana() != null) {
            _hashCode += getUrlGuiaUrbana().hashCode();
        }
        if (getUrlMapServer() != null) {
            _hashCode += getUrlMapServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(URLsPlano.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ot.model.localgis.com", "URLsPlano"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlGuiaUrbana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ot.model.localgis.com", "urlGuiaUrbana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlMapServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ot.model.localgis.com", "urlMapServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
