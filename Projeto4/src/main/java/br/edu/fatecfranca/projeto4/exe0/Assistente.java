/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author danielfacciolo
 */
public class Assistente extends Funcionario {
    
    private float horasExtras;
    private String quemAssiste;
    
    public Assistente(){
        super();
    }

    public Assistente(float horasExtras, String quemAssiste, int codigo, String nome, 
            String cpf, float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria); // chama construtor da superclasse
        this.horasExtras = horasExtras;
        this.quemAssiste = quemAssiste;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }

    @Override
    public String toString() {
        return "Assistente{" + "horasExtras=" + horasExtras + 
                ", quemAssiste=" + quemAssiste + super.toString() + '}';
    }
    
    
    
}
