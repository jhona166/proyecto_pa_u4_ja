package com.example.demo.uce.funcionalidad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainInterfacesFuncionales {
	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 1.SUPPLIER
		LOG.info("1.SUPPLIER");
		// Clases
		IPersonaSupplier<String> supplier1 = new PersonaSupplierImpl();
		LOG.error("Supplier Clase:"+supplier1.getNombre());
		
		// Lambas
		IPersonaSupplier<String> supplier2= () -> "Jhonatan 2";
		LOG.info("Supplier Lambda:"+supplier2.getNombre());
		
		
		IPersonaSupplier<Integer> supplier3 =() -> Integer.valueOf(5);
		LOG.info("Supplier Lambda:"+supplier3.getNombre());
		
		IPersonaSupplier<Persona> supplier4 =() -> {
			Persona per = new Persona();
			per.setApellido("Altamirano");
			per.setNombre("Jhonatan");
			return per;
		};
		LOG.info("Supplier Lambda:"+supplier4.getNombre());
		
		
		IPersonaSupplier<Persona> supplier5 = new PersonaSupplier2Impl();
		LOG.info("Supplier Lambda:"+supplier5.getNombre());
		// 1.CONSUMER
		LOG.info("2. CONSUMER");
		//Clase
		
		IPersonaConsumer<String,Integer> consumer1 = new PersonaConsumerImpl();
		consumer1.accept("Procesa este dato ",Integer.valueOf(10));
		
		//Lambda
		IPersonaConsumer<String,Integer> consumer2 = (cadena, numero) -> {
			LOG.info("mnsaje a:"+cadena);
			LOG.info("mnsaje b:"+numero);
		};
		
		consumer2.accept("procesa este dato 2",Integer.valueOf(15));
	
		IPersonaConsumer<Integer, Integer> consumer3 = (valor1, valor2)->{
			Integer valor3 = valor1.intValue()+valor2.intValue();
			LOG.info("Valor 3= "+valor3);
		};
		consumer3.accept(Integer.valueOf(5),Integer.valueOf(15));
	
		// 1.CONSUMER
		LOG.info("3. PREDICATE");
		
		//Lambdas
		IPersonaPredicate<String> predicate1 = cadena -> cadena.contains("Z");
		LOG.info("Predicate:"+predicate1.evaluar("Edison"));
		
		IPersonaPredicate<Integer> predicate2 = numero ->{
			if(numero.intValue()>10) {
				return true;
			}else {
				return false;
			}
		};
		LOG.info("Predicate:"+predicate2.evaluar(Integer.valueOf(11)));
		
		// 4. FUCTION 
		LOG.info("4. FUNCTION");
		IPersonaFunction<String, Integer> function = numero ->"Valor"+numero.toString();
		LOG.info(function.aplicar(10));
		
		IPersonaFunction<Ciudadano , Persona> function2 = per->{
			Ciudadano ciu = new Ciudadano();
			ciu.setNombreCompleto(per.getNombre()+" "+per.getApellido());
			ciu.setCiudad("Quito");
			return ciu;
		};
		Persona per1 = new Persona();
		per1.setNombre("Jhonatan");
		per1.setApellido("Altamirano");
		Ciudadano ciudadanoConvertido =function2.aplicar(per1);
		LOG.info("Ciudadano convertido: "+ciudadanoConvertido);

		// 4. UnaryOperator
		//labdas
		IPersonaUnaryOperator<String> unaryOperator = cadena->{
			String cadenaFinal = cadena.concat("-sufijo");
			return cadenaFinal;
		};
		LOG.info("unaryOperator: "+unaryOperator.aplicar("Daniel"));
	
	}


	

}
