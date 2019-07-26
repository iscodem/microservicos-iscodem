package com.springboot.api.apitest.model;

public class Persona {
	
	private Integer id;
	private String nomnbres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sexo;
	private String direccion;
	private String estadoCivil;
	
	public Persona() {
		
	}

	public Persona(Integer id, String nomnbres, String apellidoPaterno, String apellidoMaterno, String sexo,
			String direccion, String estadoCivil) {
	
		this.id = id;
		this.nomnbres = nomnbres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomnbres() {
		return nomnbres;
	}

	public void setNomnbres(String nomnbres) {
		this.nomnbres = nomnbres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nomnbres=" + nomnbres + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", estadoCivil=" + estadoCivil + "]";
	}

}
