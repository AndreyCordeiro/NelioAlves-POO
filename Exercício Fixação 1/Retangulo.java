package application;

public class Retangulo {
    private double largura, altura;

    public double area() {
        double calcArea;
        return calcArea = largura * altura;
    }

    public double perimetro() {
        double calcPerimetro;
        return calcPerimetro = (2 * altura) + (2 * largura);
    }

    public double diagonal() { //Pythagoras (c² = b² + b²)
        double calcDiagonal, x;
        calcDiagonal = (largura * largura) + (altura * altura);
        x = Math.sqrt(calcDiagonal);
        return x;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}