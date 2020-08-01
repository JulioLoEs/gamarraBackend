package com.proyecto.integrador.store.demo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto.integrador.store.demo.entidades.Categoria;

public interface CategoriaRepositorio extends Repository<Categoria, Integer>{

	List<Categoria>findAll();
	Categoria findById(Integer id);
	Categoria save(Categoria c);
	void delete(Categoria c);
	
}
