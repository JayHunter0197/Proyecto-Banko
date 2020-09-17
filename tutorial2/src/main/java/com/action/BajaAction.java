package com.action;

import com.business.Usuario;
import com.dao.UsuarioDao;
import com.opensymphony.xwork2.ActionSupport;

public class BajaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	   private Usuario usuario;
	   
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
		   UsuarioDao userDao = new UsuarioDao();
		   userDao.setUsuario(usuario); 
		    
		   try 
		   {
			   
			   ret = userDao.bajaUsuario();
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
	
}
