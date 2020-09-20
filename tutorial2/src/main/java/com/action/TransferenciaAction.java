package com.action;

import com.business.Cuenta;
import com.business.Transferencia;
import com.business.Usuario;
import com.dao.CuentaDao;
import com.dao.TransferenciaDao;
import com.opensymphony.xwork2.ActionSupport;

public class TransferenciaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	   private Usuario usuario;
	   private Cuenta cuenta;
	   private Transferencia transferencia;
	   
	   public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Usuario getUsuario() {
	      return usuario;
	   }

	   public void setUsuario(Usuario usuario) {
	      this.usuario = usuario;
	   }
	   
	   public String init(){
			return "next";
		}
	   
	   public String execute()
	   {
		   String ret = ERROR;
		   TransferenciaDao transferenciaDao = new TransferenciaDao();
		   transferenciaDao.setUsuario(usuario);
		   transferenciaDao.setTransferencia(transferencia);
		    
		   try 
		   {
			   
			   ret = transferenciaDao.transferir();
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
	
}
