package application;

public class Main {

    public static void main(String[] args) {
        //Criação do objeto Estudante 1 e 2
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        //Dados do estudante 1
        estudante.setNome("Marcos");
        estudante.setNota1(27);
        estudante.setNota2(31);
        estudante.setNota3(32);
        estudante.calcMedia();
        System.out.println("Aluno: " + estudante.getNome() +"\nNota final: " + estudante.calcMedia() + "\nAprovado: " + estudante.aprovado() + "\nPontos Restantes: " + estudante.ptsRestantes());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //Dados do estudante 2
        estudante2.setNome("Pedro");
        estudante2.setNota1(17);
        estudante2.setNota2(20);
        estudante2.setNota3(15);
        System.out.println("Aluno: " + estudante2.getNome() +"\nNota final: " + estudante2.calcMedia() + "\nAprovado: " + estudante2.aprovado() + "\nPontos Restantes: " + estudante2.ptsRestantes());
    }
}