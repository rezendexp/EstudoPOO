package javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodio, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodio, String genero, String estudio) {
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getEpisodio() {
        return this.episodio;
    }
}
