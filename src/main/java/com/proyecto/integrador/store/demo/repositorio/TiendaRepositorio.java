package com.proyecto.integrador.store.demo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto.integrador.store.demo.entidades.Tienda;

public interface TiendaRepositorio extends Repository<Tienda, Integer>{
	
	List<Tienda>findAll();
	Tienda findById(Integer id);
	Tienda save(Tienda t);
	void delete(Tienda t);
	
	
	

}
