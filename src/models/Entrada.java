package models;

import java.util.Date;
import java.util.Timer;

public class Entrada {
    
    private int id_entrada;

    private String entrada_carro;

    private Date data_entrada;

    private String ft_frente;

    private String ft_tras;

    private String ft_lateral;

    private String riscos;

    private Timer hora_entrada;

    private String estado_do_carro;

    private String matricula_carro;

    private Coordenador coordenador;

    public Entrada(int id_entrada, String entrada_carro, Date data_entrada, String ft_frente, String ft_tras, String ft_lateral, String riscos, Timer hora_entrada, String estado_do_carro, String matricula_carro, Coordenador coordenador) {
        this.id_entrada = id_entrada;
        this.entrada_carro = entrada_carro;
        this.data_entrada = data_entrada;
        this.ft_frente = ft_frente;
        this.ft_tras = ft_tras;
        this.ft_lateral = ft_lateral;
        this.riscos = riscos;
        this.hora_entrada = hora_entrada;
        this.estado_do_carro = estado_do_carro;
        this.matricula_carro = matricula_carro;
        this.coordenador = coordenador;
    }

    public Entrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getEntrada_carro() {
        return entrada_carro;
    }

    public void setEntrada_carro(String entrada_carro) {
        this.entrada_carro = entrada_carro;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getFt_frente() {
        return ft_frente;
    }

    public void setFt_frente(String ft_frente) {
        this.ft_frente = ft_frente;
    }

    public String getFt_tras() {
        return ft_tras;
    }

    public void setFt_tras(String ft_tras) {
        this.ft_tras = ft_tras;
    }

    public String getFt_lateral() {
        return ft_lateral;
    }

    public void setFt_lateral(String ft_lateral) {
        this.ft_lateral = ft_lateral;
    }

    public String getRiscos() {
        return riscos;
    }

    public void setRiscos(String riscos) {
        this.riscos = riscos;
    }

    public Timer getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Timer hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getEstado_do_carro() {
        return estado_do_carro;
    }

    public void setEstado_do_carro(String estado_do_carro) {
        this.estado_do_carro = estado_do_carro;
    }

    public String getMatricula_carro() {
        return matricula_carro;
    }

    public void setMatricula_carro(String matricula_carro) {
        this.matricula_carro = matricula_carro;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
}
