package com.tienda.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "")
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idproveedores;
	
	@Column(name="")
	private String nombre;
	
	@Column(name="")
	private String apellido;
	
	@Column(name="")
	private String empresa;

	public Integer getIdproveedores() {
		return idproveedores;
	}

	public void setIdproveedores(Integer idproveedores) {
		this.idproveedores = idproveedores;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	

}
