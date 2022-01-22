package models;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    
    private int id_tarefas;

    private String nome;

    private String descricao;

    private String matricula;

    private Mecanico mecanico;

    private Coordenador coordenador;

    private Manutencao manutencao;

    private Estado estado;

    private List<Tarefas_Pecas> tarefas_pecas = new ArrayList<>();

    public Tarefas(int id_tarefas, String nome, String descricao, String matricula, Mecanico mecanico, Coordenador coordenador, Manutencao manutencao, Estado estado, List<Tarefas_Pecas> tarefas_pecas) {
        this.id_tarefas = id_tarefas;
        this.nome = nome;
        this.descricao = descricao;
        this.matricula = matricula;
        this.mecanico = mecanico;
        this.coordenador = coordenador;
        this.manutencao = manutencao;
        this.estado = estado;
        this.tarefas_pecas = tarefas_pecas;
    }

    public int getId_tarefas() {
        return id_tarefas;
    }

    public void setId_tarefas(int id_tarefas) {
        this.id_tarefas = id_tarefas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Tarefas_Pecas> getTarefas_pecas() {
        return tarefas_pecas;
    }

    public void setTarefas_pecas(List<Tarefas_Pecas> tarefas_pecas) {
        this.tarefas_pecas = tarefas_pecas;
    }
}
