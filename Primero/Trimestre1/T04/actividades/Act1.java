package Primero.Trimestre1.T04.actividades;

import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        float  NUMERO1 = reader.nextInt();
        System.out.println("Intriduce el segundo número");
        float NUMERO2 = reader.nextInt();
        System.out.println(NUMERO1+ "+" + NUMERO2 + "=" + (NUMERO1+NUMERO2));
        System.out.println(NUMERO1+ "-" + NUMERO2 + "=" + (NUMERO1-NUMERO2));
        System.out.println(NUMERO1+ "*" + NUMERO2 + "=" + (NUMERO1*NUMERO2));
        System.out.println(NUMERO1+ "/" + NUMERO2 + "=" + (NUMERO1/NUMERO2));
        System.out.println(NUMERO1+ "%" + NUMERO2 + "=" + (NUMERO1%NUMERO2));
    }
}
