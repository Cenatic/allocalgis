package com.geopista.server.backup.web;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.plus.jaas.JAASUserPrincipal;
import org.exolab.castor.xml.Unmarshaller;

import admcarApp.PasarelaAdmcar;

import com.geopista.protocol.control.Sesion;
import com.geopista.server.administradorCartografia.ACException;
import com.geopista.server.administradorCartografia.ACMessage;
import com.geopista.server.administradorCartografia.ACQuery;
import com.geopista.server.administradorCartografia.PermissionException;
import com.geopista.server.administradorCartografia.SystemMapException;
import com.geopista.server.database.CPoolDatabase;
import com.geopista.util.ServletContextListener;



/**
 * Servlet que recibe las peticiones http de los clientes para hacer peticiones a la BBDD. Se envian peticiones
 * multipart, por si el tama�o de las peticiones fuera grande. Se parsea a xml y en esta clase se desparsean y se
 * recoje el elemento ACQuery. Con la accion se discrimina la peticion y se obtienen los parametros en caso de que
 * los haya.
 * */



public class BackupServlet extends HttpServlet
{
    private org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(BackupServlet.class);

    public int numeroServlet = 0;
    
    private static boolean dbOracle = false;
    
    public static final int CREAR_USUARIO = 0;
	public static final int BORRAR_USUARIO = 1;
	public static final String USUARIO = "usuario";
	public static final String PASSWORD = "password";
    
