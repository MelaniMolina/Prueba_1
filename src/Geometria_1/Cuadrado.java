package Geometria_1;
import static java.lang.Math.*;
public class Cuadrado {
<<<<<<< HEAD
    private double lado;
    double resul_area;
    double result_peri;
    double result_diago;
=======
      private double lado;
     double resul_area;
     double result_peri;
     double result_diago;
>>>>>>> origin/master

    public double getResul_area() {
        return resul_area;
    }

    public double getResult_peri() {
        return result_peri;
    }

    public double getResult_diago() {
        return result_diago;
    }

    public Cuadrado(double lado, double resul_area) {
        this.lado = lado;
        this.resul_area = (pow(lado,2));
    }
    public void Cuadrado_Peri(double lado,double result_peri){
        this.lado=lado;
        this.result_peri = (4*lado);
    }
    public void Cuadrado_Diago(double lado,double result_diago){
        this.lado=lado;
        this.result_diago = (lado*sqrt(2));
    }
<<<<<<< HEAD
=======



>>>>>>> origin/master
}
