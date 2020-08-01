package com.proyecto.integrador.store.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.entidades.Producto;
import com.proyecto.integrador.store.demo.repositorio.ProductoRepositorio;
import com.proyecto.integrador.store.demo.services.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService {
	
	@Autowired
	private ProductoRepositorio prepositorio;

	@Override
	public List<Producto> listar() {
		 
		return prepositorio.findAll();
	}

	@Override
	public Producto listarId(int id) {
		 
		return prepositorio.findById(id);
	}

	@Override
	public Producto agregar(Producto p) {
		 
		return prepositorio.save(p);
	}

	@Override
	public Producto editar(Producto p) {
		 
		return prepositorio.save(p);
	}

	@Override
	public Producto eliminar(int id) {
		Producto p = prepositorio.findById(id); 
		if(p!=null) {
			 prepositorio.delete(p);
		}
		return p;
		
	}

}
