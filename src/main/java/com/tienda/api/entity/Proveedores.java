package com.tienda.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "PROVEEDORES")
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer PROV_ID;
	
	@Column(name="PROV_NOM")
	private String PROV_NOM;
	
	@Column(name="PROV_APE")
	private String PROV_APE;
	
	@Column(name="PROV_EMPRE")
	private String PROV_EMPRE;

	
	
	

	public String getPROV_EMPRE() {
		return PROV_EMPRE;
	}

	public void setPROV_EMPRE(String pROV_EMPRE) {
		PROV_EMPRE = pROV_EMPRE;
	}

	public Integer getPROV_ID() {
		return PROV_ID;
	}

	public void setPROV_ID(Integer pROV_ID) {
		PROV_ID = pROV_ID;
	}

	public String getPROV_NOM() {
		return PROV_NOM;
	}

	public void setPROV_NOM(String pROV_NOM) {
		PROV_NOM = pROV_NOM;
	}

	public String getPROV_APE() {
		return PROV_APE;
	}

	public void setPROV_APE(String pROV_APE) {
		PROV_APE = pROV_APE;
	}



	
	
	
	

}
