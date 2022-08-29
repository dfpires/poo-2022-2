/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.ex2;

/**
 *
 * @author monitorlab4
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(01,15,"Fulano",1200);
        System.out.println(obj1.mostrarDados());
        obj1.realizarDeposito(12000);
        obj1.realizarSaque(100000);
        System.out.println(obj1.mostrarDados());
        
        
    }
    
}
