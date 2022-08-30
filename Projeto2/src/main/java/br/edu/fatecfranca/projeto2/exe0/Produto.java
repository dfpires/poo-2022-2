package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author Daniel
 */
// final indica que a classe não pode ser herdada
public final class Produto {

    // private permite definir uma variável com visibilidade privada
    // isso faz com que a variável possa ser acessada diretamente
    // apenas dentro da própria classes
    // caso queiramos acessar esta variável de fora da classe, precisamos
    // utilizar os getters e setters
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
        this.setQtde(this.qtde - x);
    }
    
    public void subir(double x){
        this.preco += x;
    }
    
    public void descer(double x){
        this.setPreco(this.preco - x);
        
    }
    
    public void mostrar(){
        System.out.println("Nome " + this.nome + " Qtde " + this.qtde +
                " Preço " + this.preco);
    }
}
