package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Informe os dados do produto");
        System.out.print("Nome: ");
        produto.setNome(sc.nextLine());

        System.out.print("Preço: ");
        produto.setPreco(sc.nextDouble());

        System.out.print("Quantidade: ");
        produto.setQuantidade(sc.nextInt());


        //Adicionar produtos no estoque
        produto.adicionarProduto(2);
        //Remover produtos no estoque
        produto.removerProduto(1);

        //Apresentar as informaões do estoque para o usuário
        System.out.println(produto.toString());
    }
}