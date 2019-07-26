package com.springboot.api.apitest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.api.apitest.dao.PersonaDao;
import com.springboot.api.apitest.model.Persona;
import com.springboot.api.apitest.rowmapper.PersonaRowMapper;

@Repository
public class PersonaDaoImpl extends JdbcDaoSupport implements PersonaDao {
	
	 public PersonaDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);		
	}
	
	@Override
	public List<Persona> getAllPersonas() {
		
		List<Persona> personas = new ArrayList<Persona>();
		
		String sql = "select id,nombres,apellidoPaterno, apellidoMaterno, sexo, direccion, estadoCivil from persona";
		
		try {
			
			RowMapper<Persona> personaRow = new PersonaRowMapper();
			personas = getJdbcTemplate().query(sql, personaRow);
			logger.debug("Se han listado las siguiente personas : "+personas.toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return personas;
	}

	@Override
	public Persona getPersona(Integer id) {
		
		
		return null;
	}

	@Override
	public void savePersona(Persona persona) {
		
		
	}

	@Override
	public void deletePersona(Integer id) {
		
		
	}
}
