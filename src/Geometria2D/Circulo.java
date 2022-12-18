package Geometria2D;

import static java.lang.Math.*;

public class Circulo {
        private  double radio;
        double resultado;

        double perimetro;

        double diametro;

    public double getDiametro() {
        return diametro;
    }

    public double getResultado() {
        return resultado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public Circulo(double radio, double resultado) {
        this.radio = radio;
        this.resultado = (PI * pow(radio,2));
        }
    public void Circulo_Perimetro(double radio, double perimetro) {
        this.radio = radio;
        this.perimetro = (2* PI * radio);

    }
    public void Circulo_Diametro(double radio, double diametro) {
        this.radio = radio;
        this.diametro = (2*radio);
    }




}
