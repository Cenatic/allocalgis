package es.satec.gps;

import org.apache.log4j.Logger;

import es.satec.gps.exceptions.GPSAlreadyStartedException;
import es.satec.gps.exceptions.GPSException;

/**
 * Controlador del GPS.
 * <p>
 * Inicializa el GPS y permite consultar la informaci�n que proporciona
 * el dispositivo de GPS.
 * 
 */
public class GPSController {
    private Logger log = (Logger) Logger.getInstance(GPSReader.class);

    private static GPSController instance = null;
    private GPSReader gpsReader = null;
    private static String gpsPropertiesResource = null;

    private GPSController() {
    	if (gpsPropertiesResource == null)
    		gpsReader = new GPSReader();
    	else
    		gpsReader = new GPSReader(gpsPropertiesResource);
    }

    /**
     * Obtiene una instancia del controlador de GPS
     * 
     * @return Instancia del controlador de GPS
     */
    public static GPSController getInstance() {
        if (instance == null)
            instance = new GPSController();
        return instance;
    }
    
    public static void init(String propertiesResource) {
    	gpsPropertiesResource = propertiesResource;
    }

    /**
     * Inicia la lectura de informaci�n del GPS.
     * 
     * @throws GPSAlreadyStartedException Si el gps ya est� inciado
     * @throws GPSException Si se produce alg�n error al iniciar el GPS
     */
    public void startReading() throws GPSAlreadyStartedException, GPSException {
        log.debug("Iniciamos el subsistema de GPS");
//        monitor.debug("Iniciamos el subsistema de GPS");
        if (gpsReader.isEnabled()) {
            if (!gpsReader.isRunnig()) {
                gpsReader.start();
            } else {
                log.error("El GPS ya esta iniciado");
//                monitor.error("El GPS ya esta iniciado");
                throw new GPSAlreadyStartedException("El gps ya esta iniciado");
            }
        } else {
            log.error("El GPS esta desactivado o mal configurado");
//            monitor.error("El GPS esta desactivado o mal configurado");
            throw new GPSException("El gps esta desactivado");
        }
    }

    /**
     * Detiene la lectura de datos del GPS
     */
    public void stopReading() {
        log.debug("Detenemos el subsistema de GPS");
//        monitor.debug("Detenemos el subsistema de GPS");
        gpsReader.stopThread();
    }

    /**
     * Devuelve la informaci�n proporcionada por el GPS para la situaci�n
     * actual del dispositivo m�vil.
     * 
     * @return Objeto con la informaci�n proporcionada por el GPS
     */
    public GPSInfo getGPSInfo() {
        return gpsReader.getGPSInfo();
    }

}
