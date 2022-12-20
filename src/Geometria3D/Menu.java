/*
package Geometria3D;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
    static Scanner sc=new Scanner(System.in);
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
                                            double lado=0, r=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            System.out.println("Ingrese el lado de su cubo: ");
                                            lado= sc.nextDouble();
                                            Cubo cubo=new Cubo(lado,r);
                                            cubo.area();
                                            System.out.println("EL area del cubo es: "+cubo.getResultado());
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
                                            cilindro.area();
                                            System.out.println("\nEl resultado del area es: " + df.format(cilindro.getResultado()));


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
                                            tetraedro.altura();
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
                                            esfera.area();
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
                                            octaedro.altura();
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
                                            prismaRegular.area();
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

                                            Cono cono=new Cono(ladoG,radioC,alturaC,resultadoC);
                                            cono.altura();
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
                                            co.Tronco_cono_Lateral();
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
                                            double lado=0,r=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            Cubo cubo = new Cubo(lado,r);
                                            cubo.perimetro();
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
                                            cilindro.perimetro();
                                            System.out.println("\nEl resultado del perimetro es: " + df.format(cilindro.getResultado()));
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
                                            tetraedro.area();
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
                                            esfera.perimetro();
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
                                            octaedro.area();
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
                                            prismaRegular.perimetro();
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

                                            Cono cono=new Cono(ladoG,radioC,alturaC,resultadoC);
                                            cono.area();
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
                                            co.Tronco_cono_Lateral();
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
                                            double lado=0,r=0;
                                            do {
                                                System.out.print("\nIngrese el lado: ");
                                                lado = sc.nextDouble();
                                                if (lado < 0) {
                                                    System.out.println("\nEl valor ingresado es incorrecto vuelva a intentarlo por favor");
                                                }
                                            } while (lado < 0);
                                            System.out.println("Ingrese el lado de su cubo: ");
                                            lado= sc.nextDouble();
                                            Cubo cubo=new Cubo(lado,r);
                                            cubo.volumen();
                                            System.out.println("El volumen del cubo es: "+cubo.getResultado());
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
                                            cilindro.volumen();
                                            System.out.println("\nEl resultado del volumrn es: " + df.format(cilindro.getResultado()));

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
                                            tetraedro.volumen();
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
                                            esfera.volumen();
                                            System.out.println("\nEl resultado del volumen es: " + df.format(esfera.getResultado()));


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
                                            octaedro.volumen();
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
                                            prismaRegular.volumen();
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

                                            Cono cono=new Cono(ladoG,radioC,alturaC,resultadoC);
                                            cono.volumen();
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


*/