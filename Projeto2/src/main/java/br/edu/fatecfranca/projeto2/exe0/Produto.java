package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author Daniel
 */
// final indica que a classe não pode ser herdada
public final class Produto {

    // criar os atributos da classe, também chamados de variáveis da classe
    private int qtde;
    private double preco;
    private String nome;
    
    public Produto(){
        
    }
    public Produto(String nome, int qtde, double preco){
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQtde(int qtde){
        if (qtde >= 0){
            this.qtde = qtde;
        }
        else {
            System.out.println("Qtde não pode ser negativa");
        }
    }
    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço não pode ser negativo");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getQtde(){
        return this.qtde;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void comprar(int x){
        this.qtde += x;
    }
    
    public void vender(int x){
        if (x <= this.qtde){
            this.qtde += x;
        }
    }
    public void subir(double x){
        this.preco += x;
    }
    public void descer(double x){
        if ( x <= this.preco){
            this.preco -= x;
        }
    }
    public void mostrar(){
        System.out.println("Nome " + this.nome + " Qtde " + this.qtde +
                " Preço " + this.preco);
    }
}
