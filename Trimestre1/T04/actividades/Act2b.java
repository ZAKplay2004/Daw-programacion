package Trimestre1.T04.actividades;

import java.lang.Math;
import java.util.Scanner;
public class Act2b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float  NUMERO = reader.nextInt();
        System.out.println("raíz cuadrada =" + String.format("%.2f",(Math.sqrt (NUMERO))));
    }
}