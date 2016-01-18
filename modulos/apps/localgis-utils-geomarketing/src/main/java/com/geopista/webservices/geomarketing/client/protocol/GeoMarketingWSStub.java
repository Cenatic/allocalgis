/**
 * GeoMarketingWSStub.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.webservices.geomarketing.client.protocol;



/*
 *  GeoMarketingWSStub java implementation
 */


public class GeoMarketingWSStub extends org.apache.axis2.client.Stub
{
	protected org.apache.axis2.description.AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized String getUniqueSuffix(){
		// reset the counter if it is greater than 99999
		if (counter > 99999){
			counter = 0;
		}
		counter = counter + 1; 
		return Long.toString(System.currentTimeMillis()) + "_" + counter;
	}


	private void populateAxisService() throws org.apache.axis2.AxisFault {

		//creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("GeoMarketingWS" + getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[7];

		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getPortalStepRelations"));
		_service.addOperation(__operation);




		_operations[0]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getGeomarketingData"));
		_service.addOperation(__operation);




		_operations[1]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getGeomarketingAndElementsData"));
		_service.addOperation(__operation);




		_operations[2]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getPostalDataFromIdTramosAndIdVia"));
		_service.addOperation(__operation);




		_operations[3]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getNumElements"));
		_service.addOperation(__operation);




		_operations[4]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getGeomarketingByIdLayerAndAttributeName"));
		_service.addOperation(__operation);




		_operations[5]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com", "getGeomarketingAndElementsDataByIdLayerAndAttributeName"));
		_service.addOperation(__operation);




		_operations[6]=__operation;


	}

