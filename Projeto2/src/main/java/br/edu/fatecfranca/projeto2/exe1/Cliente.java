package br.edu.fatecfranca.projeto2.exe1;

public final class Cliente {
    private String nroConta, nroAgencia, nome;
    private double saldo;
    
    public Cliente(){
        
    }
    public Cliente(String nroConta, String nroAgencia, String nome, double saldo){
        this.setNome(nome);
        this.setNroAgencia(nroAgencia);
        this.setNroConta(nroConta);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    public void setNroAgencia(String nroAgencia){
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    public void setNome(String nome){
        if (nome.length() <= 30) 
            this.nome = nome;
        else System.out.println("Tamanho inválido"); 
    }
    public void setSaldo(double saldo){
        if (saldo >= 0)
           this.saldo = saldo;
        else System.out.println("Saldo não pode ser negativo");
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double x){
        this.setSaldo(this.saldo + x);
    }
    public void sacar(double x){
        this.setSaldo(this.saldo - x);
    }
    public void mostrar(){
        System.out.println("Conta " + this.nroConta + " Agência " + this.nroAgencia +
                " Nome " + this.nome + " Saldo " + this.saldo);
    }
}