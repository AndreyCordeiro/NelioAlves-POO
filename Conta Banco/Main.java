package application;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto cliente
        Cliente cliente1 = new Cliente();

        //Método para pegar as informações da conta
        cliente1.dadosConta();

        //Realizar um depósito
        cliente1.depositar(50);

        //Realizar sauqe (lembrando que é cobrado uma taxa de 5 reais)
        cliente1.sacar(5);

        //Método para informar todos os dados da conta
        cliente1.status();
    }
}