package com.geopista.utils.alfresco.manager.beans;

import java.io.Serializable;

/**
 * @author david.caaveiro
 * @company SATEC
 * @date 10-04-2012
 * @version 1.0
 * @ClassComments Bean con la clave un�voca (path o uuid) de un elemento de Alfresco
 */
public class AlfrescoKey implements Serializable{

	/**
	 * Constantes
	 */
	public static final int KEY_UUID = 1;
	public static final int KEY_PATH = 2;
	
	/**
	 * Variables
	 */
	private String key;		
	private int keyType;

	/**
	 * Constructor
	 * @param key: Clave un�voca
	 * @param keyType: Tipo de clave un�voca 
	 */
	public AlfrescoKey(String key, int keyType) {
		this.key = key;
		this.keyType = keyType;
	}

	/**
	 * Getter key
	 * @return String: Clave un�voca
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Setter key
	 * @param key: Clave un�voca
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Getter keyType
	 * @return int: Tipo de clave un�voca (KEY_UUID o KEY_PATH)
	 */
	public int getKeyType() {
		return keyType;
	}

	/**
	 * Setter keyType
	 * @param int: Tipo de clave un�voca (KEY_UUID o KEY_PATH)
	 */
	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}

	/**
	 * @override: toString()
	 * @return String: Clave un�voca
	 */
	@Override
	public String toString() {
		return key;
	}
	
}
