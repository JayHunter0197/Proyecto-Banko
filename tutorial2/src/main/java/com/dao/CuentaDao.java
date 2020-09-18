package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.utils.Conexion;
import com.business.Cuenta;
import com.business.Usuario;

public class CuentaDao {

    private Cuenta cuenta;
    private Usuario usuario;


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    public String altaCuenta() throws Exception {
        String ret = "error";
        boolean found = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        conexion.establishConnection();
        conn = conexion.getCon();

        String sql = "SELECT name FROM login WHERE";
        sql += " user = ? AND password = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario.getUsuario());
        ps.setString(2, usuario.getPassword());
        ResultSet rs = ps.executeQuery();
        //System.out.println("Valor de usuario: "+usuario.getUsuario());
        //System.out.println("Valor de password: "+usuario.getPassword());


        while (rs.next()) {
            found = true;
        }

        if (found == true) {
            String sqlInsert = "INSERT INTO test.cuenta (id, usuario, monto) ";
            sqlInsert += "VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, cuenta.getId());
            ps.setString(2, usuario.getUsuario());
            ps.setFloat(3, cuenta.getMonto());
            ps.executeUpdate();
            //System.out.println("Valor de usuario: "+cuenta.getId());
            //System.out.println("Valor de password: "+usuario.getUsuario());
            //System.out.println("Valor de password: "+cuenta.getMonto());

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
    
    public String bajaCuenta() throws Exception {
        String ret = "error";
        String userDB= "";
        String passwordDB= "";
        Conexion conexion = new Conexion();
        Connection conn = null;
        conexion.establishConnection();
        conn = conexion.getCon();
        
        String sql = "SELECT user, password FROM login WHERE";
        sql+=" user = ? AND password = ?";
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
       	 String sqlInsert = "DELETE FROM test.cuenta WHERE id = ? ";
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, cuenta.getId());
            ps.executeUpdate();
            System.out.println("Valor de usuario: "+cuenta.getId());
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

}