package com.proyecto.integrador.store.demo.services;

import java.util.List;

import com.proyecto.integrador.store.demo.entidades.Producto;


public interface ProductoService {
	
	List<Producto>listar();
	Producto listarId(int id);
	Producto agregar(Producto p);
	Producto editar(Producto p);
	Producto eliminar(int id);

}
