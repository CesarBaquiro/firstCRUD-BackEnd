package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DemoApplication;
import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import ch.qos.logback.classic.Level;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	//private final static Logger LOGGER = Logger.getLogger(UsuarioController.class);
	
	@Autowired
	UsuarioService usuarioService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return usuarioService.obtenerUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		//LOGGER.log(Level.INFO, "Se hizo el post");
		return this.usuarioService.guardarUsuario(usuario);
	}
}
