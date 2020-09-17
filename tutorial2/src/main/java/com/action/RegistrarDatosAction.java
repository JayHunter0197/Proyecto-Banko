package com.action;

import tutorial.tutorial.example.ExampleSupport;

public class RegistrarDatosAction extends ExampleSupport {
	
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE = "HelloWorld.message";
    private String message;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private String escolaridad;
    private String sexo;
    private String terminos;
    
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }	
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscolaridad() {
		return escolaridad;
	}
	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTerminos() {
		return terminos;
	}
	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}
	
	 public String init(){
			return "next";
		}
	
	@Override
	public void validate(){
        if(this.nombre == null || "".equals(this.nombre.trim())){
            addFieldError("nombre","Nombre inválido.");
        }
        
        if(this.direccion == null || "".equals(this.direccion.trim())){
            addFieldError("direccion","Dirección inválida.");
        }
    }
	 
	public String execute() throws Exception {
        setMessage(getText(MESSAGE));
        return SUCCESS;
    }
	
}