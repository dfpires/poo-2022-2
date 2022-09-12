
package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Passageiro objPassageiro = new Passageiro(1, "Fulano", "Franca");
        Voo objVoo = new Voo(10, "São Paulo", "Recife");
        Reserva objReserva = new Reserva(1, new Date(), objPassageiro, objVoo);
        System.out.println(objReserva.toString());
        
        Voo obj2Voo = new Voo(20, "Campinhas", "Belo Horizonte");
        Reserva obj2Reserva = new Reserva(2, new Date(), objPassageiro, obj2Voo);
        System.out.println(obj2Reserva.toString());
        
        
        Passageiro obj2Passageiro = new Passageiro(2, "Beltrano", "Franca");
        Reserva obj3Reserva = new Reserva(3, new Date(), obj2Passageiro, objVoo);
        System.out.println(obj3Reserva.toString());
        
    }
    
}
