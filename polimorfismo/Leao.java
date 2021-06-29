package Bigas.polimorfismo;

public class Leao extends Animal{
    
    private String corJuba;

    public Leao(String nome, String corJuba){
        super(nome);
        this.corJuba = corJuba;
    }

    public void andar(double metros){
        System.out.println(getNome() + "andou por " + metros + " metros");
    }

    public void rugir(){
        System.out.println(getNome() + " esta rugindo.");
    }

    public String getCorJuba(){
        return corJuba;
    }

}
