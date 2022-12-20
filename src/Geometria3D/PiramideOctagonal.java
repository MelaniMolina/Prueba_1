package Geometria3D;

public class PiramideOctagonal  extends Operaciones{
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
    @Override
    public void altura() {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = Math.sqrt((Math.pow(ladoB,2))-(Math.pow((ladoB/2),2)));
        this.apotemaL = Math.sqrt((Math.pow(ladoL,2))-(Math.pow((ladoB/2),2)));
        this.altura = Math.sqrt((Math.pow(apotemaL,2))-(Math.pow(apotemaB,2)));
        this.resultado = resultado;
    }
    @Override
    public void area() {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = Math.sqrt((Math.pow(ladoB,2))-(Math.pow((ladoB/2),2)));
        this.apotemaL = Math.sqrt((Math.pow(ladoL,2))-(Math.pow((ladoB/2),2)));
        this.altura = Math.sqrt((Math.pow(apotemaL,2))-(Math.pow(apotemaB,2)));
        this.resultado = resultado;
    }
    @Override
    public void volumen() {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = apotemaB;
        this.apotemaL = apotemaL;
        this.altura = altura;
        this.resultado = resultado;
    }


}
