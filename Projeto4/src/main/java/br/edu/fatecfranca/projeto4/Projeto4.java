/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto4;

import br.edu.fatecfranca.projeto4.exe0.Assistente;
import br.edu.fatecfranca.projeto4.exe0.Diretor;
import br.edu.fatecfranca.projeto4.exe0.Funcionario;
import br.edu.fatecfranca.projeto4.exe0.Gerente;

/**
 *
 * @author danielfacciolo
 */
public class Projeto4 {

    public static void polimorfismo(Funcionario camaleao){
        
        System.out.println(camaleao.toString());
    
    }
    
    public static void main(String[] args) {
        
        Gerente objGerente = new Gerente(3000, 1, "Fulano", "123",
                1500, 44);
        polimorfismo(objGerente);
        
        Assistente objAssistente = new Assistente(20, "Fulano", 11, "Beltrano", "321",
                1000, 44);
        polimorfismo(objAssistente);
        
        Diretor objDiretor = new Diretor("5", 111, "Ciclano", "656", 5000, 44);
         polimorfismo(objDiretor);
        
    }
}
