package Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act2b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = reader.nextInt();
        System.out.println("Dim eun segundo numero");
        int numero2 = reader.nextInt();
        String frase = (numero1>numero2)? "El primer numero es el mas alto":"El segundo numero es el mas alto";
        System.out.println(frase);
    }
}