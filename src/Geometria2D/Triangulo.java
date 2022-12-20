package Geometria2D;
import static java.lang.Math.*;
public class Triangulo extends Figuras2D {
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
    @Override

    protected void calculararea() {
        this.area = ((base *altura)/2);
    }
    protected void  calcularperimetro(){
        this.perimetro = (3*lado);
    }
    protected   void calculardiagonales(){
        this.diagonales = ((sqrt(3)*lado)/2);
    }
}