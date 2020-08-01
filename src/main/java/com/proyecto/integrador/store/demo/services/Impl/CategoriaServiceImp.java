package com.proyecto.integrador.store.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.entidades.Categoria;
import com.proyecto.integrador.store.demo.repositorio.CategoriaRepositorio;
import com.proyecto.integrador.store.demo.services.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	
	@Autowired
	private CategoriaRepositorio caterepositorio;

	@Override
	public List<Categoria> listar() {
		 
		return caterepositorio.findAll();
	}

	@Override
	public Categoria listarId(int id) {
		 
		return caterepositorio.findById(id);
	}

	@Override
	public Categoria agregar(Categoria c) {
		 
		return caterepositorio.save(c);
	}

	@Override
	public Categoria editar(Categoria c) {
		 
		return caterepositorio.save(c);
	}

	@Override
	public Categoria eliminar(int c) {
		// TODO Auto-generated method stub
		return null;
	}

}
