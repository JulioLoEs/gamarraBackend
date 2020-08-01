package com.proyecto.integrador.store.demo.services;

import java.util.List;

import com.proyecto.integrador.store.demo.entidades.RegistroUsuario;

public interface RegistroUsuarioService {
	
	List<RegistroUsuario>listar();
	RegistroUsuario listarId(int id);
	RegistroUsuario agregar(RegistroUsuario r);
	
	
	

}
