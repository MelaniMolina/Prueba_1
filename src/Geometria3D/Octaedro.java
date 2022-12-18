package Geometria3D;

public class Octaedro {
    double lado;
    double resultado;

    public Octaedro(double lado, double resultado) {
        this.lado = lado;

        this.resultado = resultado;
    }
    public  void alturaOctaedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado = ((lado)*(Math.sqrt(2)));
    }
    public void areaOctaedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado = ((Math.pow(lado,2))*(2*(Math.sqrt(3))));
    }
    public  void volumwnOctaedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado =((Math.pow(lado,3))*((Math.sqrt(2))/3));
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
