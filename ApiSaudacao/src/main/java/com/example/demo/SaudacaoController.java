package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // decorator para informar que a classe responde requsição
@RequestMapping("/api/saudacao")
public class SaudacaoController {
	
	// vamos criar uma API que responde pela requisição GET
	@GetMapping
	public String bomDia() {
		return "Tenha um bom dia";
	}

	
	@GetMapping("/{nome}")
	public String bomDia(@PathVariable String nome) {
		return "Tenha um bom dia " + nome ;
	}
	
}
