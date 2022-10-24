package br.edu.fatecfranca.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends 
			JpaRepository<CandidatoEntity, Long>{

	// esta classe vai herdar todos os métodos
	// inserção, remoção, consulta e atualização
	// em banco de dados da tabela candidato
	
	
}
