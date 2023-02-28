package com.example.demo.uce.funcionalidad;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante_p")

public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_estu")
	@SequenceGenerator(name = "estu_sec", sequenceName = "estu_sec", allocationSize = 1)
	@Column(name = "estu_id")
	
	private Integer id;

	@Column(name = "estu_nombre_completo")
	private String nombreCompleto;

	@Column(name = "estu_edad")
	private Integer edad;

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + "]";
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	
}

	
