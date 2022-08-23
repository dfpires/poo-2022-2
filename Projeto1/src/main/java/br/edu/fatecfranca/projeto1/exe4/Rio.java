
package br.edu.fatecfranca.projeto1.exe4;

public class Rio {
    // Java possui dois tipos de dados
    // tipo primitivo: float, double, int, char, boolean
    // Classe: String, Float, Double, Integer, Character, Boolean
    public String nome;
    public double nivel;
    public boolean poluido; // variável booleana (true / false)
    
    // construtor sem parâmetro
    public Rio(){
        
    }
    public Rio(String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(double x){
        this.nivel += x;
    } 
    public void ensolarar(double x){
        if (x <= this.nivel){
            this.nivel -= x;
        }
        else {
            System.out.println("Nível do rio não pode ser negativo");
        }
    }
    
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
        }
        else {
            System.out.println("Rio já está limpo");
        }
    }
    
    public void sujar(){
        if (!this.poluido){
            this.poluido = true;
        }
        else {
            System.out.println("Rio já está sujo");
        }
    }
    
    public void mostra(){
        String aux = this.poluido ? "Sim" : "Não";
        System.out.println("Nome: " + this.nome + 
                " Nível: " + this.nivel + 
                "Poluido: " + aux);
    }
    
}
