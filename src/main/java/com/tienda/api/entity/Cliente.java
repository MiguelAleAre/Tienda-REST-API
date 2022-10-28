package com.tienda.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcliente;
	
	@Column(name="CLIENT_NOM")
	private String nombre;
	
	@Column(name="CLIENT_APE")
	private String apellido;
	
	@Column(name="CLIENT_DNI")
	private int dni;
	
	@Column(name="CLIENT_EDAD")
	private int edad;

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
