package poo.dominio.test;

import metodos.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Carro 1";
        carro2.nome = "Carro 2";

        carro1.modelo = "Mustang";
        carro2.modelo = "Ram";

        carro1.ano = 2021;
        carro2.ano = 2025;

        System.out.println("Carro 1: " + carro1.modelo + " - " + carro1.ano);
        carro1.Acelerar("Aceleraaaaaa");
    }
}
