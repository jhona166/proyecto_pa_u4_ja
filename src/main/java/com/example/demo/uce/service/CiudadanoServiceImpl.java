package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.funcionalidad.Ciudadano;
import com.example.demo.uce.funcionalidad.Estudiante;
import com.example.demo.uce.repository.ICiudadanoRepo;
import com.example.demo.uce.repository.IEstudianteRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {
	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Autowired 
	private ICiudadanoRepo iCiudadanoRepo;

	@Override
	public List<Ciudadano> consultarTodos() {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.buscar();
	}

	@Override
	public Estudiante convertir(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new  Estudiante();
		//estudiante.setNombreCompleto("Jhonatan altamirano");
		String nombreCompleto = ciudadano.getNombre()+" "+ciudadano.getApellido();
		estudiante.setNombreCompleto(nombreCompleto);
		
		Integer dia = ciudadano.getFecha_nacimiento().getDayOfMonth();
		Integer mes = ciudadano.getFecha_nacimiento().getMonthValue();
		Integer anio = ciudadano.getFecha_nacimiento().getYear();

		Integer diaActual = LocalDateTime.now().getDayOfMonth();
		Integer mesActual = LocalDateTime.now().getMonthValue();
		Integer anioActual = LocalDateTime.now().getYear();
		// Calculo edad
		Integer edad;
		if (mes > mesActual && dia > diaActual) {
			edad = anioActual - anio;
		} else {
			edad = (anioActual - anio) - 1;
		}
		estudiante.setEdad(edad);

		this.iEstudianteRepo.insertar(estudiante);
		return estudiante;
	}




}
