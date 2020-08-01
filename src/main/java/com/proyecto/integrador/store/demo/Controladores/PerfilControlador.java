package com.proyecto.integrador.store.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.store.demo.entidades.Perfil;
import com.proyecto.integrador.store.demo.services.PerfilService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/perfiles"})
public class PerfilControlador {

	@Autowired
	PerfilService pservice;
	
	@GetMapping
	public List<Perfil>listar(){
		return pservice.listar();
	}
	
	@PostMapping
	public Perfil agregar(@RequestBody Perfil p) {
		return pservice.agregar(p);
		
	}
}
