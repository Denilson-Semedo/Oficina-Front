package models;

public class Servico {
    
    private int id_servico;

    private String nome;

    public Servico(int id_servico, String nome) {
        this.id_servico = id_servico;
        this.nome = nome;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
