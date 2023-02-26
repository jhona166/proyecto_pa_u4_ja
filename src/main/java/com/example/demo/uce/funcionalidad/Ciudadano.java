package com.example.demo.uce.funcionalidad;

public class Ciudadano {
	private String nombreCompleto;
	private String ciudad;
	@Override
	public String toString() {
		return "Ciudadano [nombreCompleto=" + nombreCompleto + ", ciudad=" + ciudad + "]";
	}
	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
 }
