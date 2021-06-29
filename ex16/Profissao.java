package Bigas.ex16;

public class Profissao{
    
    public static void main(String[] args){
        
        Funcionario f1 = new Funcionario("Fernanda", "Medica", 'F', 25, 7000); // Cria Funcionario 1
        Funcionario f2 = new Funcionario("Igor", "Enfermeiro", 'M', 23, 1500); // Cria Funcionario 2
        
        System.out.println("**FUNCIONARIOS**");
        System.out.println("");
        
        // FUNCIONARIO 1

        System.out.println("Funcionario 1");
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Salario: R$ "+f1.getSalario());
        System.out.println("Cargo: "+f1.getCargo());
        System.out.println("Sexo: "+f1.getSexo());
        System.out.println("Idade: "+f1.getIdade());
        System.out.println("");
        
        // FUNCIONARIO 2

        System.out.println("Funcionario 2");
        System.out.println("Nome: "+f2.getNome());
        System.out.println("Salario: R$ "+f2.getSalario());
        System.out.println("Cargo: "+f2.getCargo());
        System.out.println("Sexo: "+f2.getSexo());
        System.out.println("Idade: "+f2.getIdade());
        
        System.out.println(""); // Pular Linha
        
        Pizza P1= new Pizza("Espanhola", 40,4);
        Pizza P2= new Pizza("Triozinho", 33,3);       
        Pizza P3= new Pizza("A Moda", 50,6);
       
        System.out.println("**MENU**");
        System.out.println("");

        System.out.println("Pizza 1");
        System.out.println("Sabor: "+P1.getNome());
        System.out.println("Valor: R$ "+P1.getValor());
        System.out.println("Numero de Ingredientes: "+P1.getNumeroIngrediente());
        System.out.println("");

        System.out.println("Pizza 2");
        System.out.println("Sabor: "+P2.getNome());
        System.out.println("Valor: R$ "+P2.getValor());
        System.out.println("Numero de Ingredientes: "+P2.getNumeroIngrediente());
        System.out.println("");

        System.out.println("Pizza 3");
        System.out.println("Sabor: "+P3.getNome());
        System.out.println("Valor: R$ "+P3.getValor());
        System.out.println("Numero de Ingredientes: "+P3.getNumeroIngrediente());
        System.out.println("");

    }
}
