package javacore.metodos.test;

import javacore.metodos.dominio.Estudantes;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudantes estudante = new Estudantes();
        Estudantes estudante2 = new Estudantes();



        estudante.nome = "Rafael";
        estudante.sexo = 'M';
        estudante.idade = 19;

        System.out.println("----------------------------");

        estudante2.nome = "Emilly";
        estudante2.sexo = 'F';
        estudante2.idade = 21;

        estudante.imprime();
        estudante2.imprime();
    }
}
