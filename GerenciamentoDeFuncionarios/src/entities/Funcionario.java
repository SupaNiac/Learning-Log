package entities;

public class Funcionario {

    String Nome;
    Integer ID;
    Double Salario;
    String Cargo;

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

    @Override
    public String toString(){
        return "ID: " + this.ID + "\n" +
                 "Nome: " + this.Nome + "\n" +
                 "Salário: " + this.Salario + "\n" +
                 "Cargo: " + this.Cargo + "\n";
    }

}
