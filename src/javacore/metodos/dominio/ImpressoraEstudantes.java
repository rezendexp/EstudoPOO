package javacore.metodos.dominio;

public class ImpressoraEstudantes {
    public void imprime(Estudantes estudante){
        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";
    }
}
