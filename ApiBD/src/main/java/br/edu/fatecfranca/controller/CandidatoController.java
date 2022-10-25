package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.CandidatoEntity;
import br.edu.fatecfranca.model.CandidatoRepository;

@RestController // informa que a classe controla Rest
@RequestMapping("/api/candidato") // responde nesta rota
public class CandidatoController {
	
	// Java Spring tem como principal característica 
	// a injeção de dependência, que permite que um objeto
	// possa executar métodos sem ser instanciado
	@Autowired
	CandidatoRepository injecao;
	
	// consulta
	@GetMapping
	public List<CandidatoEntity> getCandidatos(){
		 return injecao.findAll(); // faz o select
	}
	
	// inserção
	@PostMapping
	public CandidatoEntity addCandidato(@RequestBody CandidatoEntity candidato) {
		// insere no banco e retorna o objeto criado
		return injecao.save(candidato); // faz o insert
	}
	
	// remoção
	// atualização
}
