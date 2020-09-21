package com.action;

import com.business.Usuario;
import com.dao.UsuarioDao;
import com.opensymphony.xwork2.ActionSupport;

public class RetiroAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
		private String cuenta;
		private String user;
		private String password;
		private Float monto;
		private Usuario usuario;

	   
	   public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public String getCuenta() {
			return cuenta;
		}

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Float getMonto() {
			return monto;
		}

		public void setMonto(Float monto) {
			this.monto = monto;
		}

	public String init(){
			return "next";
		}
	   
	   public String execute()
	   {
		   String ret = ERROR;
		   UsuarioDao userDao = new UsuarioDao();		   
		   try 
		   {
			   ret = userDao.retiro(cuenta, user, password, monto);
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
}
