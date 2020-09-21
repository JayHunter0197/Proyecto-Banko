package com.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.business.Cuenta;
import com.business.Movimiento;
import com.business.Transferencia;
import com.business.Usuario;
import com.dao.CuentaDao;
import com.dao.MovimientoDao;
import com.dao.TransferenciaDao;
import com.opensymphony.xwork2.ActionSupport;

public class ConsultaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	   private Usuario usuario;
	   private Cuenta cuenta;
	   
	   public Collection<Cuenta> list; 
	   
	   public ArrayList<Movimiento> listaMovimientos;
	   public ArrayList<Transferencia> listaTransferencias;
	   
	   public ArrayList<Movimiento> getListaMovimientos() {
		return listaMovimientos;
	}


	public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
		this.listaMovimientos = listaMovimientos;
	}


	public ArrayList<Transferencia> getListaTransferencias() {
		return listaTransferencias;
	}


	public void setListaTransferencias(ArrayList<Transferencia> listaTransferencias) {
		this.listaTransferencias = listaTransferencias;
	}


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
	   
	   public String executeM() {
		   MovimientoDao movDao= new MovimientoDao();
		   movDao.setUsuario(usuario);
		   movDao.setCuenta(cuenta);
		   
		   try {
			   listaMovimientos=movDao.consultarMovimientosCuenta();
			   return "success";
		   }
		   catch(Exception e) {
			   e.printStackTrace();
			   return "error";
		   }
		   
	   }
	   
	   public String executeT(){
		   TransferenciaDao transDao= new TransferenciaDao();
		   transDao.setUsuario(usuario);
		   transDao.setCuenta(cuenta);
		   
		   try {
			   listaTransferencias=transDao.consultarTransferencias();
			   return "success";
		   }
		   catch(Exception e) {
			   e.printStackTrace();
			   return "error";
		   }
	   }
	
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
