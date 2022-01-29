package models;

import java.util.List;

public class Oficina {
    
    private int id_oficina;

    private String nome;

    private String ilha;

    private String cidade;

    private String localidade;

    private Coordenador coordenador;

    private List<Servico> servicos;

    public Oficina(int id_oficina, String nome, String ilha, String cidade, String localidade, Coordenador coordenador, List<Servico> servicos) {
        this.id_oficina = id_oficina;
        this.nome = nome;
        this.ilha = ilha;
        this.cidade = cidade;
        this.localidade = localidade;
        this.coordenador = coordenador;
        this.servicos = servicos;
    }

    public Oficina() {
    
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIlha() {
        return ilha;
    }

    public void setIlha(String ilha) {
        this.ilha = ilha;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}
