package Geometria3D;

public class TetraedroRegular {
    double lado;
    double resultado;

    public TetraedroRegular(double lado, double resultado) {
        this.lado = lado;

        this.resultado = resultado;
    }
    public  void alturaTetraedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado = ((lado)*((Math.sqrt(6))/3));
    }
    public void areaTetraedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado = ((Math.pow(lado,2))*(Math.sqrt(3)));
    }
    public  void volumwnTetraedro(double lado,  double resultado) {
        this.lado = lado;

        this.resultado =((Math.pow(lado,2))*((Math.sqrt(3))/12));
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
