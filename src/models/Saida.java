package models;

import java.util.Date;
import java.util.Timer;

public class Saida {
    private int id_saida;

    private String levantamento_carro;

    private Date data_saida;

    private Timer hora_saida;

    private String estado_do_carro;

    private String matricula_carro;

    private Coordenador coordenador;

    public Saida(int id_saida, String levantamento_carro, Date data_saida, Timer hora_saida, String estado_do_carro, String matricula_carro, Coordenador coordenador) {
        this.id_saida = id_saida;
        this.levantamento_carro = levantamento_carro;
        this.data_saida = data_saida;
        this.hora_saida = hora_saida;
        this.estado_do_carro = estado_do_carro;
        this.matricula_carro = matricula_carro;
        this.coordenador = coordenador;
    }

    public Saida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_saida() {
        return id_saida;
    }

    public void setId_saida(int id_saida) {
        this.id_saida = id_saida;
    }

    public String getLevantamento_carro() {
        return levantamento_carro;
    }

    public void setLevantamento_carro(String levantamento_carro) {
        this.levantamento_carro = levantamento_carro;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Timer getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(Timer hora_saida) {
        this.hora_saida = hora_saida;
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
