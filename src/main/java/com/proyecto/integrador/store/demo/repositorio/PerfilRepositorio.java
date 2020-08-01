package com.proyecto.integrador.store.demo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto.integrador.store.demo.entidades.Perfil;

public interface PerfilRepositorio extends Repository<Perfil, Integer> {
	
	List<Perfil>findAll();
	Perfil findById(Integer id);
	Perfil save(Perfil p);
	void delete(Perfil p);
	

}
