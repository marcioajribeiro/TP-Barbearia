package Entidades;

public class Funcionario extends Pessoa{
    private String cargo;
    private String senha;

    public Funcionario(String nome, String endereco, String telefone, String cargo, String senha) {
        super(nome, endereco, telefone);
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
