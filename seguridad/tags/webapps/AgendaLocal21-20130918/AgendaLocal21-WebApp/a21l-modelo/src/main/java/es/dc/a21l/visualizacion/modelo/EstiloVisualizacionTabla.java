/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.visualizacion.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import es.dc.a21l.base.utils.enumerados.TipoFecha;
import es.dc.a21l.elementoJerarquia.modelo.Indicador;
import es.dc.a21l.usuario.modelo.Usuario;

@Entity
@Table(name="Tb_A21l_EstiloVisualizacionTabla")
@PrimaryKeyJoinColumn(name="Id_A21l_EstiloVisualizacion")
@DiscriminatorValue("Tabla")
public class EstiloVisualizacionTabla extends EstiloVisualizacion {
	
	
	@Column(name="decimales") 
	private Integer decimales;
	
	@Column(name="tipoFecha")
	private TipoFecha tipoFecha;
	
	@JoinColumn(name = "Id_A21l_Usuario", nullable = false)
    @OneToOne
    private Usuario usuario;
	
	@JoinColumn(name = "Id_A21l_Indicador", nullable = false)
    @OneToOne
	public Indicador indicador;
	
	public Integer getDecimales() {
		return decimales;
	}
	public void setDecimales(Integer decimales) {
		this.decimales = decimales;
	}
	public TipoFecha getTipoFecha() {
		return tipoFecha;
	}
	public void setTipoFecha(TipoFecha tipoFecha) {
		this.tipoFecha = tipoFecha;
	}
	public Indicador getIndicador() {
		return indicador;
	}
	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}