package com.example.demo.uce.funcionalidad;

public class PersonaSupplier2Impl implements IPersonaSupplier<Persona>{

	@Override
	public Persona getNombre() {
		// TODO Auto-generated method stub
		Persona per = new Persona();
		per.setApellido("Altamirano1");
		per.setNombre("Jhonatan1");
		return per;
	}

}
