package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import com.utils.Conexion;
import com.business.Usuario;


public class UsuarioDao {
	
	private Usuario usuario;
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/** 
	 * Consultar si existe el usuario.
	 * @return SUCCESS=Todo salio bien, ERROR=Si hubo un problema
	 */
	public String loginUsuario() throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
	 conexion.establishConnection();
     conn = conexion.getCon();
     
     String sql = "SELECT name FROM login WHERE";
     sql+=" user = ? AND password = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, usuario.getUsuario());
     ps.setString(2, usuario.getPassword());
     ResultSet rs = ps.executeQuery();

     // Esta linea trae la tabla resultante del query
     while (rs.next()) {
        usuario.setNombre(rs.getString(1));
        ret = "success";
     }

     if (conn != null) {
        try {
           conexion.closeConnection();
        } catch (Exception e) {
			e.printStackTrace();
        }
     }
      
      return ret;
	}
	
	public String altaUsuario() throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
     conexion.establishConnection();
     conn = conexion.getCon();
     
     String sqlInsert = "INSERT INTO test.login (user, password, name) ";
     sqlInsert+="VALUES (?, ?, ?)";
     PreparedStatement ps = conn.prepareStatement(sqlInsert);
     ps.setString(1, usuario.getUsuario());
     ps.setString(2, usuario.getPassword());
     ps.setString(3, usuario.getNombre());
     ps.executeUpdate();
     
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
	
	
	public String bajaUsuario() throws Exception
	{
	 String ret = "error";
	 String passwordDB= "";
	 Conexion conexion = new Conexion();
     Connection conn = null;
	 conexion.establishConnection();
     conn = conexion.getCon();
     
     String sql = "SELECT password FROM login WHERE";
     sql+=" user = ? AND password = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, usuario.getUsuario());
     ps.setString(2, usuario.getPassword());
     ResultSet rs = ps.executeQuery();

     // Esta linea trae la tabla resultante del query
     while (rs.next()) {
    	 passwordDB = rs.getString(1);
     }
     
     if(passwordDB.equals(usuario.getPassword()))
     {
    	 String sqlInsert = "DELETE FROM test.login WHERE user = ? and password = ? ";
         ps = conn.prepareStatement(sqlInsert);
         ps.setString(1, usuario.getUsuario());
         ps.setString(2, usuario.getPassword());
         ps.executeUpdate();
         ret = "next";
     }
    
     if (conn != null) {
        try {
           conexion.closeConnection();
        } catch (Exception e) {
			e.printStackTrace();
        }
     }
      
      return ret;
	}
	
	public ArrayList<Usuario> consultaUsuarios() throws Exception
	{
		ArrayList<Usuario> list = new ArrayList<Usuario>();
		 Conexion conexion = new Conexion();
	     Connection conn = null;
		 conexion.establishConnection();
	     conn = conexion.getCon();
	     
	     String sqlInsert = "SELECT * FROM test.login ";
	     PreparedStatement ps = conn.prepareStatement(sqlInsert);
	     ResultSet rs = ps.executeQuery();
	     
	     while (rs.next()) {
	        	Usuario user = new Usuario();
	        	user.setUsuario(rs.getString(1));
	        	user.setPassword(rs.getString(2));
	        	user.setNombre(rs.getString(3));
	           list.add(user);
	        }
	     if (conn != null)
	     {
	         try
	         {
	            conexion.closeConnection();
	         } 
	         catch (Exception e)
	         {
	 			e.printStackTrace();
	         }
	      }
	       
	       return list;
	}
	
	public ArrayList<Usuario> consultaUsuario() throws Exception
	{
		ArrayList<Usuario> list = new ArrayList<Usuario>();
		 Conexion conexion = new Conexion();
	     Connection conn = null;
		 conexion.establishConnection();
	     conn = conexion.getCon();
	     
	     String sqlInsert = "SELECT * FROM login WHERE";
	     sqlInsert+=" user = ? ";
	     PreparedStatement ps = conn.prepareStatement(sqlInsert);
	     ps.setString(1, usuario.getUsuario());
	     ResultSet rs = ps.executeQuery();
	     
	     while (rs.next()) {
	        	Usuario user = new Usuario();
	        	user.setUsuario(rs.getString(1));
	        	user.setPassword(rs.getString(2));
	        	user.setNombre(rs.getString(3));
	           list.add(user);
	        }
	     if (conn != null)
	     {
	         try
	         {
	            conexion.closeConnection();
	         } 
	         catch (Exception e)
	         {
	 			e.printStackTrace();
	         }
	      }
	       
	       return list;
	     
	   
	}
	
	
	public String validacionUsuario() throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
	 conexion.establishConnection();
     conn = conexion.getCon();
     
     String sql = "SELECT * FROM login WHERE";
     sql+=" user = ? AND password = ?";
    
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, usuario.getUsuario());
     ps.setString(2, usuario.getPassword());
     ResultSet rs = ps.executeQuery();
     

     // Esta linea trae la tabla resultante del query
     while (rs.next()) {
        ret = "next";
     }

     if (conn != null) {
        try {
           conexion.closeConnection();
        } catch (Exception e) {
			e.printStackTrace();
        }
     }
      
      return ret;
	}
	public String cambioUsuario() throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
     conexion.establishConnection();
     conn = conexion.getCon();
     
     String sqlInsert = "UPDATE test.login SET user = ?, password = ?, name = ? WHERE";
     sqlInsert+=" user = ?";
     PreparedStatement ps = conn.prepareStatement(sqlInsert);
     ps.setString(1, usuario.getUsuario());
     ps.setString(2, usuario.getPassword());
     ps.setString(3, usuario.getNombre());
     ps.setString(4, usuario.getUsuario());
     ps.executeUpdate();
     
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
	
	
	public String deposito(String cuenta, String user,  String password, Float monto) throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
     conexion.establishConnection();
     conn = conexion.getCon();
     
     //verificar si la cuenta existe en la tabla cuenta
     String sql = "SELECT usuario FROM cuenta WHERE";
     sql+=" id = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, cuenta);
     ResultSet rs = ps.executeQuery();

     if (rs.next()) {
    	 System.out.println("La cuenta "+ cuenta + " existe\n");
    	//verificar que los datos de cuenta de donde se hace el deposito existan
         sql = "SELECT name FROM login WHERE";
         sql+=" user = ? AND password = ?";
         ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         rs = ps.executeQuery();

         if (rs.next()) {
        	 System.out.println("Los datos del usuario "+ user + " son correctos\n");
        	 LocalDate localDate = LocalDate.now();
        	 Date depositoDate = Date.valueOf(localDate);
        	 String tipo = "Deposito";
        	 //Insertar el deposito en la tabla movimiento y aumentar el monto de la cuenta a depositar
        	 String sqlInsert = "INSERT INTO test.movimiento (id_cuenta, tipo, monto, fecha)";
             sqlInsert+="VALUES (?, ?, ?, ?)";
             ps = conn.prepareStatement(sqlInsert);
             ps.setString(1, cuenta);
             ps.setString(2, tipo);
             ps.setFloat(3, monto);
             ps.setDate(4, depositoDate);
             ps.executeUpdate();
             //Aumentar el monto de la cuenta a la que se le hizo el deposito
             sql = "SELECT monto FROM cuenta WHERE";
             sql+=" id = ?";
             ps = conn.prepareStatement(sql);
             ps.setString(1, cuenta);
             rs = ps.executeQuery();
             if(rs.next()) {
            	 Float montoAnterior = rs.getFloat(1);
            	 Float nuevoMonto = montoAnterior + monto;                 
                 sqlInsert = "UPDATE test.cuenta SET monto = ? WHERE";
                 sqlInsert+=" id = ?";
                 ps = conn.prepareStatement(sqlInsert);
                 ps.setFloat(1, nuevoMonto);
                 ps.setString(2, cuenta);
                 ps.executeUpdate();
                 ret = "next";
                 System.out.println("Se hizo el deposito correctamente\n");
             }
         }
         else {
        	 System.out.println("No estan correctos los datos del usuario "+ user);
         }
     }
    
     if (conn != null) {
        try {
           conexion.closeConnection();
        } catch (Exception e) {
			e.printStackTrace();
        }
     }
      
      return ret;
	}
	
	public String retiro(String cuenta, String user,  String password, Float monto) throws Exception
	{
	 String ret = "error";
	 Conexion conexion = new Conexion();
     Connection conn = null;
     conexion.establishConnection();
     conn = conexion.getCon();
     
     //verificar si la cuenta existe en la tabla cuenta
     String sql = "SELECT usuario FROM cuenta WHERE";
     sql+=" id = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, cuenta);
     ResultSet rs = ps.executeQuery();

     if (rs.next()) {
    	 System.out.println("La cuenta "+ cuenta + " existe\n");
    	//verificar que los datos de cuenta de donde se hace el retiro existan
         sql = "SELECT name FROM login WHERE";
         sql+=" user = ? AND password = ?";
         ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         rs = ps.executeQuery();

         if (rs.next()) {
        	 System.out.println("Los datos del usuario "+ user + " son correctos\n");
        	 LocalDate localDate = LocalDate.now();
        	 Date depositoDate = Date.valueOf(localDate);
        	 String tipo = "Retiro";
        	 //Insertar el retiro en la tabla movimiento y aumentar el monto de la cuenta a depositar
        	 String sqlInsert = "INSERT INTO test.movimiento (id_cuenta, tipo, monto, fecha)";
             sqlInsert+="VALUES (?, ?, ?, ?)";
             ps = conn.prepareStatement(sqlInsert);
             ps.setString(1, cuenta);
             ps.setString(2, tipo);
             ps.setFloat(3, monto);
             ps.setDate(4, depositoDate);
             ps.executeUpdate();
             //Disminuir el monto de la cuenta a la que se le hizo el retiro
             sql = "SELECT monto FROM cuenta WHERE";
             sql+=" id = ?";
             ps = conn.prepareStatement(sql);
             ps.setString(1, cuenta);
             rs = ps.executeQuery();
             if(rs.next()) {
            	 Float montoAnterior = rs.getFloat(1);
            	 Float nuevoMonto = montoAnterior - monto;
            	 if(nuevoMonto>=0) {
            		 sqlInsert = "UPDATE test.cuenta SET monto = ? WHERE";
                     sqlInsert+=" id = ?";
                     ps = conn.prepareStatement(sqlInsert);
                     ps.setFloat(1, nuevoMonto);
                     ps.setString(2, cuenta);
                     ps.executeUpdate();
                     ret = "next";
                     System.out.println("Se hizo el retiro correctamente\n");
            	 }else {
            		 System.out.println("La cuenta no tiene fondos suficientes para realizar ese retiro");
            	 }
             }
         }
         else {
        	 System.out.println("No estan correctos los datos del usuario "+ user);
         }
     }
    
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