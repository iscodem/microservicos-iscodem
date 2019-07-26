package com.springboot.api.apitest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.apitest.bean.ResponseAllPersona;
import com.springboot.api.apitest.dao.impl.PersonaDaoImpl;
import com.springboot.api.apitest.model.Persona;
import com.springboot.api.apitest.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDaoImpl _personaDao; 
	
	@Override
	public ResponseAllPersona getAllPersonas() {
		ResponseAllPersona response = new ResponseAllPersona();
		List<Persona> personas = new ArrayList<Persona>();
		personas = _personaDao.getAllPersonas();
		
		if(personas.size() > 0) {
			response.setCodigo("0000");
			response.setMensaje("Se han encontrado personas en la lista");
			response.setPersonas(personas);
		}else {
			response.setCodigo("0100");
			response.setMensaje("No se han encontrado personas en la lista");
			
		}		
		return response;
	}

	@Override
	public Persona getPersona(Integer id) {
		
		return _personaDao.getPersona(id);
	}

	@Override
	public void savePersona(Persona persona) {
		
		_personaDao.savePersona(persona);
	}

	@Override
	public void deletePersona(Integer id) {
		_personaDao.deletePersona(id);
		
	}

}
