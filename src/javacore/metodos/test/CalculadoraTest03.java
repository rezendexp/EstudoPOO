package javacore.metodos.test;

import javacore.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultadoDivisao = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultadoDivisao);
        calculadora.divisaoPorDoisNumeros(20, 0);
    }
}
