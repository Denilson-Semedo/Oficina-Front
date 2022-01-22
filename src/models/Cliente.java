package models;

import java.util.List;

public class Cliente extends Utilizador{

    private String notificacao;

    public Cliente(String notificacao, String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {
        super(bi, nome, sobrenome, username, password, email, telemovel, ft_perfil);
        this.notificacao = notificacao;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }
}
