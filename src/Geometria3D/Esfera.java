package Geometria3D;

public class Esfera {
double radio;
double resul=0;

    public Esfera(double radio, double resul) {
        this.radio = radio;
        this.resul = 4*(Math.PI*(Math.pow(radio,2)));
    }

    public void areaEsfera(double radio, double resul) {
        this.radio = radio;
        this.resul = resul;
    }
    public void perimetroEsfera(double radio, double resul) {
        this.radio = radio;
        this.resul = resul;
    }
    public void volumenEsfera(double radio, double resul) {
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
