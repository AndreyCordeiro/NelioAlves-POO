package application;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private int numConta;
    private double saldo;

    //Construtor para criar o Objeto Cliente na classe Main
    public Cliente() {
    }

    //Construtor para NÃO informar o depósito inicial
    public Cliente(String nome, int numConta) {
        this.nome = nome;
        this.numConta = numConta;
    }

    //Construtor para informar o depósito inicial
    public Cliente(String nome, int numConta, double saldoInicial) {
        this.nome = nome;
        this.numConta = numConta;
        depositar(saldoInicial);
    }

    public void dadosConta() {
        Scanner sc = new Scanner(System.in);
        Cliente statusCliente;

        System.out.print("Informe o Dono da conta: ");
        String nomeDono = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Há um depósito inicial (s/n)?: ");
        char primeiroDeposito = sc.next().charAt(0);

        double valorInicial = 0;
        if (primeiroDeposito == 's') {
            System.out.print("Informe o valor: ");
            valorInicial = sc.nextDouble();
            statusCliente = new Cliente(nomeDono, numeroConta, valorInicial);
        } else {
            statusCliente = new Cliente(nomeDono, numeroConta);
        }
        this.nome = nomeDono;
        this.numConta = numeroConta;
        depositar(valorInicial);
    }

    public void status() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-=-=-= DADOS DA CONTA =-=-=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Titular da Conta: " + getNome() +
                "\nNúmero da Conta: " + getNumConta() +
                "\nSaldo em Conta: " + getSaldo());
    }

    public void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    public void sacar(double quantidade) {
        this.saldo -= quantidade + 5; //5 é o valor cobrado pelo banco quando é realizado um saque
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}