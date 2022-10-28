package com.tienda.api.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.api.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente,Integer>{

}
