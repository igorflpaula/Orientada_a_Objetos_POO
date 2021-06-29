package Bigas.polimorfismo;

public class Gato extends Animal{

    private double tamanho;

    public Gato(String nome, double tamanho){
        super(nome);
        this.tamanho = tamanho;
    }
    
    public double getTamanho(){
        return tamanho;
    }

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
}
