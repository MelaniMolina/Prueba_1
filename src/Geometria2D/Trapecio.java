package Geometria2D;

public class Trapecio extends Figuras2D {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double ladouno;
    private double ladodos;

    public Trapecio(double baseMayor, double baseMenor, double altura, double ladouno, double ladodos) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladouno = ladouno;
        this.ladodos = ladodos;
        calculararea();
        calcularperimetro();
        calcularperimetro();
    }
     @Override
    protected void calculararea(){
        this.area = ((altura/2)*(baseMayor+baseMenor));
    }
    protected void calcularperimetro(){
        this.perimetro = ladouno+baseMenor+ladodos+baseMayor;
    }

    protected void calculardiagonales(){
        this.diagonales =((2*area)/(baseMayor+baseMenor));
    }

}