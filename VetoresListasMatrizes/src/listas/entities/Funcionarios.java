package listas.entities;

public class Funcionarios {
    private int id;
    private String nome;
    private double salario;

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double perc) {
        this.salario += this.salario * (perc / 100);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", this.getId(), this.getNome(), this.getSalario());
    }
}
