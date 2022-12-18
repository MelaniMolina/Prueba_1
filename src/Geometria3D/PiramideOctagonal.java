package Geometria3D;

public class PiramideOctagonal {
    double ladoL=0;
    double ladoB=0;

    double apotemaB=0;
    double apotemaL=0;
    double altura=0;

    double resultado=0;

    public PiramideOctagonal(double ladoL, double ladoB, double apotemaB, double apotemaL, double altura, double resultado) {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = apotemaB;
        this.apotemaL = apotemaL;
        this.altura = altura;
        this.resultado = resultado;
    }
    public void ayhPiramideOctagonal(double ladoL, double ladoB, double apotemaB, double apotemaL, double altura, double resultado) {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = Math.sqrt((Math.pow(ladoB,2))-(Math.pow((ladoB/2),2)));
        this.apotemaL = Math.sqrt((Math.pow(ladoL,2))-(Math.pow((ladoB/2),2)));
        this.altura = Math.sqrt((Math.pow(apotemaL,2))-(Math.pow(apotemaB,2)));
        this.resultado = resultado;
    }
    public void areaPiramideOctagonal(double ladoL, double ladoB, double apotemaB, double apotemaL, double altura, double resultado) {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = Math.sqrt((Math.pow(ladoB,2))-(Math.pow((ladoB/2),2)));
        this.apotemaL = Math.sqrt((Math.pow(ladoL,2))-(Math.pow((ladoB/2),2)));
        this.altura = Math.sqrt((Math.pow(apotemaL,2))-(Math.pow(apotemaB,2)));
        this.resultado = resultado;
    }
    public void volumenPiramideOctagonal(double ladoL, double ladoB, double apotemaB, double apotemaL, double altura, double resultado) {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = apotemaB;
        this.apotemaL = apotemaL;
        this.altura = altura;
        this.resultado = resultado;
    }

    public double getLadoL() {
        return ladoL;
    }

    public void setLadoL(double ladoL) {
        this.ladoL = ladoL;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getApotemaB() {
        return apotemaB;
    }

    public void setApotemaB(double apotemaB) {
        this.apotemaB = apotemaB;
    }

    public double getApotemaL() {
        return apotemaL;
    }

    public void setApotemaL(double apotemaL) {
        this.apotemaL = apotemaL;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
