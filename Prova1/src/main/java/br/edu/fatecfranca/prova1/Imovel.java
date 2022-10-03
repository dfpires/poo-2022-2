/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.prova1;

/**
 *
 * @author danielfacciolo
 */
public class Imovel {
 
    protected String endereco;
    
    public Imovel(){
        
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }
    
    
}
