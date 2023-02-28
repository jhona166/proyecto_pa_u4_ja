package com.example.demo.uce.funcionalidad;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="ciudadano_p")
public class Ciudadano {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_ciud")
	@SequenceGenerator(name = "ciud_sec", sequenceName = "ciud_sec", allocationSize = 1)
	@Column(name = "ciud_id")
	private Integer id;
	@Column(name = "ciud_nombre")
	private String nombre;
	@Column(name = "ciud_apellido")
	private String apellido;
	@Column(name = "ciud_fecha_nacimiento")
	private LocalDateTime fecha_nacimiento;
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	
	
}
