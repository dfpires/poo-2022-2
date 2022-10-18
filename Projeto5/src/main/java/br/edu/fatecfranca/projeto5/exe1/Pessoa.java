/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

/**
 *
 * @author danielfacciolo
 */
public class Pessoa extends Animal implements ICidadao, IContribuinte, IProfessor{ 

    @Override
    public void vota() {
        System.out.println("Pessoa votando ....");
    }

    @Override
    public void obterRg() {
        System.out.println("Pessoa tirando RG ...");
    }

    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagando IR ...");
    }

    @Override
    public void obterCpf() {
        System.out.println("Pessoa obtendo CPF ... ");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando ...");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhando ...");
    }
    
}
