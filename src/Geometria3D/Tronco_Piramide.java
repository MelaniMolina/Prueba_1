package Geometria3D;
import static java.lang.Math.*;
public class Tronco_Piramide {
    private double bM;
    private double bm;
    private double lado;
    private double lados;
    private double areaB;

    double area_total;
    double area_lateral;
    double volumen;

    public double getArea_total() {
        return area_total;
    }

    public double getArea_lateral() {
        return area_lateral;
    }

    public double getVolumen() {
        return volumen;
    }

    public Tronco_Piramide(double bM, double bm, double lado, double lados,double area_total) {
        this.bM = bM;
        this.bm = bm;
        this.lado = lado;
        this.lados = lados;
        this.area_total=(((bM+bm)*lado)/3);
    }
    public void Tronco_Piramide_Laterak(double bm,double lado,double area_lateral){
        this.bm=bm;
        this.lado= lado;
        this.area_lateral= (bm*lado)/2;
    }

    public void Tronco_Piramide_Volumen(double bm,double areaB,double volumen){
        this.bm=bm;
        this.areaB= areaB;
        this.area_lateral= (bm*areaB)/3;
}

}
