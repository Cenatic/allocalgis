package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class RedDistribucionEIEL extends WorkflowEIEL implements Serializable, EIELPanel{
	
	public RedDistribucionEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo provincia","codprov","eiel_c_abast_rd",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_c_abast_rd",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_c_abast_rd",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_c_abast_rd",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_c_abast_rd",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Tramo","tramo_rd","eiel_c_abast_rd",""));
	}	

	public Hashtable getIdentifyFields() {
		return null;
	}
	
	
}
