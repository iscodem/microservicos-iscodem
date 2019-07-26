package com.springboot.api.apitest.dao;

import java.util.List;

import com.springboot.api.apitest.model.Persona;

public interface PersonaDao {

	List<Persona> getAllPersonas();
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);
	
}
