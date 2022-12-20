package Geometria2D;
import static java.lang.Math.*;
public class Pentagono  extends  Figuras2D{
    private double lado =0;
    private double perimetro;
    private double apotema;
    private double altura;


    public Pentagono(double lado, double perimetro, double apotema, double altura) {
        this.lado = lado;
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.altura = altura;
        calculararea();
        calcularperimetro();
        calcularperimetro();
    }
     @Override
    protected void calculararea() {
        this.area = ((perimetro*apotema)/2);
    }

    protected void  calcularperimetro(){
        this.perimetro = 5*lado;
    }

    protected   void calculardiagonales(){
        this. diagonales= sqrt(pow(altura,2)-(pow(lado,2)/2));
    }


}