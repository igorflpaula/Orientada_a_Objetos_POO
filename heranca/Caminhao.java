package Bigas.heranca;

public class Caminhao extends Veiculo{

    private float peso;
    private float pesoAtual;
    
    public Caminhao(String nome, float velocidadeMaxima, float peso, float pesoAtual){
        super(nome, velocidadeMaxima);
        this.peso = peso;
        this.pesoAtual = pesoAtual;
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

        System.out.println(getTipo_veiculo() +" tem " + velocidadeMaxima + " de Velocidade Máxima e suporta ate " + peso + " kg's.");
        //System.out.println("E esta a uma velocidade de " +getVelocidadeAtual() + " km/h e com carregando apenas " +getPesoAtual() + " kg's.");
        //System.out.println();
    }

    @Override
    public void acelerar(double porcentagem){
        if(pesoAtual > peso/2){
            if(ligado == true && velocidadeAtual > 0){
                velocidadeAtual += (velocidadeAtual * (porcentagem/2))/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else if(ligado == true && velocidadeAtual == 0){
                velocidadeAtual += (velocidadeMaxima * (porcentagem/2))/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else{
                System.out.println("Caminhao ja desligado.");
            }
        }
        else{
            if(ligado == true && velocidadeAtual > 0){
                velocidadeAtual += (velocidadeAtual * porcentagem)/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else if(ligado == true && velocidadeAtual == 0){
                velocidadeAtual += (velocidadeMaxima * porcentagem)/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else{
                System.out.println("Caminhao ja desligado.");
            }
        }
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPesoAtual() {
        return pesoAtual;
    }
    public void setPesoAtual(float pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public void tipoDeVeiculo(){
        System.out.println("Caminhão");
    }
}
