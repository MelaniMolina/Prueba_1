package Geometria_1;

public class Triangulo_Rectan {
    private  double opuesto;
    private double adyacente;
    private double hipotenusa;
    double areTriAn;
    double perimetroTriAn;
    double AnguloTriAn;

    public double getAreTriAn() {
        return areTriAn;
    }

    public double getPerimetroTriAn() {
        return perimetroTriAn;
    }

    public double getAnguloTriAn() {
        return AnguloTriAn;
    }

    public Triangulo_Rectan(double opuesto, double adyacente, double areTriAn) {
        this.opuesto = opuesto;
        this.adyacente = adyacente;
        this.areTriAn =((opuesto * adyacente)/2);
    }
    public void Triangulo_RectanPerimetro(double opuesto,double adyacente,double hipotenusa,double perimetroTriAn){
<<<<<<< HEAD
        this.opuesto = opuesto;
        this.adyacente = adyacente;
        this.hipotenusa = hipotenusa;
        this.perimetroTriAn = (opuesto+adyacente+hipotenusa);
    }

    public void Triangulo_RectanAngulo(double opuesto,double hipotenusa,double AnguloTriAn ){
        this.opuesto = opuesto;
        this.hipotenusa = hipotenusa;
        double op =Math.asin(opuesto/hipotenusa);
        double result= (op*180)/3.141592654;
        this.AnguloTriAn = result ;

    }
=======
     this.opuesto = opuesto;
     this.adyacente = adyacente;
     this.hipotenusa = hipotenusa;
     this.perimetroTriAn = (opuesto+adyacente+hipotenusa);
    }

    public void Triangulo_RectanAngulo(double opuesto,double hipotenusa,double AnguloTriAn ){
    this.opuesto = opuesto;
    this.hipotenusa = hipotenusa;
    double op =Math.asin(opuesto/hipotenusa);
    double result= (op*180)/3.141592654;
    this.AnguloTriAn = result ;

    }


>>>>>>> origin/master
}
