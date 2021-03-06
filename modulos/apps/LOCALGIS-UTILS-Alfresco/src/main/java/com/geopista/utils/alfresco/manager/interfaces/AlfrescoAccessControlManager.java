/**
 * AlfrescoAccessControlManager.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.utils.alfresco.manager.interfaces;

import java.rmi.RemoteException;

import org.alfresco.webservice.accesscontrol.ACE;
import org.alfresco.webservice.accesscontrol.ACL;
import org.alfresco.webservice.accesscontrol.AccessControlFault;
import org.alfresco.webservice.accesscontrol.AccessStatus;
import org.alfresco.webservice.accesscontrol.GetPermissionsResult;
import org.alfresco.webservice.accesscontrol.HasPermissionsResult;

import com.geopista.utils.alfresco.manager.beans.AlfrescoKey;

/**
 * @author david.caaveiro
 * @company SATEC
 * @date 10-04-2012
 * @version 1.0
 */
public interface AlfrescoAccessControlManager {
	
	/**
	 * Constantes (Roles)
	 */
	public static final String ACE_PERMISSION_ADMINISTRATOR = "Administrator"; //Administrador
	public static final String ACE_PERMISSION_COORDINATOR = "Coordinator"; //Coordinador
	public static final String ACE_PERMISSION_COLLABORATOR = "Collaborator"; //Colaborador
	public static final String ACE_PERMISSION_CONTRIBUTOR = "Contributor"; //Coautor
	public static final String ACE_PERMISSION_EDITOR = "Editor"; //Editor
	public static final String ACE_PERMISSION_CONSUMER = "Consumer"; //Lector
	
	/**
	 * Constantes (Tipos de autoridad)
	 */
	public static final String TYPE_GROUP = "GROUP";
	public static final String TYPE_USER = "USER";
	
	
	/**
	 * Metodos abstractos
	 */
	public abstract boolean hasPermission(AlfrescoKey key, ACE ace) throws AccessControlFault, RemoteException;
	public abstract boolean hasPermission(AlfrescoKey key, String userName, AccessStatus accessStatus, String [] permission) throws AccessControlFault, RemoteException;
	public abstract boolean hasPermission(AlfrescoKey key, String userName, String [] permission) throws AccessControlFault, RemoteException;
	public abstract boolean hasPermission(AlfrescoKey key, String userName, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean hasAllPermissions(AlfrescoKey key, String userName) throws AccessControlFault, RemoteException;
	public abstract HasPermissionsResult [] hasPermission(AlfrescoKey key, String [] permissions) throws AccessControlFault, RemoteException;
	public abstract boolean hasPermission(AlfrescoKey key, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean hasAllPermissions(AlfrescoKey key) throws AccessControlFault, RemoteException;
	public abstract boolean addGroup(String groupName) throws AccessControlFault, RemoteException;
	public abstract String [] addUsersToGroup(String groupName, String [] userName) throws AccessControlFault, RemoteException;
	public abstract boolean addUserToGroup(String groupName, String userName) throws AccessControlFault, RemoteException;
	public abstract ACL [] addAccess(AlfrescoKey key, ACE [] aces) throws AccessControlFault, RemoteException;
	public abstract ACL [] addAccess(AlfrescoKey key, ACE ace) throws AccessControlFault, RemoteException;
	public abstract boolean addAccess(AlfrescoKey key, String name, AccessStatus accessStatus, String [] permission) throws AccessControlFault, RemoteException;
	public abstract boolean addAccess(AlfrescoKey key, String name, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean addAllAccess(AlfrescoKey key, String name) throws AccessControlFault, RemoteException;
	public abstract boolean addAccessToGroup(AlfrescoKey key, String groupName, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean addAllAccessToGroup(AlfrescoKey key, String groupName) throws AccessControlFault, RemoteException;
	public abstract boolean addAccessToUser(AlfrescoKey key, String userName, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean addAllAccessToUser(AlfrescoKey key, String userName) throws AccessControlFault, RemoteException;
	public abstract boolean denyAccess(AlfrescoKey key, String name, String  [] permission) throws AccessControlFault, RemoteException;
	public abstract boolean denyAllAccess(AlfrescoKey key, String name) throws AccessControlFault, RemoteException;
	public abstract boolean denyAccessToGroup(AlfrescoKey key, String groupName, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean denyAllAccessToGroup(AlfrescoKey key, String groupName) throws AccessControlFault, RemoteException;
	public abstract boolean denyAccessToUser(AlfrescoKey key, String userName, String permission) throws AccessControlFault, RemoteException;
	public abstract boolean denyAllAccessToUser(AlfrescoKey key, String userName) throws AccessControlFault, RemoteException;
	public abstract boolean setInheritPermission(AlfrescoKey key, boolean inheritPermission) throws AccessControlFault, RemoteException;
	public abstract boolean existsGroup(String groupName) throws AccessControlFault, RemoteException;
	public abstract boolean existsUserInGroup(String groupName, String userName) throws AccessControlFault, RemoteException;	
	public abstract String [] getAllAuthoritiesFromType(String type) throws AccessControlFault, RemoteException;
	public abstract String [] getAllGroups() throws AccessControlFault, RemoteException;
	public abstract String [] getAllUsers() throws AccessControlFault, RemoteException;
	public abstract GetPermissionsResult [] getPermissions(AlfrescoKey key) throws AccessControlFault, RemoteException;
	public abstract boolean deleteGroups(String [] groupNames) throws AccessControlFault, RemoteException;
	public abstract boolean deleteGroup(String groupName) throws AccessControlFault, RemoteException;
	public abstract boolean deleteUsersFromGroup(String groupName, String [] userNames) throws AccessControlFault, RemoteException;
	public abstract boolean deleteUserFromGroup(String groupName, String userName) throws AccessControlFault, RemoteException;

}
