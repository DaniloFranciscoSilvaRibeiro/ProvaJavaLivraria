package model;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private Integer diasAtraso;
    private Double multa;
    private Double aplicarMultaExtra;

    public Emprestimo(Usuario usuario, Livro livro, Integer diasAtraso, Double multa, Double aplicarMultaExtra) {
        this.usuario = usuario;
        this.livro = livro;
        this.diasAtraso = diasAtraso;
        this.multa = multa;
        this.aplicarMultaExtra = aplicarMultaExtra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getAplicarMultaExtra() {
        return aplicarMultaExtra;
    }

    public void setAplicarMultaExtra(Double aplicarMultaExtra) {
        this.aplicarMultaExtra = aplicarMultaExtra;
    }

    public Double getCalcularMulta(){
        return multa = livro.getValorMulta() * diasAtraso + aplicarMultaExtra;
    }

    public String getResumo(){
        return "Dias de Atraso: " + this.diasAtraso + " " + "\nValor Total da Multa: " + this.multa;
    }

}
