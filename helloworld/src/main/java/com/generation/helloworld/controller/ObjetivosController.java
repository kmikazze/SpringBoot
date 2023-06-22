package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Meus objetivos de aprendizagem: Gostaria de explorar mais minha cominucação "
				+ "e minhas habilidades técnicas. Pretendo até o final deste módulo me empenhar "
				+ "para que eu me torne uma ótima pessoa em ambiente de trabalho e saiba"
				+ " desempenhar meu papel como pessoa desenvolvedora full stack júnior";
	}

}
