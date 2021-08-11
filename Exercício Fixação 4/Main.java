package application;

public class Main {
    public static void main(String[] args) {
        Conversor conv = new Conversor();

        //Informe o preço atual do dólar
        conv.setPrecoDolar(3.10);
        //Informe a quantidade de dólar que você deseja comprar
        conv.setQuantDolar(200);

        System.out.println("Quantidade a ser paga em reais: " + conv.converter());
    }
}