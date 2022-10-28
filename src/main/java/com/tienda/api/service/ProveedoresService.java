package com.tienda.api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tienda.api.dao.ProveedoresDAO;
import com.tienda.api.entity.Proveedores;

@Service
public class ProveedoresService extends CRUDImpl<Proveedores,Integer>{

	@Autowired
	private ProveedoresDAO reposi;
	
	@Override
	public JpaRepository<Proveedores, Integer> getRepository() {
		return reposi;
	}

}
