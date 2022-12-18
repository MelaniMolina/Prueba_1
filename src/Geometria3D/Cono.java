package Geometria3D;

public class Cono {
    double lado, radio, altura, resultado;

    public Cono(double lado, double radio, double altura, double resultado) {
        this.lado = lado;
        this.radio = radio;
        this.altura = altura;
        this.resultado = resultado;
    }
    public void alturaCono(double lado, double radio, double altura, double resultado) {
        this.lado = lado;
        this.radio = radio;
        this.altura = (Math.sqrt((Math.pow(lado,2))+(Math.pow(radio,2))));
        this.resultado = resultado;
    }
    public void areaCono(double lado, double radio, double altura, double resultado) {
        this.lado = lado;
        this.radio = radio;
        this.altura = altura;
        this.resultado = ((Math.PI*radio*lado)+(Math.PI*(Math.pow(radio,2))));
    }
    public void volumenCono(double lado, double radio, double altura, double resultado) {
        this.lado = lado;
        this.radio = radio;
        this.altura = (Math.sqrt((Math.pow(lado,2))+(Math.pow(radio,2))));
        this.resultado = ((1/3)*Math.PI*Math.pow(radio,2)*altura);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
