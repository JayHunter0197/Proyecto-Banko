package com.dao;

import java.sql.Connection;

import com.business.Movimiento;
import com.utils.Conexion;



public class MovimientoDao {
	
	
	
	private Movimiento movimiento;
	
	public Movimiento getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}
	
	
}