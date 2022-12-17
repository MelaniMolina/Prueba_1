package Geometria_1;
import static java.lang.Math.*;
public class Pentagono {
    private double lado =0;
    private double perimetro;
    private double apotema;
    private double altura;


    double are_Penta;
    double peri_Penta;
    double Apotema_Penta;

    public double getAre_Penta() {
        return are_Penta;
    }

    public double getPeri_Penta() {
        return peri_Penta;
    }

    public double getApotema_Penta() {
        return Apotema_Penta;
    }

    public Pentagono(double perimetro, double apotema, double are_Penta) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.are_Penta = ((perimetro*apotema)/2);
    }

    public  void  Pentagono_Per(double lado,double peri_Penta){
        this.lado = lado;
        this.peri_Penta = 5*lado;
    }

    public  void  Pentagono_Apotema(double altura,double lado,double Apotema_Penta){
<<<<<<< HEAD
        this.altura = altura;
        this.lado = lado;
        this.Apotema_Penta = sqrt(pow(altura,2)-(pow(lado,2)/2));
    }

=======
     this.altura = altura;
     this.lado = lado;
     this.Apotema_Penta = sqrt(pow(altura,2)-(pow(lado,2)/2));
    }


>>>>>>> origin/master
}
