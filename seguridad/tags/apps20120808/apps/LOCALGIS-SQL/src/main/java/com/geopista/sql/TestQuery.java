package com.geopista.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

import com.geopista.app.AppContext;

public class TestQuery {

	private Locale locale;
	private static AppContext aplicacion = (AppContext) AppContext.getApplicationContext();
	
	private Connection getConnection() {
		try {
			Connection connection = aplicacion.getConnection(); 
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public TestQuery() {
		locale = Locale.getDefault();
	}
	
	public boolean vaciarTabla(String nombreTabla) {
		Connection connection = null;
		PreparedStatement ps = null;
        try {
        	connection = getConnection();
        	ps = connection.prepareStatement("vaciaTabla");
        	ps.setString(1, nombreTabla);
			ps.executeUpdate();
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (ps!=null){
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (connection!=null) {
				closeConnection(connection);
			}
		}	
	}
	
	public boolean borrarDatos(String nombreTabla, String campo, String id) {
		Connection connection = null;
		PreparedStatement ps = null;
        try {
        	connection = getConnection();
        	ps = connection.prepareStatement("borraDatos");
        	ps.setString(1, nombreTabla);
        	ps.setString(2, campo);
        	ps.setString(3, id);
			ps.executeUpdate();
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (ps!=null){
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (connection!=null) {
				closeConnection(connection);
			}
		}	
	}
	
	public boolean borrarDatos(String id) {
		Connection connection = null;
		PreparedStatement ps = null;
        try {
        	connection = getConnection();
        	ps = connection.prepareStatement("borraDatos");
        	ps.setString(1, id);
        	
			ps.executeUpdate();
            return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (ps!=null){
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (connection!=null) {
				closeConnection(connection);
			}
		}	
	}
	public static void main(String[] args) {
		TestQuery tq = new TestQuery();
		tq.vaciarTabla("prueba2");
		//tq.borrarDatos("prueba", "nombre", "1");
		tq.borrarDatos("1");
	}
}
