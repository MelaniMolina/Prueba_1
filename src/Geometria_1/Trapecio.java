package Geometria_1;
import static java.lang.Math.*;
public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double ladouno;

    private double ladodos;

    private double area;
    double areaTrapecio;
    double perimetroTrapecio;
    double alturaTrapecio;

    public double getAreaTrapecio() {
        return areaTrapecio;
    }

    public double getPerimetroTrapecio() {
        return perimetroTrapecio;
    }

    public double getAlturaTrapecio() {
        return alturaTrapecio;
    }

    public Trapecio(double baseMayor, double baseMenor, double altura, double areaTrapecio) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.areaTrapecio = ((altura/2)*(baseMayor+baseMenor));
    }
    public void Trapecio_Peri(double ladouno,double baseMayor,double ladodos,double baseMenor,double perimetroTrapecio){
        this.ladouno = ladouno;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladodos = ladodos;
        this.perimetroTrapecio = ladouno+baseMenor+ladodos+baseMayor;
    }

    public void Trapecio_Altura(double area,double baseMayor,double baseMenor,double alturaTrapecio){
        this.area = area;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.alturaTrapecio =((2*area)/(baseMayor+baseMenor));
    }

}