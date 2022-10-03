package br.edu.fatecfranca.prova1;

/**
 *
 * @author danielfacciolo
 */
public final class Computador {

    private String modo;
    private int memoria;
    
    public Computador(){
        
    }

    public Computador(String modo, int memoria) {
        this.setModo(modo);
        this.setMemoria(memoria);
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        if (modo.equals("ligado") || modo.equals("desligado")){
            this.modo = modo;
        }
        else System.out.println("Modo inválido");
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria == 4 || memoria == 8 || memoria == 16 || memoria == 32){
            this.memoria = memoria;
        }
        else System.out.println("Memória inválida");
    }
    
    public void upgradeRam(int x){
        this.setMemoria(this.memoria + x);
    }
}
