package com.action;

import com.business.Usuario;
import com.dao.UsuarioDao;
import com.opensymphony.xwork2.ActionSupport;

public class CambioAction extends ActionSupport {

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
	   
	   public String validation()
	   {
		   String ret = ERROR;
		   UsuarioDao userDao = new UsuarioDao();
		   userDao.setUsuario(usuario); 
		    
		   try 
		   {
			   ret = userDao.validacionUsuario();
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
	   
	   public String execute()
	   {
		   String ret = ERROR;
		   UsuarioDao userDao = new UsuarioDao();
		   userDao.setUsuario(usuario); 
		    
		   try 
		   {
			   ret = userDao.cambioUsuario();
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       ret = ERROR;
		   }
		      return ret;
	   }
	
}
