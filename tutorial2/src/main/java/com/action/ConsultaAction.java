package com.action;

import java.util.Collection;
import java.util.List;

import com.business.Usuario;
import com.dao.UsuarioDao;
import com.opensymphony.xwork2.ActionSupport;

public class ConsultaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	   private Usuario usuario;
	   public Collection<Usuario> list; 
	   
	   public Collection<Usuario> getList() {
			return list;
		}


		public void setList(List<Usuario> list) {
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
	   
	   // Consulta General 
	   public String executeG() throws Exception
	   {
		 
		   
		   UsuarioDao userDao = new UsuarioDao();
		   userDao.setUsuario(usuario); 
		   
		   try
		   {
			   list = userDao.consultaUsuarios();
			   return "next";
		   }
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		       return "error";
		   }
		     
	   }
	   
	// Consulta  Particular
	   public String executeP()
	   {
		   
		   UsuarioDao userDao = new UsuarioDao();
		   userDao.setUsuario(usuario); 
		    
		   try 
		   {
			   list = userDao.consultaUsuario();
			   return "next";
		   }
		  
		   
		   catch (Exception e)
		   {
			   e.printStackTrace();
		      return "error";
		   }
		      
	   }
	
}
