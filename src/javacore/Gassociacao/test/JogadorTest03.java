package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
            Jogador jogador = new Jogador("Rafa");
            Jogador jogador2 = new Jogador("Gabriel");
            Time time = new Time("Corinthians");
            Jogador [] jogadores = {jogador, jogador2};

            jogador.setTime(time);
            jogador2.setTime(time);
            time.setJogadores(jogadores);

        System.out.println("----- Jogador -----");

        jogador.imprime();

        System.out.println("----- Time -----");

        time.imprime();
    }
}
