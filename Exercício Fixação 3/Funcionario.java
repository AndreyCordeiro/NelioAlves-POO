package application;

public class Funcionario {
    private String nome;
    private double salarioBruto, taxa;

    public double salarioLiquido() {
        double salarioLiquido;
        salarioLiquido = salarioBruto - taxa;
        return salarioLiquido;
    }

    public void aumentoSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}