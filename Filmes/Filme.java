package Filmes;

public class Filme {
   
    public Filme(String nome, String genero, int duracaoMinutos) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }
    private String nome;
    private String genero;
    private int duracaoMinutos;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }


}
