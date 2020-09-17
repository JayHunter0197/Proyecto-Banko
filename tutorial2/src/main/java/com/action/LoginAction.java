package com.action;

import com.opensymphony.xwork2.ActionSupport;

import com.dao.UsuarioDao;
import com.business.Usuario;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
   private Usuario usuario;
   
   public Usuario getUsuario() {
      return usuario;
   }

   public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
   }
   
   public String execute() {
      String ret = ERROR;
	  UsuarioDao userDao = new UsuarioDao();
	  userDao.setUsuario(usuario);
	 
      
      try {
    	  ret = userDao.loginUsuario();
      } catch (Exception e) {
		 e.printStackTrace();
         ret = ERROR;
      }
      return ret;
   }



}
