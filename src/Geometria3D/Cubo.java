package Geometria3D;

public class Cubo {
    double vlado;
    double resultado;

    public Cubo(double vlado, double resultado) {
        this.vlado = vlado;
        this.resultado = resultado;
    }

    public double getVlado() {
        return vlado;
    }

    public void setVlado(double vlado) {
        this.vlado = vlado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void cuboArea(double vlado, double resultado)
    { this.vlado=vlado;
        this.resultado=(Math.pow(vlado, 2)) * 6;

    }
}
