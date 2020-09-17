package com.business;

import java.sql.Date;

public class Transferencia {

	private int id;
	private String idCuenta1;
	private String idCuenta2;
	private float monto;
	private Date fecha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdCuenta1() {
		return idCuenta1;
	}
	public void setIdCuenta1(String idCuenta1) {
		this.idCuenta1 = idCuenta1;
	}
	public String getIdCuenta2() {
		return idCuenta2;
	}
	public void setIdCuenta2(String idCuenta2) {
		this.idCuenta2 = idCuenta2;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
