package com.proyecto.integrador.store.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.store.demo.entidades.Categoria;
import com.proyecto.integrador.store.demo.services.CategoriaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/categorias"})
public class Controlador {
	
	@Autowired
	CategoriaService catservice;
	
	@GetMapping
	public List<Categoria>listar(){
		
		return catservice.listar();
	}
	
	@PostMapping
	public Categoria agregar(@RequestBody Categoria c) {
		return catservice.agregar(c);
	}
	
	@GetMapping(path = {"/{id}"})
	public Categoria listarId(@PathVariable("id")int id) {
		return  catservice.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Categoria editar(@RequestBody Categoria c, @PathVariable("id") int id) {
		c.setIdcategoria(id);
		return catservice.editar(c);
	}

}
