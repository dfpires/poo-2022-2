
package br.edu.fatecfranca.projeto3.exe1;

public final class Voo {
    private int id;
    private String origem;
    private String destino;
    
    public Voo(){
        
    }

    public Voo(int id, String origem, String destino) {
        this.setId(id);
        this.setOrigem(origem);
        this.setDestino(destino);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", origem=" + origem + ", destino=" + destino + '}';
    }
    
}
