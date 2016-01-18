package com.localgis.server.taskscheduler.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ScheduleUtils {

	/**
	 * Clase que invoca por reflexi�n el m�todo de la clase de la tarea a ejecutar
	 * @param cls: Clase de la tarea a ejecutar
	 * @param method: Nombre del m�todo de la tarea a ejecutar
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void executeClass(Class<?> cls, String method) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Method meth = cls.getMethod(method, String[].class);
	    String[] params = null;
	    meth.invoke(null, (Object) params); 
	}
	
}
