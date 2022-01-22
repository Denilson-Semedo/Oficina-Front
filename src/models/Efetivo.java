package models;

public class Efetivo extends Mecanico {
    
    private double salario;

    private String inps;

    private String nif;

    public Efetivo(double salario, String inps, String nif, String morada, boolean estado, Oficina oficina, String bi, String nome, String sobrenome, String username, String password, String email, String telemovel, String ft_perfil) {
        super(morada, estado, oficina, bi, nome, sobrenome, username, password, email, telemovel, ft_perfil);
        this.salario = salario;
        this.inps = inps;
        this.nif = nif;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getInps() {
        return inps;
    }

    public void setInps(String inps) {
        this.inps = inps;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
