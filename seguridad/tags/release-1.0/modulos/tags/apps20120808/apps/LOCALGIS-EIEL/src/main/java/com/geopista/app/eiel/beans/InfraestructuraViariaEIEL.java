package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class InfraestructuraViariaEIEL extends WorkflowEIEL implements Serializable, EIELPanel{
	
	public InfraestructuraViariaEIEL(){
		
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo provincia","codprov","eiel_c_redviaria_tu",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_c_redviaria_tu",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_c_redviaria_tu",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_c_redviaria_tu",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_c_redviaria_tu",""));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo tramo viario","tramo_vu","eiel_c_redviaria_tu",""));
		
	}	

	public Hashtable getIdentifyFields() {
		return null;
	}
	
	
}
