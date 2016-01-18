/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.metadatos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import es.dc.a21l.base.modelo.EntidadBase;
import es.dc.a21l.elementoJerarquia.modelo.Indicador;

	/**
	 *
	 * @author Balidea Consulting & Programming
	 */
	@Entity
	@Table(name = "Tb_A21l_Metadatos",uniqueConstraints={@UniqueConstraint(columnNames={"idIndicador"})})
	public class Metadatos extends EntidadBase {
	    
	    @Column(name = "Metadatos")
	    private String metadatos;

	    @JoinColumn(name = "idIndicador", referencedColumnName = "id_a21l_elementojerarquia", nullable = false)
	    @OneToOne
	    private Indicador indicador;

		public String getMetadatos() {
			return metadatos;
		}

		public void setMetadatos(String metadatos) {
			this.metadatos = metadatos;
		}

		public Indicador getIndicador() {
			return indicador;
		}

		public void setIndicador(Indicador indicador) {
			this.indicador = indicador;
		}		
	}
