package com.tienda.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.api.entity.Proveedores;
import com.tienda.api.service.ProveedoresService;
import com.tienda.api.utils.NotFoundException;


@RestController
@RequestMapping("/proveedor")
public class ProveedoresController {
	
	@Autowired
	private ProveedoresService serProve;
	
	
	@GetMapping("/listarTodos")
	
	public ResponseEntity<List<Proveedores>> listarTodos() throws Exception{
		List<Proveedores> lista=serProve.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/buscarProveePorID/{codigo}")
	public ResponseEntity<Proveedores> buscarPorID(@PathVariable("codigo") Integer cod) throws Exception{
		Proveedores bean=serProve.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		
		return new ResponseEntity<>(bean,HttpStatus.OK); 
	}
	
	@PostMapping("/registrarProvee")
	public ResponseEntity<Proveedores> registrarProvee(@RequestBody Proveedores prov) throws Exception{
		Proveedores m=serProve.registrar(prov);
		
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizarProvee")
	public ResponseEntity<Proveedores> actualizarProvee(@RequestBody Proveedores prov) throws Exception{
		Proveedores bean=serProve.buscar(prov.getPROV_ID());
		if(bean==null)
			throw new NotFoundException();
		else
			bean=serProve.actualizar(prov);
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminarProveePorID/{codigo}")
	public ResponseEntity<Void> eliminarProveePorID(@PathVariable("codigo") Integer cod) throws Exception{
		Proveedores bean=serProve.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		else
			serProve.eliminar(cod);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
