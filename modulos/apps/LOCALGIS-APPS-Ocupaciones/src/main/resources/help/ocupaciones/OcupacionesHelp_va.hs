<?xml version='1.0' encoding='ISO-8859-1' ?>
<!DOCTYPE helpset   
PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN"
         "http://java.sun.com/products/javahelp/helpset_1_0.dtd">

<helpset version="1.0">

  <!-- title -->
  <title>Ayuda.- (VA)Aplicaci�n de Licencias de Ocupaci�n de la V�a P�blica</title>

  <!-- maps -->
  <maps>
     <homeID>ocupacionesIntro</homeID>
     <mapref location="OcupacionesMap_va.jhm"/>
  </maps>

  <!-- views -->
  <view mergetype="javax.help.UniteAppendMerge">
    <name>TOC</name>
    <label>(VA)Tabla de Contenidos</label>
    <type>javax.help.TOCView</type>
    <data>OcupacionesTOC_va.xml</data>
  </view>

  <view mergetype="javax.help.SortMerge">
    <name>Indice</name>
    <label>(VA)�ndice</label>
    <type>javax.help.IndexView</type>
    <data>OcupacionesIndex_va.xml</data>
  </view>

 <!--
  <view mergetype="javax.help.SortMerge">
    <name>Search</name>
    <label>B�squeda</label>
    <type>javax.help.SearchView</type>
    <data engine="com.sun.java.help.search.DefaultSearchEngine">
      JavaHelpSearch
    </data>
  </view>
 -->
  
</helpset>

