package com.geopista.protocol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.geopista.app.AppContext;
//import com.geopista.model.GeopistaLayer;

public class Version implements java.io.Serializable{
	
	private String fecha = "";
	private boolean featuresActivas = true;
	private boolean crearVersionado = true;
	private long revisionActual = -1;
	private int idUsuario = -1;
	private long ultimaRevision = -1;
	private long idTable = -1;
	private boolean bRecuperarFeatures = false;
	
	public boolean isbRecuperarFeatures() {
		return bRecuperarFeatures;
	}

	public void setbRecuperarFeatures(boolean bRecuperarFeatures) {
		this.bRecuperarFeatures = bRecuperarFeatures;
	}

	public long getIdTable() {
		return idTable;
	}

	public void setIdTable(long idTable) {
		this.idTable = idTable;
	}

	public Version(){
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isFeaturesActivas() {
		return featuresActivas;
	}

	public void setFeaturesActivas(boolean featuresActivas) {
		this.featuresActivas = featuresActivas;
	}

	public boolean isCrearVersionado() {
		return crearVersionado;
	}

	public void setCrearVersionado(boolean crearVersionado) {
		this.crearVersionado = crearVersionado;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public long getRevisionActual() {
		return revisionActual;
	}

	public void setRevisionActual(long revisionActual) {
		this.revisionActual = revisionActual;
	}

	public long getUltimaRevision() {
		return ultimaRevision;
	}

	public void setUltimaRevision(long ultimaRevision) {
		this.ultimaRevision = ultimaRevision;
	}
	
    /**
     * Obtiene una conexi�n a la base de datos
     * @return Conexi�n a la base de datos
     * @throws SQLException
     */
    private Connection getDBConnection () throws SQLException
    {        
        Connection con = AppContext.getApplicationContext().getConnection();
        con.setAutoCommit(false);
        return con;
    }  

    /**
     * Obtiene la revisi�n m�s actual que tenemos para esa capa
     * @return
     */
    /*public long obtieneRevisionMasActual(GeopistaLayer layer){
    	Connection conn = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	long revisionActual = -1;
    	try{
	    	conn = getDBConnection();
			StringBuffer consultaTable = new StringBuffer("(select c.id_table from layers l, attributes a,columns c ");
			consultaTable = consultaTable.append("where l.id_layer = a.id_layer and a.id_column = c.id ");
			consultaTable = consultaTable.append("and a.position = 1 and l.name = ?)");
	    	StringBuffer sbSQL = new StringBuffer("select coalesce(max(v.revision),-1) from versiones v ");
	    	sbSQL = sbSQL.append("where v.id_table_versionada= ");
	    	sbSQL = sbSQL.append(consultaTable.toString());
	    	ps = conn.prepareStatement(sbSQL.toString());
    		ps.setString(1, layer.getSystemId());
	    	rs = ps.executeQuery();
	    	if (rs.next()){
	    		revisionActual = rs.getLong(1);
	    	}else
	    		revisionActual = -1;
    	}catch(Exception e){
            JOptionPane.showMessageDialog(AppContext.getApplicationContext().getMainFrame(),e.getMessage());
	    }finally{
	    	AppContext.getApplicationContext().closeConnection(conn, ps, null, rs);
            return revisionActual;
	    }
    }*/
	
}
