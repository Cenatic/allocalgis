<?xml version='1.0' encoding='ISO-8859-1' ?>
<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN"
         "http://java.sun.com/products/javahelp/helpset_1_0.dtd">

<helpset version="1.0">

  <!-- title -->
  <title>Ayuda.- Importadores de Informaci�n Catastral</title>

  <!-- maps -->
  <maps>
     <homeID>importadoresIntro</homeID>
     <mapref location="importadoresMap_es.jhm"/>
  </maps>

  <!-- views -->
  <view mergetype="javax.help.UniteAppendMerge">
    <name>TOC</name>
    <label>Tabla de Contenidos</label>
    <type>javax.help.TOCView</type>
    <data>importadoresTOC_es.xml</data>
  </view>

  <view>
    <name>Index</name>
    <label>�ndice</label>
    <type>javax.help.IndexView</type>
    <data>importadoresIndex_es.xml</data>
  </view>     

    <view>				<!-- Deseamos que se puedan realizar b�squedas -->
        <name>Search</name>
        <label>B�squeda</label>			<!-- El tooltiptext -->
        <type>javax.help.SearchView</type>
        <data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
    </view>
    
    <impl>
    	<helpsetregistry helpbrokerclass="javax.help.DefaultHelpBroker" />
    	<viewerregistry viewertype="text/html" viewerclass="com.sun.java.help.impl.CustomKit" />
    	<viewerregistry viewertype="application/pdf" viewerclass="Your PDF Editor Kit" />
	</impl>
    

</helpset>