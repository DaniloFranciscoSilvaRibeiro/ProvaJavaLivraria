package model;

public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getDados(){
        return nome + " " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApresentar(){
        return nome + " " + email;
    }

    public String getResumo() {
        return "Nome do Usuario: " + this.nome + "\nEmail do Usuario: " + this.email;
    }
}
