package com.proyecto.integrador.store.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.entidades.RegistroUsuario;
import com.proyecto.integrador.store.demo.repositorio.RegistroUsuarioRepositorio;
import com.proyecto.integrador.store.demo.services.RegistroUsuarioService;


@Service
public class RegistroUsuarioImpl implements RegistroUsuarioService{

	
	@Autowired
	private RegistroUsuarioRepositorio rrepositorio;
	
	@Override
	public List<RegistroUsuario> listar() {
		 
		return rrepositorio.findAll();
	}

	@Override
	public RegistroUsuario listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroUsuario agregar(RegistroUsuario r) {
		// TODO Auto-generated method stub
		return null;
	}

}
