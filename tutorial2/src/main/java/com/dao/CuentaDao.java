package com.dao;

import java.sql.Connection;
import com.utils.Conexion;
import com.business.Cuenta;

public class CuentaDao {

	private Cuenta cuenta;
	
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	// Falta agregar los demas metodos 
	public String altaCuenta() throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
     conexion.establishConnection();
     conn = conexion.getCon();
     
    
     
     ret = "next";
    
     if (conn != null) {
        try {
           conexion.closeConnection();
        } catch (Exception e) {
			e.printStackTrace();
        }
     }
      
      return ret;
	}

	
}