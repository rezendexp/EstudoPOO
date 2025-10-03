package metodos;

import java.sql.SQLOutput;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void divisaoPorDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é divisivel");
            return;
        }
            System.out.println("É divisivel");
        }

        public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
            System.out.println("Dentro do altera dois números");
            System.out.println("Num1 " + numero1);
            System.out.println("Num2 " + numero2);
        }

        public void somaArray(int[] numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }
        public void somaVarArgs(int... numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }
    }