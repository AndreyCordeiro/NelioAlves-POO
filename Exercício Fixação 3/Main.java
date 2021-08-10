package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);

        //Informe o nome do funcionário
        func.setNome("João Silva");
        //Informe o Salário Bruto
        func.setSalarioBruto(6000);
        //Informe o imposto
        func.setTaxa(1000);

        System.out.println("Funcionário: " + func.getNome() + "\nSalário Líquido R$ " + func.salarioLiquido());

        //Informe a porcentagem no aumento do salário
        func.aumentoSalario(10);

        System.out.println("=-=-=-=-=-=-= Valores atualizados =-=-=-=-=-=-=");
        System.out.println("Funcionário: " + func.getNome() + "\nSalário Líquido R$ " + func.salarioLiquido());
    }
}