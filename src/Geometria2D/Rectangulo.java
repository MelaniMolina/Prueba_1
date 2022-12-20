package Geometria2D;
import static java.lang.Math.*;
public class Rectangulo extends Figuras2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
     @Override
    protected void calculararea() {
        this.area = (base*altura);

    }
    protected void calcularperimetro(){

        this.perimetro = 2*(altura*base);
    }
    protected void calculardiagonales(){
        this.diagonales = sqrt(pow(base,2)+pow(altura,2));
    }
}