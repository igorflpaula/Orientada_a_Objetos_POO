package Bigas.ex7;

import java.util.Scanner;

public class Perimetro{

    public static void main(String[] args){
        
        int l;
        double x;
        Scanner lerLados = new Scanner(System.in);          
        //Aqui, fica dando erro de 'Resource Leak is never closed'                                                            
        //O jeito que achei de arrumar, que era colocar input.closed no final, não adiantou
        System.out.print("Digite quantos lados tem o Poligono: ");
        l = lerLados.nextInt();
        
        Poligono pol = new Poligono(l);
        
        for(int i=0; i<l; i++){                             //Aqui, eu queria que o primeiro Lado, fosse o Lado 1, não o Lado 0
            System.out.print("Tamanho do lado " +(i+1));    //Mas todas as opções que eu tentei, não deu certo.
            System.out.print(":");
            System.out.println("");
            x = lerLados.nextDouble();
            pol.setLado(i,x);
        }
        
        double p = pol.perimetro();
        
        System.out.print("Poligono de " +l);
        System.out.print(" lados, possui " +p);
        System.out.print(" de Perimetro.");
        
        lerLados.close();
    }
}
