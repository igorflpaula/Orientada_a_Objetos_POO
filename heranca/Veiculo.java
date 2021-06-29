package Bigas.heranca;

public class Veiculo{

    protected String tipo_veiculo;
    protected float velocidadeMaxima;
    protected float velocidadeAtual = 0;
    protected boolean ligado;

    public Veiculo(String nome, float velocidadeMaxima){
        this.tipo_veiculo = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligado = false;
    }
  
    public void exibeVeiculo(){
        System.out.println("Erro: veículo de tipo indefinido.");
    }

    public String getTipo_veiculo(){
        return tipo_veiculo;
    }
    
    public void setTipo_veiculo(String tipo_veiculo){
        this.tipo_veiculo = tipo_veiculo;
    }
    
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public boolean estaLigado(){
        if (ligado == true){
            return true;
        } else{
            return false;
        }
    }
    public boolean estaParado(){
        if (velocidadeAtual == 0){
            return true;
        } else{
            return false;
        }
    }
    public void ligar(){
        if(ligado == false){
            System.out.println("Ligando veiculo...");
            this.ligado = true;
        } 
        else{
            System.out.println("Veiculo já está ligado");
        }
    }

    public void desligar(){
        if(ligado == false && estaParado() == true){
            ligado = false;
            System.out.println("Veiculo desligando...");
        }
        else if(estaParado() == false && ligado == true){
            System.out.println("Veiculo em movimento, não é possível desligar");
        }
        else{
            System.out.println("Veiculo ja esta desligado.");
        }            
    }
    
    public void acelerar(double porcentagem){
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
            System.out.println("O veiculo esta desligado, nao foi possivel acelerar.");
        }
    }

    public void vAtual(double porcentagem){
        System.out.println("Velocidade atual: " +getVelocidadeAtual() + " km/h");
    }
    
    public void frear(double porcentagem){
        if(ligado == true && velocidadeAtual > 0){
            velocidadeAtual -= (velocidadeAtual * porcentagem)/100;
            if(velocidadeAtual < 0){
                velocidadeAtual = 0;
            }
        }
    }

}   