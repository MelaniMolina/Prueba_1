package Geometria3D;

public class PrismaRegular extends Operaciones {
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
    @Override
    public void area() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = 2*((ladoA*ladoB)+(ladoA*altura)+(ladoB*altura));
    }
    @Override
    public void perimetro() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = ((ladoA * 4)+(ladoB*4)+(altura*4));
    }
    @Override
    public void volumen() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
        this.resultado = ladoA*ladoB*altura;
    }


}
