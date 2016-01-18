package com.geopista.utils.alfresco.manager.beans;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author david.caaveiro
 * @company SATEC
 * @date 10-04-2012
 * @version 1.0
 * @ClassComments Bean que contiene el nombre del nodo y la clave un�voca de Alfresco
 */
public class AlfrescoNode extends DefaultMutableTreeNode {

	/**
	 * Variables
	 */
	private String name;
	private String uuid;
	
	/**
	 * Constructor
	 */
	public AlfrescoNode() {		
	}
	
	/**
	 * Constructor
	 * @param name: Nombre del nodo
	 * @param uuid: Clave un�voca
	 */
	public AlfrescoNode(String name, String uuid) {
		this.name = name;
		this.uuid = uuid;
	}
	
	/**
	 * Getter name
	 * @return String: Nombre del nodo
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter name
	 * @param name: Nombre del nodo
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter uuid
	 * @return String: Clave un�voca
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * Setter uuid
	 * @param uuid: Clave un�voca
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * @override: toString()
	 * @return String: Nombre del nodo
	 */
	@Override
	public String toString() {
		return getName();
	}	
}
