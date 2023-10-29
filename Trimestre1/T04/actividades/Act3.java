package Trimestre1.T04.actividades;

import java.lang.Math;
import java.util.Scanner;
public class Act3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float  NUMERO = reader.nextInt();
        System.out.println("A que lo elevamos?");
        float  potencia = reader.nextInt();
        System.out.println("Resultado=" + String.format("%.2f",(Math.pow (NUMERO, potencia))));
    }
}