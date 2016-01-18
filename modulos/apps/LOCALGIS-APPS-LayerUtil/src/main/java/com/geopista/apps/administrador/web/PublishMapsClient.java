/**
 * PublishMapsClient.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.geopista.apps.administrador.web;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;

import javax.xml.namespace.QName;

import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

import com.geopista.app.AppContext;
import com.geopista.app.UserPreferenceConstants;
import com.geopista.server.administrador.web.LocalgisLayer;

public class PublishMapsClient {

	private static final String UTM_30N_ETRS89="25830";
	
    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public PublishMapsClient() {
        create0();
        Endpoint PublishMapsPortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://web.administrador.server.geopista.com", "PublishMapsPortTypeLocalEndpoint"), new QName("http://web.administrador.server.geopista.com", "PublishMapsPortTypeLocalBinding"), "xfire.local://PublishMaps");
        endpoints.put(new QName("http://web.administrador.server.geopista.com", "PublishMapsPortTypeLocalEndpoint"), PublishMapsPortTypeLocalEndpointEP);
        Endpoint PublishMapsHttpPortEP = service0 .addEndpoint(new QName("http://web.administrador.server.geopista.com", "PublishMapsHttpPort"), new QName("http://web.administrador.server.geopista.com", "PublishMapsHttpBinding"), AppContext.getApplicationContext().getString(UserPreferenceConstants.TOMCAT_URL)+"/PublishLayers/services/PublishMaps");
        endpoints.put(new QName("http://web.administrador.server.geopista.com", "PublishMapsHttpPort"), PublishMapsHttpPortEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((com.geopista.apps.administrador.web.PublishMapsPortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://web.administrador.server.geopista.com", "PublishMapsPortTypeLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://web.administrador.server.geopista.com", "PublishMapsHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public PublishMapsPortType getPublishMapsPortTypeLocalEndpoint() {
        return ((PublishMapsPortType)(this).getEndpoint(new QName("http://web.administrador.server.geopista.com", "PublishMapsPortTypeLocalEndpoint")));
    }

    public PublishMapsPortType getPublishMapsPortTypeLocalEndpoint(String url) {
        PublishMapsPortType var = getPublishMapsPortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public PublishMapsPortType getPublishMapsHttpPort() {
        return ((PublishMapsPortType)(this).getEndpoint(new QName("http://web.administrador.server.geopista.com", "PublishMapsHttpPort")));
    }

    public PublishMapsPortType getPublishMapsHttpPort(String url) {
        PublishMapsPortType var = getPublishMapsHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        PublishMapsClient client = new PublishMapsClient();
        
		//create a default service endpoint
        PublishMapsPortType service = client.getPublishMapsHttpPort();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();

        LocalgisLayer localgisLayer = new LocalgisLayer();
        localgisLayer.setLayername("parcelas");
        localgisLayer.setLayerid(101);
        localgisLayer.setSrid(UTM_30N_ETRS89);
        localgisLayer.setLayerquery("SELECT Parcelas.id, Parcelas.referencia_catastral, Parcelas.id_municipio, Parcelas.primer_numero, Parcelas.primera_letra, Parcelas.segundo_numero, Parcelas.segunda_letra, Parcelas.kilometro, Parcelas.bloque, Parcelas.direccion_no_estructurada, Parcelas.codigo_postal, Parcelas.fecha_alta, Parcelas.fecha_baja, transform(Parcelas.\"GEOMETRY\", ?T) as \"GEOMETRY\", Parcelas.codigodelegacionmeh, Parcelas.nombreentidadmenor, Parcelas.id_distrito, Parcelas.codigozonaconcentracion, Parcelas.codigopoligono, Parcelas.codigoparcela, Parcelas.nombreparaje, Parcelas.id_via, Parcelas.area, Parcelas.length, Parcelas.anno_expediente, Parcelas.referencia_expediente, Parcelas.codigo_entidad_colaboradora, Parcelas.tipo_movimiento, Parcelas.codigo_municipiodgc, Parcelas.bice, Parcelas.codigo_provinciaine, Parcelas.codigo_municipio_localizaciondgc, Parcelas.codigo_municipio_localizacionine, Parcelas.codigo_municipio_origendgc, Parcelas.codigo_paraje, Parcelas.superficie_finca, Parcelas.superficie_construida_total, Parcelas.superficie_const_sobrerasante, Parcelas.superficie_const_bajorasante, Parcelas.superficie_cubierta, Parcelas.anio_aprobacion, Parcelas.codigo_calculo_valor, Parcelas.poligono_catastral_valoracion, Parcelas.modalidad_reparto, Parcelas.indicador_infraedificabilidad, Parcelas.movimiento_baja, Parcelas.coordenada_x, Parcelas.coordenada_y, Parcelas.modificado, Municipios.NombreOficial FROM Municipios INNER JOIN Parcelas ON (Municipios.ID=Parcelas.ID_Municipio) WHERE Municipios.ID in (?M) AND Fecha_baja IS NULL");
        localgisLayer.setStyleName("parcelas:_:default:parcelas");
        String resultado = service.configureLayerAndStylesFile(localgisLayer);
        
		System.out.println(resultado);
        		System.exit(0);
    }

}
