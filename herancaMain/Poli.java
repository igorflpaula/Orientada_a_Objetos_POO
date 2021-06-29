package Bigas.herancaMain;

import Bigas.heranca.Veiculo;
import Bigas.heranca.Moto;
import Bigas.heranca.CarroPasseio;
import Bigas.heranca.Caminhao;
import Bigas.heranca.CarroCorrida;

import java.util.ArrayList;
import java.util.Random;

public class Poli{

    public static void main(String [] args){

        ArrayList<Veiculo> car = new ArrayList<>();
        String primeiro = null, ultimo = null;
        float vpri, vult;

        Random r = new Random();
        double porcentagem = (double) (r.nextInt(100)+1)/100;

        car.add(new Moto("Moto", 200, 5));
        car.add(new CarroPasseio("Carro", 100, 4));
        car.add(new Caminhao("Caminhao", 50, 2000, 1200));
        car.add(new CarroCorrida("Carro Corrida", 300, 22, "Bigas", "Mercedes AMG"));

        CarroCorrida c = (CarroCorrida) car.get(3);
        c.ligaTurbo();
        System.out.println();

        for(int i=0; i<car.size(); i++){
            car.get(i).exibeVeiculo();
            car.get(i).ligar();
            for(int j=0; j<5; j++){
                car.get(i).acelerar(porcentagem);
                car.get(i).vAtual(porcentagem*i);
            }
            System.out.println();
        }

        primeiro = car.get(0).getTipo_veiculo();
        vpri = (float) car.get(0).getVelocidadeAtual();
        ultimo = car.get(0).getTipo_veiculo();
        vult = (float) car.get(0).getVelocidadeAtual();

        for(int i=0; i<car.size(); i++){
            if(vpri < car.get(i).getVelocidadeAtual()){
                primeiro = car.get(i).getTipo_veiculo();
                vpri = (float) car.get(i).getVelocidadeAtual();
            }
        }
        for(int i=0; i<car.size(); i++){
            if(vult > car.get(i).getVelocidadeAtual()){
                ultimo = car.get(i).getTipo_veiculo();
                vpri = (float) car.get(i).getVelocidadeAtual();
            }
        }

        System.out.println();
        System.out.println("Vencedor: " +primeiro);
        System.out.println("Ultimo: " +ultimo);
    }
    
}
