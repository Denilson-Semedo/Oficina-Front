package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Marcacao {
    
    private int id_marcacao;

    private Date data;

    private String matricula;

    private Boolean estado;

    private Cliente cliente;

    private Oficina oficina;

    private List<Servico> servicos = new ArrayList<>();

    public Marcacao(int id_marcacao, Date data, String matricula, Boolean estado, Cliente cliente, Oficina oficina) {
        this.id_marcacao = id_marcacao;
        this.data = data;
        this.matricula = matricula;
        this.estado = estado;
        this.cliente = cliente;
        this.oficina = oficina;
    }
    
    public Marcacao() {
        
    }

    public int getId_marcacao() {
        return id_marcacao;
    }

    public void setId_marcacao(int id_marcacao) {
        this.id_marcacao = id_marcacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}
