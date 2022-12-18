package Geometria2D;
import static java.lang.Math.*;
public class Hexagono {
    private double perimetro;
    private double apotema;
    private  double lad;

    double areaHexa;
    double perimteroHexa;
    double apotemaHexa;

    public double getAreaHexa() {
        return areaHexa;
    }

    public double getPerimteroHexa() {
        return perimteroHexa;
    }

    public double getApotemaHexa() {
        return apotemaHexa;
    }

    public Hexagono(double perimetro, double apotema, double areaHexa) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.areaHexa = ((perimetro*apotema)/2);
    }

    public  void Hexagono_Peri(double lad,double perimteroHexa){
        this.lad = lad;
        this.perimteroHexa= 6*lad;
    }
    public  void Hexagono_Apot(double lad,double apotemaHexa){
        this.lad = lad;
        this.apotemaHexa= ((sqrt(3)*lad)/2);
    }

}