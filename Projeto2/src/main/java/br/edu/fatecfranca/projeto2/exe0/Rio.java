
package br.edu.fatecfranca.projeto2.exe0;

public final class Rio {
    // Java possui dois tipos de dados
    // tipo primitivo: float, double, int, char, boolean
    // Classe: String, Float, Double, Integer, Character, Boolean
    private String nome;
    private double nivel;
    private boolean poluido; // variável booleana (true / false)
    
    // construtor sem parâmetro
    public Rio(){
        
    }
    public Rio(String nome, double nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNivel(double nivel){
        if (nivel >= 0){
            this.nivel = nivel;
        }
        else System.out.println("Nível não pode ser negativo");
    }
    public void setPoluido(boolean poluido){
       this.poluido = poluido;
    }
    public String getNome(){
        return this.nome;
    }
    public double getNivel(){
        return this.nivel;
    }
    public boolean isPouido(){
        return this.poluido;
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
