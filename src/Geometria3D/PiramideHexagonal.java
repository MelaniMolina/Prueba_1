package Geometria3D;

public class PiramideHexagonal  extends Operaciones{

    private double num1;
    private double num2;

    public PiramideHexagonal(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
        public void altura() {
            this.resultado=Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2));
        }
    @Override
        public void area() {
            this.num1 = num1;
            this.apotemaB = apotemaB;
            this.resultado = (num1*num2)/2;
        }
    @Override
        public void volumen() {
            this.volumen = (Math.sqrt(3)/2)*Math.pow(num1,2)*num2;
        }




}
