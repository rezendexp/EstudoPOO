package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Rafael");
        Professor professor2 = new Professor("Miguel");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Emilly", professores);


        escola.imprime();
    }
}
