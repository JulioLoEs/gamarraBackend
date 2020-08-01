package com.proyecto.integrador.store.demo.services;

import java.util.List;

import com.proyecto.integrador.store.demo.entidades.Tienda;

public interface TiendaService {
	

	List<Tienda>listar();
	Tienda listarId(int id);
	Tienda agregar(Tienda t);
	Tienda editar(Tienda t);
	Tienda eliminar(int id);
	
}
