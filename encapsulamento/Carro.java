package Bigas.encapsulamento;

public class Carro{

    /*int numeroCarro;
    String piloto;
    String equipe;
    double velocidadeMax;
    double velocidadeAtual;
    boolean ligado; */

    public static void main(String[] args){

        CarroCorrida car1 = new CarroCorrida(22, "Bigas", "Scuderia Ferrari", 330.00);

        //System.out.println("teste " +car1.getPiloto());

        car1.nome();

        car1.estaLigado();
        car1.estaParado();
        car1.estaLigado();
		car1.ligar();
		car1.acelerar(20);  //20%
        car1.acelerar(40);
        car1.estaParado();
        car1.acelerar(60);
        car1.desligar();    //Testar se ele não desliga em movimento
        car1.acelerar(80);
        car1.acelerar(100);
		car1.frear(50);
        car1.frear(100);
		car1.desligar();

    }
      
}
