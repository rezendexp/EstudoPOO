package poo.dominio.test;

import metodos.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultadoDivisao = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultadoDivisao);
    }
}
