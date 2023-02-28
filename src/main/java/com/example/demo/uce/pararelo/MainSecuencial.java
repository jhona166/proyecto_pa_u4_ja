package com.example.demo.uce.pararelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainSecuencial {
	
	
	public static void main(String[] args) {
	List<Integer> idEstudiantes= new ArrayList<>();
	for(int i=1;i<=10; i++) {
		idEstudiantes.add(i);
	
	}
	idEstudiantes.forEach(numero->System.out.println("Estudiante: "+numero));
	//
	//Procesar cada Estudiantefor
	long tiempoInicial = System.currentTimeMillis();
	List<String> listaFinal=new ArrayList<>();
	for (Integer id : idEstudiantes) {
		listaFinal.add(procesarIdEstudiante(id));
	}
	
	long tiempoFinal =System.currentTimeMillis();
	long tiempoTranscurrido = (tiempoFinal-tiempoInicial)/1000;
	listaFinal.forEach(cadena->System.out.println(cadena));
	System.out.println("Tiempo trancurrido en segundos: "+tiempoTranscurrido);
	
	}
	public static String  procesarIdEstudiante(Integer idEstudiante) {
		//Convertir en String
		String idConvertido ="E"+ idEstudiante.toString();
		//Insertar en la base
		System.out.println("insertando estudiante: "+idConvertido+"Hilo: "+Thread.currentThread().getName());
		//1 segundo
		try {
			//1segundo
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idConvertido;
	}
}
