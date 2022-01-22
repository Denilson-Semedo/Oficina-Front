package models;

public class Pecas {
    
    private int id_pecas;

    private int quantidade;

    private String nome;

    private Coordenador coordenador;

    public Pecas(int id_pecas, int quantidade, String nome, Coordenador coordenador) {
        this.id_pecas = id_pecas;
        this.quantidade = quantidade;
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public int getId_pecas() {
        return id_pecas;
    }

    public void setId_pecas(int id_pecas) {
        this.id_pecas = id_pecas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
}
