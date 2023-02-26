package com.example.demo.uce.funcionalidad;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainInterfacesFuncionales {
	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//JAVA
		LOG.info("JAVA Supplier");
		Stream<String> lista = Stream.generate(()->"Jhonatan 2").limit(2);
		lista.forEach(cadena->LOG.info(cadena));
		//2.CONSUMER
		LOG.info("JAVA Consumer");
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7);
		listaNumeros.forEach(numero->LOG.info("valor: "+numero));
		//3.PREDICATE
		LOG.info("JAVA Predicate");
		Stream<Integer> listaFiltrada =listaNumeros.stream().filter(numero-> numero>=3);
		listaFiltrada.forEach(numero->LOG.info("Valor: "+numero));
		//4.FUCTION
		LOG.info("JAVA Function");
		Stream<Integer> listaCambiada2 = listaNumeros.stream().map(numeroLista->{
			Integer valorFinal = numeroLista+1;
			return valorFinal;
		});
		listaCambiada2.forEach(numero->LOG.info("Valor entero"+numero));
		
	}


	

}
