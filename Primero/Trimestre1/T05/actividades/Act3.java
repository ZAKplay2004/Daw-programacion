package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = reader.nextInt();
        if (numero %2==0)
        {
            System.out.printf(numero+ " es par");
        }else {
            System.out.println(numero+ " es impar");
        }
    }
}
