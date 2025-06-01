package entities;

public class Funcionario {

    String Nome;
    Integer ID;
    String Cargo;
    Double Salario;

    public Funcionario(String nome, Integer ID, Double salario, String cargo) {
        Nome = nome;
        this.ID = ID;
        Salario = salario;
        Cargo = cargo;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getID() {
        return ID;
    }

    public String getCargo() {
        return Cargo;
    }

    public Double getSalario() {
        return Salario;
    }

}
