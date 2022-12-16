package Geometria_1;
import static java.lang.Math.*;
public class Rectangulo {
      private double base;
      private double altura;
      double area;
      double perim;
      double diago;

    public double getArea() {
        return area;
    }

    public double getPerim() {
        return perim;
    }

    public double getDiago() {
        return diago;
    }

    public Rectangulo(double base, double altura, double area) {
        this.base = base;
        this.altura = altura;
        this.area = (base*altura);
    }
    public void Rectangulo_Perimetro(double base , double altura , double perim){
        this.base = base;
        this.altura = altura;
        this.perim = 2*(altura*base);
    }
    public void Rectangulo_Diagonal(double base,double altura ,double diago){
        this.base = base;
        this.altura = altura;
        this.diago = sqrt(pow(base,2)+pow(altura,2));
    }
}
