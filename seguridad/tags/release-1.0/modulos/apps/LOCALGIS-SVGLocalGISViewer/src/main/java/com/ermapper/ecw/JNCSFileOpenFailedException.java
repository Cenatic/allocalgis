package com.ermapper.ecw;

/**
 * Excepci�n que se lanza si se produce un error al abrir el fichero
 */
public class JNCSFileOpenFailedException extends JNCSException
{

    public JNCSFileOpenFailedException()
    {
    }

    public JNCSFileOpenFailedException(String s)
    {
        super(s);
    }
}
