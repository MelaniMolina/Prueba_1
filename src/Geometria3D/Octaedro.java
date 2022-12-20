package Geometria3D;

public class Octaedro  extends Operaciones{
    double lado;
    double resultado;

    public Octaedro(double lado, double resultado) {
        this.lado = lado;

        this.resultado = resultado;
    }
    @Override
    public  void altura() {
        this.lado = lado;

        this.resultado = ((lado)*(Math.sqrt(2)));
    }
    @Override
    public void area() {
        this.lado = lado;

        this.resultado = ((Math.pow(lado,2))*(2*(Math.sqrt(3))));
    }
    @Override
    public  void volumen() {
        this.lado = lado;

        this.resultado =((Math.pow(lado,3))*((Math.sqrt(2))/3));
    }


}
