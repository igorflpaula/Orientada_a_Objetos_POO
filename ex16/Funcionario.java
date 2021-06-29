package Bigas.ex16;

public class Funcionario{
    
// VARIAVEIS PARA FUNCIONARIO

    private String nome;
    private String cargo;
    private double salario;
    private char sexo;
    private int idade;
    
    public Funcionario(String nome, String cargo, char sexo, int idade, double salario){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.sexo = sexo;
        this.idade = idade;
    }

// NOME
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

// CARGO 
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

// SALARIO       
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

// SEXO 
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

// IDADE   
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
}