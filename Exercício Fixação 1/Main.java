package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        //Informe a largura do um retângulo
        ret.setLargura(3);

        //Informe a altura do retângulo
        ret.setAltura(4);

        System.out.println("Área: "+ ret.area() + "\nPerímetro: " + ret.perimetro() + "\nDiagonal: " + ret.diagonal());
    }
}