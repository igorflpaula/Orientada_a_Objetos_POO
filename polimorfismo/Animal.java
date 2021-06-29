package Bigas.polimorfismo;

public class Animal{
    
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void alimentar(){
        System.out.println(getNome() + " esta comendo.");
        mastigar();
        engolir();
        digerir();
    }

    private void mastigar(){
        System.out.println("Mastigando o alimento.");
    }

    protected void engolir(){
        System.out.println("Engolindo o alimento.");
    }

    protected void digerir(){
        System.out.println("Digerindo o alimento.");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
