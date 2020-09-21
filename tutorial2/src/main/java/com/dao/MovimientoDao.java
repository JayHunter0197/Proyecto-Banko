package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.business.Cuenta;
import com.business.Movimiento;
import com.business.Usuario;
import com.utils.Conexion;



public class MovimientoDao {
	
	private Movimiento movimiento;
	private Cuenta cuenta;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usario) {
		this.usuario = usario;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Movimiento getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}
	
	
	
	public ArrayList<Movimiento> consultarMovimientosCuenta() throws Exception {
    	
    	ArrayList<Movimiento> listaMovimientos = new ArrayList<Movimiento>();
    	String userDB= "";
        String passwordDB= "";
        Conexion conexion = new Conexion();
        Connection conn = null;
        conexion.establishConnection();
        conn = conexion.getCon();
        

        String sql = "SELECT user, password FROM login WHERE";
        sql += " user = ? AND password = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario.getUsuario());
        ps.setString(2, usuario.getPassword());
        ResultSet rs = ps.executeQuery();
        System.out.println("Valor de usuario: "+usuario.getUsuario());
        System.out.println("Valor de password: "+usuario.getPassword());


        while (rs.next()) {
        	userDB = rs.getString(1);
          	 passwordDB = rs.getString(2);
        }
        
        if(( passwordDB.equals(usuario.getPassword())) && (userDB.equals(usuario.getUsuario())))
        {

            String query = "SELECT * FROM movimiento WHERE";
    	     query+=" id_cuenta = ? ";
    	     ps = conn.prepareStatement(query);
    	     ps.setString(1, cuenta.getId());
    	     rs = ps.executeQuery();
    	     
    	     while (rs.next()) {
    	    	 	Movimiento mov = new Movimiento();
		        	mov.setId(rs.getInt(1));
		        	mov.setIdCuenta(rs.getString(2));
		        	mov.setTipo(rs.getString(3));
		        	mov.setMonto(rs.getFloat(4));
		        	mov.setFecha(rs.getDate(5));
		           listaMovimientos.add(mov);
    	        }
        }
        
      

        if (conn != null) {
            try {
                conexion.closeConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return listaMovimientos;
    }
	
	
}