
package br.edu.fatecfranca.projeto1.exe3;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        // vamos criar um objeto da classe Produto -> INSTANCIAR A CLASSE
        Produto obj1 = new Produto();
        obj1.nome = "Liquidificador";
        obj1.qtde = 3;
        obj1.preco = 348;
        
        System.out.println("Nome: " + obj1.nome + " Qtde: " + obj1.qtde + 
                " Preço: " + obj1.preco);
        
        // instanciar mais um objeto como exercício
        Produto obj2 = new Produto();
        obj2.nome = "Bola de futebol";
        obj2.preco = 90.30f;
        obj2.qtde = 6;
        System.out.println("Nome: " + obj2.nome + " Qtde: " + obj2.qtde + 
                " Preço: " + obj2.preco);
                
        
        
    }
}
