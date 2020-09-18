package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
     //System.out.println("Valor de usuario: "+usuario.getUsuario());
     //System.out.println("Valor de password: "+usuario.getPassword());

     // Esta linea trae la tabla resultante del query
     while (rs.next()) {
        usuario.setNombre(rs.getString(1));
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
	
}