package Geometria3D;

public class TroncoCono extends Operaciones{
    private double radio1;
    private double radio2;
    private double num3;

    public TroncoCono(double radio1, double radio2, double num3) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.num3 = num3;
        area();
        volumen();
        altura();
    }
    @Override
    public void area(){
        this.area=3.14*(Math.pow(radio1,2)+Math.pow(radio2,2)+num3*(radio1+radio2));
    }
    public void volumen(){
        this.resultado=(num3*3.14)/3*(Math.pow(radio1,2)+Math.pow(radio2,2)+radio1*radio2);
    }
    public void altura(){
        this.resultado=3.14*(radio1+radio2)*num3;
    }
}
