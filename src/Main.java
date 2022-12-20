
import Geometria3D.Cubo;
import Geometria2D.*;
import java.lang.Math.*;
import Geometria3D.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        int op = 0, op1 = 0, op2 = 0;
        int contin;
        double num1,num2,num3,resultado;
        try {
            do{
                System.out.print("\t-/-/-/-/-/ M E N U /-/-/-/-/-");
                System.out.println("\n");
                System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                System.out.println("|\t1) Geometria2D              |");
                System.out.println("|\t2) Geometria3D              |");
                System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                do {
                    System.out.println("\nSelecione una Opcion");
                    System.out.print(">> ");
                    op = sc.nextInt();
                    if (op < 0){
                        System.out.println("\nEl dato ingresado es incorrecto vuelva a intentarlo");
                    }
                }while (op < 1 || op > 2);
                switch (op) {
                    case 1:
                        System.out.print("\t-/-/-/-/-/ MENU Geometria2D /-/-/-/-/-");
                        System.out.println("\n");
                        System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                        System.out.println("|\t1) Areas                    |");
                        System.out.println("|\t2) Perimetros               |");
                        System.out.println("|\t3) Diagonales                |");
                        System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                        do {
                            System.out.println("Selecione una Opcion");
                            System.out.print(">> ");
                            op1 = sc.nextInt();
                            if (op1 < 0){
                                System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                            }
                        }while(op1 < 1 || op1 > 3);
                        switch (op1) {
                            case 1:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU AREAS /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Circulo                  |");
                                    System.out.println("|\t2) Cuadrado                 |");
                                    System.out.println("|\t3) Rectangulo               |");
                                    System.out.println("|\t4) Rombo                    |");
                                    System.out.println("|\t5) Triangulo                |");
                                    System.out.println("|\t6) Pentagono                |");
                                    System.out.println("|\t7) Hexagono                 |");
                                    System.out.println("|\t8) Paralelogramo            |");
                                    System.out.println("|\t9) Trapecio                 |");
                                    System.out.println("|\t10) Triangulo rectangulo    |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            do {
                                                System.out.print("\nIngrese el radio del Circulo: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            } while (num1< 0);
                                            Circulo c = new Circulo(num1);
                                            System.out.println("El resultado del Area del Circulo es: " + df.format(c.getArea()));
                                            System.out.println("");
                                            break;
                                        case 2:
                                            do {
                                                System.out.print("\nIngrese el Lado del Cuadrado: ");
                                                num1= sc.nextDouble();
                                                if (num1 < 0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (num1 < 0);
                                            Cuadrado cu = new Cuadrado(num1);
                                            System.out.println("El resultado del Area del Cuadrado es: "+df.format(cu.getArea()));
                                            break;
                                        case 3:
                                            double resu = 0;
                                            double altura, base;
                                            do {
                                                System.out.print("\nIngrese la Base del Rectangulo: ");
                                                base = sc.nextDouble();
                                                if (base < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (base < 0);
                                            do {
                                                System.out.print("Ingrese la Altura del Rectangulo: ");
                                                altura = sc.nextDouble();
                                                if (altura < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (altura < 0);
                                            Rectangulo ar = new Rectangulo(base,altura,resu);
                                            System.out.println("\nEl resultado del Area del Rectangulo es: "+df.format(ar.getArea()));
                                            break;
                                        case 4:
                                            double re = 0, mayor, menor;
                                            do {
                                                System.out.print("\nIngrese la Diagonal Mayor del Rombo: ");
                                                mayor = sc.nextDouble();
                                                if (mayor < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (mayor < 0);
                                            do {
                                                System.out.print("Ingrese la Diagonal Menor del Rombo: ");
                                                menor = sc.nextDouble();
                                                if (menor < 0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (menor < 0);
                                            Rombo are = new Rombo(mayor,menor,re);
                                            System.out.println("\nEl resultado del Area del Rombo es: "+df.format(are.getAreaR()));
                                            break;
                                        case 5:
                                            double resultado2 = 0, b, a1;
                                            do {
                                                System.out.print("\nIngrese la Base del Triangulo: ");
                                                b = sc.nextDouble();
                                                if (b < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (b < 0);
                                            do {
                                                System.out.print("Ingrese la Altura del Triangulo: ");
                                                a1 = sc.nextDouble();
                                                if (a1 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (a1 < 0);
                                            Triangulo area2= new Triangulo(b,a1,resultado2);
                                            System.out.println("\nEl resultado del Area del Triangulo es: "+df.format(area2.getArea_Trian()));
                                            break;
                                        case 6:
                                            double resultado5 = 0, peri, ap;
                                            do {
                                                System.out.print("\nIngrese el Perimetro del Pentagono: ");
                                                peri = sc.nextDouble();
                                                if (peri < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (peri < 0);
                                            do {
                                                System.out.print("Ingrese el Apotema del Pentagono: ");
                                                ap = sc.nextDouble();
                                                if (ap < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (ap < 0);
                                            Pentagono area4 = new Pentagono(peri,ap,resultado5);
                                            System.out.println("\nEl resultado del Area del Pentagono es: "+df.format(area4.getAre_Penta()));
                                            break;
                                        case 7:
                                            do {
                                                System.out.print("\nIngrese el Perimetro del Hexagono: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (num1 < 0);
                                            do {
                                                System.out.print("Ingrese el Apotema del Hexagono: ");
                                                num2 = sc.nextDouble();
                                                if ( num2 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (num2 < 0);
                                            Hexagono h = new Hexagono(num1,num2);
                                            System.out.println("\nEl resultado del Area del Hexagono es: "+df.format(h.getArea()));
                                            break;
                                        case 8:
                                            double resultado6 = 0, bas, alt1;
                                            do {
                                                System.out.print("\nIngrese la Base del Paralelogramo: ");
                                                bas = sc.nextDouble();
                                                if (bas < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (bas < 0);
                                            do {
                                                System.out.print("Ingrese la Altura del Paralelogramo: ");
                                                alt1 = sc.nextDouble();
                                                if (alt1 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (alt1 < 0);
                                            Paralelogramo are1 = new Paralelogramo(bas,alt1,resultado6);
                                            System.out.println("\nEl resultado del Area del Paralelogramo es: "+df.format(are1.getAreParale()));
                                            break;
                                        case 9:
                                            double resul=0, baseM, basem, alt3;
                                            do {
                                                System.out.print("\nIngrese la Base Mayor del Trapecio: ");
                                                baseM = sc.nextDouble();
                                                if (baseM < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (baseM < 0);
                                            do {
                                                System.out.print("Ingrese la Base Menor del Trapecio: ");
                                                basem = sc.nextDouble();
                                                if (basem < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while(basem < 0);
                                            do {
                                                System.out.print("Ingrese la Altura del Trapecio: ");
                                                alt3 = sc.nextDouble();
                                                if (alt3<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (alt3 <0);
                                            Trapecio area5 = new Trapecio(baseM,basem,alt3,resul);
                                            System.out.println("\nEl resultado del Area del Trapecio es: "+df.format(area5.getAreaTrapecio()));
                                            break;
                                        case 10:
                                            double resultado11 = 0, op3, ady;
                                            do {
                                                System.out.print("\nIngrese el Cateto Opuesto del Triangulo Rectangulo: ");
                                                op3 = sc.nextDouble();
                                                if (op3<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (op3<0);
                                            do {
                                                System.out.print("Ingrese el Cateto Adyacentes del Triangulo Rectangulo: ");
                                                ady = sc.nextDouble();
                                                if (ady < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresarlo porfavor");
                                                }
                                            }while (ady <0);
                                            Triangulo_Rectan area6 = new Triangulo_Rectan( op3,ady,resultado11);
                                            System.out.println("\nEl resultado del Area del Triangulo Rectangulo es: "+df.format(area6.getAreTriAn()));
                                            break;
                                    }
                                    System.out.println("\nDesea sea realizar el calculo de otro area 1.SI: ");
                                    contin = sc.nextInt();
                                    System.out.println();
                                }while (contin == 1);
                                break;
                            case 2:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU PERIMETROS /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Circulo                  |");
                                    System.out.println("|\t2) Cuadrado                 |");
                                    System.out.println("|\t3) Rectangulo               |");
                                    System.out.println("|\t4) Rombo                    |");
                                    System.out.println("|\t5) Triangulo                |");
                                    System.out.println("|\t6) Pentagono                |");
                                    System.out.println("|\t7) Hexagono                 |");
                                    System.out.println("|\t8) Paralelogramo            |");
                                    System.out.println("|\t9) Trapecio                 |");
                                    System.out.println("|\t10) Triangulo rectangulo    |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            do {
                                                System.out.print("\nIngrese el radio del Circulo: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            } while (num1 < 0);
                                            Circulo c = new Circulo(num1);
                                            System.out.println("\nEl resultado del Perimetro es: " + df.format(c.getPerimetro()));
                                            break;
                                        case 2:
                                            do {
                                                System.out.print("\nIngrese el Lado del Cuadrado: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (num1 < 0);
                                            Cuadrado cu = new Cuadrado(num1);
                                            System.out.println("\nEl resultado del Perimetro es: "+ df.format(cu.getPerimetro()));
                                            break;
                                        case 3:
                                            double result = 0 ;
                                            double base, altu;
                                            do {
                                                System.out.print("\nIngrese la Altura del Rectangulo: ");
                                                altu = sc.nextDouble();
                                                if (altu < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (altu < 0);
                                            do {
                                                System.out.println("Ingrese la Base del Rectangulo: ");
                                                base = sc.nextDouble();
                                                if (base < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (base < 0);
                                            Rectangulo pe = new Rectangulo(altu,base,result);
                                            pe.Rectangulo_Perimetro(altu,base,result);
                                            System.out.println("\nEl resultado del Perimetro es: "+df.format(pe.getPerim()));
                                            break;
                                        case 4:
                                            double resultado1 = 0, lad, ar;
                                            do{
                                                System.out.print("\nIngrese el Valor del Lado del Rombo: ");
                                                lad = sc.nextDouble();
                                                if (lad < 0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            } while (lad < 0);
                                            System.out.print("Ingrese le Valor del Area del Rombo: ");
                                            ar = sc.nextDouble();
                                            Rombo perimetro1 = new Rombo(lad,ar,resultado1);
                                            perimetro1.RomboPeri(lad,ar,resultado1);
                                            System.out.println("\nEl resultado del perimetro del Rombo es: "+df.format(perimetro1.getPerimetroR()));
                                            break;
                                        case 5:
                                            double resultado3 = 0, aux = 0, lado1;
                                            do {
                                                System.out.print("\nIngrese el Valor del Triangulo: ");
                                                lado1 = sc.nextDouble();
                                                if (lado1 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (lado1 < 0);
                                            Triangulo perimetro3= new Triangulo(resultado3,lado1, aux);
                                            perimetro3.Triangulo_Per(lado1,resultado3);
                                            System.out.println("\nEl resultado del Perimetro del Triangulo es: "+df.format(perimetro3.getPerimetro_Trian()));
                                            break;
                                        case 6:
                                            double resultado4=0,aux3 = 0, lados4;
                                            do {
                                                System.out.print("\nIngrese el Valor del Lado del Pentagono: ");
                                                lados4 = sc.nextDouble();
                                                if (lados4<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (lados4 < 0 );
                                            Pentagono perimetro5 = new Pentagono(lados4,resultado4,aux3);
                                            perimetro5.Pentagono_Per(lados4,resultado4);
                                            System.out.println("\nEl resultado del Perimetro del Pentagono es: "+df.format(perimetro5.getPeri_Penta()));
                                            break;
                                        case 7:
                                            do {
                                                System.out.print("\nIngrese el Valor del Lado del Hexagono: ");
                                                num1 = sc.nextDouble();
                                                if (num1< 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (num1 < 0);
                                            Hexagono h = new Hexagono(num1,num2=0);
                                            System.out.println("\nEl resultado del Perimetro del Hexagono es: "+df.format(h.getPerimetro()));
                                            break;
                                        case 8:
                                            double resultado8 = 0, lad2, base1;
                                            do {
                                                System.out.print("\nIngrese el Lado del Paralelogramo: ");
                                                lad2 = sc.nextDouble();
                                                if (lad2 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (lad2 < 0);
                                            do {
                                                System.out.print("Ingrese la Base del Paralelogramo: ");
                                                base1 = sc.nextDouble();
                                                if (base1 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (base1 < 0);
                                            Paralelogramo perimetro8 = new Paralelogramo(lad2,base1,resultado8);
                                            perimetro8.Paralelogramo_Perime(lad2,base1,resultado8);
                                            System.out.println("\nEl resultado del Perimetro del Paralelogramo es: "+df.format(perimetro8.getPeriParale()));
                                            break;
                                        case 9:
                                            double resul3=0, lad5, mayor,lad10, menor ;
                                            do {
                                                System.out.print("\nIngrese el Lado del Trapecio: ");
                                                lad5 = sc.nextDouble();
                                                if (lad5 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (lad5 < 0);
                                            do {
                                                System.out.print("Ingrese la Base Mayor del Trapecio: ");
                                                mayor = sc.nextDouble();
                                                if (mayor <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (mayor < 0);
                                            do {
                                                System.out.print("Ingrese el Segundo Lado del Trapecio: ");
                                                lad10 = sc.nextDouble();
                                                if (lad10<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (lad10<0);
                                            do {
                                                System.out.print("Ingrese la Base Menor del Trapecio: ");
                                                menor = sc.nextDouble();
                                                if (menor<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo porfavor");
                                                }
                                            }while (menor<0);
                                            Trapecio perimetro10 = new Trapecio(lad5,mayor,lad10,menor);
                                            perimetro10.Trapecio_Peri(lad5,mayor,lad10,menor,resul3);
                                            System.out.println("\nEl resultado del Perimetro del Trapecio es: "+df.format(perimetro10.getPerimetroTrapecio()));
                                            break;
                                        case 10:

                                            break;

                                    }
                                    System.out.println("\nDesea sea realizar el calculo de otro area 1.SI: ");
                                    contin = sc.nextInt();
                                    System.out.println();
                                }while (contin == 1);
                                break;
                            case 3:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU DIAGONALES /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Circulo                  |");
                                    System.out.println("|\t2) Cuadrado                 |");
                                    System.out.println("|\t3) Rectangulo               |");
                                    System.out.println("|\t4) Rombo                    |");
                                    System.out.println("|\t5) Triangulo                |");
                                    System.out.println("|\t6) Pentagono                |");
                                    System.out.println("|\t7) Hexagono                 |");
                                    System.out.println("|\t8) Paralelogramo            |");
                                    System.out.println("|\t9) Trapecio                 |");
                                    System.out.println("|\t10) Triangulo rectangulo    |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            do {
                                                System.out.print("\nIngrese el la Longitud de Circulo: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (num1 < 0);
                                            Circulo c = new Circulo(num1);
                                            System.out.println("\nEl resultado de la Diagonal es: " + df.format(c.getDiagonales()));
                                            break;
                                        case 2:
                                            do {
                                                System.out.print("\nIngrese el Lado de la Diagonal: ");
                                                num1 = sc.nextDouble();
                                                if (num1 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (num1 < 0);
                                            Cuadrado cu = new Cuadrado(num1);
                                            System.out.println("\nEl resultado de la Diagonal es: "+df.format(cu.getDiagonales()));
                                            break;
                                        case 3:
                                            double resul_D = 0;
                                            double bas, al;
                                            do {
                                                System.out.print("\nIngrese la Base del Rectangulo: ");
                                                bas = sc.nextDouble();
                                                if (bas < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (bas < 0);
                                            do {
                                                System.out.print("Ingrese la Altura del Rectangulo: ");
                                                al = sc.nextDouble();
                                                if (al < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (al < 0);
                                            Rectangulo di = new Rectangulo(bas,al,resul_D);
                                            di.Rectangulo_Diagonal(bas,al,resul_D);
                                            System.out.println("\nEl resultado del Perimetro es: "+ df.format(di.getDiago()));
                                            break;
                                        case 4:
                                            double resul = 0, diagome, ar;
                                            do {
                                                System.out.print("\nIngrese el Diagonal Mayor del Rombo: ");
                                                diagome = sc.nextDouble();
                                                if ( diagome < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (diagome < 0);
                                            do {
                                                System.out.print("Ingrese le Valor del Area del Rombo: ");
                                                ar = sc.nextDouble();
                                                if (ar < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (ar < 0);
                                            Rombo diagonal1 = new Rombo(diagome,ar,resul);
                                            diagonal1.RomboDiago(diagome,ar,resul);
                                            System.out.println("\nEl resultado de la Diagonal Menor es: "+df.format(diagonal1.getDiagoR()));
                                            break;
                                        case 5:
                                            double resultado4 = 0, aux = 0, lados;
                                            do {
                                                System.out.print("\nIngrese el Valor del Lado del Triangulo: ");
                                                lados = sc.nextDouble();
                                                if (lados < 0){

                                                }
                                            }while (lados < 0);
                                            Triangulo altura = new Triangulo(lados,resultado4,aux);
                                            altura.Triangulo_Altura(lados,resultado4);
                                            System.out.println("\nEl resultado de la Altura del Triangulo es: "+df.format(altura.getAltura_Trian()));
                                            break;
                                        case 6:
                                            double resultado6 = 0, alt, la1;
                                            do {
                                                System.out.print("\nIngrese la Altura del Pentagono: ");
                                                alt = sc.nextDouble();
                                                if (alt < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (alt < 0);
                                            do {
                                                System.out.print("Ingrese el Lado del Pentagono: ");
                                                la1 = sc.nextDouble();
                                                if (la1 < 0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (la1 <0);
                                            Pentagono altura2 = new Pentagono(alt,la1,resultado6);
                                            altura2.Pentagono_Apotema(alt,la1,resultado6);
                                            System.out.println("\nEl resultado del Apotema del Pentagono es: "+df.format(altura2.getApotema_Penta()));
                                            break;
                                        case 7:
                                            do {
                                                System.out.print("\nIngrese el Valor del Lado del Hexagono: ");
                                                num1 = sc.nextDouble();
                                                if (num1 <  0 ){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (num1 < 0 );
                                            Hexagono h = new Hexagono(num1,num2=0);
                                            System.out.println("\nEl resultado el Apotema del Hexagono es: "+df.format(h.getDiagonales()));
                                            break;
                                        case 8:
                                            double resultado9 = 0, lad4, base2, angulo;
                                            do {
                                                System.out.print("\nIngrese el Lado del Paralelogramo: ");
                                                lad4 = sc.nextDouble();
                                                if (lad4 < 0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (lad4 < 0);
                                            do {
                                                System.out.print("Ingrese la Base del Paralelogramo: ");
                                                base2 = sc.nextDouble();
                                                if (base2 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (base2 < 0);
                                            do {
                                                System.out.print("Ingrese el Angulo que se Opone del Paralelogramo: ");
                                                angulo = sc.nextDouble();
                                                if (angulo <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (angulo <0);
                                            Paralelogramo diagonal2 = new Paralelogramo(lad4,base2,angulo);
                                            diagonal2.Paralelogramo_Diagonal(lad4,base2,angulo,resultado9);
                                            System.out.println("El resultado de la Diagonal del Paralelogramo es: "+df.format(diagonal2.getDiagonParale()));
                                            break;
                                        case 9:
                                            double resultado10= 0,are1,M, m;
                                            do {
                                                System.out.print("\nIngfrese el Area del Trapecio: ");
                                                are1 = sc.nextDouble();
                                                if (are1 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (are1 <0);
                                            do {
                                                System.out.print("Ingrese la Base Mayor del Trapecio: ");
                                                M = sc.nextDouble();
                                                if (M<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (M <0);
                                            do {
                                                System.out.print("Ingrese la Base Menor del Trapecio: ");
                                                m = sc.nextDouble();
                                                if (m <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (m <0);
                                            Trapecio altura4 = new Trapecio(are1,M,m,resultado10);
                                            altura4.Trapecio_Altura(are1,M,m,resultado10);
                                            System.out.println("\nEl resultado de la Altura del Trapecio es: "+df.format(altura4.getAlturaTrapecio()));
                                            break;
                                        case 10:
                                            double resul4 = 0, opu,ady1,hip;
                                            do {
                                                System.out.print("\nIngrese el Cateto Opuesto del Triangulo Rectangulo: ");
                                                opu = sc.nextDouble();
                                                if (opu <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (opu <0);
                                            do {
                                                System.out.print("Ingrese el Cateto Adyacentes del Triangulo Rectangulo: ");
                                                ady1 = sc.nextDouble();
                                                if (ady1 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (ady1 <0);
                                            do {
                                                System.out.print("Ingrese la Hipotenusa del Triangulo Rectangulo: ");
                                                hip = sc.nextByte();
                                                if (hip<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (hip <0);
                                            Triangulo_Rectan perimetro12 = new Triangulo_Rectan(opu,ady1,hip);
                                            perimetro12.Triangulo_RectanPerimetro(opu, ady1,hip,resul4);
                                            System.out.println("El resultado del Perimetro del Triangulo Rectangulo es: "+df.format(perimetro12.getPerimetroTriAn()));

                                            break;

                                    }
                                    System.out.println("\nDesea sea realizar el calculo de otro area 1.SI: ");
                                    contin = sc.nextInt();
                                    System.out.println();
                                }while (contin == 1);
                                break;
                            default:
                                System.out.println("ERROR FUERA DE RANGO");
                        }
                        break;
                    case 2:
                        System.out.print("\t-/-/-/-/-/ MENU Geometria3D /-/-/-/-/-");
                        System.out.println("\n");
                        System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                        System.out.println("|\t1) Areas                    |");
                        System.out.println("|\t2) Perimetros               |");
                        System.out.println("|\t3) Volumenes                |");
                        System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                        do {
                            System.out.println("Selecione una Opcion");
                            System.out.print(">> ");
                            op1 = sc.nextInt();
                            if (op1 < 0){
                                System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                            }
                        }while(op1 < 1 || op1 > 3);
                        switch (op1){
                            case 1:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU AREAS /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Cubo                     |");
                                    System.out.println("|\t2) Cilindro                 |");
                                    System.out.println("|\t3) Tetraedro                |");
                                    System.out.println("|\t4) Esfera                   |");
                                    System.out.println("|\t5) Octaedro                 |");
                                    System.out.println("|\t6) Piramide Regular         |");
                                    System.out.println("|\t7) Cono                     |");
                                    System.out.println("|\t8) Tronco Cono              |");
                                    System.out.println("|\t9) Tronco Piramide          |");
                                    System.out.println("|\t10) Prisma                  |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            double lado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            Cubo cubo = new Cubo(lado, resultado=0);
                                            cubo.cuboArea(lado, resultado);
                                            System.out.println("\nEl resultado del area es: " + df.format(cubo.getResultado()));

                                            break;
                                        case 2:
                                            double altura=0, result =0, radio=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                radio = sc.nextDouble();
                                                if (radio < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radio < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                altura = sc.nextDouble();
                                                if (altura < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (altura < 0);
                                            Cilindro cilindro = new Cilindro(altura,radio, result);
                                            cilindro.cilArea(altura,radio, result);
                                            System.out.println("\nEl resultado del area es: " + df.format(cilindro.getResult()));


                                            break;
                                        case 3:
                                            double lado1=0, resultad=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado1 = sc.nextDouble();
                                                if (lado1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado1 < 0);
                                            TetraedroRegular tetraedro=new TetraedroRegular(lado1,resultad);
                                            tetraedro.alturaTetraedro(lado1,resultad);
                                            System.out.println("\nEl resultado de la altura es: " + df.format(tetraedro.getResultado()));

                                            break;
                                        case 4:
                                            double rad=0, resu=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                rad = sc.nextDouble();
                                                if (rad < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (rad < 0);
                                            Esfera esfera=new Esfera(rad,resu);
                                            esfera.areaEsfera(rad,resu);
                                            System.out.println("\nEl resultado del  es: " + df.format(esfera.getResul()));



                                            break;
                                        case 5:

                                            double olado=0, oresultado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                olado = sc.nextDouble();
                                                if (olado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (olado < 0);
                                            Octaedro octaedro=new Octaedro(olado, oresultado);
                                            octaedro.alturaOctaedro(olado,olado);
                                            System.out.println("\nEl resultado de la altura es: " + df.format(octaedro.getResultado()));


                                            break;
                                        case 6:
                                            double alturaP=0, ladoA, ladoB ,resultaP =0;
                                            do {
                                                System.out.print("\nIngrese la altura A: ");
                                                ladoA = sc.nextDouble();
                                                if (ladoA < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoA < 0);
                                            do {
                                                System.out.print("\nIngrese la altura B: ");
                                                ladoB = sc.nextDouble();
                                                if (ladoB < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoB < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                alturaP = sc.nextDouble();
                                                if (alturaP < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (alturaP < 0);
                                            PrismaRegular prismaRegular=new PrismaRegular(ladoA,ladoB, alturaP, resultaP);
                                            prismaRegular.areaPrismaRegular(ladoA,ladoB,alturaP,resultaP);
                                            System.out.println("\nEl resultado del area es: " + df.format(prismaRegular.getResultado()));


                                            break;
                                        case 7:
                                            double ladoG=0, radioC=0, alturaC=0 ,resultadoC=0;
                                            do {
                                                System.out.print("\nIngrese el lado del cono: ");
                                                ladoG = sc.nextDouble();
                                                if (ladoG < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoG < 0);
                                            do {
                                                System.out.print("\nIngrese el radio : ");
                                                radioC = sc.nextDouble();
                                                if (radioC < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radioC < 0);

                                            Cono cono=new Cono(ladoG,radioC, alturaC, resultadoC);
                                            cono.alturaCono(ladoG,radioC,alturaC,resultadoC);
                                            System.out.println("\nEl resultado de la altura es: " + df.format(cono.getResultado()));

                                            break;
                                        case 8:
                                            double G,g,altura14,resultado15=0, radioos=0;
                                            do{
                                                System.out.print("\nIngrese el radio uno: ");
                                                G=sc.nextDouble();
                                                if (G <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (G <0);
                                            do{
                                                System.out.print("Ingrese el radio dos: ");
                                                g=sc.nextDouble();
                                                if (g<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (g <0);
                                            do{
                                                System.out.print("Ingrese la altura: ");
                                                altura14=sc.nextDouble();
                                                if (altura14<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (altura14 <0);
                                            Tronco_cono co = new Tronco_cono(G,g,altura14,resultado15);
                                            co.Tronco_cono_Lateral(G,g,altura14,radioos);
                                            System.out.println("\nEl resultado del area lateral es: " + df.format(co.getArea_lateralTC()));
                                            break;
                                        case 9:
                                            double G1,g1,altura15,resultado16=0, radioos1=0;
                                            do{
                                                System.out.print("\nIngrese la base mayor: ");
                                                G1=sc.nextDouble();
                                                if (G1 <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (G1 <0);
                                            do{
                                                System.out.print("Ingrese base menor: ");
                                                g1=sc.nextDouble();
                                                if (g1<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (g1 <0);
                                            do{
                                                System.out.print("Ingrese lado uno: ");
                                                altura15=sc.nextDouble();
                                                if (altura15<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (altura15 <0);
                                            Tronco_Piramide tr = new Tronco_Piramide(G1,g1,altura15,resultado16,radioos1);
                                            tr.Tronco_Piramide_Laterak(G1,g1,altura15);
                                            System.out.println("\nEl resultado del area lateral es: " + df.format(tr.getArea_lateral()));
                                            break;
                                        case 10:

                                            break;
                                    }
                                    System.out.print("\nDesea realizar otro ejericio de areas 1.SI: ");
                                    contin = sc.nextInt();
                                }while(contin == 1);
                                break;
                            case 2:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU PERIMETROS /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Cubo                     |");
                                    System.out.println("|\t2) Cilindro                 |");
                                    System.out.println("|\t3) Tetraedro                |");
                                    System.out.println("|\t4) Esfera                   |");
                                    System.out.println("|\t5) Octaedro                 |");
                                    System.out.println("|\t6) Piramide Regular         |");
                                    System.out.println("|\t7) Cono                     |");
                                    System.out.println("|\t8) Tronco Cono              |");
                                    System.out.println("|\t9) Tronco Piramide          |");
                                    System.out.println("|\t10) Prisma                  |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            double lado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            Cubo cubo = new Cubo(lado, resultado=0);
                                            cubo.cuboPerimetro(lado, resultado);
                                            System.out.println("\nEl resultado del area es: " + df.format(cubo.getResultado()));
                                            break;
                                        case 2:
                                            double altura=0, result =0, radio=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                radio = sc.nextDouble();
                                                if (radio < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radio < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                altura = sc.nextDouble();
                                                if (altura < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (altura < 0);
                                            Cilindro cilindro = new Cilindro(altura,radio, result);
                                            cilindro.cilArea(altura,radio, result);
                                            System.out.println("\nEl resultado del perimetro es: " + df.format(cilindro.getResult()));
                                            break;
                                        case 3:
                                            double lado1=0, resultad=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado1 = sc.nextDouble();
                                                if (lado1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado1 < 0);
                                            TetraedroRegular tetraedro=new TetraedroRegular(lado1,resultad);
                                            tetraedro.areaTetraedro(lado1,resultad);
                                            System.out.println("\nEl resultado del area es: " + df.format(tetraedro.getResultado()));

                                            break;
                                        case 4:
                                            double rad=0, resu=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                rad = sc.nextDouble();
                                                if (rad < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (rad < 0);
                                            Esfera esfera=new Esfera(rad,resu);
                                            esfera.perimetroEsfera(rad,resu);
                                            System.out.println("\nEl resultado del  es: " + df.format(esfera.getResul()));

                                            break;
                                        case 5:
                                            double olado=0, oresultado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                olado = sc.nextDouble();
                                                if (olado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (olado < 0);
                                            Octaedro octaedro=new Octaedro(olado, oresultado);
                                            octaedro.areaOctaedro(olado,olado);
                                            System.out.println("\nEl resultado de la area es: " + df.format(octaedro.getResultado()));



                                            break;
                                        case 6:
                                            double alturaP=0, ladoA, ladoB ,resultaP =0;
                                            do {
                                                System.out.print("\nIngrese la altura A: ");
                                                ladoA = sc.nextDouble();
                                                if (ladoA < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoA < 0);
                                            do {
                                                System.out.print("\nIngrese la altura B: ");
                                                ladoB = sc.nextDouble();
                                                if (ladoB < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoB < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                alturaP = sc.nextDouble();
                                                if (alturaP < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (alturaP < 0);
                                            PrismaRegular prismaRegular=new PrismaRegular(ladoA,ladoB, alturaP, resultaP);
                                            prismaRegular.perimetroPrismaRegular(ladoA,ladoB,alturaP,resultaP);
                                            System.out.println("\nEl resultado del perimetro es: " + df.format(prismaRegular.getResultado()));


                                            break;
                                        case 7:
                                            double ladoG=0, radioC=0, alturaC=0 ,resultadoC=0;
                                            do {
                                                System.out.print("\nIngrese el lado del cono: ");
                                                ladoG = sc.nextDouble();
                                                if (ladoG < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoG < 0);
                                            do {
                                                System.out.print("\nIngrese el radio : ");
                                                radioC = sc.nextDouble();
                                                if (radioC < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radioC < 0);

                                            Cono cono=new Cono(ladoG,radioC, alturaC, resultadoC);
                                            cono.areaCono(ladoG,radioC,alturaC,resultadoC);
                                            System.out.println("\nEl resultado del area es: " + df.format(cono.getResultado()));

                                            break;
                                        case 8:
                                            double G,g,altura14,resultado15=0, radioos=0;
                                            do{
                                                System.out.print("\nIngrese el radio uno: ");
                                                G=sc.nextDouble();
                                                if (G <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (G <0);
                                            do{
                                                System.out.print("Ingrese el radio dos: ");
                                                g=sc.nextDouble();
                                                if (g<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (g <0);
                                            do{
                                                System.out.print("Ingrese la altura: ");
                                                altura14=sc.nextDouble();
                                                if (altura14<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (altura14 <0);
                                            Tronco_cono co = new Tronco_cono(G,g,altura14,resultado15);
                                            co.Tronco_cono_Lateral(G,g,altura14,radioos);
                                            System.out.println("\nEl resultado del area lateral es: " + df.format(co.getArea_lateralTC()));
                                            break;
                                        case 9:

                                            break;
                                        case 10:

                                            break;
                                    }
                                    System.out.print("\nDesea realizar otro ejericio de Perimetros 1.SI: ");
                                    contin = sc.nextInt();
                                }while(contin == 1);
                                break;
                            case 3:
                                do {
                                    System.out.print("\t-/-/-/-/-/ SUBMENU VOLUMENES /-/-/-/-/-");
                                    System.out.println("\n");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    System.out.println("|\t1) Cubo                     |");
                                    System.out.println("|\t2) Cilindro                 |");
                                    System.out.println("|\t3) Tetraedro                |");
                                    System.out.println("|\t4) Esfera                   |");
                                    System.out.println("|\t5) Octaedro                 |");
                                    System.out.println("|\t6) Piramide Regular         |");
                                    System.out.println("|\t7) Cono                     |");
                                    System.out.println("|\t8) Tronco Cono              |");
                                    System.out.println("|\t9)                 |");
                                    System.out.println("|\t10)     |");
                                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                                    do {
                                        System.out.println("Selecione una Opcion");
                                        System.out.print(">> ");
                                        op2 = sc.nextInt();
                                        if (op2 < 0) {
                                            System.out.println("\nEl dato ingresado es incorrecto vuelva intentarlo");
                                        }
                                    } while (op2 < 1 || op2 > 10);
                                    switch (op2) {
                                        case 1:
                                            double lado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            Cubo cubo = new Cubo(lado, resultado=0);
                                            cubo.cuboVolumen(lado, resultado);
                                            System.out.println("\nEl resultado del area es: " + df.format(cubo.getResultado()));

                                            break;
                                        case 2:

                                            double altura=0, result =0, radio=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                radio = sc.nextDouble();
                                                if (radio < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radio < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                altura = sc.nextDouble();
                                                if (altura < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (altura < 0);
                                            Cilindro cilindro = new Cilindro(altura,radio, result);
                                            cilindro.cilVolumen(altura,radio, result);
                                            System.out.println("\nEl resultado del volumrn es: " + df.format(cilindro.getResult()));

                                            break;
                                        case 3:
                                            double lado1=0, resultad=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado1 = sc.nextDouble();
                                                if (lado1 < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado1 < 0);
                                            TetraedroRegular tetraedro=new TetraedroRegular(lado1,resultad);
                                            tetraedro.volumwnTetraedro(lado1,resultad);
                                            System.out.println("\nEl resultado del volumen es: " + df.format(tetraedro.getResultado()));
                                            break;
                                        case 4:
                                            double rad=0, resu=0;
                                            do {
                                                System.out.print("\nIngrese el radio: ");
                                                rad = sc.nextDouble();
                                                if (rad < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (rad < 0);
                                            Esfera esfera=new Esfera(rad,resu);
                                            esfera.volumenEsfera(rad,resu);
                                            System.out.println("\nEl resultado del volumen es: " + df.format(esfera.getResul()));


                                            break;
                                        case 5:
                                            double olado=0, oresultado=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                olado = sc.nextDouble();
                                                if (olado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (olado < 0);
                                            Octaedro octaedro=new Octaedro(olado, oresultado);
                                            octaedro.volumwnOctaedro(olado,olado);
                                            System.out.println("\nEl resultado del volumen es: " + df.format(octaedro.getResultado()));



                                            break;
                                        case 6:
                                            double alturaP=0, ladoA, ladoB ,resultaP =0;
                                            do {
                                                System.out.print("\nIngrese la altura A: ");
                                                ladoA = sc.nextDouble();
                                                if (ladoA < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoA < 0);
                                            do {
                                                System.out.print("\nIngrese la altura B: ");
                                                ladoB = sc.nextDouble();
                                                if (ladoB < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoB < 0);
                                            do {
                                                System.out.print("\nIngrese la altura: ");
                                                alturaP = sc.nextDouble();
                                                if (alturaP < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (alturaP < 0);
                                            PrismaRegular prismaRegular=new PrismaRegular(ladoA,ladoB, alturaP, resultaP);
                                            prismaRegular.volumenPrismaRegular(ladoA,ladoB,alturaP,resultaP);
                                            System.out.println("\nEl resultado del volumrn es: " + df.format(prismaRegular.getResultado()));


                                            break;
                                        case 7:
                                            double ladoG=0, radioC=0, alturaC=0 ,resultadoC=0;
                                            do {
                                                System.out.print("\nIngrese el lado del cono: ");
                                                ladoG = sc.nextDouble();
                                                if (ladoG < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (ladoG < 0);
                                            do {
                                                System.out.print("\nIngrese el radio : ");
                                                radioC = sc.nextDouble();
                                                if (radioC < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (radioC < 0);

                                            Cono cono=new Cono(ladoG,radioC, alturaC, resultadoC);
                                            cono.volumenCono(ladoG,radioC,alturaC,resultadoC);
                                            System.out.println("\nEl resultado del volumen es: " + df.format(cono.getResultado()));


                                            break;
                                        case 8:
                                            double G,g,altura12,resultado13=0;
                                            do{
                                                System.out.print("\nIngrese el radio uno: ");
                                                G=sc.nextDouble();
                                                if (G <0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (G <0);
                                            do{
                                                System.out.print("Ingrese el radio dos: ");
                                                g=sc.nextDouble();
                                                if (g<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (g <0);
                                            do{
                                                System.out.print("Ingrese la altura: ");
                                                altura12=sc.nextDouble();
                                                if (altura12<0){
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            }while (altura12 <0);
                                            Tronco_cono t = new Tronco_cono(G,g,altura12,resultado13);
                                            t.Tronco_cono_Volumen(G,g,altura12);
                                            System.out.println("\nEl resultado del volumen es: " + df.format(t.getVolumen_TC()));
                                            break;
                                        case 9:

                                            break;
                                        case 10:

                                            break;
                                    }
                                    System.out.print("\nDesea realizar otro ejericio de volumenes 1.SI: ");
                                    contin = sc.nextInt();
                                }while(contin == 1);
                                break;
                        }
                        break;
                }
                System.out.print("\nDesea realizar algun otro ejercicio 1.SI: ");
                contin = sc.nextInt();
            }while(contin == 1);
        } catch(Exception e){
            System.out.println("Ingreso Erroneo de Datos " + e.getMessage());
        } finally{
            System.out.println("El a Programa Finalizado!!!!");
        }

    }

}