package com.action;

import com.business.Cuenta;
import com.business.Usuario;
import com.dao.CuentaDao;
import com.opensymphony.xwork2.ActionSupport;

public class BajaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	   private Usuario usuario;
	   private Cuenta cuenta;
	   
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
		   CuentaDao cuentaDao = new CuentaDao();
		   cuentaDao.setUsuario(usuario);
		   cuentaDao.setCuenta(cuenta);
		    
		   try 
		   {
			   
			   ret = cuentaDao.bajaCuenta();
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
	
}
