package com.proyecto.integrador.store.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.store.demo.entidades.RegistroUsuario;
import com.proyecto.integrador.store.demo.services.RegistroUsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuarios"})
public class RegistroUsuarioControlador {

	@Autowired
	RegistroUsuarioService rservice;
	
	@GetMapping
	public List<RegistroUsuario>listar(){
		return rservice.listar();
	}
	
	
}
