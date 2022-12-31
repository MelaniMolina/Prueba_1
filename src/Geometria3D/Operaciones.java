package Geometria3D;

public abstract class Operaciones {
      double radio;
     double lado;
     double altura;
     double area;
     double perimetro;
     double apotemaB;
     double apotemaL;
     double resultado;
     double volumen;

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void area(){}

    public void perimetro(){}

    public void volumen(){}

    public void altura(){}
    public void apotemaB(){}
    public void apotemaL(){}
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return resultado;
    }

    public void setArea(double area) {
        this.resultado = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotemaB;
    }

    public void setApotema(double apotema) {
        this.apotemaB = apotema;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
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


}
