package Bigas.ex7;

public class Poligono{

    private int n;
    private double lados[];
    
    public Poligono(int n){
        lados = new double[n];
        this.n = n;
    }
    
    public void setLado(int j, double tamanholado){
        this.lados[j] = tamanholado; 
    }
    
    public double perimetro(){
        for(int i=1; i<n; i++){
            lados[0] += lados[i];
        }
        
        return lados[0];
    }
}
