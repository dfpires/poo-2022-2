/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

/**
 *
 * @author danielfacciolo
 */
public class Cidade {
 
    public void contrata(IProfessor p){
	p.ensina();
	p.trabalha();
    }

    public void contrata(IEmpregado e){
            e.trabalha();
    }

    public void cobraDe(IContribuinte c) {
            c.pagaIr();
    }

    public void registra(ICidadao c) {
            c.obterRg();
    }

    public void alimenta(Animal a ){
            a.come();
    }

}
