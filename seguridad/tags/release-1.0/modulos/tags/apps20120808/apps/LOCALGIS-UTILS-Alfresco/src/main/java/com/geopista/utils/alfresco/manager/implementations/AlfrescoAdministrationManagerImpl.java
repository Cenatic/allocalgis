package com.geopista.utils.alfresco.manager.implementations;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.alfresco.webservice.administration.AdministrationFault;
import org.alfresco.webservice.administration.NewUserDetails;
import org.alfresco.webservice.administration.UserDetails;
import org.alfresco.webservice.administration.UserFilter;
import org.alfresco.webservice.administration.UserQueryResults;
import org.alfresco.webservice.types.NamedValue;
import org.alfresco.webservice.util.Constants;
import org.alfresco.webservice.util.WebServiceFactory;

import com.geopista.utils.alfresco.manager.interfaces.AlfrescoAdministrationManager;

/**
 * @author david.caaveiro
 * @company SATEC
 * @date 10-04-2012
 * @version 1.0
 * @ClassComments Clase que gestiona los usuarios de Alfresco (los m�todos requieren autenticaci�n)
 */
public class AlfrescoAdministrationManagerImpl implements AlfrescoAdministrationManager {
	
	/**
     * Variables
     */
	private static AlfrescoAdministrationManagerImpl instance = new AlfrescoAdministrationManagerImpl();
	   
	/**
     * Constructor
     */
	protected AlfrescoAdministrationManagerImpl() {
	}
	
	/**
     * Solicita la instancia �nica de la clase (Singleton)
     * @return AlfrescoAdministrationManagerImpl
     */
	public static AlfrescoAdministrationManagerImpl getInstance(){
		return instance;
	}
	
	/**
	 * Crea usuarios
	 * @param users: Array de detalles de los usuarios a crear
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails []: Array de detalles de los usuarios creados
	 */
	public UserDetails [] addUsers(NewUserDetails [] users) throws AdministrationFault, RemoteException{
		return WebServiceFactory.getAdministrationService().createUsers(users);		 
	}
	
	/**
	 * Crea un usuario
	 * @param users: Detalles del usuario a crear
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario creado
	 */
	public UserDetails addUser(NewUserDetails user) throws AdministrationFault, RemoteException{
		UserDetails [] users = addUsers(new NewUserDetails [] {user});
		if(users != null && users.length > 0)
			return users[0];
		return null;
	}
	
	/**
	 * Crea un usuario
	 * @param userName: Nombre del usuario a crear
	 * @param password: Contrase�a del usuario a crear
	 * @param properties: Array de propiedades del usuario a crear
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario creado
	 */
	public UserDetails addUser(String userName, String password, NamedValue [] properties) throws AdministrationFault, RemoteException{
		NewUserDetails user = new NewUserDetails();
		user.setUserName(userName);
		user.setPassword(password);
		if(properties == null){
			properties = new NamedValue[3];
            properties[0] = new NamedValue(Constants.PROP_USER_FIRSTNAME, false, userName, null);
            properties[1] = new NamedValue(Constants.PROP_USER_LASTNAME, false, userName, null);
            properties[2] = new NamedValue(Constants.PROP_USER_EMAIL, false, userName + "@localgis.com", null);
		}
		user.setProperties(properties);
		return addUser(user);
	}
		
	/**
	 * Crea un usuario
	 * @param userName: Nombre del usuario a crear
	 * @param password: Contrase�a del usuario a crear
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario creado
	 */
	public UserDetails addUser(String userName, String password) throws AdministrationFault, RemoteException{
		return addUser(userName, password, null);
	}
	
	/**
	 * Solicita el resultado de la existencia de un usuario
	 * @param userName: Nombre del usuario
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return bolean: Resultado de la existencia del usuario
	 */
	public boolean existsUser(String userName) throws AdministrationFault, RemoteException{
		UserFilter userFilter = new UserFilter();
		userFilter.setUserName(userName);
		UserQueryResults userQueryResults = WebServiceFactory.getAdministrationService().queryUsers(userFilter);
		if(userQueryResults != null && userQueryResults.getUserDetails() != null && userQueryResults.getUserDetails().length > 0)
			return true;
		return false;
	}
	
	/**
	 * Solicita los detalles del usuario por su nombre
	 * @param userName: Nombre del usuario
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario
	 */
	public UserDetails getUser(String userName) throws AdministrationFault, RemoteException{
		return WebServiceFactory.getAdministrationService().getUser(userName);
	}
	
	/**
	 * Actualiza los detalles de los usuarios
	 * @param users: Array con los detalles de usuarios
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Array con los detalles de los usuarios
	 */
	public UserDetails [] setUsers(UserDetails [] users) throws AdministrationFault, RemoteException{
		return WebServiceFactory.getAdministrationService().updateUsers(users);
	}
	
	/**
	 * Actualiza los detalles de un usuario
	 * @param users: Detalles del usuario
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario
	 */
	public UserDetails setUser(UserDetails user) throws AdministrationFault, RemoteException{
		UserDetails [] users = setUsers(new UserDetails [] {user});
		if(users != null && users.length > 0)
			return users[0];
		return null;
	}
	
	/**
	 * Actualiza las propiedades de un usuario
	 * @param userName: Nombre del usuario
	 * @param properties: Array de propiedades a actualizar
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return UserDetails: Detalles del usuario
	 */
	public UserDetails setUser(String userName, NamedValue [] properties) throws AdministrationFault, RemoteException{
		UserDetails user = getUser(userName);
		user.setProperties(properties);
		return setUser(user);
	}
	
	/**
	 * Cambia la contrase�a de un usuario
	 * @param userName: Nombre del usuario
	 * @param newPassword: Contrase�a nueva
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return boolean: Resultado del cambio de contrase�a
	 */
	public boolean setPassword(String userName, String newPassword) throws AdministrationFault, RemoteException{
		WebServiceFactory.getAdministrationService().changePassword(userName, null, newPassword);
		return true;
	}
	
	/**
	 * Borra usuarios
	 * @param userNames: Array de nombres de los usuarios a borrar
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return boolean: Resultado del borrado de usuarios
	 */
	public boolean deleteUsers(String [] userNames) throws AdministrationFault, RemoteException{
		WebServiceFactory.getAdministrationService().deleteUsers(userNames);
		return true;
	}
	
	/**
	 * Borra usuario
	 * @param userNames: Nombre del usuario a borrar
	 * @throws AdministrationFault
	 * @throws RemoteException
	 * @return boolean: Resultado del borrado del usuario
	 */
	public boolean deleteUser(String userName) throws AdministrationFault, RemoteException{
		return deleteUsers(new String [] {userName});
	}
	
}
