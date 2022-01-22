package models;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    
    private int id_fatura;

    private String oficina;

    private boolean pagamento;

    private double montante_a_pagar;

    private Cliente cliente;

    private Coordenador coordenador;

    private List<Servico> servicos = new ArrayList<>();

    public Fatura(int id_fatura, String oficina, boolean pagamento, double montante_a_pagar, Cliente cliente, Coordenador coordenador) {
        this.id_fatura = id_fatura;
        this.oficina = oficina;
        this.pagamento = pagamento;
        this.montante_a_pagar = montante_a_pagar;
        this.cliente = cliente;
        this.coordenador = coordenador;
    }

    public int getId_fatura() {
        return id_fatura;
    }

    public void setId_fatura(int id_fatura) {
        this.id_fatura = id_fatura;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public double getMontante_a_pagar() {
        return montante_a_pagar;
    }

    public void setMontante_a_pagar(double montante_a_pagar) {
        this.montante_a_pagar = montante_a_pagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
