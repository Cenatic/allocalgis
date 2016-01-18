/**
 * Utils.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.mobile.svg;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Utils {
	
	/**
	 * Codifica una cadena de caracteres en UTF-8
	 * @param src
	 * @return
	 */
    public static String parseUTF8(String src) {
//    	String result = null;
//		try {
//			result = new String(line.getBytes("UTF-8"));
//		} catch (UnsupportedEncodingException e) {}
//		return result;
    	CharSequence chsec = src;
    	String s = "";
    	int v = 0;
    	for (int i = 0; i < chsec.length(); i++) {
    		v = chsec.charAt(i);
    		if(v<128){
    			s = s + chsec.charAt(i);
    		}
    		//a partir del car�cter 128 pondremos la codificaci�n en XML
    		else {
    			s = s + "&#"+v+";";
    		}
		}
    	
    	return s;
    }
    
    /**
     * Transforma una cadena de UTF8 a LATIN.
     * @param src
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String parseFromUtf8ToLatin(String src) throws UnsupportedEncodingException{
    	String out = new String(src.getBytes("8859_1"), "utf-8");
    	return out;
    }

    /**
     * Transforma un fichero de UTF8 a LATIN.
     * @param file
     * @return ByteArrayInputStream
     * @throws UnsupportedEncodingException
     */
    public static ByteArrayInputStream parseFromUtf8ToLatin(File file) {
    	FileInputStream fin = null;
    	int ch;
    	StringBuffer fileContent = new StringBuffer("");
    	try{
    		fin = new FileInputStream(file);
	    	while((ch = fin.read()) != -1){
	    		fileContent.append((char)ch);
	    	}
    		return new ByteArrayInputStream(fileContent.toString().getBytes("UTF8"));
    	}
    	catch(FileNotFoundException e){
    		System.out.println(e);
    	}
    	catch(IOException e){
    		System.out.println(e);
    	}
    	finally{
    		try {
				fin.close();
			} catch (IOException e) {
				System.out.println(e);
			}
    	}
		return null;
    }
    
	/**
	 * Codifica una cadena de caracteres en entidades HTML
	 * @param line
	 * @return
	 */
    public static String parseHTML(String line) {
    	String result = line.replace("<", "&lt;");
        result = result.replace("<","&lt;");
        result = result.replace(">", "&gt;");
        result = result.replace("<", "&lt;");
        result = result.replace("'", "&quot;");
        result = result.replace("�", "&ntilde;");
        result = result.replace("�", "&Ntilde;");
        result = result.replace("�", "&Ccedil;");
        result = result.replace("�", "&ccedil;");
        
        result = result.replace("�", "&aacute;");
        result = result.replace("�", "&eacute;");       
        result = result.replace("�", "&iacute;");     
        result = result.replace("�", "&oacute;");     
        result = result.replace("�", "&uacute;");
        
        result = result.replace("�", "&Aacute;");
        result = result.replace("�", "&Eacute;");       
        result = result.replace("�", "&Iacute;");     
        result = result.replace("�", "&Oacute;");     
        result = result.replace("�", "&Uacute;");     
        
        result = result.replace("�", "&agrave;");
        result = result.replace("�", "&egrave;");       
        result = result.replace("�", "&igrave;");     
        result = result.replace("�", "&ograve;");     
        result = result.replace("�", "&ugrave;");     
        
        result = result.replace("�", "&Agrave;");
        result = result.replace("�", "&Egrave;");       
        result = result.replace("�", "&Igrave;");     
        result = result.replace("�", "&Ograve;");     
        result = result.replace("�", "&Ugrave;");         
        
        return result;
    }
    
	/**
	 * Redondea un double a nDec decimales
	 * @param nD
	 * @param nDec
	 * @return
	 */
	public static double redondear(double nD, int nDec){  
	  return Math.round(nD*Math.pow(10,nDec))/Math.pow(10,nDec);  
	} 
	
}
