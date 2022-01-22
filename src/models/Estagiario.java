package models;

import java.util.Date;

public class Estagiario extends Mecanico{
    
    private Date data_inicio;

    private Date data_fim;

    public Estagiario(Date data_inicio, Date data_fim, String morada, boolean estado, Oficina oficina, String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {
        super(morada, estado, oficina, bi, nome, sobrenome, username, password, email, telemovel, ft_perfil);
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
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
}
