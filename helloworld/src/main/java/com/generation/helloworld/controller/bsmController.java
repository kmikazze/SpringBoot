package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class bsmController {
	
	@GetMapping
	public String bsm() {
		return "BSM's Generation: "
				+ " 1 - Mentalidade de crescimento"
				+ " | 2 - Orientação ao futuro"
				+ " | 3 - Persistência"
				+ " | 4 - Responsabilidade pessoal"
				+ " | 5 - Orientação ao detalhe"
				+ " | 6 - Trabalho em equipe"
				+ " | 7 - Proatividade"
				+ " | 8 - Comunicação";
	}
	

}
