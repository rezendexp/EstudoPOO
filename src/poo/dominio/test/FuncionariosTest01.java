package poo.dominio.test;

import metodos.Funcionarios;

import java.util.Scanner;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios ituber = new Funcionarios();

        System.out.println("Qual o salário? ");
        Scanner sc = new Scanner(System.in);
        String salarioInput = sc.nextLine();
        
        
        ituber.nome = "Gohan";
        ituber.idade = 19;
        ituber.salario = salarioInput;
        ituber.imprimindoDadosItubers(ituber);
    }
}
