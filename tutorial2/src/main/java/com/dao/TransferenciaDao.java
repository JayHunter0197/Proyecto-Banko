package com.dao;

import java.sql.Connection;

import com.business.Movimiento;
import com.business.Transferencia;
import com.utils.Conexion;



public class TransferenciaDao {
	
	
	
	private Transferencia transferencia;

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	
	
	
}