/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author danielfacciolo
 */
public class Funcionario {
    // variáveis da superclasse devem ser com visilidade protected para permitir
    // que as subclasses herdem estas
    protected int codigo;
    protected String nome, cpf;
    protected float salario, cargaHoraria;

    public Funcionario(){
        
    }
    
    public Funcionario(int codigo, String nome, String cpf, float salario, float cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + 
                ", cpf=" + cpf + ", salario=" + salario + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
    
}
