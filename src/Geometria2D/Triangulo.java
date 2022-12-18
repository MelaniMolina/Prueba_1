package Geometria2D;
import static java.lang.Math.*;
public class Triangulo {
    private double base;
    private double altura;
    private double lado;

    double area_Trian;
    double perimetro_Trian;
    double altura_Trian;

    public double getArea_Trian() {
        return area_Trian;
    }

    public double getPerimetro_Trian() {
        return perimetro_Trian;
    }

    public double getAltura_Trian() {
        return altura_Trian;
    }

    public Triangulo(double base, double altura, double area_Trian) {
        this.base = base;
        this.altura = altura;
        this.area_Trian = ((base *altura)/2);
    }
    public void  Triangulo_Per(double lado,double perimetro_Trian){
        this.lado = lado;
        this.perimetro_Trian = (3*lado);
    }
    public  void Triangulo_Altura(double lado ,double altura_Trian){
        this.lado = lado;
        this.altura_Trian = ((sqrt(3)*lado)/2);
    }
}