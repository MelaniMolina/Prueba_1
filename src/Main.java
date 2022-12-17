import Geometria_1.Circulo;
import Geometria_1.Cuadrado;
import Geometria_1.Rectangulo;
import Geometria_1.Rombo;
import Geometria_1.Triangulo_Rectan;
import Geometria_1.Paralelogramo;
import Geometria_1.Trapecio;
import  Geometria_1.Pentagono;
import  Geometria_1.Triangulo;
import Geometria_1.Hexagono;
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
                        //Paralelo_Area();
                        //Paralelo_Perimetro();
                        //Paralelo_Diagonal();
                        //Trapecio_Area();
                        //Trapecio_Perime();
                        //Trapecio_Altura();
                        //                        Pentagono_Altura();
                        Hexagono_Apotema();
                        //Hexagono_Perimetro();
                        //Hexagono_Area();
                        //Triangulo_Altura();
                        //Triangulo_Peri();
                        //Triangulo_Area();
                        //Pentagono_Perimetro();
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

    static public void Rombo_Area(){
        double resultado = 0;
        System.out.print("Ingrese la Diagonal Mayor del Rombo: ");
        double mayor = sc.nextDouble();
        System.out.print("Ingrese la Diagonal Menor del Rombo: ");
        double menor =sc.nextDouble();
        Rombo area = new Rombo(mayor,menor,resultado);
        System.out.println("El resultado del Area del Rombo es: "+df.format(area.getAreaR()));
    }

    static  public void Rombo_Perimetro(){
        double resul = 0;
        System.out.print("Ingrese el Valor del Lado del Rombo: ");
        double lad = sc.nextDouble();
        System.out.print("Ingrese le Valor del Area del Rombo: ");
        double ar = sc.nextDouble();
        Rombo perimetro = new Rombo(lad,ar,resul);
        perimetro.RomboPeri(lad,ar,resul);
        System.out.println("El resultado del Area del Rombo es: "+df.format(perimetro.getPerimetroR()));
    }
    static  public void Rombo_DiagoMayor(){
        double resul = 0;
        System.out.print("Ingrese el Diagonal Mayor del Rombo: ");
        double diagome= sc.nextDouble();
        System.out.print("Ingrese le Valor del Area del Rombo: ");
        double ar = sc.nextDouble();
        Rombo diagonal = new Rombo(diagome,ar,resul);
        diagonal.RomboDiago(diagome,ar,resul);
        System.out.println("El resultado de la Diagonal Menor es: "+df.format(diagonal.getDiagoR()));
    }

    static public void Triangulo_RecArea(){
        double resultado = 0;
        System.out.print("Ingrese el Cateto Opuesto del Triangulo Rectangulo: ");
        double op = sc.nextDouble();
        System.out.print("Ingrese el Cateto Adyacentes del Triangulo Rectangulo: ");
        double ady = sc.nextDouble();
        Triangulo_Rectan area = new Triangulo_Rectan( op,ady,resultado);
        System.out.println("El resultado del Area del Triangulo Rectangulo es: "+df.format(area.getAreTriAn()));
    }

    static public void Triangulo_RecPeri(){
        double resul = 0;
        System.out.print("Ingrese el Cateto Opuesto del Triangulo Rectangulo: ");
        double opu = sc.nextDouble();
        System.out.print("Ingrese el Cateto Adyacentes del Triangulo Rectangulo: ");
        double ady = sc.nextDouble();
        System.out.print("Ingrese la Hipotenusa del Triangulo Rectangulo: ");
        double hip = sc.nextByte();
        Triangulo_Rectan perimetro = new Triangulo_Rectan(opu,ady,hip);
        perimetro.Triangulo_RectanPerimetro(opu, ady,hip,resul);
        System.out.println("El resultado del Perimetro del Triangulo Rectangulo es: "+df.format(perimetro.getPerimetroTriAn()));

    }

    static public  void Triangulo_RecAngulo(){
        double resul = 0;
        System.out.print("Ingrese el Cateto Opuesto del Triangulo Rectangulo: ");
        double opuest = sc.nextByte();
        System.out.print("Ingrese la Hipotenusa del Tiangulo Rectangulo: ");
        double hipote = sc.nextDouble();
        Triangulo_Rectan angulo = new Triangulo_Rectan(opuest,hipote,resul);
        angulo.Triangulo_RectanAngulo(opuest,hipote,resul);
        double pi = 3.141592654;
        System.out.println("El resultado del Angulo del Triangulo Rectangulo es: "+angulo.getAnguloTriAn());
    }

    static public void Paralelo_Area(){
        double resultado = 0;
        System.out.print("Ingrese la Base del Paralelogramo: ");
        double bas=sc.nextDouble();
        System.out.print("Ingrese la Altura del Paralelogramo: ");
        double alt=sc.nextDouble();
        Paralelogramo are = new Paralelogramo(bas,alt,resultado);
        System.out.println("El resultado del Area del Triangulo Rectangulo es: "+df.format(are.getAreParale()));
    }

    static  public void Paralelo_Perimetro(){
        double resultado = 0;
        System.out.print("Ingrese el Lado del Paralelogramo: ");
        double lad= sc.nextDouble();
        System.out.print("Ingrese la Base del Paralelogramo: ");
        double base = sc.nextDouble();
        Paralelogramo perimetro = new Paralelogramo(lad,base,resultado);
        perimetro.Paralelogramo_Perime(lad,base,resultado);
        System.out.println("El resultado del Perimetro del Paralelogramo es: "+df.format(perimetro.getPeriParale()));

    }
    static  public void Paralelo_Diagonal(){
        double resultado = 0;
        System.out.print("Ingrese el Lado del Paralelogramo: ");
        double lad= sc.nextDouble();
        System.out.print("Ingrese la Base del Paralelogramo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el Angulo que se Opone del Paralelogramo: ");
        double angulo = sc.nextDouble();
        Paralelogramo diagonal = new Paralelogramo(lad,base,angulo);
        diagonal.Paralelogramo_Diagonal(lad,base,angulo,resultado);
        System.out.println("El resultado de la Diagonal del Paralelogramo es: "+df.format(diagonal.getDiagonParale()));

    }

    static  public void  Trapecio_Area(){
        double resul=0;
        System.out.print("Ingrese la Base Mayor del Trapecio: ");
        double baseM = sc.nextDouble();
        System.out.print("Ingrese la Base Menor del Trapecio: ");
        double basem = sc.nextDouble();
        System.out.print("Ingrese la Altura del Trapecio: ");
        double alt = sc.nextDouble();
        Trapecio area = new Trapecio(baseM,basem,alt,resul);
        System.out.println("El resultado del Area del Trapecio es: "+df.format(area.getAreaTrapecio()));
    }
    static public void  Trapecio_Perime(){
        double resul=0;
        System.out.print("Ingrese el Lado del Trapecio: ");
        double lad = sc.nextDouble();
        System.out.print("Ingrese la Base Mayor del Trapecio: ");
        double mayor = sc.nextDouble();
        System.out.print("Ingrese el Segundo Lado del Trapecio: ");
        double lad2 = sc.nextDouble();
        System.out.print("Ingrese la Base Menor del Trapecio: ");
        double menor = sc.nextDouble();
        Trapecio perimetro = new Trapecio(lad,mayor,lad2,menor);
        perimetro.Trapecio_Peri(lad,mayor,lad2,menor,resul);
        System.out.println("El resultado del Perimetro del Trapecio es: "+df.format(perimetro.getPerimetroTrapecio()));

}

     static  public  void Trapecio_Altura(){
     double resultado= 0;
         System.out.print("Ingfrese el Area del Trapecio: ");
         double are= sc.nextDouble();
         System.out.print("Ingrese la Base Mayor del Trapecio: ");
         double M = sc.nextDouble();
         System.out.print("Ingrese la Base Menor del Trapecio: ");
         double m = sc.nextDouble();
         Trapecio altura = new Trapecio(are,M,m,resultado);
         altura.Trapecio_Altura(are,M,m,resultado);
         System.out.println("El resultado de la Altura del Trapecio es: "+df.format(altura.getAlturaTrapecio()));

}
     static  public void  Pentagono_Area(){
        double result = 0;
         System.out.print("Ingrese el Perimetro del Pentagono: ");
         double peri = sc.nextDouble();
         System.out.print("Ingrese el Apotema del Pentagono: ");
         double ap = sc.nextDouble();
         Pentagono area = new Pentagono(peri,ap,result);
         System.out.println("El resultado del Area del Trapecio es: "+df.format(area.getAre_Penta()));
     }

     static public void Pentagono_Perimetro(){
         double resultado=0,aux = 0;
         System.out.print("Ingrese el Valor del Lado del Pentagono: ");
         double lados = sc.nextDouble();
         Pentagono perimetro = new Pentagono(lados,resultado,aux);
         perimetro.Pentagono_Per(lados,resultado);
         System.out.println("El resultado del Perimetro del Pentagono es: "+df.format(perimetro.getPeri_Penta()));
     }
     static  public  void Pentagono_Altura(){
        double resultado = 0;
         System.out.print("Ingrese la Altura del Pentagono: ");
         double alt = sc.nextDouble();
         System.out.print("Ingrese el Lado del Pentagono: ");
         double la = sc.nextDouble();
         Pentagono altura = new Pentagono(alt,la,resultado);
         altura.Pentagono_Apotema(alt,la,resultado);
         System.out.println("El resultado del Apotema del Pentagono es: "+df.format(altura.getApotema_Penta()));
     }

     static public void Triangulo_Area(){
        double resultado = 0;
         System.out.print("Ingrese la Base del Triangulo: ");
         double b = sc.nextDouble();
         System.out.print("Ingrese la Altura del Triangulo: ");
         double a = sc.nextDouble();
         Triangulo area= new Triangulo(b,a,resultado);
         System.out.println("El resultado del Area del Triangulo es: "+df.format(area.getArea_Trian()));
     }
     static public void Triangulo_Peri(){
        double result = 0, aux = 0;
         System.out.print("Ingrese el Valor del Triangulo: ");
         double lad = sc.nextDouble();
         Triangulo perimetro = new Triangulo(result,lad, aux);
         perimetro.Triangulo_Per(lad,result);
         System.out.println("El resultado del Perimetro del Triangulo es: "+df.format(perimetro.getPerimetro_Trian()));
     }

     static  public void  Triangulo_Altura(){
        double resul = 0, aux = 0;
         System.out.print("Ingrese el Valor del Lado del Triangulo: ");
         double lados = sc.nextDouble();
         Triangulo altura = new Triangulo(lados,resul,aux);
         altura.Triangulo_Altura(lados,resul);
         System.out.println("El resultado de la Altura del Triangulo es: "+df.format(altura.getAltura_Trian()));

     }

     static  public  void Hexagono_Area(){
        double resultado = 0;
         System.out.print("Ingrese el Perimetro del Hexagono: ");
         double per = sc.nextDouble();
         System.out.print("Ingrese el Apotema del Hexagono: ");
         double apt = sc.nextDouble();
         Hexagono area = new Hexagono(per,apt,resultado);
         System.out.println("El resultado del Area del Hexagono es: "+df.format(area.getAreaHexa()));
     }

     static  public  void Hexagono_Perimetro(){
        double result = 0, aux = 0;
         System.out.print("Ingrese el Valor del Lado del Hexagono: ");
         double lad= sc.nextDouble();
         Hexagono perimetro = new Hexagono(lad,result,aux);
         perimetro.Hexagono_Peri(lad,result);
         System.out.println("El resultado del Perimetro del Hexagono es: "+df.format(perimetro.getPerimteroHexa()));
     }
     static  public void  Hexagono_Apotema(){
        double resultado = 0 , aux =0;
         System.out.print("Ingrese el Valor del Lado del Hexagono: ");
         double lados = sc.nextDouble();
         Hexagono apotema = new Hexagono(lados,resultado,aux);
         apotema.Hexagono_Apot(lados,resultado);
         System.out.println("El resultado el Apotema del Hexagono es: "+df.format(apotema.getApotemaHexa()));


     }
}