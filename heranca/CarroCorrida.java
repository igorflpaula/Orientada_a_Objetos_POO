package Bigas.heranca;

public class CarroCorrida extends Veiculo{

    private int numeroCarro;
    private String piloto;
    private String equipe;
    private boolean turbo;
    
    public CarroCorrida(String nome, float velocidadeMaxima, int numeroCarro, String piloto, String equipe){
        super(nome, velocidadeMaxima);
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.turbo = false;
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
        if(isTurbo() == true){
            System.out.println("Turbo ON");
        }
        else{
            System.out.println("Turbo OFF");
        }

        System.out.print(getTipo_veiculo() +" tem " + velocidadeMaxima + " de Velocidade Máxima alem de ser o ");
        System.out.print("Carro Nº " +this.numeroCarro);
		System.out.print(" do Piloto " +this.piloto);
        System.out.print(" e da Equipe " +this.equipe);
		//System.out.print(" e da Equipe " +this.equipe + "esta a uma velocidade de " +getVelocidadeAtual() + " km/h");
        System.out.println();
    }

    public void ligaTurbo(){
        if(turbo == false){
            turbo = true;
            System.out.println("Turbo ligado.");
        }
        else{
            System.out.println("Turbo ja ligado.");
        }
    }

    @Override
    public void acelerar(double porcentagem){
        if(isTurbo() == true){
            if(ligado == true && velocidadeAtual > 0){
                velocidadeAtual += (velocidadeAtual * (porcentagem*2))/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else if(ligado == true && velocidadeAtual == 0){
                velocidadeAtual += (velocidadeMaxima * (porcentagem*2))/100;
                if(velocidadeAtual > velocidadeMaxima){
                    velocidadeAtual = velocidadeMaxima;
                }
            }
            else{
                System.out.println("Carro ja desligado.");
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
                System.out.println("Carro ja desligado.");
            }
        }
    }

    public boolean isTurbo(){
        return turbo;
    }

    public boolean turboLigado(){
        return turbo;
    }

    public int getNumeroCarro(){
        return numeroCarro;
    }

    public String getPiloto(){
        return piloto;
    }

    public String getEquipe(){
        return equipe;
    }

    public boolean getTurbo(){
		return turbo;
	}
	
	public void setTurbo(boolean turbo){
		this.turbo = turbo;
	}

    public void tipoDeVeiculo(){
        System.out.println("Carro de corrida");
    }


}
