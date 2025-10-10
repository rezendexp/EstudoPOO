package javacore.Fmodificadorestatico.dominio;

public class Anime {
    public String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização");
    }{
        System.out.println("Dentro do bloco de inicialização");
    }
    public Anime(String nome) {
        this.nome = nome;
    }
        public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
