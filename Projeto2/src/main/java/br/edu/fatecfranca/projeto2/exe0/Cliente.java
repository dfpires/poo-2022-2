/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author 1090482111037
 */
public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public double saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(int numeroConta, int numeroAgencia, String nome, double saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(int x){
        saldo = saldo + x;
    }
    
    public void realizarSaque (int x){
        if(saldo >= x){
        saldo = saldo - x;
        }
        
        else{
            System.out.println("Você não tem saldo o suficiente");
        }
    }
    
    public String mostrarDados(){
        return "Numero da conta: " + this.numeroConta + " Nome do cliente: " + this.nome +
        " Saldo: " + this.saldo;
    }
}
