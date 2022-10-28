package com.tienda.api.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CRUDImpl <T,ID> implements CRUD <T,ID> {

	public abstract JpaRepository<T,ID> getRepository();
	

	@Override
	public T registrar(T bean) throws Exception {
		return getRepository().save(bean);
	}

	@Override
	public T actualizar(T bean) throws Exception {
		// TODO Auto-generated method stub
		return getRepository().save(bean);
	}

	@Override
	public void eliminar(ID cod) throws Exception {
		getRepository().deleteById(cod);
		
	}

	@Override
	public T buscar(ID cod) throws Exception {
		// TODO Auto-generated method stub
		return getRepository().findById(cod).orElse(null);
	}

	@Override
	public List<T> listar() throws Exception {
		// TODO Auto-generated method stub
		return getRepository().findAll();
	}

	
}
