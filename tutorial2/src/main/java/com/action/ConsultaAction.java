package com.action;

import java.util.Collection;
import java.util.List;

import com.business.Cuenta;
import com.business.Usuario;
import com.dao.CuentaDao;
import com.dao.UsuarioDao;
import com.opensymphony.xwork2.ActionSupport;

public class ConsultaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	   private Usuario usuario;
	   private Cuenta cuenta;
	   
	   public Collection<Cuenta> list; 
	   
	   public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}


	public Collection<Cuenta> getList() {
			return list;
		}



		public void setList(List<Cuenta> list) {
			this.list = list;
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
	   
	   
	// Consulta  Particular
	   public String executeB()
	   {
	
		   CuentaDao cuentaDao = new CuentaDao();
		   cuentaDao.setUsuario(usuario);
		   cuentaDao.setCuenta(cuenta);
		    
		   try 
		   {
			   list = cuentaDao.balance();
			   if (list.isEmpty())
			   {
				   return "error";
			   }
			   return "next";
		   }
		  
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		      return "error";
		   }
		      
	   }
	
}
