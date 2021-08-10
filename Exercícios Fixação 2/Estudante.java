package application;

public class Estudante {
    private String nome;
    private double nota1, nota2, nota3;

    public double ptsRestantes() {
        if(calcMedia() < 60) {
            return 60 - calcMedia();
        } else {
            return 0;
        }
    }
    
    public boolean aprovado() {
        boolean aprovado = false;

        if(calcMedia() >= 60) {
            aprovado = true;
        } else {
            aprovado = false;
        }
        return aprovado;
    }

    public double calcMedia() {
        double media;
        media = this.nota1 + this.nota2 + this.nota3;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}