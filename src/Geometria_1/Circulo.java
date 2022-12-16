package Geometria_1;

import static java.lang.Math.*;

public class Circulo {
        private  double radio;
        double resultado;
        double perimetro;
        public double getResultado() {
        return resultado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public Circulo(double radio, double resultado) {
        this.radio = radio;
        this.resultado = (PI * pow(radio,2));
        this.resultado = (2* PI * radio);
    }




}
