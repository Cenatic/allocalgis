El proyecto est� desarrollado utilizando un Tomcat versi�n 6.0.14.

Para que la aplicaci�n funcione correctamente desde el Tomcat integrado en el
Eclipse hay que a�adir unas variables. Para ello:

- Run -> Run Configurations
- Entrar en el servidor Tomcat correspondiente (dentro de Apache Tomcat en el
  �rbol de la izquierda)
- En la pesta�a de Environment crear las siguientes variables:
     PATH=C:\Archivos de programa\LocalGIS\mapserver\cgi-bin
     PROJ_LIB=C:\Archivos de programa\LocalGIS\mapserver\proj 
	 
	
Para generar para diferentes entornos con sustitucion de cadenas por los valores reales hay que
ejecutar

mvn package -P MODELO_PRO (Para el entorno de produccion de MODELO)

Los diferentes entornos se configuran en la parte final del pom.xml y los parametros a sustituir estan en el fichero
localgis.properties (al final del todo para cada entorno) y se ejecutan desde el fichero build.xml (que se llama desde el 
propio pom.xml)	


mvn clean package -P MODELO_PRO -s c:\Users\fjgarcia\.m2\settings_localgis_windows.xml
mvn clean install -P MODELO_PRO -s c:\Users\fjgarcia\.m2\settings_localgis_windows.xml
mvn clean deploy -P MODELO_PRO -s c:\Users\fjgarcia\.m2\settings_localgis_windows.xml
	 