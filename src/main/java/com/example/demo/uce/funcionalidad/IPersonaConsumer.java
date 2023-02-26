package com.example.demo.uce.funcionalidad;
@FunctionalInterface
public interface IPersonaConsumer<T,R> {
	public void accept(T arg1, R arg2);
	
}
