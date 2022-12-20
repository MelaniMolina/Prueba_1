package Geometria3D;

public class Esfera  extends Operaciones {
double radio;
double resul=0;

    public Esfera(double radio, double resul) {
        this.radio = radio;
        this.resul = 4*(Math.PI*(Math.pow(radio,2)));
    }
    @Override
    public void area() {
        this.radio = radio;
        this.resul = resul;
    }
    @Override
    public void perimetro() {
        this.radio = radio;
        this.resul = resul;
    }
    @Override
    public void volumen() {
        this.radio = radio;
        this.resul =  (4/3)*(Math.PI*(Math.pow(radio,3)));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getResul() {
        return resul;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }
}
