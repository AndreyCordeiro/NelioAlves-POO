package application;

import java.util.Scanner;

public class Matriz {
    public Matriz() {
    }

    public void criarMatriz() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamnho da matriz: ");
        int n = sc.nextInt();

        //Criação da matriz bidimensional
        int[][] mat = new int[n][n];

        //Pedindo para o usuário informar todos os números da matriz
        for (int i = 0; i < mat.length; i++) {
            System.out.println("\nInforme os números da coluna:");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite um número: ");
                mat[i][j] = sc.nextInt();
            }
        }

        //Pegando os números da diagonal principal
        System.out.println("\nDiagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }

        int numNegativos = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] < 0) {
                    numNegativos++;
                }
            }
        }
        System.out.println("\nNúmeros negativos: " + numNegativos);
    }
}