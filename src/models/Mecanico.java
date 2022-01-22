package models;

public class Mecanico extends Utilizador{
    
    private String morada;

    private boolean estado;

    private Oficina oficina;

    public Mecanico(String morada, boolean estado, Oficina oficina, String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {
        super(bi, nome, sobrenome, username, password, email, telemovel, ft_perfil);
        this.morada = morada;
        this.estado = estado;
        this.oficina = oficina;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}
