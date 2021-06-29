package Bigas.ex16;

public class Pizza{

// VARIAVEIS PARA A PIZZA

    String nome;
    double valor;
    int numeroIngrediente;
    
    public Pizza(String nome, double valor, int numeroIngrediente){
        this.nome = nome;
        this.valor = valor;
        this.numeroIngrediente = numeroIngrediente;
    }        

// NOME
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

// VALOR 
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

// NUMERO DE INGREDIENTES     
    public int getNumeroIngrediente(){
        return numeroIngrediente;
    }
    public void setNumeroIngrediente(int numeroIngrediente){
        this.numeroIngrediente = numeroIngrediente;
    }

}
