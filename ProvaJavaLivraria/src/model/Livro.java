package model;

public class Livro {

    private String titulo;
    private String autor;
    private Double valorMulta;

    public Livro(String titulo, String autor, Double valorMulta) {
        this.titulo = titulo;
        this.autor = autor;
        this.valorMulta = valorMulta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getResumo() {
        return "Titulo do Livro: " + this.titulo + "\nAutor do Livro: " + this.autor + "\nValor Inicial da Multa do Primeiro Dia: " + this.valorMulta;
    }
}
