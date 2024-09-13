package Primero.Trimestre1.T06.actividades;

import java.util.Scanner;
public class Act5b {
    public static double CalcArea ( double lado){
        return lado*lado;
    }
    public static double CalcArea (double base, double altura){
        return  (base*altura)/2;
    }
    public static void Menu(){
        Scanner reader =new Scanner(System.in);
        int opcion;
        System.out.println("De que deseas calcular el area: ");
        System.out.println("1-Cuadrado.");
        System.out.println("2-Triangulo.");
        System.out.println("----------------------");
        System.out.print("Opcion: ");
        opcion= reader.nextInt();
        do {
            switch (opcion){
                case 1 :
                    System.out.print("Introduzca el valor del lado del cuadrado: ");
                    double ladoCuadrado = reader.nextInt();
                    double areaC= CalcArea(ladoCuadrado);
                    System.out.println("El area del cuadrado es " +areaC);
                    break;
                case 2:
                    System.out.print("Introduzca el valor de la altura del triangulo: ");
                    double alturaTriangulo = reader.nextInt();
                    System.out.print("Introduzca el valor de la base del triangulo: ");
                    double baseTriangulo= reader.nextInt();
                    double areaT= CalcArea(baseTriangulo,alturaTriangulo);
                    System.out.println("El area del cuadrado es " +areaT);
                    break;
            }
        }while (opcion ==0);
    }

    public static void main(String[] args) {
        Menu();
    }
}
