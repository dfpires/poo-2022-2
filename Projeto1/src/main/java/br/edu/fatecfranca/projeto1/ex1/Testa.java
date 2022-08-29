/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.ex1;

/**
 *
 * @author 1090482111037
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.nomeAluno = "Joao";
        obj1.numeroAluno = 120;
        obj1.idade = 12;
        obj1.p1 = 8;
        obj1.p2 = 4;
        
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
        Aluno obj2 = new Aluno(125,"Luis",15,9,1);
        System.out.println(obj2.dadosAluno());    
        obj2.passou();          
    }    
}
