package models;

public class Tipo_Utilizador {

    private int id_tipo_utilizador;

    private String nome;
    
    public Tipo_Utilizador(int id_tipo_utilizador, String nome) {
        this.id_tipo_utilizador = id_tipo_utilizador;
        this.nome = nome;
    }

    public int getId_tipo_utilizador() {
        return id_tipo_utilizador;
    }

    public void setId_tipo_utilizador(int id_tipo_utilizador) {
        this.id_tipo_utilizador = id_tipo_utilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
