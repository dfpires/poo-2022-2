package br.edu.fatecfranca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // informa que é entidade de BD
@Table(name="candidato") // informa que é uma tabela
public class CandidatoEntity {
	@Id // chave primária
	// campo auto-incremento iniciando em 1
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="partido")
	private String partido;
	@Column(name="idade")
	private int idade;
	@Column(name="nota")
	private float nota;
	
	public CandidatoEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "CandidatoEntity [id=" + id + ", nome=" + nome + ", partido=" + partido + ", idade=" + idade + ", nota="
				+ nota + "]";
	}
	
	
}
