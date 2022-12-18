package Geometria3D;
import static java.lang.Math.*;
public class Tronco_cono {
    private double radioUno;
    private double radiodos;
    private double altura;
    double volumen_TC;
    double area_lateralTC;

    public double getVolumen_TC() {
        return volumen_TC;
    }

    public double getArea_lateralTC() {
        return area_lateralTC;
    }

    public double getArea_totalTC() {
        return area_totalTC;
    }

    double area_totalTC;

    public Tronco_cono(double radioUno, double radiodos, double altura,double area_totalTC) {
        this.radioUno = radioUno;
        this.radiodos = radiodos;
        this.altura = altura;
        this.area_totalTC = PI*altura*(radioUno+radiodos)+ PI*(pow(radioUno,2))+ PI*(pow(radiodos,2));

    }
    public void Tronco_cono_Lateral(double altura,double radioUno,double radiodos,double area_lateralTC){
        this.altura=altura;
        this.radioUno= radioUno;
        this.radiodos=radiodos;
        this.area_lateralTC= (PI*altura*(radioUno+radiodos));
    }
    public void Tronco_cono_Volumen(double altura,double radioUno,double volumen_TC){
        this.altura=altura;
        this.radioUno= radioUno;
        this.volumen_TC = ((PI*radioUno+altura)/3);
    }

}
