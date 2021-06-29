package Bigas.heranca;

public class Moto extends Veiculo{

    private int bagagem;

    public Moto(String nome, float velocidadeMaxima, int bagagem){
        super(nome, velocidadeMaxima);
        this.bagagem = bagagem;
    }

    @Override
    public void exibeVeiculo(){

        System.out.println(getTipo_veiculo() +" tem " + velocidadeMaxima + " de Velocidade Máxima e possui " + bagagem + " de bagagem.");
        //System.out.println("E esta a uma velocidade de " +getVelocidadeAtual() + " km/h");
        //System.out.println();
        if(isLigado() == true){
            System.out.println(getTipo_veiculo() + " ligado");
        }
        else{
            System.out.println(getTipo_veiculo() + " desligado");
        }
        if(estaParado() == true){
            System.out.println(getTipo_veiculo() + " parado");
        }
        else{
            System.out.println(getTipo_veiculo() + " em movimento...");
        }
    }

    public int getBagagem(){
        return bagagem;
    }
    public void setBagagem(int bagagem){
        this.bagagem = bagagem;
    }
   
    public void tipoDeVeiculo(){
        System.out.println("Moto");
    }

}
