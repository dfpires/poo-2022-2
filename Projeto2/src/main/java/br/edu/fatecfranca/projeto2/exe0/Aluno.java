/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author 1090482111037
 */
public class Aluno {
    public int numeroAluno;
    public String nomeAluno;
    public int idade;
    public double p1;
    public double p2;
    
    //Definir os metodos construtores
    public Aluno (){
        
    }
    
    public Aluno (int numeroAluno, String nomeAluno, int idade, double p1, double p2){
        
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public double notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String dadosAluno() {
        return "Numero Aluno: " + this.numeroAluno + " Nome aluno: " + this.nomeAluno + 
        " Idade: " + this.idade + " Nota final: " + this.notaFinal();
    }
    
    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
