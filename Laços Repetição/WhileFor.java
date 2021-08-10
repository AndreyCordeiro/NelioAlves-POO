package whilefor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Quantos números você quer informar? ");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.println("O número informado deve ser maior que #0. Tente novamente!");
            numero = sc.nextInt();
        }

        int maiorNumero = Integer.MIN_VALUE;

        for(int i = 1; i <= numero; i++) {
            System.out.println("Informe o #" + i + "º número");
            int novoNumero = sc.nextInt();

            if (novoNumero > maiorNumero) {
                maiorNumero = novoNumero;
            }
        }
        System.out.println("O maior número informado é: " + maiorNumero);
    }
}