package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.funcionalidad.Ciudadano;
import com.example.demo.uce.funcionalidad.Estudiante;

public interface ICiudadanoService {
	public List<Ciudadano> consultarTodos();
	public Estudiante convertir(Ciudadano ciudadano);
	
}
