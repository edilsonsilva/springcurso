package com.projeto.spring.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {

	
	@GetMapping("/turma/mensagem")
	public String mensagem() {
		return "Comandos elementares";
	}
	
}
