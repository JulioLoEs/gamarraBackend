package com.proyecto.integrador.store.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.entidades.Tienda;
import com.proyecto.integrador.store.demo.repositorio.TiendaRepositorio;
import com.proyecto.integrador.store.demo.services.TiendaService;


@Service
public class TiendaServiceImpl implements TiendaService {
	
	@Autowired
	private TiendaRepositorio trepositorio;

	@Override
	public List<Tienda> listar() {
		 
		return trepositorio.findAll();
	}

	@Override
	public Tienda listarId(int id) {
		 
		return trepositorio.findById(id);
	}

	@Override
	public Tienda agregar(Tienda t) {
		
		return trepositorio.save(t);
	}

	@Override
	public Tienda editar(Tienda t) {
	 
		return trepositorio.save(t);
	}

	@Override
	public Tienda eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
