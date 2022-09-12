package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public final class Reserva {
    private int id;
    private Date data;
    
    // agregação
    private Passageiro passageiro;
    private Voo voo;
    
    public Reserva(){
        
    }

    public Reserva(int id, Date data, Passageiro passageiro, Voo voo) {
        this.setId(id);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", data=" + data + 
                ", passageiro=" + passageiro + ", voo=" + voo + '}';
    }
    
    
}
