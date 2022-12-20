package Geometria2D;

import static java.lang.Math.*;

public class Circulo extends Figuras2D {
        private  double radio;

    public Circulo(double radio) {
        this.radio = radio;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }

    @Override
    protected void calculararea() {
        this.radio = radio;
        this.area = (PI * pow(radio,2));
        }
    protected void calcularperimetro() {
        this.radio = radio;
        this.perimetro = (2* PI * radio);

    }
    protected void calculardiagonales() {
        this.radio = radio;
        this.diagonales = (2*radio);
    }




}
