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

import com.proyecto.integrador.store.demo.entidades.Tienda;
import com.proyecto.integrador.store.demo.services.TiendaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/tiendas"})
public class TiendaControlador {
	
	@Autowired
	TiendaService tservice;
	
	@GetMapping
	public List<Tienda>listar(){
		return tservice.listar();
	}

	@PostMapping
	public Tienda agregar(@RequestBody Tienda t) {
		return tservice.agregar(t);
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Tienda listarId(@PathVariable("id")int id) {
		return tservice.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Tienda editar(@RequestBody Tienda t, @PathVariable("id") int id) {
		t.setIdtienda(id);
		return tservice.editar(t);
	}
	
}
