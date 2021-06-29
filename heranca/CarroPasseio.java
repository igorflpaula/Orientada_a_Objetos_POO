package Bigas.heranca;

public class CarroPasseio extends Veiculo{

    private int porta;
    
    public CarroPasseio(String nome, float velocidadeMaxima, int porta){
        super(nome, velocidadeMaxima);
        this.porta = porta;
    }

    @Override
    public void exibeVeiculo(){

        if(isLigado() == true){
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
        if(estaParado() == true){
            System.out.println("Parado");
        }
        else{
            System.out.println("Em movimento...");
        }

        System.out.println(getTipo_veiculo() +" tem " + velocidadeMaxima + " de Velocidade Máxima e possui " + porta + " portas.");
        //System.out.println("E esta a uma velocidade de " +getVelocidadeAtual() + " km/h");
        //System.out.println();
    }

    public int getPorta(){
        return porta;
    }
    public void setPorta(int porta){
        this.porta = porta;
    }

    public void tipoDeVeiculo(){
        System.out.println("Carro de Passeio");
    }
}
