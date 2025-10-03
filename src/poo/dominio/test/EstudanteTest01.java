package poo.dominio.test;

import metodos.Estudantes;
import metodos.ImpressoraEstudantes;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudantes estudante = new Estudantes();
        Estudantes estudante2 = new Estudantes();

        ImpressoraEstudantes impressora = new ImpressoraEstudantes();



        estudante.nome = "Rafael";
        estudante.sexo = 'M';
        estudante.idade = 19;

        System.out.println("----------------------------");

        estudante2.nome = "Emilly";
        estudante2.sexo = 'F';
        estudante2.idade = 21;

        impressora.imprime(estudante);
        impressora.imprime(estudante2);

        System.out.println("###########");

        impressora.imprime(estudante);
        impressora.imprime(estudante2);
    }
}
