/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto4;

import br.edu.fatecfranca.projeto4.exe0.Assistente;
import br.edu.fatecfranca.projeto4.exe0.Diretor;
import br.edu.fatecfranca.projeto4.exe0.Funcionario;
import br.edu.fatecfranca.projeto4.exe0.Gerente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Projeto4 {

    public static void calcSalario(Funcionario objFuncionario){
         // será executado: Funcionario objFuncionario = objGerente
        // OU
        // será executado: Funcionario objFuncionario = objAssistente
        // OU    
        // será executado: Funcionario objFuncionario = objDiretor
         JOptionPane.showMessageDialog(null, objFuncionario.calculaSalario());
    }
    public static void converteString(Funcionario camaleao){
        // será executado: Funcionario camaleao = objGerente
        // OU
        // será executado: Funcionario camaleao = objAssistente
        // OU    
        // será executado: Funcionario camaleao = objDiretor
        JOptionPane.showMessageDialog(null, camaleao.toString()); // ocorre o polimorfismo
    
    }
    
    public static void main(String[] args) {
        
        Gerente objGerente = new Gerente(3000, 1, "Fulano", "123",
                1500, 44);
        converteString(objGerente);
        calcSalario(objGerente);
        Assistente objAssistente = new Assistente(20, "Fulano", 11, "Beltrano", "321",
                1000, 44);
        converteString(objAssistente);
        calcSalario(objAssistente);
        
        Diretor objDiretor = new Diretor("5", 111, "Ciclano", "656", 5000, 44);
         converteString(objDiretor);
        calcSalario(objDiretor);
        
        
        ArrayList<Funcionario> vetor = new ArrayList();
        vetor.add(new Gerente(3000, 2, "Abreu", "123", 1500, 44));
        vetor.add(new Assistente(20, "Pedro", 22, "Beltrano", "321", 1000, 44));
        vetor.add(new Diretor("5", 222, "Lucas", "656", 5000, 44));
    }
    
    // crie um método nesta classe, a exemplo do método polimorfismo
    // que execute o método calculaSalario()
}
