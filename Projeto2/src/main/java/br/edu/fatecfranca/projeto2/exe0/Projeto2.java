package br.edu.fatecfranca.projeto2.exe0;

public class Projeto2 {

    public static void main(String[] args) {
       Produto prod1 = new Produto();
       prod1.setNome("microfone");
       prod1.setQtde(-5);
       prod1.setPreco(-94.21);
       prod1.mostrar();
       System.out.println(" Qtde: " + prod1.getQtde());
       System.out.println(" Nome: " + prod1.getNome());
       System.out.println(" Preço: " + prod1.getPreco());
       
       Produto prod2 = new Produto("placa de vídeo", -1, -890.00);
       prod2.mostrar();
      
       
    }
}
