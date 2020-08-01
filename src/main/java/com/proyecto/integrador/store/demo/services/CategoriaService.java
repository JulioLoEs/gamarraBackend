package com.proyecto.integrador.store.demo.services;

import java.util.List;

import com.proyecto.integrador.store.demo.entidades.Categoria;

public interface CategoriaService {
	
	List<Categoria>listar();
	Categoria listarId(int id);
	Categoria agregar(Categoria c);
	Categoria editar(Categoria c);
	Categoria eliminar(int c);

}
