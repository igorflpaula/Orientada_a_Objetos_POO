package Bigas.encapsulamento;

public class CarroCorrida{

    private int numeroCarro;
    private String piloto;
    private String equipe;
    private double velocidadeMax;
    private double velocidadeAtual = 0; //só get
    private boolean ligado; //só get

    public CarroCorrida(int num, String piloto, String equipe, double vMax){
        this.numeroCarro = num;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMax = vMax;
        this.ligado = false;
    }


    public int getNumeroCarro(){
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro){
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto(){
        return piloto;
    }

    public void setPiloto(String piloto){
        this.piloto = piloto;
    }

    public String getEquipe(){
        return equipe;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public double getVelocidadeMax(){
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    } 

    public boolean getLigado(){
		return ligado;
	}
	
	public void setLigado(boolean ligado){
		this.ligado = ligado;
	}

	public void nome(){
		System.out.print("CARRO Nº " +this.numeroCarro);
		System.out.print(" do Piloto " +this.piloto);
		System.out.print(" e da Equipe " +this.equipe);
		System.out.print(" vai entrar na pista!\n");
	}

    public boolean estaLigado(){

        if(this.getLigado() == true){
			System.out.print("Carro Nº " +this.numeroCarro);
			System.out.print("esta LIGADO");
        }
        
		return this.getLigado();
	}

    public boolean estaParado(){

		if(this.velocidadeAtual == 0){
			System.out.print("Carro Nº " +this.numeroCarro);
			System.out.print(" esta PARADO\n");
			return true;
		}
		else{
			System.out.print("Carro Nº " +this.numeroCarro);
			System.out.print(" esta em MOVIMENTO\n");
			return false;
		}

	}
	
	public void ligar(){
		this.setLigado(true);

		System.out.println("LIGADO o carro do piloto " +this.piloto);
	}
	
	public void desligar(){

		if(this.estaParado() == true){
			setLigado(false);
			System.out.println("DESLIGADO o carro do piloto " +this.piloto);
		}
		else{
			System.out.println("Velocidade atual: " + this.getVelocidadeAtual());
			System.out.println("PARE o carro para desliga-lo");
		}
	}
	
	public void acelerar(double porcentagem){
		System.out.println("Acelerando...");

		if(this.getVelocidadeAtual() <= this.getVelocidadeMax()){
			if (this.getVelocidadeAtual() != 0){
				this.setVelocidadeAtual(this.getVelocidadeAtual()+(this.getVelocidadeAtual() * (porcentagem/100)));
				
				if(this.getVelocidadeAtual()>this.getVelocidadeMax()){
					this.setVelocidadeAtual(this.getVelocidadeMax());
				}

				System.out.println("Velocidade Atual: " +this.getVelocidadeAtual() + " km/h");
			}
			else{
				this.setVelocidadeAtual(this.getVelocidadeMax() * (porcentagem/100));
				System.out.println("Velocidade Atual: " + this.getVelocidadeAtual() + " km/h");
			}
		}
		else{
			System.out.println("Carro em Velocidade Maxima!" + this.getVelocidadeAtual());
		}
	}
	
	public void frear(double porcentagem){
		if(this.getLigado() == true){
			this.setVelocidadeAtual(this.getVelocidadeAtual()-(this.getVelocidadeAtual() * porcentagem/100));

			if(this.getVelocidadeAtual() < 0){
				this.setVelocidadeAtual(0);
			}
			System.out.println("Parando...");
			System.out.println("Velocidade Atual: " + this.getVelocidadeAtual() + " km/h");
		}
	}

}