package Geometria3D;

public class Cilindro {
    double altura, radio , resultado;

    public Cilindro(double altura, double radio, double resultado) {
        this.altura = altura;
        this.radio = radio;
        this.resultado = resultado;
    }
    public void cilArea(double altura, double radio, double resultado) {
        this.altura = altura;
        this.radio = radio;
        this.resultado = (2*Math.PI*radio)*(radio+altura);
    }
    public  void cilPerimetro(double altura, double radio, double resultado) {
        this.altura = altura;
        this.radio = radio;
        this.resultado =(2*Math.PI*radio)+altura;
    }
    public void cilVolumen(double altura, double radio, double resultado) {
        this.altura = altura;
        this.radio = radio;
        this.resultado = Math.PI*Math.pow(radio,2)*altura;
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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
