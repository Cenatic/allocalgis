package com.ermapper.ecw;

/**
 * Excepci�n que se lanza cuando se realiza una operaci�n no permitida sobre un fichero que a�n no ha sido abierto 
 */
public class JNCSFileNotOpenException extends JNCSException
{

    public JNCSFileNotOpenException()
    {
    }

    public JNCSFileNotOpenException(String s)
    {
        super(s);
    }
}
