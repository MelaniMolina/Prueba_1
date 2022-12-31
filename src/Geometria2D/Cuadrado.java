package Geometria2D;
import static java.lang.Math.*;
public class Cuadrado extends Figuras2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }

    @Override
    protected void calculararea(){
        this.area = (pow(lado,2));
    }
    protected void calcularperimetro(){
        this.lado=lado;
        this.perimetro = (4*lado);
    }
    protected void calculardiagonales(){
        this.lado=lado;
        this.diagonales = (lado*sqrt(2));
    }



}