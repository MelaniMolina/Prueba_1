package Geometria3D;

public class Cubo extends Operaciones{
    double lado, resultado;

    public Cubo(double lado, double resultado) {
        this.lado = lado;
        this.resultado = resultado;
    }

    @Override
    public void area() {
        resultado=(Math.pow(lado, 2)) * 6;
    }

    @Override
    public void perimetro() {
        resultado=lado*12;
    }

    @Override
    public void volumen() {
        resultado=Math.pow(lado, 3);
    }


}
