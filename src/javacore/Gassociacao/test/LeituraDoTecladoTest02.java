package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O grande software de decisão do futuro");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO");
        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        }else{
            System.out.println("NÃO");
        }
    }
}