    public void init(ServletConfig config) throws ServletException{
    	
    	super.init(config);

    	try{

//    		Connection conn=CPoolDatabase.getConnection();
//    		if (conn!=null){
//    			if (((org.enhydra.jdbc.core.CoreConnection)conn).con instanceof org.postgresql.PGConnection)
//    				dbOracle=false;
//    			else
//    				dbOracle=true;
//    			conn.close();
//    			CPoolDatabase.releaseConexion();
//
//    		}
//    		else{
//    			logger.info("Conexion contra la BD no disponible");
//    		}

    		ServletContextListener.numeroCat ++;

    		numeroServlet = ServletContextListener.numeroCat;

    		System.out.println("Instantiated Cat a new "+config.getServletName()+" object. Total:"+ServletContextListener.numeroCat);

    	} catch (Exception e){
    		e.printStackTrace();
    		logger.error(e.getMessage());
    	}

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    /**
     * Metodo que mediante el request lee el ACQuery y analiza que accion se desea realiza para llamar a la clase
     * COperacionesDGC que es la que conecta con BBDD. El resultado se escribe en el objeto oos y se vuelve a enviar.
     *
     * @param request Los datos e la peticion.
     * @param response Los datos de la respuesta
     * @throws ServletException
     * @throws IOException
     * */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	    	
    	System.out.println("[BackupServlet : doPost ]: Entrando en servlet Backup");
        ObjectOutputStream oos=null;
        try{
//            JAASUserPrincipal jassUserPrincipal = (JAASUserPrincipal) request.getUserPrincipal();
//            Sesion userSesion = PasarelaAdmcar.listaSesiones.getSesion(jassUserPrincipal.getName());

            ACQuery query= new ACQuery();
            Vector docsFiles= new Vector();
            logger.error("[BackupServlet : doPost ]: dentro try");
            if(!org.apache.commons.fileupload.DiskFileUpload.isMultipartContent(request))
            {
                /* -- PostMethod --  */

            logger.debug("[BackupServlet : doPost ]: en if cogiendo la query");
            logger.debug("MENSAJE XML ----------"+request.getParameter("mensajeXML"));

                ACMessage abQuery= (ACMessage) Unmarshaller.unmarshal(ACMessage.class,new StringReader(request.getParameter("mensajeXML")));
                ObjectInputStream ois= new ObjectInputStream(new ByteArrayInputStream(abQuery.getQuery()));
                query= (ACQuery)ois.readObject();
            }
            else
            {
                /** -- MultiPartPost -- */
               // Create a new file upload handler
                org.apache.commons.fileupload.DiskFileUpload upload= new org.apache.commons.fileupload.DiskFileUpload();
                List items= upload.parseRequest(request);

                // Process the uploaded items
                Iterator iter= items.iterator();

                while (iter.hasNext())
                {
                    org.apache.commons.fileupload.FileItem item= (org.apache.commons.fileupload.FileItem) iter.next();

                    if (item.isFormField())
                    {
                       if (item.getFieldName().equalsIgnoreCase("mensajeXML"))
                       {
                           ACMessage abQuery=(ACMessage)Unmarshaller.unmarshal(ACMessage.class,new StringReader(item.getString("ISO-8859-1")));
                           ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(abQuery.getQuery()));
                           query=(ACQuery)ois.readObject();

                           logger.debug("MENSAJE XML:"+item.getString("ISO-8859-1"));
                       }
//                       else if (item.getFieldName().equalsIgnoreCase(com.geopista.protocol.net.EnviarSeguro.idMunicipio)){
//                           String sMunicipio = item.getString("ISO-8859-1");
//                           userSesion.setIdMunicipio(sMunicipio);
//                        }
                    }
                   
                }
            }
           
            
            response.setHeader("Transfer-encoding","chunked");
            response.setHeader("Content-Encoding", "gzip");
            oos= new ObjectOutputStream(new GZIPOutputStream(response.getOutputStream()));
            
            String usuario = (String)query.getParams().get(USUARIO);
            String password = (String) query.getParams().get(PASSWORD);

            Sesion sesion= sesion(request);
            switch (query.getAction())
            {
                case CREAR_USUARIO:
                {
                	
                    //Creaci�n rol
                	String sSQL= "CREATE USER " + usuario + " WITH PASSWORD '" + password + "' SUPERUSER";

                			PreparedStatement ps= null;
                			Connection conn= null;

                			try{
                				conn= CPoolDatabase.getConnection();
                				ps= conn.prepareStatement(sSQL);
                				ps.execute();
                				//conn.commit();
                			}
                			catch (Exception e){
                				throw e;
                			}
                			finally{
                				try{ps.close();}catch(Exception e){};
                				try{conn.close();}catch(Exception e){};
                			}
                	break;
                }
                case BORRAR_USUARIO:
                {
                	//Borrado rol
                	String sSQL= "DROP ROLE " + usuario;;

        			PreparedStatement ps= null;
        			Connection conn= null;

        			try{
        				conn= CPoolDatabase.getConnection();
        				ps= conn.prepareStatement(sSQL);
        				ps.execute();
        				//conn.commit();
        			}
        			catch (Exception e){
        				throw e;
        			}
        			finally{
        				try{ps.close();}catch(Exception e){};
        				try{conn.close();}catch(Exception e){};
        			}
                    break;
                }
                
            }
        }
        catch(PermissionException pe){
            try{
                oos.writeObject(new ACException(pe));
            }
            catch(Exception ex){};
        }
        catch(SystemMapException pe)
        {
            try
            {
            	oos.writeObject(new ACException(pe));
            }
            catch(Exception ex){};
        }/** MultiPartPost */
        catch (org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException pe){
            try{
                oos.writeObject(new ACException(pe));
            }
            catch(Exception ex){};
        }
        /** java.lang.OutOfMemoryError */
        catch (java.lang.Error e){
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            try{
                oos.writeObject(new ACException(e));
            }
            catch(Exception ex){};
        }
        catch(Exception e) {
//            e.printStackTrace();
            log(e.getMessage());
            throw new RuntimeException(e);
        }
        finally{
            try{oos.close();}catch(Exception e){};
        }
    }

    /**
     * Metodo que obtiene la sesion del usuario que ha hecho la peticion.
     *
     * @param request Datos de la peticion.
     * */
    private Sesion sesion(HttpServletRequest request)
    {
        Sesion sRet=null;
        JAASUserPrincipal userPrincipal = (JAASUserPrincipal)request.getUserPrincipal();
        if (userPrincipal!=null)
        {
            String  sIdSesion= userPrincipal.getName();
            sRet=PasarelaAdmcar.listaSesiones.getSesion(sIdSesion);
        }
        return sRet;
    }

}
