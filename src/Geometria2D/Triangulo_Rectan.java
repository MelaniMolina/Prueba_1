package Geometria2D;

public class Triangulo_Rectan extends Figuras2D {
    private  double opuesto;
    private double adyacente;
    private double hipotenusa;

    public Triangulo_Rectan(double opuesto, double adyacente, double hipotenusa) {
        this.opuesto = opuesto;
        this.adyacente = adyacente;
        this.hipotenusa = hipotenusa;
        calculararea();
        calcularperimetro();
        calculardiagonales();
    }
     @Override
    protected void calculararea() {

        this.area =((opuesto * adyacente)/2);
    }
    protected void calcularperimetro() {
        this.perimetro = (opuesto+adyacente+hipotenusa);
    }

    protected void calculardiagonales(){
        double op =Math.asin(opuesto/hipotenusa);
        double result= (op*180)/3.141592654;
        this.diagonales = result ;
    }


}