package Bigas.polimorfismo;

public class Girafa extends Animal{
    
    private double tamPescoco;

    public Girafa(String nome, double tamPescoco){
        super(nome);
        this.tamPescoco = tamPescoco;
    }

    public void andar(double metros){
        System.out.println(getNome() + "andou por " + metros + " metros");
    }

    public double getTamPescoco(){
        return tamPescoco;
    }

    public void setTamPescoco(double tamPescoco){
        this.tamPescoco = tamPescoco;
    }

}
