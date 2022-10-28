package com.tienda.api.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tienda.api.dao.ClienteDAO;
import com.tienda.api.entity.Cliente;
@Service
public class ClienteService extends CRUDImpl<Cliente,Integer>{

	
	@Autowired
	private ClienteDAO repo;
	
	@Override
	public JpaRepository<Cliente, Integer> getRepository() {
		return repo;
	}

}
