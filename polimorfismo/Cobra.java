package Bigas.polimorfismo;

public class Cobra extends Animal{

    private String especie;
    private double comprimento;

    public Cobra(String especie, String nome, double comprimento){
        super(nome);
        this.especie = especie;
        this.comprimento = comprimento;
    }

    @Override
    public void alimentar(){
        System.out.println(getNome() + " esta comendo.");
        engolir();
        digerir();
    }
    
    /*private void rastejar(double metros){
        System.out.println(getNome() + "rastejou por " + metros + " metros");
    }*/

    public String getEspecie(){
        return especie;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

}
