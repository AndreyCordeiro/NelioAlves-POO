package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;
    private int id;

    //Método construtor
    public Funcionario() {
    }

    //Método construtor
    public Funcionario(String nome, double salario, int id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    //Método com o menu de opções
    public void menu() {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos funcionários você deseja informar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nFuncionário #" + i);
            System.out.print("Informe o ID: ");
            setId(id = sc.nextInt());

            while (idExistente(lista, id)) {
                System.out.print("Este ID já existe! Insira outro: ");
                setId(sc.nextInt());
            }

            System.out.print("Informee o nome: ");
            setNome(nome = sc.next());

            System.out.print("Informe o salário: ");
            setSalario(salario = sc.nextDouble());

            lista.add(new Funcionario(nome, salario, id));
        }
        System.out.print("Deseja aumentar o salário de algum funcionário (s/n)? ");
        String op = sc.next();

        if (op.equals("s")){
            System.out.print("Informe o ID do funcionário que deseja aumentar o salário: ");
            int id = sc.nextInt();

            Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (func == null) {
                System.out.println("Este ID não existe!");
            } else {
                System.out.print("\nInforme a porcentagem: ");
                double porcentagem = sc.nextDouble();
                func.aumentoSalario(porcentagem);

                //Mostrar a lista de funcionários no fim do programa
                System.out.println("\nLista de funcionários:");
                for (Funcionario f : lista) {
                    System.out.println(f);
                }
            }
        } else {
            //Mostrar a lista de funcionários no fim do programa
            System.out.println("Lista de funcionários:");
            for (Funcionario f : lista) {
                System.out.println(f);
            }
        }
    }

    //Método para aumentar o salário de acordo com a porcentagem informada
    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem / 100;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Método para verificar o se o ID informado já existente
    public static boolean idExistente(List<Funcionario> lista, int id) {
        Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }

    @Override
    public String toString() {
        return  getId() + ", " +
                getNome() + ", " +
                getSalario();
    }
}