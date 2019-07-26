package com.springboot.api.apitest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.api.apitest.dao.PersonaDao;
import com.springboot.api.apitest.model.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao {

	private static List<Persona> listapersonas = new ArrayList<Persona>();
	
	 public PersonaDaoImpl() {
		
		 listapersonas.add(new Persona(1, "Jose Luis", "Huamán", "Villar", "Masculino", "Los olivos", "Casado"));
		 listapersonas.add(new Persona(2, "Madona", "Madona", "Madona", "Femenino", "EEUU", "Divorciada"));
		 listapersonas.add(new Persona(3, "Richard", "Paucar", "De la torre", "Masculino", "Los olivos", "Soltero"));
		 listapersonas.add(new Persona(4, "Bertha", "García", "Esteban", "Femenino", "Pan Norte km. 4", "Casada"));
		 
	}
	
	@Override
	public List<Persona> getAllPersonas() {
		
		return listapersonas;
	}

	@Override
	public Persona getPersona(Integer id) {
		Persona persona = null;
		
		for(int i = 0; i < listapersonas.size(); i++) {
			if(listapersonas.get(i).getId() == id) {
				persona = listapersonas.get(i);
				return persona;
			}
		}
		
		return persona;
	}

	@Override
	public void savePersona(Persona persona) {
		if(persona.getId() == null || "".equals(persona.getId())) {
			persona.setId(listapersonas.size()+1);
			listapersonas.add(persona);
			
		}else {
			for(int i = 0; i < listapersonas.size(); i++) {
				if(listapersonas.get(i).getId() == persona.getId()) {
					listapersonas.set(i, persona);
				}
			}
		}		
		
	}

	@Override
	public void deletePersona(Integer id) {
		
		for(int i = 0; i <listapersonas.size(); i++ ) {
			Persona persona = getPersona(id);
			if(persona != null) {
				listapersonas.remove(persona);
			}			
		}		
	}
}
