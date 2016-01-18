/**
 * Traza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geopista.app.inventario.sicalwin.cliente.aytos.util.gestion;

public class Traza  implements java.io.Serializable {
    private java.lang.String ficheroInterno;

    private int nivel;

    private int nivelInterno;

    public Traza() {
    }

    public Traza(
           java.lang.String ficheroInterno,
           int nivel,
           int nivelInterno) {
           this.ficheroInterno = ficheroInterno;
           this.nivel = nivel;
           this.nivelInterno = nivelInterno;
    }


    /**
     * Gets the ficheroInterno value for this Traza.
     * 
     * @return ficheroInterno
     */
    public java.lang.String getFicheroInterno() {
        return ficheroInterno;
    }


    /**
     * Sets the ficheroInterno value for this Traza.
     * 
     * @param ficheroInterno
     */
    public void setFicheroInterno(java.lang.String ficheroInterno) {
        this.ficheroInterno = ficheroInterno;
    }


    /**
     * Gets the nivel value for this Traza.
     * 
     * @return nivel
     */
    public int getNivel() {
        return nivel;
    }


    /**
     * Sets the nivel value for this Traza.
     * 
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    /**
     * Gets the nivelInterno value for this Traza.
     * 
     * @return nivelInterno
     */
    public int getNivelInterno() {
        return nivelInterno;
    }


    /**
     * Sets the nivelInterno value for this Traza.
     * 
     * @param nivelInterno
     */
    public void setNivelInterno(int nivelInterno) {
        this.nivelInterno = nivelInterno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Traza)) return false;
        Traza other = (Traza) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ficheroInterno==null && other.getFicheroInterno()==null) || 
             (this.ficheroInterno!=null &&
              this.ficheroInterno.equals(other.getFicheroInterno()))) &&
            this.nivel == other.getNivel() &&
            this.nivelInterno == other.getNivelInterno();
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
        if (getFicheroInterno() != null) {
            _hashCode += getFicheroInterno().hashCode();
        }
        _hashCode += getNivel();
        _hashCode += getNivelInterno();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Traza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gestion.util.aytos", "Traza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ficheroInterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ficheroInterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelInterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelInterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
