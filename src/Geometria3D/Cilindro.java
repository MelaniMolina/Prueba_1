package Geometria3D;

public class Cilindro {
private double altura, radio, result=0;

    public Cilindro(double altura, double radio, double result) {
        this.altura = altura;
        this.radio = radio;
        this.result = result;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void cilArea(double result,double altura, double radio)
    {
        this.altura=altura;
        this.radio=radio;
        this.result=((2*(Math.PI)*radio)*(radio+altura));
    }
    public void cilPerimetro(double result,double altura, double radio)
    {
        this.altura=altura;
        this.radio=radio;
        this.result=((2*(Math.PI)*radio)+altura);
    }
    public void cilVolumen(double result,double altura, double radio)
    {
        this.altura=altura;
        this.radio=radio;
        this.result=((Math.PI)*(Math.pow(radio,2))*altura);
    }

}
