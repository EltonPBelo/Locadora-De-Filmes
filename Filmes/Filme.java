package Filmes;

public class Filme {

    private String nome;
    private String genero;
    private int duracaoMinutos;
    private int quantidade;
    private double valorAluguel;
   
    public Filme(String nome, String genero, int duracaoMinutos, int quantidade, double valorAluguel) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
        this.quantidade = quantidade;
        this.valorAluguel = valorAluguel;
    }
    public Filme(String nome, String genero, int duracaoMinutos) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }


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
