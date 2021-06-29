package Bigas.polimorfismoMain;

import Bigas.polimorfismo.Animal;
import Bigas.polimorfismo.Cobra;
import Bigas.polimorfismo.Leao;
import Bigas.polimorfismo.Girafa;
import Bigas.polimorfismo.Gato;

import java.util.ArrayList;

public class Zoologico{

    public static void main(String [] args){

        ArrayList<Animal> zoo = new ArrayList<>();

        Leao l = new Leao("Simba", "marrom");
        zoo.add(l);

        zoo.add(new Girafa("Melman", 2.5));

        zoo.add(new Cobra("Naja", "Kaa", 4.3));

        zoo.add(new Gato("Garfield", 0.5));

        for(int i=0; i<zoo.size(); i++){
            zoo.get(i).alimentar();
            System.out.println();
        }

        Leao l2 = (Leao) zoo.get(0);
        System.out.println(l2.getCorJuba());

    }
    
}
