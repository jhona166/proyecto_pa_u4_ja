package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.funcionalidad.Ciudadano;
import com.example.demo.uce.funcionalidad.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;

@SpringBootApplication
public class ProyectoPaU3JaApplication implements CommandLineRunner {
	private static final Logger LOG = LoggerFactory.getLogger(ProyectoPaU3JaApplication.class);
	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		long tiempoInicio = System.currentTimeMillis();
		List<Estudiante> listaCompleta = this.procesarEstudiantes();
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTotal = (tiempoFinal- tiempoInicio)/1000;
		System.out.println("Tiempo total: "+tiempoTotal+"seg");
		listaCompleta.forEach(estu -> System.out.println(estu+"\t"+Thread.currentThread().getName()));
	
	}

	public List<Estudiante> procesarEstudiantes() {
		List<Ciudadano> ciudadanos =  this.iCiudadanoService.consultarTodos();
		ciudadanos.forEach(ciud -> System.out.println("Impresion: "+ciud));

		List<Estudiante> estudiantes = ciudadanos.parallelStream().map(conv -> this.iCiudadanoService.convertir(conv))
				.collect(Collectors.toList());

		return estudiantes;
	}


}
