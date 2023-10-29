package Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = reader.nextInt();
        if (edad >= 18)
            System.out.printf("Puedes pasar");
        else
            System.out.printf("No puedes pasar");
    }
}
