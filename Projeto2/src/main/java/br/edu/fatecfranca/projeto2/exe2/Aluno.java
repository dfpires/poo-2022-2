package br.edu.fatecfranca.projeto2.exe2;
public final class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;
    
    public Aluno(){
        
    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    public void setNroAluno(int nroAluno){
        // converte int para String
        if (Integer.toString(nroAluno).length() == 6){
            this.nroAluno = nroAluno;
        }
        else System.out.println("Tamanho incorreto");
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Tamanho inválido");
    }
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Idade inválida");
    }
    public void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("Nota p1 inválida");
    }
    public void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("Nota p2 inválida");
    }
    public int getNroAluno(){
        return this.nroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    public void notaFinal(){
        float media = (this.p1 + this.p2)/2;
        System.out.println("A nota final do aluno é " + media);
    }
    public void dadosAluno(){
        System.out.println("Número: " + this.nroAluno + " Nome: " + this.nome +
                " Idade: " + this.idade);
    }
}
