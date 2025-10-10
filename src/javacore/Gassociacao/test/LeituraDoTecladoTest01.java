package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite o M ou F para o seu nome abaixo: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + idade);
        System.out.println("Nome: " + sexo);
    }
}
