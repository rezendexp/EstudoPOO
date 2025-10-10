package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Rafael");
    Jogador jogador2 = new Jogador("Gabriel");
    Jogador jogador3 = new Jogador("Miguel");
    Jogador[]jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }

    }
}
