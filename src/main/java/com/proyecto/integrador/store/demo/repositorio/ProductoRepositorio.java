package com.proyecto.integrador.store.demo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto.integrador.store.demo.entidades.Producto;

public interface ProductoRepositorio extends Repository<Producto, Integer>{
	
	List<Producto>findAll();
	Producto findById(Integer id);
	Producto save(Producto p);
	void delete (Producto p);

}
