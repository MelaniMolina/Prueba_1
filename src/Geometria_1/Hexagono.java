package Geometria_1;
import static java.lang.Math.*;
public class Hexagono extends Figuras2D {
    private double num1;
    private double num2;

    public Hexagono(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
    @Override
    protected  void calculararea() {
        area = ((num1 * num2) / 2);
    }
    protected void calcularperimetro(){
        perimetro= 6*num1;
    }
    protected void calculardiagonales(){
        diagonales= ((sqrt(3)*num1)/2);
    }

}