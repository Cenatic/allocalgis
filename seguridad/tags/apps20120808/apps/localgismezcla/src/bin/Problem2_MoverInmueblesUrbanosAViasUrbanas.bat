@echo off 

SET CLASSPATH=log4j-1.2.16.jar;commons-logging-1.1.1.jar;pg74jdbc3.jar;.
REM SET PROPERTIES=-Dlog4j.debug=true -Dlog4j.configuration=log4j.properties
SET PROPERTIES=-Dlog4j.configuration=log4j_test.properties
call java  %PROPERTIES% com.geopista.test.Problem2_MoverInmueblesUrbanosAViasUrbanas %1 %2 %3

