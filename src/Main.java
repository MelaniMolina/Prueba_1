import Geometria_1.Circulo;
import Geometria_1.Cuadrado;
import Geometria_1.Rectangulo;

import java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        int op = 0;
        String contin;
        try {
            do {
                System.out.print("\t-/-/-/-/-/ M E N U /-/-/-/-/-");
                System.out.println("\n");
                System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                System.out.println("|\t1) Areas                    |");
                System.out.println("|\t2) Perimetros               |");
                System.out.println("|\t3) Volumen                  |");
                System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                System.out.println("Selecione una Opcion");
                System.out.print(">> ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        //Perimetro_Circulo();
                        //Area_Circulo();
                        //Diagonal_Circulo();
                        break;
                    case 2:
                        //Area_Cuadrado();
                        //Cuadrado_Peri();
                        //Cuadrado_Diagonal();
                        //Rectan_Area();
                        //Rectan_Peri();
                        Rectan_Diago();
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("ERROR FUERA DE RANGO");
                }
                System.out.println("Desea Continuar \n Presione s o n ");
                contin = sc.next();
            } while (contin.equals("S") || contin.equals("s"));

        } catch (Exception e) {
            System.out.println("Ingreso Erroneo de Datos " + e.getMessage());
        } finally {
            System.out.println("El a Programa Finalizado!!!!");
        }
    }


    static public void Area_Circulo() {
        double result = 0;
        System.out.print("Ingrese el radio del Circulo: ");
        double rad = sc.nextDouble();
        Circulo area = new Circulo(rad, result);
        System.out.println("El resultado del Area del Circulo es: " + df.format(area.getResultado()));
    }

    static public void Perimetro_Circulo() {
        double resul = 0 ;
        System.out.print("Ingrese el radio del Circulo: ");
        double radio = sc.nextDouble();
        Circulo perimetro = new Circulo(radio,resul);
        perimetro.Circulo_Perimetro(radio,resul);
        System.out.println("El resultado del Perimetro es: "+ df.format(perimetro.getPerimetro()));
    }

    static public void Diagonal_Circulo(){
        double resultado = 0;
        System.out.print("Ingrese el la Longitud de Circulo: ");
        double ra = sc.nextDouble();
       Circulo diagonal = new Circulo(ra,resultado);
       diagonal.Circulo_Diametro(ra,resultado);
        System.out.println("El resultado de la Diagonal es: "+df.format(diagonal.getDiametro()));
    }

    static public void Area_Cuadrado(){
        double result = 0;
        System.out.print("Ingrese el Lado del Cuadrado: ");
        double lad = sc.nextDouble();
        Cuadrado area = new Cuadrado(lad,result);
        System.out.println("El resultado del Area del Cuadrado es: "+df.format(area.getResul_area()));
    }

    static public void Cuadrado_Peri(){
        double res = 0;
        System.out.print("Ingrese el Lado del Cuadrado: ");
        double lado = sc.nextDouble();
        Cuadrado perimetro = new Cuadrado(lado,res);
        perimetro.Cuadrado_Peri(lado,res);
        System.out.println("El resultado del Perimetro es: "+ df.format(perimetro.getResult_peri()));
    }

    static  public  void Cuadrado_Diagonal(){
        double result = 0;
        System.out.print("Ingrese el Lado de la Diagonal: ");
        double la = sc.nextDouble();
        Cuadrado diagonal = new Cuadrado(la,result);
        diagonal.Cuadrado_Diago(la,result);
        System.out.println("El resultado de la Diagonal es: "+df.format(diagonal.getResult_diago()));
    }

    static public void Rectan_Area(){
        double resu = 0;
        System.out.print("Ingrese la Base del Rectangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la Altura del Rectangulo: ");
        double altura = sc.nextDouble();
        Rectangulo area = new Rectangulo(base,altura,resu);
        System.out.println("El resultado del Area del Rectangulo es: "+df.format(area.getArea()));
    }

    static public void Rectan_Peri(){
        double result = 0 ;
        System.out.print("Ingrese la Altura del Rectangulo: ");
        double altu = sc.nextDouble();
        System.out.println("Ingrese la Base del Rectangulo: ");
        double base = sc.nextDouble();
        Rectangulo perimetro = new Rectangulo(altu,base,result);
        perimetro.Rectangulo_Perimetro(altu,base,result);
        System.out.println("El resultado del Perimetro es: "+df.format(perimetro.getPerim()));

    }
    static public void Rectan_Diago(){
        double resul_D = 0;
        System.out.print("Ingrese la Base del Rectangulo: ");
        double bas = sc.nextDouble();
        System.out.print("Ingrese la Altura del Rectangulo: ");
        double al = sc.nextDouble();
        Rectangulo diagonal = new Rectangulo(bas,al,resul_D);
        diagonal.Rectangulo_Diagonal(bas,al,resul_D);
        System.out.println("El resultado del Perimetro es: "+ df.format(diagonal.getDiago()));
    }



}