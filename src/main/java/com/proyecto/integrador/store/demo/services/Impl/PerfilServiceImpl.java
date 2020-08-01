package com.proyecto.integrador.store.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.entidades.Perfil;
import com.proyecto.integrador.store.demo.repositorio.PerfilRepositorio;
import com.proyecto.integrador.store.demo.services.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	private PerfilRepositorio perfrepositorio;
	
	@Override
	public List<Perfil> listar() {
		 
		return perfrepositorio.findAll();
	}

	@Override
	public Perfil listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil agregar(Perfil p) {
		 
		return perfrepositorio.save(p);
	}

	@Override
	public Perfil editar(Perfil p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil borrar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
