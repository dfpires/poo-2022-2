
package br.edu.fatecfranca.projeto3.exe0;

public final class Aluno {
    private int ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(int ra, String nome) {
        this.setRa(ra);
        this.setNome(nome);
    }

    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
    
    
}
