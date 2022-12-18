package Geometria3D;

public class PrismaRegular {
    double ladoA=0;
    double ladoB=0;
    double resultado=0;
    double altura=0;

    public PrismaRegular(double ladoA, double ladoB, double altura, double resultado) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = resultado;

    }
    public void areaPrismaRegular(double ladoA, double ladoB, double altura, double resultado) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = 2*((ladoA*ladoB)+(ladoA*altura)+(ladoB*altura));
    }
    public void perimetroPrismaRegular(double ladoA, double ladoB,  double altura,double resultado) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = ((ladoA * 4)+(ladoB*4)+(altura*4));
    }
    public void volumenPrismaRegular(double ladoA, double ladoB, double altura, double resultado) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = ladoA*ladoB*altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
