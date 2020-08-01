package com.proyecto.integrador.store.demo.services;

import java.util.List;

import com.proyecto.integrador.store.demo.entidades.Perfil;

public interface PerfilService {
	
	List<Perfil>listar();
	Perfil listarId(int id);
	Perfil agregar(Perfil p);
	Perfil editar(Perfil p);
	Perfil borrar(int id);
	

}
