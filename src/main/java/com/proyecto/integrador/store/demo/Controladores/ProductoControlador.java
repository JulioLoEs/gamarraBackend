package com.proyecto.integrador.store.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.store.demo.entidades.Producto;
import com.proyecto.integrador.store.demo.services.ProductoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/productos"})
public class ProductoControlador {
	
	@Autowired
	ProductoService pservice;
	
	@GetMapping
	public List<Producto>listar(){
		return pservice.listar();
	}
	
	@PostMapping
	public Producto agregar(@RequestBody Producto p) {
		return pservice.agregar(p);
		
	}
	
	@GetMapping(path = {"/{id}"})
	public Producto listarId(@PathVariable("id")int id) {
		return  pservice.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Producto editar(@RequestBody Producto p, @PathVariable("id") int id) {
		p.setIdproducto(id);
		return pservice.editar(p);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Producto borrar(@PathVariable("id")int id) {
		return pservice.eliminar(id);
	}

}
