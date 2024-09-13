package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = reader.nextInt();
        System.out.println("Dim eun segundo numero");
        int numero2 = reader.nextInt();
        if (numero1>numero2)
            System.out.println(numero1+ "es el numero mas alto");
        else
            System.out.println(numero2+ " es el numero mas alto");
    }
}
