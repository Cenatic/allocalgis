package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class RedDeRamalesEIEL extends WorkflowEIEL implements Serializable, EIELPanel{
	
	public RedDeRamalesEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo provincia","codprov","eiel_c_saneam_rs",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_c_saneam_rs",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_c_saneam_rs",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_c_saneam_rs",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_c_saneam_rs",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Tramo del ramal","tramo_rs","eiel_c_saneam_rs",""));
	}	

	public Hashtable getIdentifyFields() {
		return null;
	}
	
	
}
