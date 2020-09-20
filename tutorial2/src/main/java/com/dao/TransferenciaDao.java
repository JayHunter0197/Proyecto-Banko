package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;


import com.business.Transferencia;
import com.business.Usuario;
import com.utils.Conexion;



	public class TransferenciaDao {
	
	  private Transferencia transsferencia;
	  private Usuario usuario;
	    
	
	
	public Transferencia getTranssferencia() {
			return transsferencia;
		}

		public void setTranssferencia(Transferencia transsferencia) {
			this.transsferencia = transsferencia;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

	private Transferencia transferencia;

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	
	
	public String transferir() throws Exception {
        String ret = "error";
        
        String userDB= "";
        String passwordDB= "";
        
        String myAccount ="";
        String otherAccount="";
        
        float myAmount =0; 
        float transferAmount = transferencia.getMonto();
        
        String loginMessage="User not found, please check your user and password";
        String myAccountMessage = "Your account "+transferencia.getIdCuenta1()+" was not found";
        String otherAccountMessage = "Account "+transferencia.getIdCuenta2()+" was not found";
        String amountMessage ="You do not have enough funds";
        
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
        
        //System.out.println("Valor de usuario: "+usuario.getUsuario());
        //System.out.println("Valor de password: "+usuario.getPassword());


        while (rs.next()) {
        	userDB = rs.getString(1);
          	 passwordDB = rs.getString(2);
          	 loginMessage="User "+userDB+" was found";
        }
        
        System.out.println(loginMessage);
        
        if(( passwordDB.equals(usuario.getPassword())) && (userDB.equals(usuario.getUsuario())))
        {

            String sqlCheck = "SELECT id, monto FROM cuenta WHERE";
            sqlCheck += " id = ? AND usuario = ? ";
            ps = conn.prepareStatement(sqlCheck);
            ps.setString(1, transferencia.getIdCuenta1());
            ps.setString(2, userDB);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
            	 myAccount = rs.getString(1);
            	 myAccountMessage= "Your account "+myAccount+" was found ";
            
            }
            
            System.out.println(myAccountMessage);
            
            
            
            String sqlCheckAmount = "SELECT id, monto FROM cuenta WHERE";
            sqlCheckAmount += " id = ? AND usuario = ? AND monto >= ?";
            ps = conn.prepareStatement(sqlCheckAmount);
            ps.setString(1, transferencia.getIdCuenta1());
            ps.setString(2, userDB);
            ps.setFloat(3, transferencia.getMonto());
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
            	 myAmount = rs.getFloat(2);
            	 amountMessage= "You have "+myAmount+"$ in your account";
            
            }
            
            System.out.println(amountMessage);
            
            
            
            String sqlCheck2 = "SELECT id, monto FROM cuenta WHERE";
            sqlCheck2 += " id = ?";
            ps = conn.prepareStatement(sqlCheck2);
            ps.setString(1, transferencia.getIdCuenta2());
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
            	 otherAccount = rs.getString(1);
            	 otherAccountMessage= "Account "+otherAccount+" was found ";
            }
            
            System.out.println(otherAccountMessage+"\n\n");
            
            if( (myAccount.equals(transferencia.getIdCuenta1())) && (otherAccount.equals(transferencia.getIdCuenta2())) && (myAmount>0) )
            {
            	LocalDate localDate = LocalDate.now(); 
                Date transferDate= Date.valueOf(localDate);
                
                
            	String sqlTransfer = "INSERT INTO test.transferencia (id_cuenta_1, id_cuenta_2, monto, fecha) ";
                sqlTransfer += "VALUES (?, ?, ?, ?)";
                ps = conn.prepareStatement(sqlTransfer);
                ps.setString(1, myAccount);
                ps.setString(2, otherAccount);
                ps.setFloat(3, transferencia.getMonto());
                ps.setDate(4, transferDate);
                ps.executeUpdate();
                
                String sqlRetire = "UPDATE test.cuenta SET cuenta.monto= cuenta.monto - ? WHERE cuenta.id = ? ";
                ps = conn.prepareStatement(sqlRetire);
                ps.setFloat(1, transferAmount);
                ps.setString(2, myAccount);
                ps.executeUpdate();
                
                String sqlDeposit = "UPDATE test.cuenta SET cuenta.monto= cuenta.monto + ? WHERE cuenta.id = ? ";
                ps = conn.prepareStatement(sqlDeposit);
                ps.setFloat(1, transferAmount);
                ps.setString(2, otherAccount);
                ps.executeUpdate();
                
                ret = "next";
                
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