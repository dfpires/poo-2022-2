package br.edu.fatecfranca.projeto1;

/**
 *
 * @author daniel.pires
 */
public class Teste {

    public static void main(String[] args) {
       // vamos criar um objeto da classe Produto
       // estamos instanciando a classe Produto
       // ou criando uma instância da classe Produto
       Produto obj1 = new Produto();
       obj1.nome = "Bola de basquete";
       obj1.qtde = 3;
       obj1.preco = 90.40;
       obj1.mostrar();
       
       obj1.comprar(2);
       obj1.vender(1);
       obj1.subir(3);
       obj1.descer(1);
       obj1.mostrar();
       
       // chama o método construtor para inicializar as variáveis
       Produto obj2 = new Produto("Máscara para Covid-19", 5, 5.20); 
       obj2.mostrar();
       obj2.comprar(3);
       obj2.vender(1);
       obj2.subir(3);
       obj2.descer(1);
       obj2.mostrar();
        
       Produto obj3 = new Produto("Almoço", 2, 12.90); 
       obj3.mostrar();
       obj3.comprar(1);
       obj3.vender(2);
       obj3.subir(3);
       obj3.descer(1);
       obj3.mostrar();
       
    }
}
