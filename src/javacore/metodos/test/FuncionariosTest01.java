package javacore.metodos.test;

import javacore.metodos.dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setNome("Pedro");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        funcionario.setMedia(100000);
        System.out.println("Média: " + funcionario.getMedia());
    }
}
