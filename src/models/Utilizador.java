package models;

import java.util.ArrayList;
import java.util.List;

public class Utilizador {
    
    private String bi;

    private String nome;

    private String sobrenome;

    private String username;

    private String password;

    private String email;

    private String telemovel;

    private String ft_perfil;
    
    //private List<Tipo_Utilizador> authorities  = new ArrayList<>();

    public Utilizador(String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {//List<Tipo_Utilizador> authorities
        this.bi = bi;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telemovel = telemovel;
        this.ft_perfil = ft_perfil;
        //this.authorities = authorities;
    }

    public Utilizador() {
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public String getFt_perfil() {
        return ft_perfil;
    }

    public void setFt_perfil(String ft_perfil) {
        this.ft_perfil = ft_perfil;
    }

//    public List<Tipo_Utilizador> getTipo_utilizador() {
//        return authorities;
//    }
//
//    public void setTipo_utilizador(List<Tipo_Utilizador> tipo_utilizador) {
//        this.authorities = tipo_utilizador;
//    }
}
