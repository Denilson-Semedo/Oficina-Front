package models;

public class Tarefas_Pecas {
    
    private int id_tarefas_pecas;

    private int quantidade_utilizada;

    private Tarefas tarefa;

    private Pecas peca;

    public Tarefas_Pecas(int id_tarefas_pecas, int quantidade_utilizada, Tarefas tarefa, Pecas peca) {
        this.id_tarefas_pecas = id_tarefas_pecas;
        this.quantidade_utilizada = quantidade_utilizada;
        this.tarefa = tarefa;
        this.peca = peca;
    }

    public int getId_tarefas_pecas() {
        return id_tarefas_pecas;
    }

    public void setId_tarefas_pecas(int id_tarefas_pecas) {
        this.id_tarefas_pecas = id_tarefas_pecas;
    }

    public int getQuantidade_utilizada() {
        return quantidade_utilizada;
    }

    public void setQuantidade_utilizada(int quantidade_utilizada) {
        this.quantidade_utilizada = quantidade_utilizada;
    }

    public Tarefas getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefas tarefa) {
        this.tarefa = tarefa;
    }

    public Pecas getPeca() {
        return peca;
    }

    public void setPeca(Pecas peca) {
        this.peca = peca;
    }
}
