package com.ermapper.ecw;

/**
 * Excepci�n que se lanza cuando se intenta establecer una vista inv�lida para la imagen
 */
public class JNCSInvalidSetViewException extends JNCSException
{

    public JNCSInvalidSetViewException()
    {
    }

    public JNCSInvalidSetViewException(String s)
    {
        super(s);
    }
}
