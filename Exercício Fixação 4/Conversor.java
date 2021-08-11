package application;

public class Conversor {
    //Criando uma constante de imposto
    public static final double IMPOSTO = 0.06;

    private double precoDolar, quantDolar;

    public double converter() {
        return getPrecoDolar() * getQuantDolar() * (1.0 + IMPOSTO);
    }

    public double getPrecoDolar() {
        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {
        this.precoDolar = precoDolar;
    }

    public double getQuantDolar() {
        return quantDolar;
    }

    public void setQuantDolar(double quantDolar) {
        this.quantDolar = quantDolar;
    }
}