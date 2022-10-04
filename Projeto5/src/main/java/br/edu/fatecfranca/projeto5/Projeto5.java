/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto5;

/**
 *
 * @author danielfaccioloo
 */
public class Projeto5 {

    public static void main(String[] args) {
        
        Ornitorrinco objOrn1 = new Ornitorrinco();
        objOrn1.botarOvo();
        objOrn1.darMama();
        
        
        IMamifero objMam1 = new Ornitorrinco();
        
        objMam1.darMama();
        
        IAve objAv1 = new Ornitorrinco();
        objAv1.botarOvo();
        
        
    }
}
