package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.funcionalidad.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	
}
