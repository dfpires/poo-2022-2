/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto2.exe1;

/**
 *
 * @author Daniel.Pires
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
        cli1.depositar(1000);
        cli1.sacar(400);
        cli1.mostrar();
    }
    
}
