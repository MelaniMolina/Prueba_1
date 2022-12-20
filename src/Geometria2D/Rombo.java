package Geometria2D;
import static java.lang.Math.*;
public class Rombo extends Figuras2D{
    private double diagoMayor;
    private double diagoMenor;

    public Rombo(double diagoMayor, double diagoMenor) {
        this.diagoMayor = diagoMayor;
        this.diagoMenor = diagoMenor;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
     @Override
    protected  void calculararea() {
        this.area = ((diagoMayor*diagoMenor)/2);
    }

    protected void calcularperimetro(){
        this.perimetro = diagoMayor*4;
    }

    protected void  calculardiagonales(){
        this.diagonales = sqrt(4*(pow(diagoMenor,2))-pow(diagoMayor,2));
    }
}