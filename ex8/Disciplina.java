package Bigas.ex8;

public class Disciplina{

    //VARIAVEIS MATERIA
    private Aluno alunos[];
    int auxiliar;
    int i;
    
    public Disciplina(int tam){
        alunos = new Aluno[tam];
    }
    
    public boolean adicionaAluno(Aluno aluno){

        for(i=0; i<this.alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                return true;
            }
        }
        
        return false;
    }
    
    public boolean removerAluno(Aluno aluno){

        for(i=0; i<this.alunos.length; i++){
            if(alunos[i].getNome().equals(aluno.getNome()) && alunos[i].getIdade() == aluno.getIdade() && alunos[i].getTurma() == aluno.getTurma()){
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public void lista(){

        System.out.println("\n**DADOS DOS ALUNOS**");
        System.out.println("");
        
        for(int i=0; i<this.alunos.length;i++){
            if(alunos[i] != null){
                alunos[i].dados();
                System.out.println("");
            }
        }         
    }
    
    public void getNumedodosAlunos(){

        auxiliar = 0;
        for(i=0; i<this.alunos.length; i++){
            if(alunos[i] != null){
                auxiliar++;
            }
        }
        
        System.out.println("Numero de alunos na disciplina: " +auxiliar);
        
    }
}
