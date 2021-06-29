package Bigas.ex8;

public class Aluno{

    // VARIAVEIS ALUNO
    private String nome;
    private int idade;
    private int turma;
    
    public Aluno (String nome1, int idade1, int turma1){
        this.setNome(nome1);
        this.setIdade(idade1);
        this.setTurma(turma1);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getTurma(){
        return turma;
    }

    public void setTurma(int turma){
        this.turma = turma;
    }
    
    public void dados(){
        System.out.println("Aluno: "+this.nome);
        System.out.println("Idade do aluno: "+this.idade);
        System.out.println("Turma: "+this.turma);
    }
}
