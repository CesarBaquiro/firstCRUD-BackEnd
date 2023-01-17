package com.example.demo.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;




@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return usuarioService.obtenerUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}
}
