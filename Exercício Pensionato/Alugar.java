package application;

import java.util.Scanner;

public class Programa {
    private String nome, email;
    private int quartoEscolhido;

    //Método construtor
    public Programa() {
    }

    public Programa(String nome, String email, int quartoEscolhido) {
        this.nome = nome;
        this.email = email;
        this.quartoEscolhido = quartoEscolhido;
    }

    public void alugar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados (1 a 9): ");
        int quartos = sc.nextInt();
        Programa[] quartosAlugar = new Programa[quartos];

        if (quartos >= 1 && quartos <= 9) {
            for (int i = 0; i < quartos; i++) {
                System.out.print("\nInforme o nome: ");
                setNome(nome = sc.next());

                System.out.print("Informe o e-mail: ");
                setEmail(email = sc.next());

                System.out.print("Informe o número do quarto: ");
                setQuartoEscolhido(quartoEscolhido = sc.nextInt());

                if (quartoEscolhido >= 1 && quartoEscolhido <= 9) {
                    quartosAlugar[i] = new Programa(nome, email, quartoEscolhido);
                } else {
                    System.out.println("Este quarto não existe!");
                    break;
                }
            }
        } else {
            System.out.println("Este quarto não existe!");
        }

        if (quartos >= 1 && quartos <= 9 && quartoEscolhido >= 1 && quartoEscolhido <= 9) {
            System.out.println("\nQuartos ocupados:");
        } else {
            System.out.println("Fim do programa!");
        }

        for (int i = 0; i < quartos; i++) {
            System.out.println(quartosAlugar[i].toString());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuartoEscolhido() {
        return quartoEscolhido;
    }

    public void setQuartoEscolhido(int quartoEscolhido) {
        this.quartoEscolhido = quartoEscolhido;
    }

    @Override
    public String toString() {
        return "#" + getQuartoEscolhido() +
                ", " + getNome() +
                ", " + getEmail();
    }
}