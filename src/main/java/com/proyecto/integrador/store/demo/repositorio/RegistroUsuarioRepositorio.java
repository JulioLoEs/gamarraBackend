package com.proyecto.integrador.store.demo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto.integrador.store.demo.entidades.RegistroUsuario;

public interface RegistroUsuarioRepositorio extends Repository<RegistroUsuario, Integer>{
	
	List<RegistroUsuario>findAll();
	RegistroUsuario findById(Integer id);
	RegistroUsuario save(RegistroUsuario r);
	void delete (RegistroUsuario r);

}
