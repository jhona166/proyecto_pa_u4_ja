package com.example.demo.uce.pararelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MainParaleloStream {
	public static void main(String[] args) {
		List<Integer> idEstudiantes = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			idEstudiantes.add(i);

		}
		idEstudiantes.forEach(numero -> System.out.println("Estudiante: " + numero));
		long tiempoInicial = System.currentTimeMillis();
		
		
		
		List<String> listaFinal = idEstudiantes.parallelStream().map(id -> procesarIdEstudiante(id))
				.collect(Collectors.toList());

		//
		// Procesar cada Estudiantefor

		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		listaFinal.forEach(cadena -> System.out.println(cadena));
		System.out.println("Tiempo trancurrido en segundos: " + tiempoTranscurrido);

	}

	public static String procesarIdEstudiante(Integer idEstudiante) {
		// Convertir en String
		String idConvertido = "E" + idEstudiante.toString();
		// Insertar en la base
		System.out.println("insertando estudiante: " + idConvertido + "Hilo: " + Thread.currentThread().getName());
		// 1 segundo
		try {
			// 1segundo
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idConvertido;
	}
}
