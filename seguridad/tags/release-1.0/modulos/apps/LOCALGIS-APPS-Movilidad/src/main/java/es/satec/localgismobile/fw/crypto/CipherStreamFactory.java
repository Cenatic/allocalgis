package es.satec.localgismobile.fw.crypto;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;

import es.satec.localgismobile.fw.crypto.keystore.exceptions.KeyNotFoundException;
import es.satec.localgismobile.fw.crypto.keystore.exceptions.KeyStoreAccessException;
import es.satec.localgismobile.fw.crypto.keystore.imagekeystore.ImageKeyStore;
import es.satec.localgismobile.fw.crypto.keystore.interfaces.IKeyStore;

/**
 * Clase factor�a que se encarga de devolver streams de cifrado correctamente
 * configurados para la encriptacion y la desencriptaci�n
 * @author jpolo
 *
 */

public class CipherStreamFactory {

	/**
	 *  Almacen del que se recupera la clave utilizada para la encriptacion
	 *  y desencriptaci�n
	 */
	private static IKeyStore keyStore = null;
	/**
	 * Tama�o en bits de la clave de cifrado
	 */
	private static int keySize = 0;
	/**
	 * Array de bytes que contiene la clave de cifrado
	 */
	private static byte byteArrayKey[] = null;
	
	static {
		keyStore = new ImageKeyStore();
		keySize = 256;
		
		try {
			loadKey();
		} catch (KeyStoreAccessException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	/**
	 * M�todo que devuelve un stream de salida configurado para que la salida
	 * sea encriptada
	 * @param unEncryptedOutputStream Stream de salida sobre el que se desea encriptar
	 * @return Stream de salida encriptado
	 */
	public static OutputStream getOutputStream(OutputStream unEncryptedOutputStream){
		BlockCipher engine = new AESEngine();
		BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));

		cipher.init(true, new KeyParameter(byteArrayKey));
		SatecBufferedCipherOutputStream cipherOutputStream = new SatecBufferedCipherOutputStream(unEncryptedOutputStream, cipher);
		return cipherOutputStream;

	}
	
	/**
	 * M�todo que devuelve un stream de entrada configurado para que la entrada
	 * sea desencriptada
	 * @param encryptedInputStream Stream de entrada ya encriptado que se desea desencriptar 
	 * @return Stream de entrada desencriptado
	 * @throws IOException Si se produce un error al leer del stream de entrada
	 */
	public static InputStream getInputStream(InputStream encryptedInputStream) throws IOException {
		BlockCipher engine = new AESEngine();
		BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));

		cipher.init(false, new KeyParameter(byteArrayKey));
		SatecBufferedCipherInputStream cipherInputStream = new SatecBufferedCipherInputStream(encryptedInputStream, cipher);
		return cipherInputStream;		
	}
	
	/**
	 * Carga la clave de cifrado del almac�n de claves
	 * @throws KeyStoreAccessException Si se produce un error al acceder al almacen de claves
	 */
	private static void loadKey() throws KeyStoreAccessException{
		try {
			byteArrayKey = keyStore.loadKey();
		} catch (KeyNotFoundException e) {			
			byteArrayKey = new byte[keySize/8];
			for (int i = 0; i < byteArrayKey.length; i++)
				byteArrayKey[i] = (byte) ((new Double(Math.random() * 255)).intValue() & 0xFF);
			
			keyStore.saveKey(byteArrayKey);
		}
	}
}
