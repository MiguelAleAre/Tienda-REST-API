package com.tienda.api.service;

import java.util.List;

public interface CRUD<T,ID> {

	T registrar(T bean) throws Exception;
	T actualizar(T bean)throws Exception;
	void eliminar(ID cod)throws Exception;
	T buscar(ID cod) throws Exception;
	List<T> listar() throws Exception;
	
}
