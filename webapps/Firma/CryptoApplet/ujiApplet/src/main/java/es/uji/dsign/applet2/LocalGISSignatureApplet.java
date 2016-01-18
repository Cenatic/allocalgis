package es.uji.dsign.applet2;

/**
 * Applet de firma de PDF. Utiliza el applet de firma modificado por SATEC. Las
 * modificaciones consisten fundamentalmente en que se pinte el interfaz gr�fico
 * en el propio applet y no en un frame externo. Al haber hecho estos cambios
 * podr�a pasar que no funcione correctamente otro tipo de firma que no sea la
 * PDF, debido al interfaz gr�fico, no a la algoritmica. Adem�s no funcionar�a
 * la apertura desde la barra de menu de ficheros PKCS12 ya que no tenemos un
 * frame, por tanto no tenemos menubar y no tenemos esta funcionalidad
 * 
 * @author albegarcia
 * 
 */
public class LocalGISSignatureApplet extends SignatureApplet {

    private static final long serialVersionUID = 1L;

    public void init() {
        super.init();
        //setSignatureOutputFormat("PDF");
        //setSignatureOutputFormat("XADES_MITYC");
        setInputDataEncoding("PLAIN");
        signDataPDFLocalToPDFLocal();
    }


}
