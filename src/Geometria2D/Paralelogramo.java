package Geometria2D;
import static java.lang.Math.*;
public class Paralelogramo extends Figuras2D{
    private  double num1;
    private  double num2;
    private  double num3;

    public Paralelogramo(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
    @Override
    protected void calculararea(){
        this.area = num1 * num2;
    }
    protected void calcularperimetro(){
        this.perimetro = (2*(num1*num2));
    }
    protected void calculardiagonales(){
        this.diagonales = sqrt(pow(num1,2)+pow(num2,2)-(num1*num2)*Math.cos(num3));

    }
}