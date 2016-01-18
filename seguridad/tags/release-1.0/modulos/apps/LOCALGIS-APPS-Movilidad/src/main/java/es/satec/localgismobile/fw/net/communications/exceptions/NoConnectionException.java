package es.satec.localgismobile.fw.net.communications.exceptions;

import org.apache.log4j.Logger;

import es.satec.localgismobile.fw.Global;
import es.satec.localgismobile.fw.net.communications.HttpManager;

public class NoConnectionException extends Exception {
	
	private static Logger log = Global.getLoggerFor(NoConnectionException.class);
	
	private int httpCode;
	
	public NoConnectionException(){		
		super("ERROR de CONEXI�N.");
		log.error("ERROR de CONEXI�N.");
		//se pone -1 por indicar alg�n n�mero, pero no tiene 
		//ning�n valor sem�ntico sobre el error de conexi�n
		this.httpCode = -1;
	}
	
	public NoConnectionException(int code){
		super("ERROR de CONEXI�N. HTTP Code == " + code);
		log.error("ERROR de CONEXI�N. HTTP Code == " + code);
		this.httpCode = code;
	}
	
	public NoConnectionException(String mensaje){
		super("ERROR de CONEXI�N: "+mensaje);
		log.error("ERROR de CONEXI�N: "+mensaje);
		//se pone -1 por indicar alg�n n�mero, pero no tiene 
		//ning�n valor sem�ntico sobre el error de conexi�n
		this.httpCode = -1;
	}

	public int getHttpCode() {
		return httpCode;
	}

}
