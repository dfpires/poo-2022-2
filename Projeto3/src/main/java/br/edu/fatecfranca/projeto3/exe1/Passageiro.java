
package br.edu.fatecfranca.projeto3.exe1;

/**
 *
 * @author danielfacciolo
 */
public final class Passageiro {
    private int id;
    private String nome;
    private String cidade;

    public Passageiro(){
        
    }

    public Passageiro(int id, String nome, String cidade) {
        this.setId(id);
        this.setNome(nome);
        this.setCidade(cidade);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + '}';
    }
    
    
    
}
