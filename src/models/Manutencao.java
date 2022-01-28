package models;

import java.util.Date;

public class Manutencao {
    
    private int id_manutencao;

    private Date data_inicio;

    private Date data_fim;

    private Coordenador coordenador;

    private Estado estado;

    private Marcacao marcacao;

    private Fatura fatura;

    public Manutencao(int id_manutencao, Date data_inicio, Date data_fim, Coordenador coordenador, Estado estado, Marcacao marcacao, Fatura fatura) {
        this.id_manutencao = id_manutencao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.coordenador = coordenador;
        this.estado = estado;
        this.marcacao = marcacao;
        this.fatura = fatura;
    }

    public Manutencao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_manutencao() {
        return id_manutencao;
    }

    public void setId_manutencao(int id_manutencao) {
        this.id_manutencao = id_manutencao;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Marcacao getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(Marcacao marcacao) {
        this.marcacao = marcacao;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
