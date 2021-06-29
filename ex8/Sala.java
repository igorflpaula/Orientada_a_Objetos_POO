package Bigas.ex8;

public class Sala{

    public static void main(String[] args){
       
        Aluno n1 = new Aluno("Igor",23,1);
        Aluno n2 = new Aluno("Fernanda",21,2);
        Aluno n3 = new Aluno("Nicholas",25,3);
        
        Disciplina x1 = new Disciplina(40);
          
// ALUNO 1
    if(x1.adicionaAluno(n1) == true){
        System.out.println("Aluno: "+n1.getNome() + " Foi adicionado.");
    }
    else{
        System.out.println("**NAO ADICIONADO**" + n1.getNome());
    }

// ALUNO 2
    if(x1.adicionaAluno(n2) == true){
        System.out.println("Aluno: "+n2.getNome() + " Foi adicionado.");
    }
    else{
        System.out.println("**NAO ADICIONADO**" + n2.getNome());
    }

// ALUNO 3
    if(x1.adicionaAluno(n3) == true){
        System.out.println("Aluno: "+n3.getNome() + " Foi adicionado.");
    }
    else{
        System.out.println("**NAO ADICIONADO**" +n3.getNome());
    }
        
// TIRAR ALUNO

    if (x1.removerAluno(n2) == true){
        System.out.println("Aluno: " +n2.getNome() + " Foi Removida.");
    }
    else{
        System.out.println("**ERRO AO REMOVER ALUNO**" +n2.getNome());
    }

    x1.lista();
    x1.getNumedodosAlunos();

    }
}
