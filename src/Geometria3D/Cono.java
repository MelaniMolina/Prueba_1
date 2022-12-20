package Geometria3D;

public class Cono extends Operaciones{

double lado, radio, altura, resultado;

    public Cono(double lado, double radio, double altura, double resultado) {
        this.lado = lado;
        this.radio = radio;
        this.altura = altura;
        this.resultado = resultado;
    }

    @Override
    public void area() {
        resultado= ((Math.PI*radio*lado)+(Math.PI*(Math.pow(radio,2))));
    }

    @Override
    public void altura() {
            resultado = (Math.sqrt((Math.pow(lado,2))+(Math.pow(radio,2))));
    }

    @Override
    public void volumen() {
        this.altura = (Math.sqrt((Math.pow(lado,2))+(Math.pow(radio,2))));
        resultado= ((1/3)*Math.PI*Math.pow(radio,2)*altura);
    }
}
