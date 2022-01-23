package models;

public class Coordenador extends Utilizador {
    
    private String morada;

    public Coordenador(String morada, String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {
        super(bi, nome, sobrenome, username, password, email, telemovel, ft_perfil);
        this.morada = morada;
    }

    public Coordenador() {
        
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
