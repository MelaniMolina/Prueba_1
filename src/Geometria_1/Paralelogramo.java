package Geometria_1;
import static java.lang.Math.*;
public class Paralelogramo {
    private  double base;
    private  double altura;
    private  double lado;
    private double angulo;
    double areParale;
    double periParale;
    double diagonParale;

    public double getAreParale() {
        return areParale;
    }

    public double getPeriParale() {
        return periParale;
    }

    public double getDiagonParale() {
        return diagonParale;
    }

    public Paralelogramo(double base, double altura, double areParale) {
        this.base = base;
        this.altura = altura;
        this.areParale = base*altura;
    }
    public  void Paralelogramo_Perime(double lado,double base , double periParale ){
<<<<<<< HEAD
        this.lado = lado;
        this.base= base;
        this.periParale = (2*(lado*base));
=======
       this.lado = lado;
       this.base= base;
       this.periParale = (2*(lado*base));
>>>>>>> origin/master
    }
    public void Paralelogramo_Diagonal(double lado,double base,double angulo, double diagonParale ){
        this.lado = lado;
        this.base = base;
        this.angulo = angulo;
        this.diagonParale = sqrt(pow(lado,2)+pow(base,2)-(lado*base)*Math.cos(angulo));

    }
}