	//populates the faults
	private void populateFaults(){

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.SQLExceptionException2");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.SQLExceptionException2");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$SQLExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.SQLExceptionException2");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.SQLExceptionException2");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$SQLExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.NamingExceptionException0");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$NamingException");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.ACExceptionException1");
		faultMessageMap.put( new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),"com.localgis.webservices.geomarketing.client.GeoMarketingWSStub$ACExceptionE");



	}

	/**
	 *Constructor that takes in a configContext
	 */

	public GeoMarketingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint)
					throws org.apache.axis2.AxisFault {
		this(configurationContext,targetEndpoint,false);
	}


	/**
	 * Constructor that takes in a configContext  and useseperate listner
	 */
	public GeoMarketingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
					throws org.apache.axis2.AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);


		configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
				targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		//Set the soap version
		_serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


	}

	/**
	 * Default Constructor
	 */
	public GeoMarketingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

		this(configurationContext,"" );

	}

	/**
	 * Default Constructor
	 */
	public GeoMarketingWSStub() throws org.apache.axis2.AxisFault {

		this("" );

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public GeoMarketingWSStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null,targetEndpoint);
	}




	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getPortalStepRelations
	 * @param getPortalStepRelations0

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse getPortalStepRelations(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations getPortalStepRelations0)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:getPortalStepRelations");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getPortalStepRelations0,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getPortalStepRelations")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetPortalStepRelations
	 * @param getPortalStepRelations0

	 */
	public  void startgetPortalStepRelations(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations getPortalStepRelations0,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:getPortalStepRelations");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getPortalStepRelations0,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getPortalStepRelations")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetPortalStepRelations(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetPortalStepRelations(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetPortalStepRelations((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetPortalStepRelations((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetPortalStepRelations(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPortalStepRelations(f);
							}
						} else {
							callback.receiveErrorgetPortalStepRelations(f);
						}
					} else {
						callback.receiveErrorgetPortalStepRelations(f);
					}
				} else {
					callback.receiveErrorgetPortalStepRelations(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetPortalStepRelations(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getGeomarketingData
	 * @param getGeomarketingData2

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse getGeomarketingData(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData getGeomarketingData2)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("urn:getGeomarketingData");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getGeomarketingData2,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getGeomarketingData")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetGeomarketingData
	 * @param getGeomarketingData2

	 */
	public  void startgetGeomarketingData(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData getGeomarketingData2,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:getGeomarketingData");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getGeomarketingData2,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getGeomarketingData")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetGeomarketingData(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeomarketingData(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetGeomarketingData((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetGeomarketingData((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetGeomarketingData(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingData(f);
							}
						} else {
							callback.receiveErrorgetGeomarketingData(f);
						}
					} else {
						callback.receiveErrorgetGeomarketingData(f);
					}
				} else {
					callback.receiveErrorgetGeomarketingData(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeomarketingData(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getGeomarketingAndElementsData
	 * @param getGeomarketingAndElementsData4

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse getGeomarketingAndElementsData(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData getGeomarketingAndElementsData4)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("urn:getGeomarketingAndElementsData");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getGeomarketingAndElementsData4,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getGeomarketingAndElementsData")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2){
							throw (com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetGeomarketingAndElementsData
	 * @param getGeomarketingAndElementsData4

	 */
	public  void startgetGeomarketingAndElementsData(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData getGeomarketingAndElementsData4,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:getGeomarketingAndElementsData");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getGeomarketingAndElementsData4,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getGeomarketingAndElementsData")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetGeomarketingAndElementsData(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeomarketingAndElementsData(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetGeomarketingAndElementsData((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2){
									callback.receiveErrorgetGeomarketingAndElementsData((com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetGeomarketingAndElementsData((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetGeomarketingAndElementsData(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsData(f);
							}
						} else {
							callback.receiveErrorgetGeomarketingAndElementsData(f);
						}
					} else {
						callback.receiveErrorgetGeomarketingAndElementsData(f);
					}
				} else {
					callback.receiveErrorgetGeomarketingAndElementsData(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeomarketingAndElementsData(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getPostalDataFromIdTramosAndIdVia
	 * @param getPostalDataFromIdTramosAndIdVia6

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse getPostalDataFromIdTramosAndIdVia(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia getPostalDataFromIdTramosAndIdVia6)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("urn:getPostalDataFromIdTramosAndIdVia");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getPostalDataFromIdTramosAndIdVia6,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getPostalDataFromIdTramosAndIdVia")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetPostalDataFromIdTramosAndIdVia
	 * @param getPostalDataFromIdTramosAndIdVia6

	 */
	public  void startgetPostalDataFromIdTramosAndIdVia(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia getPostalDataFromIdTramosAndIdVia6,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("urn:getPostalDataFromIdTramosAndIdVia");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getPostalDataFromIdTramosAndIdVia6,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getPostalDataFromIdTramosAndIdVia")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetPostalDataFromIdTramosAndIdVia(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetPostalDataFromIdTramosAndIdVia((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetPostalDataFromIdTramosAndIdVia((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
							}
						} else {
							callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
						}
					} else {
						callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(f);
					}
				} else {
					callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetPostalDataFromIdTramosAndIdVia(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getNumElements
	 * @param getNumElements8

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse getNumElements(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements getNumElements8)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("urn:getNumElements");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getNumElements8,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getNumElements")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2){
							throw (com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetNumElements
	 * @param getNumElements8

	 */
	public  void startgetNumElements(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements getNumElements8,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("urn:getNumElements");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getNumElements8,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getNumElements")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetNumElements(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetNumElements(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetNumElements((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2){
									callback.receiveErrorgetNumElements((com.geopista.webservices.geomarketing.client.protocol.SQLExceptionException2)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetNumElements((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetNumElements(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetNumElements(f);
							}
						} else {
							callback.receiveErrorgetNumElements(f);
						}
					} else {
						callback.receiveErrorgetNumElements(f);
					}
				} else {
					callback.receiveErrorgetNumElements(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetNumElements(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getGeomarketingByIdLayerAndAttributeName
	 * @param getGeomarketingByIdLayerAndAttributeName10

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse getGeomarketingByIdLayerAndAttributeName(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName getGeomarketingByIdLayerAndAttributeName10)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction("urn:getGeomarketingByIdLayerAndAttributeName");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getGeomarketingByIdLayerAndAttributeName10,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getGeomarketingByIdLayerAndAttributeName")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetGeomarketingByIdLayerAndAttributeName
	 * @param getGeomarketingByIdLayerAndAttributeName10

	 */
	public  void startgetGeomarketingByIdLayerAndAttributeName(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName getGeomarketingByIdLayerAndAttributeName10,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction("urn:getGeomarketingByIdLayerAndAttributeName");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getGeomarketingByIdLayerAndAttributeName10,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getGeomarketingByIdLayerAndAttributeName")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetGeomarketingByIdLayerAndAttributeName(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
							}
						} else {
							callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
						}
					} else {
						callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(f);
					}
				} else {
					callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeomarketingByIdLayerAndAttributeName(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#getGeomarketingAndElementsDataByIdLayerAndAttributeName
	 * @param getGeomarketingAndElementsDataByIdLayerAndAttributeName12

	 * @throws com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0 : 
	 * @throws com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1 : 
	 */



	public  com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse getGeomarketingAndElementsDataByIdLayerAndAttributeName(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName getGeomarketingAndElementsDataByIdLayerAndAttributeName12)


					throws java.rmi.RemoteException


					,com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0
					,com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction("urn:getGeomarketingAndElementsDataByIdLayerAndAttributeName");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getGeomarketingAndElementsDataByIdLayerAndAttributeName12,
					optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"getGeomarketingAndElementsDataByIdLayerAndAttributeName")));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
							throw (com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex;
						}

						if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
							throw (com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex;
						}


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.localgis.webservices.geomarketing.client.GeoMarketingClientWS#startgetGeomarketingAndElementsDataByIdLayerAndAttributeName
	 * @param getGeomarketingAndElementsDataByIdLayerAndAttributeName12

	 */
	public  void startgetGeomarketingAndElementsDataByIdLayerAndAttributeName(

			com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName getGeomarketingAndElementsDataByIdLayerAndAttributeName12,

			final com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction("urn:getGeomarketingAndElementsDataByIdLayerAndAttributeName");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getGeomarketingAndElementsDataByIdLayerAndAttributeName12,
				optimizeContent(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"getGeomarketingAndElementsDataByIdLayerAndAttributeName")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetGeomarketingAndElementsDataByIdLayerAndAttributeName(
							(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
										(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0){
									callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName((com.geopista.webservices.geomarketing.client.protocol.NamingExceptionException0)ex);
									return;
								}

								if (ex instanceof com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1){
									callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName((com.geopista.webservices.geomarketing.client.protocol.ACExceptionException1)ex);
									return;
								}


								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
							}
						} else {
							callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
						}
					} else {
						callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(f);
					}
				} else {
					callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetGeomarketingAndElementsDataByIdLayerAndAttributeName(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}



	/**
	 *  A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
		}
		return returnMap;
	}



	private javax.xml.namespace.QName[] opNameArray = null;
	private boolean optimizeContent(javax.xml.namespace.QName opName) {


		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;   
			}
		}
		return false;
	}
	//http://192.168.192.1:8080/LocalGISGeoWebServices/services/GeoMarketingWS.GeoMarketingWSHttpSoap12Endpoint/
	public static class GeoMarketingOT2
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = GeoMarketingOT2
                Namespace URI = http://geomarketing.webservices.localgis.com/xsd
                Namespace Prefix = ns9
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com/xsd")){
				return "ns9";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for AttName
		 */


		protected java.lang.String localAttName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localAttNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getAttName(){
			return localAttName;
		}



		/**
		 * Auto generated setter method
		 * @param param AttName
		 */
		public void setAttName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localAttNameTracker = true;
			} else {
				localAttNameTracker = true;

			}

			this.localAttName=param;


		}


		/**
		 * field for ExternalValue
		 */


		protected int localExternalValue ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localExternalValueTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getExternalValue(){
			return localExternalValue;
		}



		/**
		 * Auto generated setter method
		 * @param param ExternalValue
		 */
		public void setExternalValue(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localExternalValueTracker = true;

			} else {
				localExternalValueTracker = true;
			}

			this.localExternalValue=param;


		}


		/**
		 * field for ForeignHabitants
		 */


		protected int localForeignHabitants ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localForeignHabitantsTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getForeignHabitants(){
			return localForeignHabitants;
		}



		/**
		 * Auto generated setter method
		 * @param param ForeignHabitants
		 */
		public void setForeignHabitants(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localForeignHabitantsTracker = true;

			} else {
				localForeignHabitantsTracker = true;
			}

			this.localForeignHabitants=param;


		}


		/**
		 * field for IdFeature
		 * This was an Array!
		 */


		protected int[] localIdFeature ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdFeatureTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getIdFeature(){
			return localIdFeature;
		}






		/**
		 * validate the array for IdFeature
		 */
		protected void validateIdFeature(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param IdFeature
		 */
		public void setIdFeature(int[] param){

			validateIdFeature(param);


			if (param != null){
				//update the setting tracker
				localIdFeatureTracker = true;
			} else {
				localIdFeatureTracker = true;

			}

			this.localIdFeature=param;
		}




		/**
		 * field for Municipio
		 */


		protected java.lang.String localMunicipio ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localMunicipioTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getMunicipio(){
			return localMunicipio;
		}



		/**
		 * Auto generated setter method
		 * @param param Municipio
		 */
		public void setMunicipio(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localMunicipioTracker = true;
			} else {
				localMunicipioTracker = true;

			}

			this.localMunicipio=param;


		}


		/**
		 * field for NumFemales
		 */


		protected int localNumFemales ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNumFemalesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getNumFemales(){
			return localNumFemales;
		}



		/**
		 * Auto generated setter method
		 * @param param NumFemales
		 */
		public void setNumFemales(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localNumFemalesTracker = true;

			} else {
				localNumFemalesTracker = true;
			}

			this.localNumFemales=param;


		}


		/**
		 * field for NumHabitants
		 */


		protected int localNumHabitants ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNumHabitantsTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getNumHabitants(){
			return localNumHabitants;
		}



		/**
		 * Auto generated setter method
		 * @param param NumHabitants
		 */
		public void setNumHabitants(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localNumHabitantsTracker = true;

			} else {
				localNumHabitantsTracker = true;
			}

			this.localNumHabitants=param;


		}


		/**
		 * field for NumMales
		 */


		protected int localNumMales ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNumMalesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getNumMales(){
			return localNumMales;
		}



		/**
		 * Auto generated setter method
		 * @param param NumMales
		 */
		public void setNumMales(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localNumMalesTracker = true;

			} else {
				localNumMalesTracker = true;
			}

			this.localNumMales=param;


		}


		/**
		 * field for Ranges
		 */


		protected java.lang.String localRanges ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localRangesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getRanges(){
			return localRanges;
		}



		/**
		 * Auto generated setter method
		 * @param param Ranges
		 */
		public void setRanges(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localRangesTracker = true;
			} else {
				localRangesTracker = true;

			}

			this.localRanges=param;


		}


		/**
		 * field for S10
		 */


		protected java.lang.String localS10 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localS10Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getS10(){
			return localS10;
		}



		/**
		 * Auto generated setter method
		 * @param param S10
		 */
		public void setS10(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localS10Tracker = true;
			} else {
				localS10Tracker = true;

			}

			this.localS10=param;


		}


		/**
		 * field for S20
		 */


		protected java.lang.String localS20 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localS20Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getS20(){
			return localS20;
		}



		/**
		 * Auto generated setter method
		 * @param param S20
		 */
		public void setS20(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localS20Tracker = true;
			} else {
				localS20Tracker = true;

			}

			this.localS20=param;


		}


		/**
		 * field for S30
		 */


		protected java.lang.String localS30 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localS30Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getS30(){
			return localS30;
		}



		/**
		 * Auto generated setter method
		 * @param param S30
		 */
		public void setS30(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localS30Tracker = true;
			} else {
				localS30Tracker = true;

			}

			this.localS30=param;


		}


		/**
		 * field for S40
		 */


		protected java.lang.String localS40 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localS40Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getS40(){
			return localS40;
		}



		/**
		 * Auto generated setter method
		 * @param param S40
		 */
		public void setS40(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localS40Tracker = true;
			} else {
				localS40Tracker = true;

			}

			this.localS40=param;


		}


		/**
		 * field for SpanishHabitants
		 */


		protected int localSpanishHabitants ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSpanishHabitantsTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getSpanishHabitants(){
			return localSpanishHabitants;
		}



		/**
		 * Auto generated setter method
		 * @param param SpanishHabitants
		 */
		public void setSpanishHabitants(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localSpanishHabitantsTracker = true;

			} else {
				localSpanishHabitantsTracker = true;
			}

			this.localSpanishHabitants=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GeoMarketingOT2.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com/xsd");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":GeoMarketingOT2",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"GeoMarketingOT2",
							xmlWriter);
				}


			}
			if (localAttNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"attName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"attName");
					}

				} else {
					xmlWriter.writeStartElement("attName");
				}


				if (localAttName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localAttName);

				}

				xmlWriter.writeEndElement();
			} if (localExternalValueTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"externalValue", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"externalValue");
					}

				} else {
					xmlWriter.writeStartElement("externalValue");
				}

				if (localExternalValue==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalValue));
				}

				xmlWriter.writeEndElement();
			} if (localForeignHabitantsTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"foreignHabitants", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"foreignHabitants");
					}

				} else {
					xmlWriter.writeStartElement("foreignHabitants");
				}

				if (localForeignHabitants==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForeignHabitants));
				}

				xmlWriter.writeEndElement();
			} if (localIdFeatureTracker){
				if (localIdFeature!=null) {
					namespace = "http://geomarketing.webservices.localgis.com/xsd";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localIdFeature.length;i++){

						if (localIdFeature[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"idFeature", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"idFeature");
								}

							} else {
								xmlWriter.writeStartElement("idFeature");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeature[i]));
							xmlWriter.writeEndElement();

						} else {

							// write null attribute
							namespace = "http://geomarketing.webservices.localgis.com/xsd";
							if (! namespace.equals("")) {
								prefix = xmlWriter.getPrefix(namespace);

								if (prefix == null) {
									prefix = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix,"idFeature", namespace);
									xmlWriter.writeNamespace(prefix, namespace);
									xmlWriter.setPrefix(prefix, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"idFeature");
								}

							} else {
								xmlWriter.writeStartElement("idFeature");
							}
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					// write the null attribute
					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com/xsd";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"idFeature", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"idFeature");
						}

					} else {
						xmlWriter.writeStartElement("idFeature");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}

			} if (localMunicipioTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"municipio", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"municipio");
					}

				} else {
					xmlWriter.writeStartElement("municipio");
				}


				if (localMunicipio==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localMunicipio);

				}

				xmlWriter.writeEndElement();
			} if (localNumFemalesTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"numFemales", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"numFemales");
					}

				} else {
					xmlWriter.writeStartElement("numFemales");
				}

				if (localNumFemales==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumFemales));
				}

				xmlWriter.writeEndElement();
			} if (localNumHabitantsTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"numHabitants", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"numHabitants");
					}

				} else {
					xmlWriter.writeStartElement("numHabitants");
				}

				if (localNumHabitants==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumHabitants));
				}

				xmlWriter.writeEndElement();
			} if (localNumMalesTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"numMales", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"numMales");
					}

				} else {
					xmlWriter.writeStartElement("numMales");
				}

				if (localNumMales==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumMales));
				}

				xmlWriter.writeEndElement();
			} if (localRangesTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"ranges", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"ranges");
					}

				} else {
					xmlWriter.writeStartElement("ranges");
				}


				if (localRanges==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localRanges);

				}

				xmlWriter.writeEndElement();
			} if (localS10Tracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"s10", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"s10");
					}

				} else {
					xmlWriter.writeStartElement("s10");
				}


				if (localS10==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localS10);

				}

				xmlWriter.writeEndElement();
			} if (localS20Tracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"s20", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"s20");
					}

				} else {
					xmlWriter.writeStartElement("s20");
				}


				if (localS20==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localS20);

				}

				xmlWriter.writeEndElement();
			} if (localS30Tracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"s30", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"s30");
					}

				} else {
					xmlWriter.writeStartElement("s30");
				}


				if (localS30==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localS30);

				}

				xmlWriter.writeEndElement();
			} if (localS40Tracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"s40", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"s40");
					}

				} else {
					xmlWriter.writeStartElement("s40");
				}


				if (localS40==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localS40);

				}

				xmlWriter.writeEndElement();
			} if (localSpanishHabitantsTracker){
				namespace = "http://geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"spanishHabitants", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"spanishHabitants");
					}

				} else {
					xmlWriter.writeStartElement("spanishHabitants");
				}

				if (localSpanishHabitants==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpanishHabitants));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localAttNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"attName"));

				elementList.add(localAttName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttName));
			} if (localExternalValueTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"externalValue"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalValue));
			} if (localForeignHabitantsTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"foreignHabitants"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForeignHabitants));
			} if (localIdFeatureTracker){
				if (localIdFeature!=null){
					for (int i = 0;i < localIdFeature.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
								"idFeature"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeature[i]));



					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
							"idFeature"));
					elementList.add(null);

				}

			} if (localMunicipioTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"municipio"));

				elementList.add(localMunicipio==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMunicipio));
			} if (localNumFemalesTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"numFemales"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumFemales));
			} if (localNumHabitantsTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"numHabitants"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumHabitants));
			} if (localNumMalesTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"numMales"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumMales));
			} if (localRangesTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"ranges"));

				elementList.add(localRanges==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges));
			} if (localS10Tracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"s10"));

				elementList.add(localS10==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localS10));
			} if (localS20Tracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"s20"));

				elementList.add(localS20==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localS20));
			} if (localS30Tracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"s30"));

				elementList.add(localS30==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localS30));
			} if (localS40Tracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"s40"));

				elementList.add(localS40==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localS40));
			} if (localSpanishHabitantsTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd",
						"spanishHabitants"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpanishHabitants));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GeoMarketingOT2 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GeoMarketingOT2 object =
						new GeoMarketingOT2();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"GeoMarketingOT2".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GeoMarketingOT2)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list4 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","attName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setAttName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","externalValue").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setExternalValue(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setExternalValue(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setExternalValue(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","foreignHabitants").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setForeignHabitants(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setForeignHabitants(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setForeignHabitants(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","idFeature").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list4.add(String.valueOf(java.lang.Integer.MIN_VALUE));

							reader.next();
						} else {
							list4.add(reader.getElementText());
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone4 = false;
						while(!loopDone4){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone4 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","idFeature").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list4.add(String.valueOf(java.lang.Integer.MIN_VALUE));

										reader.next();
									} else {
										list4.add(reader.getElementText());
									}
								}else{
									loopDone4 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setIdFeature((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list4));

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","municipio").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setMunicipio(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","numFemales").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNumFemales(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setNumFemales(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setNumFemales(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","numHabitants").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNumHabitants(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setNumHabitants(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setNumHabitants(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","numMales").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNumMales(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setNumMales(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setNumMales(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","ranges").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setRanges(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","s10").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setS10(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","s20").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setS20(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","s30").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setS30(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","s40").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setS40(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com/xsd","spanishHabitants").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setSpanishHabitants(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setSpanishHabitants(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setSpanishHabitants(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetPostalDataFromIdTramosAndIdVia
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getPostalDataFromIdTramosAndIdVia",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for IdFeatureStreet
		 */


		protected int localIdFeatureStreet ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdFeatureStreetTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdFeatureStreet(){
			return localIdFeatureStreet;
		}



		/**
		 * Auto generated setter method
		 * @param param IdFeatureStreet
		 */
		public void setIdFeatureStreet(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdFeatureStreetTracker = false;

			} else {
				localIdFeatureStreetTracker = true;
			}

			this.localIdFeatureStreet=param;


		}


		/**
		 * field for IdFeatureStep
		 * This was an Array!
		 */


		protected int[] localIdFeatureStep ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdFeatureStepTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getIdFeatureStep(){
			return localIdFeatureStep;
		}






		/**
		 * validate the array for IdFeatureStep
		 */
		protected void validateIdFeatureStep(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param IdFeatureStep
		 */
		public void setIdFeatureStep(int[] param){

			validateIdFeatureStep(param);


			if (param != null){
				//update the setting tracker
				localIdFeatureStepTracker = true;
			} else {
				localIdFeatureStepTracker = false;

			}

			this.localIdFeatureStep=param;
		}




		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetPostalDataFromIdTramosAndIdVia.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getPostalDataFromIdTramosAndIdVia",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getPostalDataFromIdTramosAndIdVia",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localIdFeatureStreetTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idFeatureStreet", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idFeatureStreet");
					}

				} else {
					xmlWriter.writeStartElement("idFeatureStreet");
				}

				if (localIdFeatureStreet==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStreet cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStreet));
				}

				xmlWriter.writeEndElement();
			} if (localIdFeatureStepTracker){
				if (localIdFeatureStep!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localIdFeatureStep.length;i++){

						if (localIdFeatureStep[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"idFeatureStep", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"idFeatureStep");
								}

							} else {
								xmlWriter.writeStartElement("idFeatureStep");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStep[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStep cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localIdFeatureStreetTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idFeatureStreet"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStreet));
			} if (localIdFeatureStepTracker){
				if (localIdFeatureStep!=null){
					for (int i = 0;i < localIdFeatureStep.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"idFeatureStep"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStep[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStep cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetPostalDataFromIdTramosAndIdVia parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetPostalDataFromIdTramosAndIdVia object =
						new GetPostalDataFromIdTramosAndIdVia();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getPostalDataFromIdTramosAndIdVia".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPostalDataFromIdTramosAndIdVia)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list5 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStreet").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdFeatureStreet(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdFeatureStreet(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStep").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list5.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone5 = false;
						while(!loopDone5){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone5 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStep").equals(reader.getName())){
									list5.add(reader.getElementText());

								}else{
									loopDone5 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setIdFeatureStep((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list5));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetNumElementsResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getNumElementsResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 */


		protected int local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				local_returnTracker = false;

			} else {
				local_returnTracker = true;
			}

			this.local_return=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetNumElementsResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getNumElementsResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getNumElementsResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"return", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"return");
					}

				} else {
					xmlWriter.writeStartElement("return");
				}

				if (local_return==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"return"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetNumElementsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetNumElementsResponse object =
						new GetNumElementsResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getNumElementsResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetNumElementsResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.set_return(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.set_return(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetPortalStepRelationsResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getPortalStepRelationsResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 * This was an Array!
		 */


		protected PortalStepRelationOT[] local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return PortalStepRelationOT[]
		 */
		public  PortalStepRelationOT[] get_return(){
			return local_return;
		}






		/**
		 * validate the array for _return
		 */
		protected void validate_return(PortalStepRelationOT[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(PortalStepRelationOT[] param){

			validate_return(param);


			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;
		}



		/**
		 * Auto generated add method for the array for convenience
		 * @param param PortalStepRelationOT
		 */
		public void add_return(PortalStepRelationOT param){
			if (local_return == null){
				local_return = new PortalStepRelationOT[]{};
			}


			//update the setting tracker
			local_returnTracker = true;


			java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
			list.add(param);
			this.local_return =
					(PortalStepRelationOT[])list.toArray(
							new PortalStepRelationOT[list.size()]);

		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetPortalStepRelationsResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getPortalStepRelationsResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getPortalStepRelationsResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return!=null){
					for (int i = 0;i < local_return.length;i++){
						if (local_return[i] != null){
							local_return[i].serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
									factory,xmlWriter);
						} else {

							// write null attribute
							java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
							if (! namespace2.equals("")) {
								java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

								if (prefix2 == null) {
									prefix2 = generatePrefix(namespace2);

									xmlWriter.writeStartElement(prefix2,"return", namespace2);
									xmlWriter.writeNamespace(prefix2, namespace2);
									xmlWriter.setPrefix(prefix2, namespace2);

								} else {
									xmlWriter.writeStartElement(namespace2,"return");
								}

							} else {
								xmlWriter.writeStartElement("return");
							}

							// write the nil attribute
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				if (local_return!=null) {
					for (int i = 0;i < local_return.length;i++){

						if (local_return[i] != null){
							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(local_return[i]);
						} else {

							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"return"));
					elementList.add(local_return);

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetPortalStepRelationsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetPortalStepRelationsResponse object =
						new GetPortalStepRelationsResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getPortalStepRelationsResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPortalStepRelationsResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list1.add(null);
							reader.next();
						} else {
							list1.add(PortalStepRelationOT.Factory.parse(reader));
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while(!loopDone1){
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list1.add(null);
										reader.next();
									} else {
										list1.add(PortalStepRelationOT.Factory.parse(reader));
									}
								}else{
									loopDone1 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.set_return((PortalStepRelationOT[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										PortalStepRelationOT.class,
										list1));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class SQLException extends Exception
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = SQLException
                Namespace URI = http://sql.java/xsd
                Namespace Prefix = ns10
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://sql.java/xsd")){
				return "ns10";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for ErrorCode
		 */


		protected int localErrorCode ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localErrorCodeTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getErrorCode(){
			return localErrorCode;
		}



		/**
		 * Auto generated setter method
		 * @param param ErrorCode
		 */
		public void setErrorCode(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localErrorCodeTracker = false;

			} else {
				localErrorCodeTracker = true;
			}

			this.localErrorCode=param;


		}


		/**
		 * field for NextException
		 */


		protected SQLException localNextException ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNextExceptionTracker = false ;


		/**
		 * Auto generated getter method
		 * @return SQLException
		 */
		public  SQLException getNextException(){
			return localNextException;
		}



		/**
		 * Auto generated setter method
		 * @param param NextException
		 */
		public void setNextException(SQLException param){

			if (param != null){
				//update the setting tracker
				localNextExceptionTracker = true;
			} else {
				localNextExceptionTracker = true;

			}

			this.localNextException=param;


		}


		/**
		 * field for SQLState
		 */


		protected java.lang.String localSQLState ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSQLStateTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getSQLState(){
			return localSQLState;
		}



		/**
		 * Auto generated setter method
		 * @param param SQLState
		 */
		public void setSQLState(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localSQLStateTracker = true;
			} else {
				localSQLStateTracker = true;

			}

			this.localSQLState=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					SQLException.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}


			java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sql.java/xsd");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						namespacePrefix+":SQLException",
						xmlWriter);
			} else {
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						"SQLException",
						xmlWriter);
			}

			if (localExceptionTracker){

				if (localException!=null){
					if (localException instanceof org.apache.axis2.databinding.ADBBean){
						((org.apache.axis2.databinding.ADBBean)localException).serialize(
								new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception"),
								factory,xmlWriter,true);
					} else {
						java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
						if (! namespace2.equals("")) {
							java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

							if (prefix2 == null) {
								prefix2 = generatePrefix(namespace2);

								xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
								xmlWriter.writeNamespace(prefix2, namespace2);
								xmlWriter.setPrefix(prefix2, namespace2);

							} else {
								xmlWriter.writeStartElement(namespace2,"Exception");
							}

						} else {
							xmlWriter.writeStartElement("Exception");
						}
						org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localException, xmlWriter);
						xmlWriter.writeEndElement();
					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"Exception");
						}

					} else {
						xmlWriter.writeStartElement("Exception");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}


			} if (localErrorCodeTracker){
				namespace = "http://sql.java/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"errorCode", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"errorCode");
					}

				} else {
					xmlWriter.writeStartElement("errorCode");
				}

				if (localErrorCode==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("errorCode cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
				}

				xmlWriter.writeEndElement();
			} if (localNextExceptionTracker){
				if (localNextException==null){

					java.lang.String namespace2 = "http://sql.java/xsd";

					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"nextException", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"nextException");
						}

					} else {
						xmlWriter.writeStartElement("nextException");
					}


					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					localNextException.serialize(new javax.xml.namespace.QName("http://sql.java/xsd","nextException"),
							factory,xmlWriter);
				}
			} if (localSQLStateTracker){
				namespace = "http://sql.java/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"sQLState", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"sQLState");
					}

				} else {
					xmlWriter.writeStartElement("sQLState");
				}


				if (localSQLState==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localSQLState);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();


			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
			attribList.add(new javax.xml.namespace.QName("http://sql.java/xsd","SQLException"));
			if (localExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"Exception"));


				elementList.add(localException==null?null:
					localException);
			} if (localErrorCodeTracker){
				elementList.add(new javax.xml.namespace.QName("http://sql.java/xsd",
						"errorCode"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
			} if (localNextExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://sql.java/xsd",
						"nextException"));


				elementList.add(localNextException==null?null:
					localNextException);
			} if (localSQLStateTracker){
				elementList.add(new javax.xml.namespace.QName("http://sql.java/xsd",
						"sQLState"));

				elementList.add(localSQLState==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSQLState));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static SQLException parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				SQLException object =
						new SQLException();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"SQLException".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (SQLException)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception").equals(reader.getName())){

						object.setException(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
								ExtensionMapper.class));

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://sql.java/xsd","errorCode").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setErrorCode(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setErrorCode(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://sql.java/xsd","nextException").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.setNextException(null);
							reader.next();

							reader.next();

						}else{

							object.setNextException(SQLException.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://sql.java/xsd","sQLState").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setSQLState(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class SQLExceptionE
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"SQLException",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for SQLException
		 */


		protected SQLException localSQLException ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSQLExceptionTracker = false ;


		/**
		 * Auto generated getter method
		 * @return SQLException
		 */
		public  SQLException getSQLException(){
			return localSQLException;
		}



		/**
		 * Auto generated setter method
		 * @param param SQLException
		 */
		public void setSQLException(SQLException param){

			if (param != null){
				//update the setting tracker
				localSQLExceptionTracker = true;
			} else {
				localSQLExceptionTracker = true;

			}

			this.localSQLException=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					SQLExceptionE.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":SQLException",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"SQLException",
							xmlWriter);
				}


			}
			if (localSQLExceptionTracker){
				if (localSQLException==null){

					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";

					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"SQLException", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"SQLException");
						}

					} else {
						xmlWriter.writeStartElement("SQLException");
					}


					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					localSQLException.serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException"),
							factory,xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localSQLExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"SQLException"));


				elementList.add(localSQLException==null?null:
					localSQLException);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static SQLExceptionE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				SQLExceptionE object =
						new SQLExceptionE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)){
						// Skip the element and report the null value.  It cannot have subelements.
						while (!reader.isEndElement())
							reader.next();

						return null;


					}

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"SQLException".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (SQLExceptionE)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","SQLException").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.setSQLException(null);
							reader.next();

							reader.next();

						}else{

							object.setSQLException(SQLException.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class ACExceptionE
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"ACException",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for ACException
		 */


		protected ACException localACException ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localACExceptionTracker = false ;


		/**
		 * Auto generated getter method
		 * @return ACException
		 */
		public  ACException getACException(){
			return localACException;
		}



		/**
		 * Auto generated setter method
		 * @param param ACException
		 */
		public void setACException(ACException param){

			if (param != null){
				//update the setting tracker
				localACExceptionTracker = true;
			} else {
				localACExceptionTracker = true;

			}

			this.localACException=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					ACExceptionE.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":ACException",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"ACException",
							xmlWriter);
				}


			}
			if (localACExceptionTracker){
				if (localACException==null){

					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";

					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"ACException", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"ACException");
						}

					} else {
						xmlWriter.writeStartElement("ACException");
					}


					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					localACException.serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException"),
							factory,xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localACExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"ACException"));


				elementList.add(localACException==null?null:
					localACException);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ACExceptionE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				ACExceptionE object =
						new ACExceptionE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)){
						// Skip the element and report the null value.  It cannot have subelements.
						while (!reader.isEndElement())
							reader.next();

						return null;


					}

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"ACException".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ACExceptionE)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ACException").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.setACException(null);
							reader.next();

							reader.next();

						}else{

							object.setACException(ACException.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingAndElementsData
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingAndElementsData",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for WktGeometry
		 */


		protected java.lang.String localWktGeometry ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localWktGeometryTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getWktGeometry(){
			return localWktGeometry;
		}



		/**
		 * Auto generated setter method
		 * @param param WktGeometry
		 */
		public void setWktGeometry(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localWktGeometryTracker = true;
			} else {
				localWktGeometryTracker = true;

			}

			this.localWktGeometry=param;


		}


		/**
		 * field for Srid
		 */


		protected java.lang.String localSrid ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSridTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getSrid(){
			return localSrid;
		}



		/**
		 * Auto generated setter method
		 * @param param Srid
		 */
		public void setSrid(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localSridTracker = true;
			} else {
				localSridTracker = true;

			}

			this.localSrid=param;


		}


		/**
		 * field for IdLayer
		 */


		protected int localIdLayer ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdLayerTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdLayer(){
			return localIdLayer;
		}



		/**
		 * Auto generated setter method
		 * @param param IdLayer
		 */
		public void setIdLayer(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdLayerTracker = false;

			} else {
				localIdLayerTracker = true;
			}

			this.localIdLayer=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for Ranges
		 * This was an Array!
		 */


		protected int[] localRanges ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localRangesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getRanges(){
			return localRanges;
		}






		/**
		 * validate the array for Ranges
		 */
		protected void validateRanges(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param Ranges
		 */
		public void setRanges(int[] param){

			validateRanges(param);


			if (param != null){
				//update the setting tracker
				localRangesTracker = true;
			} else {
				localRangesTracker = false;

			}

			this.localRanges=param;
		}




		/**
		 * field for IdMunicipio
		 */


		protected int localIdMunicipio ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdMunicipioTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdMunicipio(){
			return localIdMunicipio;
		}



		/**
		 * Auto generated setter method
		 * @param param IdMunicipio
		 */
		public void setIdMunicipio(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdMunicipioTracker = false;

			} else {
				localIdMunicipioTracker = true;
			}

			this.localIdMunicipio=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingAndElementsData.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingAndElementsData",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingAndElementsData",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localWktGeometryTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"wktGeometry", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"wktGeometry");
					}

				} else {
					xmlWriter.writeStartElement("wktGeometry");
				}


				if (localWktGeometry==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localWktGeometry);

				}

				xmlWriter.writeEndElement();
			} if (localSridTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"srid", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"srid");
					}

				} else {
					xmlWriter.writeStartElement("srid");
				}


				if (localSrid==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localSrid);

				}

				xmlWriter.writeEndElement();
			} if (localIdLayerTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idLayer", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idLayer");
					}

				} else {
					xmlWriter.writeStartElement("idLayer");
				}

				if (localIdLayer==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idLayer cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localRangesTracker){
				if (localRanges!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localRanges.length;i++){

						if (localRanges[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"ranges", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"ranges");
								}

							} else {
								xmlWriter.writeStartElement("ranges");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			} if (localIdMunicipioTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idMunicipio", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idMunicipio");
					}

				} else {
					xmlWriter.writeStartElement("idMunicipio");
				}

				if (localIdMunicipio==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idMunicipio cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdMunicipio));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localWktGeometryTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"wktGeometry"));

				elementList.add(localWktGeometry==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWktGeometry));
			} if (localSridTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"srid"));

				elementList.add(localSrid==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSrid));
			} if (localIdLayerTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idLayer"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localRangesTracker){
				if (localRanges!=null){
					for (int i = 0;i < localRanges.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"ranges"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			} if (localIdMunicipioTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idMunicipio"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdMunicipio));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingAndElementsData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingAndElementsData object =
						new GetGeomarketingAndElementsData();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingAndElementsData".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingAndElementsData)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list7 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","wktGeometry").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setWktGeometry(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","srid").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setSrid(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idLayer").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdLayer(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdLayer(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list7.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone7 = false;
						while(!loopDone7){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone7 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){
									list7.add(reader.getElementText());

								}else{
									loopDone7 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setRanges((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list7));

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idMunicipio").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdMunicipio(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdMunicipio(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class Exception
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = Exception
                Namespace URI = http://geomarketing.webservices.localgis.com
                Namespace Prefix = ns8
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for Exception
		 */


		protected java.lang.Object localException ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localExceptionTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.Object
		 */
		public  java.lang.Object getException(){
			return localException;
		}



		/**
		 * Auto generated setter method
		 * @param param Exception
		 */
		public void setException(java.lang.Object param){

			if (param != null){
				//update the setting tracker
				localExceptionTracker = true;
			} else {
				localExceptionTracker = true;

			}

			this.localException=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					Exception.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":Exception",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"Exception",
							xmlWriter);
				}


			}
			if (localExceptionTracker){

				if (localException!=null){
					if (localException instanceof org.apache.axis2.databinding.ADBBean){
						((org.apache.axis2.databinding.ADBBean)localException).serialize(
								new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception"),
								factory,xmlWriter,true);
					} else {
						java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
						if (! namespace2.equals("")) {
							java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

							if (prefix2 == null) {
								prefix2 = generatePrefix(namespace2);

								xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
								xmlWriter.writeNamespace(prefix2, namespace2);
								xmlWriter.setPrefix(prefix2, namespace2);

							} else {
								xmlWriter.writeStartElement(namespace2,"Exception");
							}

						} else {
							xmlWriter.writeStartElement("Exception");
						}
						org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localException, xmlWriter);
						xmlWriter.writeEndElement();
					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"Exception");
						}

					} else {
						xmlWriter.writeStartElement("Exception");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}


			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"Exception"));


				elementList.add(localException==null?null:
					localException);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static Exception parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				Exception object =
						new Exception();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"Exception".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Exception)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception").equals(reader.getName())){

						object.setException(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
								ExtensionMapper.class));

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingByIdLayerAndAttributeNameResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingByIdLayerAndAttributeNameResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 * This was an Array!
		 */


		protected GeoMarketingOT2[] local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return GeoMarketingOT2[]
		 */
		public  GeoMarketingOT2[] get_return(){
			return local_return;
		}






		/**
		 * validate the array for _return
		 */
		protected void validate_return(GeoMarketingOT2[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(GeoMarketingOT2[] param){

			validate_return(param);


			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;
		}



		/**
		 * Auto generated add method for the array for convenience
		 * @param param GeoMarketingOT2
		 */
		public void add_return(GeoMarketingOT2 param){
			if (local_return == null){
				local_return = new GeoMarketingOT2[]{};
			}


			//update the setting tracker
			local_returnTracker = true;


			java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
			list.add(param);
			this.local_return =
					(GeoMarketingOT2[])list.toArray(
							new GeoMarketingOT2[list.size()]);

		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingByIdLayerAndAttributeNameResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingByIdLayerAndAttributeNameResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingByIdLayerAndAttributeNameResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return!=null){
					for (int i = 0;i < local_return.length;i++){
						if (local_return[i] != null){
							local_return[i].serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
									factory,xmlWriter);
						} else {

							// write null attribute
							java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
							if (! namespace2.equals("")) {
								java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

								if (prefix2 == null) {
									prefix2 = generatePrefix(namespace2);

									xmlWriter.writeStartElement(prefix2,"return", namespace2);
									xmlWriter.writeNamespace(prefix2, namespace2);
									xmlWriter.setPrefix(prefix2, namespace2);

								} else {
									xmlWriter.writeStartElement(namespace2,"return");
								}

							} else {
								xmlWriter.writeStartElement("return");
							}

							// write the nil attribute
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				if (local_return!=null) {
					for (int i = 0;i < local_return.length;i++){

						if (local_return[i] != null){
							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(local_return[i]);
						} else {

							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"return"));
					elementList.add(local_return);

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingByIdLayerAndAttributeNameResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingByIdLayerAndAttributeNameResponse object =
						new GetGeomarketingByIdLayerAndAttributeNameResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingByIdLayerAndAttributeNameResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingByIdLayerAndAttributeNameResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list1.add(null);
							reader.next();
						} else {
							list1.add(GeoMarketingOT2.Factory.parse(reader));
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while(!loopDone1){
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list1.add(null);
										reader.next();
									} else {
										list1.add(GeoMarketingOT2.Factory.parse(reader));
									}
								}else{
									loopDone1 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.set_return((GeoMarketingOT2[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										GeoMarketingOT2.class,
										list1));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingAndElementsDataResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingAndElementsDataResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 */


		protected GeoMarketingOT2 local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return GeoMarketingOT2
		 */
		public  GeoMarketingOT2 get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(GeoMarketingOT2 param){

			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingAndElementsDataResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingAndElementsDataResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingAndElementsDataResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return==null){

					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";

					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}


					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					local_return.serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
							factory,xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"return"));


				elementList.add(local_return==null?null:
					local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingAndElementsDataResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingAndElementsDataResponse object =
						new GetGeomarketingAndElementsDataResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingAndElementsDataResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingAndElementsDataResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.set_return(null);
							reader.next();

							reader.next();

						}else{

							object.set_return(GeoMarketingOT2.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingAndElementsDataByIdLayerAndAttributeName
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingAndElementsDataByIdLayerAndAttributeName",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for AttributeName
		 */


		protected java.lang.String localAttributeName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localAttributeNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getAttributeName(){
			return localAttributeName;
		}



		/**
		 * Auto generated setter method
		 * @param param AttributeName
		 */
		public void setAttributeName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localAttributeNameTracker = true;
			} else {
				localAttributeNameTracker = true;

			}

			this.localAttributeName=param;


		}


		/**
		 * field for Locale
		 */


		protected java.lang.String localLocale ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localLocaleTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getLocale(){
			return localLocale;
		}



		/**
		 * Auto generated setter method
		 * @param param Locale
		 */
		public void setLocale(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localLocaleTracker = true;
			} else {
				localLocaleTracker = true;

			}

			this.localLocale=param;


		}


		/**
		 * field for IdLayer
		 */


		protected int localIdLayer ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdLayerTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdLayer(){
			return localIdLayer;
		}



		/**
		 * Auto generated setter method
		 * @param param IdLayer
		 */
		public void setIdLayer(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdLayerTracker = false;

			} else {
				localIdLayerTracker = true;
			}

			this.localIdLayer=param;


		}


		/**
		 * field for IdLayerElements
		 */


		protected int localIdLayerElements ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdLayerElementsTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdLayerElements(){
			return localIdLayerElements;
		}



		/**
		 * Auto generated setter method
		 * @param param IdLayerElements
		 */
		public void setIdLayerElements(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdLayerElementsTracker = false;

			} else {
				localIdLayerElementsTracker = true;
			}

			this.localIdLayerElements=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for Ranges
		 * This was an Array!
		 */


		protected int[] localRanges ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localRangesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getRanges(){
			return localRanges;
		}






		/**
		 * validate the array for Ranges
		 */
		protected void validateRanges(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param Ranges
		 */
		public void setRanges(int[] param){

			validateRanges(param);


			if (param != null){
				//update the setting tracker
				localRangesTracker = true;
			} else {
				localRangesTracker = false;

			}

			this.localRanges=param;
		}




		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingAndElementsDataByIdLayerAndAttributeName.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingAndElementsDataByIdLayerAndAttributeName",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingAndElementsDataByIdLayerAndAttributeName",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localAttributeNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"attributeName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"attributeName");
					}

				} else {
					xmlWriter.writeStartElement("attributeName");
				}


				if (localAttributeName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localAttributeName);

				}

				xmlWriter.writeEndElement();
			} if (localLocaleTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"locale", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"locale");
					}

				} else {
					xmlWriter.writeStartElement("locale");
				}


				if (localLocale==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localLocale);

				}

				xmlWriter.writeEndElement();
			} if (localIdLayerTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idLayer", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idLayer");
					}

				} else {
					xmlWriter.writeStartElement("idLayer");
				}

				if (localIdLayer==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idLayer cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
				}

				xmlWriter.writeEndElement();
			} if (localIdLayerElementsTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idLayerElements", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idLayerElements");
					}

				} else {
					xmlWriter.writeStartElement("idLayerElements");
				}

				if (localIdLayerElements==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idLayerElements cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayerElements));
				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localRangesTracker){
				if (localRanges!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localRanges.length;i++){

						if (localRanges[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"ranges", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"ranges");
								}

							} else {
								xmlWriter.writeStartElement("ranges");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localAttributeNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"attributeName"));

				elementList.add(localAttributeName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttributeName));
			} if (localLocaleTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"locale"));

				elementList.add(localLocale==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
			} if (localIdLayerTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idLayer"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
			} if (localIdLayerElementsTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idLayerElements"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayerElements));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localRangesTracker){
				if (localRanges!=null){
					for (int i = 0;i < localRanges.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"ranges"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingAndElementsDataByIdLayerAndAttributeName parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingAndElementsDataByIdLayerAndAttributeName object =
						new GetGeomarketingAndElementsDataByIdLayerAndAttributeName();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingAndElementsDataByIdLayerAndAttributeName".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingAndElementsDataByIdLayerAndAttributeName)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list8 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","attributeName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setAttributeName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","locale").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setLocale(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idLayer").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdLayer(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdLayer(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idLayerElements").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdLayerElements(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdLayerElements(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list8.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone8 = false;
						while(!loopDone8){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone8 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){
									list8.add(reader.getElementText());

								}else{
									loopDone8 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setRanges((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list8));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingData
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingData",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for WktGeometry
		 */


		protected java.lang.String localWktGeometry ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localWktGeometryTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getWktGeometry(){
			return localWktGeometry;
		}



		/**
		 * Auto generated setter method
		 * @param param WktGeometry
		 */
		public void setWktGeometry(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localWktGeometryTracker = true;
			} else {
				localWktGeometryTracker = true;

			}

			this.localWktGeometry=param;


		}


		/**
		 * field for Srid
		 */


		protected java.lang.String localSrid ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSridTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getSrid(){
			return localSrid;
		}



		/**
		 * Auto generated setter method
		 * @param param Srid
		 */
		public void setSrid(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localSridTracker = true;
			} else {
				localSridTracker = true;

			}

			this.localSrid=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for Ranges
		 * This was an Array!
		 */


		protected int[] localRanges ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localRangesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getRanges(){
			return localRanges;
		}






		/**
		 * validate the array for Ranges
		 */
		protected void validateRanges(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param Ranges
		 */
		public void setRanges(int[] param){

			validateRanges(param);


			if (param != null){
				//update the setting tracker
				localRangesTracker = true;
			} else {
				localRangesTracker = false;

			}

			this.localRanges=param;
		}




		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingData.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingData",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingData",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localWktGeometryTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"wktGeometry", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"wktGeometry");
					}

				} else {
					xmlWriter.writeStartElement("wktGeometry");
				}


				if (localWktGeometry==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localWktGeometry);

				}

				xmlWriter.writeEndElement();
			} if (localSridTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"srid", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"srid");
					}

				} else {
					xmlWriter.writeStartElement("srid");
				}


				if (localSrid==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localSrid);

				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localRangesTracker){
				if (localRanges!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localRanges.length;i++){

						if (localRanges[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"ranges", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"ranges");
								}

							} else {
								xmlWriter.writeStartElement("ranges");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localWktGeometryTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"wktGeometry"));

				elementList.add(localWktGeometry==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWktGeometry));
			} if (localSridTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"srid"));

				elementList.add(localSrid==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSrid));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localRangesTracker){
				if (localRanges!=null){
					for (int i = 0;i < localRanges.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"ranges"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingData object =
						new GetGeomarketingData();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingData".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingData)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list6 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","wktGeometry").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setWktGeometry(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","srid").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setSrid(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list6.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone6 = false;
						while(!loopDone6){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone6 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){
									list6.add(reader.getElementText());

								}else{
									loopDone6 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setRanges((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list6));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetNumElements
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getNumElements",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for WktGeometry
		 */


		protected java.lang.String localWktGeometry ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localWktGeometryTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getWktGeometry(){
			return localWktGeometry;
		}



		/**
		 * Auto generated setter method
		 * @param param WktGeometry
		 */
		public void setWktGeometry(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localWktGeometryTracker = true;
			} else {
				localWktGeometryTracker = true;

			}

			this.localWktGeometry=param;


		}


		/**
		 * field for Srid
		 */


		protected java.lang.String localSrid ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localSridTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getSrid(){
			return localSrid;
		}



		/**
		 * Auto generated setter method
		 * @param param Srid
		 */
		public void setSrid(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localSridTracker = true;
			} else {
				localSridTracker = true;

			}

			this.localSrid=param;


		}


		/**
		 * field for IdLayer
		 */


		protected int localIdLayer ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdLayerTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdLayer(){
			return localIdLayer;
		}



		/**
		 * Auto generated setter method
		 * @param param IdLayer
		 */
		public void setIdLayer(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdLayerTracker = false;

			} else {
				localIdLayerTracker = true;
			}

			this.localIdLayer=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for IdMunicipio
		 */


		protected int localIdMunicipio ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdMunicipioTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdMunicipio(){
			return localIdMunicipio;
		}



		/**
		 * Auto generated setter method
		 * @param param IdMunicipio
		 */
		public void setIdMunicipio(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdMunicipioTracker = false;

			} else {
				localIdMunicipioTracker = true;
			}

			this.localIdMunicipio=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetNumElements.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getNumElements",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getNumElements",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localWktGeometryTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"wktGeometry", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"wktGeometry");
					}

				} else {
					xmlWriter.writeStartElement("wktGeometry");
				}


				if (localWktGeometry==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localWktGeometry);

				}

				xmlWriter.writeEndElement();
			} if (localSridTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"srid", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"srid");
					}

				} else {
					xmlWriter.writeStartElement("srid");
				}


				if (localSrid==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localSrid);

				}

				xmlWriter.writeEndElement();
			} if (localIdLayerTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idLayer", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idLayer");
					}

				} else {
					xmlWriter.writeStartElement("idLayer");
				}

				if (localIdLayer==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idLayer cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localIdMunicipioTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idMunicipio", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idMunicipio");
					}

				} else {
					xmlWriter.writeStartElement("idMunicipio");
				}

				if (localIdMunicipio==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idMunicipio cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdMunicipio));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localWktGeometryTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"wktGeometry"));

				elementList.add(localWktGeometry==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWktGeometry));
			} if (localSridTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"srid"));

				elementList.add(localSrid==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSrid));
			} if (localIdLayerTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idLayer"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localIdMunicipioTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idMunicipio"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdMunicipio));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetNumElements parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetNumElements object =
						new GetNumElements();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getNumElements".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetNumElements)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","wktGeometry").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setWktGeometry(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","srid").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setSrid(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idLayer").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdLayer(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdLayer(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idMunicipio").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdMunicipio(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdMunicipio(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingByIdLayerAndAttributeName
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingByIdLayerAndAttributeName",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for AttributeName
		 */


		protected java.lang.String localAttributeName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localAttributeNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getAttributeName(){
			return localAttributeName;
		}



		/**
		 * Auto generated setter method
		 * @param param AttributeName
		 */
		public void setAttributeName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localAttributeNameTracker = true;
			} else {
				localAttributeNameTracker = true;

			}

			this.localAttributeName=param;


		}


		/**
		 * field for Locale
		 */


		protected java.lang.String localLocale ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localLocaleTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getLocale(){
			return localLocale;
		}



		/**
		 * Auto generated setter method
		 * @param param Locale
		 */
		public void setLocale(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localLocaleTracker = true;
			} else {
				localLocaleTracker = true;

			}

			this.localLocale=param;


		}


		/**
		 * field for IdLayer
		 */


		protected int localIdLayer ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdLayerTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdLayer(){
			return localIdLayer;
		}



		/**
		 * Auto generated setter method
		 * @param param IdLayer
		 */
		public void setIdLayer(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdLayerTracker = false;

			} else {
				localIdLayerTracker = true;
			}

			this.localIdLayer=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for Ranges
		 * This was an Array!
		 */


		protected int[] localRanges ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localRangesTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getRanges(){
			return localRanges;
		}






		/**
		 * validate the array for Ranges
		 */
		protected void validateRanges(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param Ranges
		 */
		public void setRanges(int[] param){

			validateRanges(param);


			if (param != null){
				//update the setting tracker
				localRangesTracker = true;
			} else {
				localRangesTracker = false;

			}

			this.localRanges=param;
		}




		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingByIdLayerAndAttributeName.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingByIdLayerAndAttributeName",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingByIdLayerAndAttributeName",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localAttributeNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"attributeName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"attributeName");
					}

				} else {
					xmlWriter.writeStartElement("attributeName");
				}


				if (localAttributeName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localAttributeName);

				}

				xmlWriter.writeEndElement();
			} if (localLocaleTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"locale", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"locale");
					}

				} else {
					xmlWriter.writeStartElement("locale");
				}


				if (localLocale==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localLocale);

				}

				xmlWriter.writeEndElement();
			} if (localIdLayerTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idLayer", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idLayer");
					}

				} else {
					xmlWriter.writeStartElement("idLayer");
				}

				if (localIdLayer==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idLayer cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localRangesTracker){
				if (localRanges!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localRanges.length;i++){

						if (localRanges[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"ranges", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"ranges");
								}

							} else {
								xmlWriter.writeStartElement("ranges");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localAttributeNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"attributeName"));

				elementList.add(localAttributeName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttributeName));
			} if (localLocaleTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"locale"));

				elementList.add(localLocale==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
			} if (localIdLayerTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idLayer"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdLayer));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localRangesTracker){
				if (localRanges!=null){
					for (int i = 0;i < localRanges.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"ranges"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRanges[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("ranges cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingByIdLayerAndAttributeName parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingByIdLayerAndAttributeName object =
						new GetGeomarketingByIdLayerAndAttributeName();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingByIdLayerAndAttributeName".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingByIdLayerAndAttributeName)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list7 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","attributeName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setAttributeName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","locale").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setLocale(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idLayer").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdLayer(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdLayer(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list7.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone7 = false;
						while(!loopDone7){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone7 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","ranges").equals(reader.getName())){
									list7.add(reader.getElementText());

								}else{
									loopDone7 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setRanges((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list7));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetPortalStepRelations
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getPortalStepRelations",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for UserName
		 */


		protected java.lang.String localUserName ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localUserNameTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getUserName(){
			return localUserName;
		}



		/**
		 * Auto generated setter method
		 * @param param UserName
		 */
		public void setUserName(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localUserNameTracker = true;
			} else {
				localUserNameTracker = true;

			}

			this.localUserName=param;


		}


		/**
		 * field for Password
		 */


		protected java.lang.String localPassword ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPasswordTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPassword(){
			return localPassword;
		}



		/**
		 * Auto generated setter method
		 * @param param Password
		 */
		public void setPassword(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPasswordTracker = true;
			} else {
				localPasswordTracker = true;

			}

			this.localPassword=param;


		}


		/**
		 * field for IdEntidad
		 */


		protected int localIdEntidad ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdEntidadTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdEntidad(){
			return localIdEntidad;
		}



		/**
		 * Auto generated setter method
		 * @param param IdEntidad
		 */
		public void setIdEntidad(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdEntidadTracker = false;

			} else {
				localIdEntidadTracker = true;
			}

			this.localIdEntidad=param;


		}


		/**
		 * field for IdFeatureStreet
		 */


		protected int localIdFeatureStreet ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdFeatureStreetTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdFeatureStreet(){
			return localIdFeatureStreet;
		}



		/**
		 * Auto generated setter method
		 * @param param IdFeatureStreet
		 */
		public void setIdFeatureStreet(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdFeatureStreetTracker = false;

			} else {
				localIdFeatureStreetTracker = true;
			}

			this.localIdFeatureStreet=param;


		}


		/**
		 * field for IdFeatureStep
		 * This was an Array!
		 */


		protected int[] localIdFeatureStep ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdFeatureStepTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int[]
		 */
		public  int[] getIdFeatureStep(){
			return localIdFeatureStep;
		}






		/**
		 * validate the array for IdFeatureStep
		 */
		protected void validateIdFeatureStep(int[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param IdFeatureStep
		 */
		public void setIdFeatureStep(int[] param){

			validateIdFeatureStep(param);


			if (param != null){
				//update the setting tracker
				localIdFeatureStepTracker = true;
			} else {
				localIdFeatureStepTracker = false;

			}

			this.localIdFeatureStep=param;
		}




		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetPortalStepRelations.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getPortalStepRelations",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getPortalStepRelations",
							xmlWriter);
				}


			}
			if (localUserNameTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"userName", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"userName");
					}

				} else {
					xmlWriter.writeStartElement("userName");
				}


				if (localUserName==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localUserName);

				}

				xmlWriter.writeEndElement();
			} if (localPasswordTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"password", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"password");
					}

				} else {
					xmlWriter.writeStartElement("password");
				}


				if (localPassword==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPassword);

				}

				xmlWriter.writeEndElement();
			} if (localIdEntidadTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idEntidad", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idEntidad");
					}

				} else {
					xmlWriter.writeStartElement("idEntidad");
				}

				if (localIdEntidad==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idEntidad cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
				}

				xmlWriter.writeEndElement();
			} if (localIdFeatureStreetTracker){
				namespace = "http://geomarketing.webservices.localgis.com";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idFeatureStreet", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idFeatureStreet");
					}

				} else {
					xmlWriter.writeStartElement("idFeatureStreet");
				}

				if (localIdFeatureStreet==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStreet cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStreet));
				}

				xmlWriter.writeEndElement();
			} if (localIdFeatureStepTracker){
				if (localIdFeatureStep!=null) {
					namespace = "http://geomarketing.webservices.localgis.com";
					boolean emptyNamespace = namespace == null || namespace.length() == 0;
					prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
					for (int i = 0;i < localIdFeatureStep.length;i++){

						if (localIdFeatureStep[i]!=java.lang.Integer.MIN_VALUE) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,"idFeatureStep", namespace);
									xmlWriter.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,"idFeatureStep");
								}

							} else {
								xmlWriter.writeStartElement("idFeatureStep");
							}


							xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStep[i]));
							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStep cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localUserNameTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"userName"));

				elementList.add(localUserName==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
			} if (localPasswordTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"password"));

				elementList.add(localPassword==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
			} if (localIdEntidadTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idEntidad"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdEntidad));
			} if (localIdFeatureStreetTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"idFeatureStreet"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStreet));
			} if (localIdFeatureStepTracker){
				if (localIdFeatureStep!=null){
					for (int i = 0;i < localIdFeatureStep.length;i++){

						elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
								"idFeatureStep"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdFeatureStep[i]));



					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("idFeatureStep cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetPortalStepRelations parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetPortalStepRelations object =
						new GetPortalStepRelations();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getPortalStepRelations".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPortalStepRelations)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list5 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","userName").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setUserName(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","password").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPassword(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idEntidad").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdEntidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdEntidad(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStreet").equals(reader.getName())){

						java.lang.String content = reader.getElementText();

						object.setIdFeatureStreet(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdFeatureStreet(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStep").equals(reader.getName())){



						// Process the array and step past its final element's end.
						list5.add(reader.getElementText());

						//loop until we find a start element that is not part of this array
						boolean loopDone5 = false;
						while(!loopDone5){
							// Ensure we are at the EndElement
							while (!reader.isEndElement()){
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone5 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","idFeatureStep").equals(reader.getName())){
									list5.add(reader.getElementText());

								}else{
									loopDone5 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.setIdFeatureStep((int[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										int.class,list5));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class ExtensionMapper{

		public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
				java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{


			if (
					"http://geomarketing.webservices.localgis.com/xsd".equals(namespaceURI) &&
					"GeoMarketingOT2".equals(typeName)){

				return  GeoMarketingOT2.Factory.parse(reader);


			}


			if (
					"http://sql.java/xsd".equals(namespaceURI) &&
					"SQLException".equals(typeName)){

				return  SQLException.Factory.parse(reader);


			}


			if (
					"http://ot.model.geomarketing.webservices.localgis.com/xsd".equals(namespaceURI) &&
					"PostalDataOT".equals(typeName)){

				return  PostalDataOT.Factory.parse(reader);


			}


			if (
					"http://geomarketing.webservices.localgis.com".equals(namespaceURI) &&
					"Exception".equals(typeName)){

				return  Exception.Factory.parse(reader);


			}


			if (
					"http://administradorCartografia.server.geopista.com/xsd".equals(namespaceURI) &&
					"ACException".equals(typeName)){

				return  ACException.Factory.parse(reader);


			}


			if (
					"http://ot.model.geomarketing.webservices.localgis.com/xsd".equals(namespaceURI) &&
					"PortalStepRelationOT".equals(typeName)){

				return  PortalStepRelationOT.Factory.parse(reader);


			}


			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class GetGeomarketingDataResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingDataResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 */


		protected GeoMarketingOT2 local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return GeoMarketingOT2
		 */
		public  GeoMarketingOT2 get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(GeoMarketingOT2 param){

			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingDataResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingDataResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingDataResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return==null){

					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";

					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}


					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					local_return.serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
							factory,xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"return"));


				elementList.add(local_return==null?null:
					local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingDataResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingDataResponse object =
						new GetGeomarketingDataResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingDataResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingDataResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.set_return(null);
							reader.next();

							reader.next();

						}else{

							object.set_return(GeoMarketingOT2.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 * This was an Array!
		 */


		protected GeoMarketingOT2[] local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return GeoMarketingOT2[]
		 */
		public  GeoMarketingOT2[] get_return(){
			return local_return;
		}






		/**
		 * validate the array for _return
		 */
		protected void validate_return(GeoMarketingOT2[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(GeoMarketingOT2[] param){

			validate_return(param);


			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;
		}



		/**
		 * Auto generated add method for the array for convenience
		 * @param param GeoMarketingOT2
		 */
		public void add_return(GeoMarketingOT2 param){
			if (local_return == null){
				local_return = new GeoMarketingOT2[]{};
			}


			//update the setting tracker
			local_returnTracker = true;


			java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
			list.add(param);
			this.local_return =
					(GeoMarketingOT2[])list.toArray(
							new GeoMarketingOT2[list.size()]);

		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return!=null){
					for (int i = 0;i < local_return.length;i++){
						if (local_return[i] != null){
							local_return[i].serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
									factory,xmlWriter);
						} else {

							// write null attribute
							java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
							if (! namespace2.equals("")) {
								java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

								if (prefix2 == null) {
									prefix2 = generatePrefix(namespace2);

									xmlWriter.writeStartElement(prefix2,"return", namespace2);
									xmlWriter.writeNamespace(prefix2, namespace2);
									xmlWriter.setPrefix(prefix2, namespace2);

								} else {
									xmlWriter.writeStartElement(namespace2,"return");
								}

							} else {
								xmlWriter.writeStartElement("return");
							}

							// write the nil attribute
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				if (local_return!=null) {
					for (int i = 0;i < local_return.length;i++){

						if (local_return[i] != null){
							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(local_return[i]);
						} else {

							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"return"));
					elementList.add(local_return);

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse object =
						new GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list1.add(null);
							reader.next();
						} else {
							list1.add(GeoMarketingOT2.Factory.parse(reader));
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while(!loopDone1){
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list1.add(null);
										reader.next();
									} else {
										list1.add(GeoMarketingOT2.Factory.parse(reader));
									}
								}else{
									loopDone1 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.set_return((GeoMarketingOT2[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										GeoMarketingOT2.class,
										list1));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetPostalDataFromIdTramosAndIdViaResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"getPostalDataFromIdTramosAndIdViaResponse",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for _return
		 * This was an Array!
		 */


		protected PostalDataOT[] local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;


		/**
		 * Auto generated getter method
		 * @return PostalDataOT[]
		 */
		public  PostalDataOT[] get_return(){
			return local_return;
		}






		/**
		 * validate the array for _return
		 */
		protected void validate_return(PostalDataOT[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(PostalDataOT[] param){

			validate_return(param);


			if (param != null){
				//update the setting tracker
				local_returnTracker = true;
			} else {
				local_returnTracker = true;

			}

			this.local_return=param;
		}



		/**
		 * Auto generated add method for the array for convenience
		 * @param param PostalDataOT
		 */
		public void add_return(PostalDataOT param){
			if (local_return == null){
				local_return = new PostalDataOT[]{};
			}


			//update the setting tracker
			local_returnTracker = true;


			java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
			list.add(param);
			this.local_return =
					(PostalDataOT[])list.toArray(
							new PostalDataOT[list.size()]);

		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					GetPostalDataFromIdTramosAndIdViaResponse.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getPostalDataFromIdTramosAndIdViaResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getPostalDataFromIdTramosAndIdViaResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return!=null){
					for (int i = 0;i < local_return.length;i++){
						if (local_return[i] != null){
							local_return[i].serialize(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return"),
									factory,xmlWriter);
						} else {

							// write null attribute
							java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
							if (! namespace2.equals("")) {
								java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

								if (prefix2 == null) {
									prefix2 = generatePrefix(namespace2);

									xmlWriter.writeStartElement(prefix2,"return", namespace2);
									xmlWriter.writeNamespace(prefix2, namespace2);
									xmlWriter.setPrefix(prefix2, namespace2);

								} else {
									xmlWriter.writeStartElement(namespace2,"return");
								}

							} else {
								xmlWriter.writeStartElement("return");
							}

							// write the nil attribute
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"return", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"return");
						}

					} else {
						xmlWriter.writeStartElement("return");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				if (local_return!=null) {
					for (int i = 0;i < local_return.length;i++){

						if (local_return[i] != null){
							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(local_return[i]);
						} else {

							elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
									"return"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
							"return"));
					elementList.add(local_return);

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetPostalDataFromIdTramosAndIdViaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetPostalDataFromIdTramosAndIdViaResponse object =
						new GetPostalDataFromIdTramosAndIdViaResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getPostalDataFromIdTramosAndIdViaResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPostalDataFromIdTramosAndIdViaResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list1.add(null);
							reader.next();
						} else {
							list1.add(PostalDataOT.Factory.parse(reader));
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while(!loopDone1){
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","return").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list1.add(null);
										reader.next();
									} else {
										list1.add(PostalDataOT.Factory.parse(reader));
									}
								}else{
									loopDone1 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.set_return((PostalDataOT[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										PostalDataOT.class,
										list1));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class PostalDataOT
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = PostalDataOT
                Namespace URI = http://ot.model.geomarketing.webservices.localgis.com/xsd
                Namespace Prefix = ns11
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://ot.model.geomarketing.webservices.localgis.com/xsd")){
				return "ns11";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for Apellido1
		 */


		protected java.lang.String localApellido1 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localApellido1Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getApellido1(){
			return localApellido1;
		}



		/**
		 * Auto generated setter method
		 * @param param Apellido1
		 */
		public void setApellido1(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localApellido1Tracker = true;
			} else {
				localApellido1Tracker = true;

			}

			this.localApellido1=param;


		}


		/**
		 * field for Apellido2
		 */


		protected java.lang.String localApellido2 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localApellido2Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getApellido2(){
			return localApellido2;
		}



		/**
		 * Auto generated setter method
		 * @param param Apellido2
		 */
		public void setApellido2(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localApellido2Tracker = true;
			} else {
				localApellido2Tracker = true;

			}

			this.localApellido2=param;


		}


		/**
		 * field for Bloque
		 */


		protected java.lang.String localBloque ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBloqueTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBloque(){
			return localBloque;
		}



		/**
		 * Auto generated setter method
		 * @param param Bloque
		 */
		public void setBloque(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localBloqueTracker = true;
			} else {
				localBloqueTracker = true;

			}

			this.localBloque=param;


		}


		/**
		 * field for Calificadornumero
		 */


		protected java.lang.String localCalificadornumero ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localCalificadornumeroTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getCalificadornumero(){
			return localCalificadornumero;
		}



		/**
		 * Auto generated setter method
		 * @param param Calificadornumero
		 */
		public void setCalificadornumero(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localCalificadornumeroTracker = true;
			} else {
				localCalificadornumeroTracker = true;

			}

			this.localCalificadornumero=param;


		}


		/**
		 * field for Calificadornumerosuperior
		 */


		protected java.lang.String localCalificadornumerosuperior ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localCalificadornumerosuperiorTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getCalificadornumerosuperior(){
			return localCalificadornumerosuperior;
		}



		/**
		 * Auto generated setter method
		 * @param param Calificadornumerosuperior
		 */
		public void setCalificadornumerosuperior(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localCalificadornumerosuperiorTracker = true;
			} else {
				localCalificadornumerosuperiorTracker = true;

			}

			this.localCalificadornumerosuperior=param;


		}


		/**
		 * field for Codigomunicipio
		 */


		protected int localCodigomunicipio ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localCodigomunicipioTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getCodigomunicipio(){
			return localCodigomunicipio;
		}



		/**
		 * Auto generated setter method
		 * @param param Codigomunicipio
		 */
		public void setCodigomunicipio(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localCodigomunicipioTracker = true;

			} else {
				localCodigomunicipioTracker = true;
			}

			this.localCodigomunicipio=param;


		}


		/**
		 * field for Codigoprovincia
		 */


		protected int localCodigoprovincia ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localCodigoprovinciaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getCodigoprovincia(){
			return localCodigoprovincia;
		}



		/**
		 * Auto generated setter method
		 * @param param Codigoprovincia
		 */
		public void setCodigoprovincia(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localCodigoprovinciaTracker = true;

			} else {
				localCodigoprovinciaTracker = true;
			}

			this.localCodigoprovincia=param;


		}


		/**
		 * field for Codigovia
		 */


		protected int localCodigovia ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localCodigoviaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getCodigovia(){
			return localCodigovia;
		}



		/**
		 * Auto generated setter method
		 * @param param Codigovia
		 */
		public void setCodigovia(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localCodigoviaTracker = true;

			} else {
				localCodigoviaTracker = true;
			}

			this.localCodigovia=param;


		}


		/**
		 * field for Dni
		 */


		protected java.lang.String localDni ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localDniTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getDni(){
			return localDni;
		}



		/**
		 * Auto generated setter method
		 * @param param Dni
		 */
		public void setDni(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localDniTracker = true;
			} else {
				localDniTracker = true;

			}

			this.localDni=param;


		}


		/**
		 * field for Hectometro
		 */


		protected int localHectometro ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localHectometroTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getHectometro(){
			return localHectometro;
		}



		/**
		 * Auto generated setter method
		 * @param param Hectometro
		 */
		public void setHectometro(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localHectometroTracker = true;

			} else {
				localHectometroTracker = true;
			}

			this.localHectometro=param;


		}


		/**
		 * field for Id_escalera
		 */


		protected java.lang.String localId_escalera ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localId_escaleraTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getId_escalera(){
			return localId_escalera;
		}



		/**
		 * Auto generated setter method
		 * @param param Id_escalera
		 */
		public void setId_escalera(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localId_escaleraTracker = true;
			} else {
				localId_escaleraTracker = true;

			}

			this.localId_escalera=param;


		}


		/**
		 * field for Id_via
		 */


		protected int localId_via ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localId_viaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getId_via(){
			return localId_via;
		}



		/**
		 * Auto generated setter method
		 * @param param Id_via
		 */
		public void setId_via(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localId_viaTracker = true;

			} else {
				localId_viaTracker = true;
			}

			this.localId_via=param;


		}


		/**
		 * field for Kilometro
		 */


		protected int localKilometro ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localKilometroTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getKilometro(){
			return localKilometro;
		}



		/**
		 * Auto generated setter method
		 * @param param Kilometro
		 */
		public void setKilometro(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localKilometroTracker = true;

			} else {
				localKilometroTracker = true;
			}

			this.localKilometro=param;


		}


		/**
		 * field for Letradni
		 */


		protected java.lang.String localLetradni ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localLetradniTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getLetradni(){
			return localLetradni;
		}



		/**
		 * Auto generated setter method
		 * @param param Letradni
		 */
		public void setLetradni(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localLetradniTracker = true;
			} else {
				localLetradniTracker = true;

			}

			this.localLetradni=param;


		}


		/**
		 * field for Nombre
		 */


		protected java.lang.String localNombre ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNombreTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getNombre(){
			return localNombre;
		}



		/**
		 * Auto generated setter method
		 * @param param Nombre
		 */
		public void setNombre(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localNombreTracker = true;
			} else {
				localNombreTracker = true;

			}

			this.localNombre=param;


		}


		/**
		 * field for Nombrevia
		 */


		protected java.lang.String localNombrevia ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNombreviaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getNombrevia(){
			return localNombrevia;
		}



		/**
		 * Auto generated setter method
		 * @param param Nombrevia
		 */
		public void setNombrevia(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localNombreviaTracker = true;
			} else {
				localNombreviaTracker = true;

			}

			this.localNombrevia=param;


		}


		/**
		 * field for Numero
		 */


		protected int localNumero ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNumeroTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getNumero(){
			return localNumero;
		}



		/**
		 * Auto generated setter method
		 * @param param Numero
		 */
		public void setNumero(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localNumeroTracker = true;

			} else {
				localNumeroTracker = true;
			}

			this.localNumero=param;


		}


		/**
		 * field for Numerosuperior
		 */


		protected int localNumerosuperior ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNumerosuperiorTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getNumerosuperior(){
			return localNumerosuperior;
		}



		/**
		 * Auto generated setter method
		 * @param param Numerosuperior
		 */
		public void setNumerosuperior(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localNumerosuperiorTracker = true;

			} else {
				localNumerosuperiorTracker = true;
			}

			this.localNumerosuperior=param;


		}


		/**
		 * field for Part_apell1
		 */


		protected java.lang.String localPart_apell1 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPart_apell1Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPart_apell1(){
			return localPart_apell1;
		}



		/**
		 * Auto generated setter method
		 * @param param Part_apell1
		 */
		public void setPart_apell1(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPart_apell1Tracker = true;
			} else {
				localPart_apell1Tracker = true;

			}

			this.localPart_apell1=param;


		}


		/**
		 * field for Part_apell2
		 */


		protected java.lang.String localPart_apell2 ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPart_apell2Tracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPart_apell2(){
			return localPart_apell2;
		}



		/**
		 * Auto generated setter method
		 * @param param Part_apell2
		 */
		public void setPart_apell2(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPart_apell2Tracker = true;
			} else {
				localPart_apell2Tracker = true;

			}

			this.localPart_apell2=param;


		}


		/**
		 * field for Planta
		 */


		protected java.lang.String localPlanta ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPlantaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPlanta(){
			return localPlanta;
		}



		/**
		 * Auto generated setter method
		 * @param param Planta
		 */
		public void setPlanta(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPlantaTracker = true;
			} else {
				localPlantaTracker = true;

			}

			this.localPlanta=param;


		}


		/**
		 * field for Puerta
		 */


		protected java.lang.String localPuerta ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localPuertaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getPuerta(){
			return localPuerta;
		}



		/**
		 * Auto generated setter method
		 * @param param Puerta
		 */
		public void setPuerta(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localPuertaTracker = true;
			} else {
				localPuertaTracker = true;

			}

			this.localPuerta=param;


		}


		/**
		 * field for Tipolocal
		 */


		protected java.lang.String localTipolocal ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localTipolocalTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getTipolocal(){
			return localTipolocal;
		}



		/**
		 * Auto generated setter method
		 * @param param Tipolocal
		 */
		public void setTipolocal(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localTipolocalTracker = true;
			} else {
				localTipolocalTracker = true;

			}

			this.localTipolocal=param;


		}


		/**
		 * field for Tiponumero
		 */


		protected java.lang.String localTiponumero ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localTiponumeroTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getTiponumero(){
			return localTiponumero;
		}



		/**
		 * Auto generated setter method
		 * @param param Tiponumero
		 */
		public void setTiponumero(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localTiponumeroTracker = true;
			} else {
				localTiponumeroTracker = true;

			}

			this.localTiponumero=param;


		}


		/**
		 * field for Tipovia
		 */


		protected java.lang.String localTipovia ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localTipoviaTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getTipovia(){
			return localTipovia;
		}



		/**
		 * Auto generated setter method
		 * @param param Tipovia
		 */
		public void setTipovia(java.lang.String param){

			if (param != null){
				//update the setting tracker
				localTipoviaTracker = true;
			} else {
				localTipoviaTracker = true;

			}

			this.localTipovia=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					PostalDataOT.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ot.model.geomarketing.webservices.localgis.com/xsd");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":PostalDataOT",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"PostalDataOT",
							xmlWriter);
				}


			}
			if (localApellido1Tracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"apellido1", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"apellido1");
					}

				} else {
					xmlWriter.writeStartElement("apellido1");
				}


				if (localApellido1==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localApellido1);

				}

				xmlWriter.writeEndElement();
			} if (localApellido2Tracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"apellido2", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"apellido2");
					}

				} else {
					xmlWriter.writeStartElement("apellido2");
				}


				if (localApellido2==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localApellido2);

				}

				xmlWriter.writeEndElement();
			} if (localBloqueTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"bloque", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"bloque");
					}

				} else {
					xmlWriter.writeStartElement("bloque");
				}


				if (localBloque==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBloque);

				}

				xmlWriter.writeEndElement();
			} if (localCalificadornumeroTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"calificadornumero", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"calificadornumero");
					}

				} else {
					xmlWriter.writeStartElement("calificadornumero");
				}


				if (localCalificadornumero==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localCalificadornumero);

				}

				xmlWriter.writeEndElement();
			} if (localCalificadornumerosuperiorTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"calificadornumerosuperior", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"calificadornumerosuperior");
					}

				} else {
					xmlWriter.writeStartElement("calificadornumerosuperior");
				}


				if (localCalificadornumerosuperior==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localCalificadornumerosuperior);

				}

				xmlWriter.writeEndElement();
			} if (localCodigomunicipioTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"codigomunicipio", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"codigomunicipio");
					}

				} else {
					xmlWriter.writeStartElement("codigomunicipio");
				}

				if (localCodigomunicipio==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigomunicipio));
				}

				xmlWriter.writeEndElement();
			} if (localCodigoprovinciaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"codigoprovincia", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"codigoprovincia");
					}

				} else {
					xmlWriter.writeStartElement("codigoprovincia");
				}

				if (localCodigoprovincia==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoprovincia));
				}

				xmlWriter.writeEndElement();
			} if (localCodigoviaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"codigovia", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"codigovia");
					}

				} else {
					xmlWriter.writeStartElement("codigovia");
				}

				if (localCodigovia==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigovia));
				}

				xmlWriter.writeEndElement();
			} if (localDniTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"dni", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"dni");
					}

				} else {
					xmlWriter.writeStartElement("dni");
				}


				if (localDni==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localDni);

				}

				xmlWriter.writeEndElement();
			} if (localHectometroTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"hectometro", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"hectometro");
					}

				} else {
					xmlWriter.writeStartElement("hectometro");
				}

				if (localHectometro==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHectometro));
				}

				xmlWriter.writeEndElement();
			} if (localId_escaleraTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"id_escalera", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"id_escalera");
					}

				} else {
					xmlWriter.writeStartElement("id_escalera");
				}


				if (localId_escalera==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localId_escalera);

				}

				xmlWriter.writeEndElement();
			} if (localId_viaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"id_via", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"id_via");
					}

				} else {
					xmlWriter.writeStartElement("id_via");
				}

				if (localId_via==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId_via));
				}

				xmlWriter.writeEndElement();
			} if (localKilometroTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"kilometro", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"kilometro");
					}

				} else {
					xmlWriter.writeStartElement("kilometro");
				}

				if (localKilometro==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKilometro));
				}

				xmlWriter.writeEndElement();
			} if (localLetradniTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"letradni", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"letradni");
					}

				} else {
					xmlWriter.writeStartElement("letradni");
				}


				if (localLetradni==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localLetradni);

				}

				xmlWriter.writeEndElement();
			} if (localNombreTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"nombre", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"nombre");
					}

				} else {
					xmlWriter.writeStartElement("nombre");
				}


				if (localNombre==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localNombre);

				}

				xmlWriter.writeEndElement();
			} if (localNombreviaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"nombrevia", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"nombrevia");
					}

				} else {
					xmlWriter.writeStartElement("nombrevia");
				}


				if (localNombrevia==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localNombrevia);

				}

				xmlWriter.writeEndElement();
			} if (localNumeroTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"numero", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"numero");
					}

				} else {
					xmlWriter.writeStartElement("numero");
				}

				if (localNumero==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
				}

				xmlWriter.writeEndElement();
			} if (localNumerosuperiorTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"numerosuperior", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"numerosuperior");
					}

				} else {
					xmlWriter.writeStartElement("numerosuperior");
				}

				if (localNumerosuperior==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumerosuperior));
				}

				xmlWriter.writeEndElement();
			} if (localPart_apell1Tracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"part_apell1", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"part_apell1");
					}

				} else {
					xmlWriter.writeStartElement("part_apell1");
				}


				if (localPart_apell1==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPart_apell1);

				}

				xmlWriter.writeEndElement();
			} if (localPart_apell2Tracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"part_apell2", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"part_apell2");
					}

				} else {
					xmlWriter.writeStartElement("part_apell2");
				}


				if (localPart_apell2==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPart_apell2);

				}

				xmlWriter.writeEndElement();
			} if (localPlantaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"planta", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"planta");
					}

				} else {
					xmlWriter.writeStartElement("planta");
				}


				if (localPlanta==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPlanta);

				}

				xmlWriter.writeEndElement();
			} if (localPuertaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"puerta", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"puerta");
					}

				} else {
					xmlWriter.writeStartElement("puerta");
				}


				if (localPuerta==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localPuerta);

				}

				xmlWriter.writeEndElement();
			} if (localTipolocalTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"tipolocal", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"tipolocal");
					}

				} else {
					xmlWriter.writeStartElement("tipolocal");
				}


				if (localTipolocal==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localTipolocal);

				}

				xmlWriter.writeEndElement();
			} if (localTiponumeroTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"tiponumero", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"tiponumero");
					}

				} else {
					xmlWriter.writeStartElement("tiponumero");
				}


				if (localTiponumero==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localTiponumero);

				}

				xmlWriter.writeEndElement();
			} if (localTipoviaTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"tipovia", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"tipovia");
					}

				} else {
					xmlWriter.writeStartElement("tipovia");
				}


				if (localTipovia==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localTipovia);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localApellido1Tracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"apellido1"));

				elementList.add(localApellido1==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApellido1));
			} if (localApellido2Tracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"apellido2"));

				elementList.add(localApellido2==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApellido2));
			} if (localBloqueTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"bloque"));

				elementList.add(localBloque==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBloque));
			} if (localCalificadornumeroTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"calificadornumero"));

				elementList.add(localCalificadornumero==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalificadornumero));
			} if (localCalificadornumerosuperiorTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"calificadornumerosuperior"));

				elementList.add(localCalificadornumerosuperior==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalificadornumerosuperior));
			} if (localCodigomunicipioTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"codigomunicipio"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigomunicipio));
			} if (localCodigoprovinciaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"codigoprovincia"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoprovincia));
			} if (localCodigoviaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"codigovia"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigovia));
			} if (localDniTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"dni"));

				elementList.add(localDni==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDni));
			} if (localHectometroTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"hectometro"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHectometro));
			} if (localId_escaleraTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"id_escalera"));

				elementList.add(localId_escalera==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId_escalera));
			} if (localId_viaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"id_via"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId_via));
			} if (localKilometroTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"kilometro"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKilometro));
			} if (localLetradniTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"letradni"));

				elementList.add(localLetradni==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLetradni));
			} if (localNombreTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"nombre"));

				elementList.add(localNombre==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombre));
			} if (localNombreviaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"nombrevia"));

				elementList.add(localNombrevia==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombrevia));
			} if (localNumeroTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"numero"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
			} if (localNumerosuperiorTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"numerosuperior"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumerosuperior));
			} if (localPart_apell1Tracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"part_apell1"));

				elementList.add(localPart_apell1==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPart_apell1));
			} if (localPart_apell2Tracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"part_apell2"));

				elementList.add(localPart_apell2==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPart_apell2));
			} if (localPlantaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"planta"));

				elementList.add(localPlanta==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlanta));
			} if (localPuertaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"puerta"));

				elementList.add(localPuerta==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPuerta));
			} if (localTipolocalTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"tipolocal"));

				elementList.add(localTipolocal==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipolocal));
			} if (localTiponumeroTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"tiponumero"));

				elementList.add(localTiponumero==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTiponumero));
			} if (localTipoviaTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"tipovia"));

				elementList.add(localTipovia==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipovia));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static PostalDataOT parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				PostalDataOT object =
						new PostalDataOT();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"PostalDataOT".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PostalDataOT)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","apellido1").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setApellido1(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","apellido2").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setApellido2(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","bloque").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setBloque(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","calificadornumero").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setCalificadornumero(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","calificadornumerosuperior").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setCalificadornumerosuperior(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","codigomunicipio").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setCodigomunicipio(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setCodigomunicipio(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setCodigomunicipio(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","codigoprovincia").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setCodigoprovincia(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setCodigoprovincia(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setCodigoprovincia(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","codigovia").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setCodigovia(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setCodigovia(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setCodigovia(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","dni").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setDni(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","hectometro").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setHectometro(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setHectometro(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setHectometro(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","id_escalera").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setId_escalera(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","id_via").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setId_via(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setId_via(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setId_via(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","kilometro").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setKilometro(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setKilometro(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setKilometro(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","letradni").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setLetradni(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","nombre").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNombre(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","nombrevia").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNombrevia(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","numero").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNumero(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setNumero(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setNumero(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","numerosuperior").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setNumerosuperior(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setNumerosuperior(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setNumerosuperior(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","part_apell1").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPart_apell1(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","part_apell2").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPart_apell2(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","planta").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPlanta(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","puerta").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setPuerta(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","tipolocal").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setTipolocal(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","tiponumero").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setTiponumero(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","tipovia").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setTipovia(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class ACException extends Exception
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = ACException
                Namespace URI = http://administradorCartografia.server.geopista.com/xsd
                Namespace Prefix = ns7
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://administradorCartografia.server.geopista.com/xsd")){
				return "ns7";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					ACException.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}


			java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://administradorCartografia.server.geopista.com/xsd");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						namespacePrefix+":ACException",
						xmlWriter);
			} else {
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						"ACException",
						xmlWriter);
			}

			if (localExceptionTracker){

				if (localException!=null){
					if (localException instanceof org.apache.axis2.databinding.ADBBean){
						((org.apache.axis2.databinding.ADBBean)localException).serialize(
								new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception"),
								factory,xmlWriter,true);
					} else {
						java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
						if (! namespace2.equals("")) {
							java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

							if (prefix2 == null) {
								prefix2 = generatePrefix(namespace2);

								xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
								xmlWriter.writeNamespace(prefix2, namespace2);
								xmlWriter.setPrefix(prefix2, namespace2);

							} else {
								xmlWriter.writeStartElement(namespace2,"Exception");
							}

						} else {
							xmlWriter.writeStartElement("Exception");
						}
						org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localException, xmlWriter);
						xmlWriter.writeEndElement();
					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"Exception", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"Exception");
						}

					} else {
						xmlWriter.writeStartElement("Exception");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}


			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();


			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
			attribList.add(new javax.xml.namespace.QName("http://administradorCartografia.server.geopista.com/xsd","ACException"));
			if (localExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"Exception"));


				elementList.add(localException==null?null:
					localException);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ACException parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				ACException object =
						new ACException();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"ACException".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ACException)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","Exception").equals(reader.getName())){

						object.setException(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
								ExtensionMapper.class));

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class PortalStepRelationOT
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = PortalStepRelationOT
                Namespace URI = http://ot.model.geomarketing.webservices.localgis.com/xsd
                Namespace Prefix = ns11
		 */


		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://ot.model.geomarketing.webservices.localgis.com/xsd")){
				return "ns11";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for Distance
		 */


		protected double localDistance ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localDistanceTracker = false ;


		/**
		 * Auto generated getter method
		 * @return double
		 */
		public  double getDistance(){
			return localDistance;
		}



		/**
		 * Auto generated setter method
		 * @param param Distance
		 */
		public void setDistance(double param){

			// setting primitive attribute tracker to true

			if (java.lang.Double.isNaN(param)) {
				localDistanceTracker = true;

			} else {
				localDistanceTracker = true;
			}

			this.localDistance=param;


		}


		/**
		 * field for IdPortal
		 */


		protected int localIdPortal ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdPortalTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdPortal(){
			return localIdPortal;
		}



		/**
		 * Auto generated setter method
		 * @param param IdPortal
		 */
		public void setIdPortal(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdPortalTracker = true;

			} else {
				localIdPortalTracker = true;
			}

			this.localIdPortal=param;


		}


		/**
		 * field for IdTramo
		 */


		protected int localIdTramo ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIdTramoTracker = false ;


		/**
		 * Auto generated getter method
		 * @return int
		 */
		public  int getIdTramo(){
			return localIdTramo;
		}



		/**
		 * Auto generated setter method
		 * @param param IdTramo
		 */
		public void setIdTramo(int param){

			// setting primitive attribute tracker to true

			if (param==java.lang.Integer.MIN_VALUE) {
				localIdTramoTracker = true;

			} else {
				localIdTramoTracker = true;
			}

			this.localIdTramo=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					PortalStepRelationOT.this.serialize(parentQName,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ot.model.geomarketing.webservices.localgis.com/xsd");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":PortalStepRelationOT",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"PortalStepRelationOT",
							xmlWriter);
				}


			}
			if (localDistanceTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"distance", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"distance");
					}

				} else {
					xmlWriter.writeStartElement("distance");
				}

				if (java.lang.Double.isNaN(localDistance)) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDistance));
				}

				xmlWriter.writeEndElement();
			} if (localIdPortalTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idPortal", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idPortal");
					}

				} else {
					xmlWriter.writeStartElement("idPortal");
				}

				if (localIdPortal==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPortal));
				}

				xmlWriter.writeEndElement();
			} if (localIdTramoTracker){
				namespace = "http://ot.model.geomarketing.webservices.localgis.com/xsd";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"idTramo", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"idTramo");
					}

				} else {
					xmlWriter.writeStartElement("idTramo");
				}

				if (localIdTramo==java.lang.Integer.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTramo));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localDistanceTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"distance"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDistance));
			} if (localIdPortalTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"idPortal"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPortal));
			} if (localIdTramoTracker){
				elementList.add(new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd",
						"idTramo"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTramo));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static PortalStepRelationOT parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				PortalStepRelationOT object =
						new PortalStepRelationOT();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"PortalStepRelationOT".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PortalStepRelationOT)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","distance").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setDistance(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

						} else {


							object.setDistance(java.lang.Double.NaN);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setDistance(java.lang.Double.NaN);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","idPortal").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setIdPortal(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setIdPortal(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdPortal(java.lang.Integer.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://ot.model.geomarketing.webservices.localgis.com/xsd","idTramo").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

							java.lang.String content = reader.getElementText();

							object.setIdTramo(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						} else {


							object.setIdTramo(java.lang.Integer.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIdTramo(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class NamingException
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://geomarketing.webservices.localgis.com",
				"NamingException",
				"ns8");



		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://geomarketing.webservices.localgis.com")){
				return "ns8";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}



		/**
		 * field for NamingException
		 */


		protected java.lang.Object localNamingException ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localNamingExceptionTracker = false ;


		/**
		 * Auto generated getter method
		 * @return java.lang.Object
		 */
		public  java.lang.Object getNamingException(){
			return localNamingException;
		}



		/**
		 * Auto generated setter method
		 * @param param NamingException
		 */
		public void setNamingException(java.lang.Object param){

			if (param != null){
				//update the setting tracker
				localNamingExceptionTracker = true;
			} else {
				localNamingExceptionTracker = true;

			}

			this.localNamingException=param;


		}


		/**
		 * isReaderMTOMAware
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try{
				isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			}catch(java.lang.IllegalArgumentException e){
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}


		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

				public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
					NamingException.this.serialize(MY_QNAME,factory,xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME,factory,dataSource);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,factory,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://geomarketing.webservices.localgis.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":NamingException",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"NamingException",
							xmlWriter);
				}


			}
			if (localNamingExceptionTracker){

				if (localNamingException!=null){
					if (localNamingException instanceof org.apache.axis2.databinding.ADBBean){
						((org.apache.axis2.databinding.ADBBean)localNamingException).serialize(
								new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException"),
								factory,xmlWriter,true);
					} else {
						java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
						if (! namespace2.equals("")) {
							java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

							if (prefix2 == null) {
								prefix2 = generatePrefix(namespace2);

								xmlWriter.writeStartElement(prefix2,"NamingException", namespace2);
								xmlWriter.writeNamespace(prefix2, namespace2);
								xmlWriter.setPrefix(prefix2, namespace2);

							} else {
								xmlWriter.writeStartElement(namespace2,"NamingException");
							}

						} else {
							xmlWriter.writeStartElement("NamingException");
						}
						org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localNamingException, xmlWriter);
						xmlWriter.writeEndElement();
					}
				} else {

					// write null attribute
					java.lang.String namespace2 = "http://geomarketing.webservices.localgis.com";
					if (! namespace2.equals("")) {
						java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

						if (prefix2 == null) {
							prefix2 = generatePrefix(namespace2);

							xmlWriter.writeStartElement(prefix2,"NamingException", namespace2);
							xmlWriter.writeNamespace(prefix2, namespace2);
							xmlWriter.setPrefix(prefix2, namespace2);

						} else {
							xmlWriter.writeStartElement(namespace2,"NamingException");
						}

					} else {
						xmlWriter.writeStartElement("NamingException");
					}

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}


			}
			xmlWriter.writeEndElement();


		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace,attName,attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName,attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localNamingExceptionTracker){
				elementList.add(new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com",
						"NamingException"));


				elementList.add(localNamingException==null?null:
					localNamingException);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static NamingException parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				NamingException object =
						new NamingException();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)){
						// Skip the element and report the null value.  It cannot have subelements.
						while (!reader.isEndElement())
							reader.next();

						return null;


					}

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"NamingException".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (NamingException)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://geomarketing.webservices.localgis.com","NamingException").equals(reader.getName())){

						object.setNamingException(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
								ExtensionMapper.class));

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */




	/**
	 *  get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
		return factory.getDefaultEnvelope();
	}


	private  java.lang.Object fromOM(
			org.apache.axiom.om.OMElement param,
			java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

		try {

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelations.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPortalStepRelationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdVia.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElements.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetNumElementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.SQLExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeName.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingByIdLayerAndAttributeNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeName.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GetGeomarketingAndElementsDataByIdLayerAndAttributeNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.NamingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.class.equals(type)){

				return com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.ACExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}




}
