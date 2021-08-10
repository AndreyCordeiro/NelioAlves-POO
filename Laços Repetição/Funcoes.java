package function;

import java.util.Scanner;

// Este código ainda não está Orientado o Objetos

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 3 números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int resultado = max(a, b, c);

        mostrarResultado(resultado);
    }

    public static int max(int a, int b, int c) {
        int aux;

        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void mostrarResultado(int valor) {
        System.out.println("O maior valor informado é: " + valor);
    }
}