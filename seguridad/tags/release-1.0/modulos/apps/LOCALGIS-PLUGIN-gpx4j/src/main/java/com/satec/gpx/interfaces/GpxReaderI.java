package com.satec.gpx.interfaces;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface GpxReaderI<T> {
	
	/**
	 * Devuelve la versi�n de GPX que soporta la clase
	 * @return versi�n soportada
	 */
	public String getGpxVersion();
	public T readGpxFile(File file) throws IOException;
	public T readGpxFile(String filename) throws IOException;
	public T readGpxFile(File file, InputStream input) throws IOException;
}
