
setlocal
cd ..
set LIB=..\..\lib
set CONFIG=.\config
set CLASS=.
java -DCONFIG=%CONFIG% -Djava.security.auth.login.config=%CONFIG%\jaasconfig.conf -Dfile.encoding=windows-1252 -classpath "%CLASS%;%LIB%\core\satecNet.jar;%LIB%\core\satec.jar;%LIB%\productos\castor\castor-0.9.5.3.jar;%LIB%\productos\jetty\start.jar;%LIB%\productos\jetty\stop.jar;%LIB%\productos\jetty\ext\jasper-compiler.jar;%LIB%\productos\jetty\ext\xercesImpl.jar;%LIB%\productos\jetty\ext\jasper-runtime.jar;%LIB%\productos\jetty\extra\ext\p6spy.jar;%LIB%\productos\jetty\extra\ext\carol.jar;%LIB%\productos\jetty\extra\ext\activation.jar;%LIB%\productos\jetty\extra\ext\hsqldb.jar;%LIB%\productos\jetty\extra\ext\log4j.jar;%LIB%\productos\jetty\extra\ext\ow_util_log_wrp_log4j.jar;%LIB%\productos\jetty\extra\ext\commons-cli.jar;%LIB%\productos\jetty\extra\ext\objectweb-datasource.jar;%LIB%\productos\jetty\extra\ext\mail.jar;%LIB%\productos\jetty\extra\ext\jotm_iiop_stubs.jar;%LIB%\productos\jetty\extra\ext\jotm.jar;%LIB%\productos\jetty\extra\ext\ow_util_log_file.jar;%LIB%\productos\jetty\extra\ext\jotm_jrmp_stubs.jar;%LIB%\productos\jetty\extra\ext\commons-logging.jar;%LIB%\productos\jetty\extra\ext\jonas_timer.jar;%LIB%\productos\jetty\extra\ext\jts1_0.jar;%LIB%\productos\jetty\extra\ext\jta-spec1_0_1.jar;%LIB%\productos\jetty\extra\ext\xapool.jar;%LIB%\productos\jetty\extra\lib\org.mortbay.jetty.plus.resource.jar;%LIB%\productos\jetty\extra\lib\org.mortbay.jetty.plus.jar;%LIB%\productos\jetty\lib\org.mortbay.jetty.jar;%LIB%\productos\jetty\lib\javax.servlet.jar;%LIB%\productos\jetty\lib\org.mortbay.jmx.jar;%LIB%\productos\postgre\pg74.213.jdbc2.jar;%LIB%\productos\httpclient\commons-httpclient-2.0.jar;%LIB%\productos\jetty\extra\lib\org.mortbay.jaas.jar;%LIB%\productos\postgres\pg74.214.jdbc3.jar;%LIB%\productos\puzzle\puzzled-1.3.zip" admcarApp.PasarelaAdmcar
 
pause
cd bin
endlocal