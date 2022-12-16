import Geometria_1.Circulo;
import java.lang.Math.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

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
                        Perimetro_Circulo();
                        break;
                    case 2:
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
        System.out.println("El resultado del Area del Circulo es: " + area.getResultado());
        System.out.println("");
    }

    static public void Perimetro_Circulo() {
        double resul = 0 ;
        System.out.print("Ingrese el radio del Circulo: ");
        double radio = sc.nextDouble();
        Circulo perimetro = new Circulo(radio,resul);
        System.out.println("El resultado del Perimetro es: "+perimetro.getResultado());
    }

    

}