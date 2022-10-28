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

import com.tienda.api.entity.Cliente;
import com.tienda.api.service.ClienteService;
import com.tienda.api.utils.NotFoundException;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService serviceCliente;
	
	
	@GetMapping("/listarClientes")
	
	public ResponseEntity<List<Cliente>> listarTodos() throws Exception{
		List<Cliente> lista=serviceCliente.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/buscarClientePorID/{codigo}")
	public ResponseEntity<Cliente> buscarPorID(@PathVariable("codigo") Integer cod) throws Exception{
		Cliente bean=serviceCliente.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		
		return new ResponseEntity<>(bean,HttpStatus.OK); 
	}
	
	@PostMapping("/registrarCliente")
	public ResponseEntity<Cliente> registrarProvee(@RequestBody Cliente cli) throws Exception{
		Cliente m=serviceCliente.registrar(cli);
		
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizarCliente")
	public ResponseEntity<Cliente> actualizarCliente(@RequestBody Cliente cli) throws Exception{
		Cliente bean=serviceCliente.buscar(cli.getIdcliente());
		if(bean==null)
			throw new NotFoundException();
		else
			bean=serviceCliente.actualizar(cli);
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminarClientePorID/{codigo}")
	public ResponseEntity<Void> eliminarClientePorID(@PathVariable("codigo") Integer cod) throws Exception{
		Cliente bean=serviceCliente.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		else
			serviceCliente.eliminar(cod);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
