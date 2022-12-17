package Geometria_1;
import static java.lang.Math.*;
public class Rombo {
    private double diagoMayor;
    private double diagoMenor;
    private double lado;
    private  double ar ;
    double areaR;
    double perimetroR;
    double diagoR;

    public double getAreaR() {
        return areaR;
    }

    public double getPerimetroR() {
        return perimetroR;
    }

    public double getDiagoR() {
        return diagoR;
    }

    public Rombo(double diagoMayor, double diagoMenor, double areaR) {
        this.diagoMayor = diagoMayor;
        this.diagoMenor = diagoMenor;
        this.areaR = ((diagoMayor*diagoMenor)/2);
    }

    public void RomboPeri(double lado,double perimetroR,double ar){
        this.lado = lado;
        this.ar = ar;
        this.perimetroR = lado+lado+lado+lado;
    }

    public void  RomboDiago(double diagoMayor,double lado,double diagoR){
        this.diagoMayor = diagoMayor;
        this.lado = lado;
        this.diagoR = sqrt(4*(pow(lado,2))-pow(diagoMayor,2));
    }
}
