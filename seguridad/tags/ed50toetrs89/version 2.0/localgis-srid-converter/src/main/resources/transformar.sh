export CLASSPATH=./localgis-srid-converter-1.1.3.jar:./dependency/commons-cli-1.0.jar:./dependency/commons-lang-1.0.jar:./dependency/commons-logging-1.1.1.jar:./dependency/commons-pool-1.3.jar:./dependency/geoapi-2.2.0.jar:./dependency/gt-api-2.5-SNAPSHOT.jar:./dependency/gt-epsg-hsql-2.5-SNAPSHOT.jar:./dependency/gt-metadata-2.5-SNAPSHOT.jar:./dependency/gt-referencing-2.5-SNAPSHOT.jar:./dependency/hsqldb-1.8.0.7.jar:./dependency/jai-core-1.1.3.jar:./dependency/jai_core-1.1.3.jar:./dependency/jsr-275-1.0-beta-2.jar:./dependency/jts-1.12.jar:./dependency/junit-3.7.jar:./dependency/log4j-1.2.16.jar:./dependency/postgis-jdbc-1.3.3.jar:./dependency/postgis-stubs-1.3.3.jar:./dependency/postgresql-9.0-801.jdbc3.jar:./dependency/vecmath-1.3.1.jar:./dependency/xercesImpl-2.4.0.jar
java Xms512M -Xmx1024M com.geopista.instalador.UTMED50ToGeoETRS89Converter $*
