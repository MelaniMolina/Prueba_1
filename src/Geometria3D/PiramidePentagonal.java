package Geometria3D;

public class PiramidePentagonal extends Operaciones {

    double ladoL;
    double ladoB;

    double apotemaB;
    double apotemaL;
    double altura;

    double resultado;

    public PiramidePentagonal(double ladoL, double ladoB, double apotemaB, double apotemaL, double altura, double resultado) {
        this.ladoL = ladoL;
        this.ladoB = ladoB;
        this.apotemaB = apotemaB;
        this.apotemaL = apotemaL;
        this.altura = altura;
        this.resultado = resultado;
        altura();
        area();
        volumen();
    }
    @Override
    public void altura() {
        this.resultado = Math.sqrt(Math.pow(altura,2)+Math.pow(apotemaB,2));
    }
    @Override
    public void area() {
        this.resultado = (((ladoB*5*apotemaB)/2)+(((ladoB*5)*apotemaL)/2));
    }
    @Override
     public void volumen() {
        this.resultado = (((ladoB*5*apotemaB)/2)*altura)/3;
    }






}
