/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.prova1;

/**
 *
 * @author danielfacciolo
 */
public class Teste {

    public static void converteString(Imovel im){
        System.out.println(im.toString());
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa objCasa = new Casa(80, "Rua das Acácias");
        converteString(objCasa);
        
        Apto objApto = new Apto(12, "Rua do Comércio 234");
        converteString(objApto);
    }
    
}
