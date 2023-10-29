package Trimestre1.T03.Actividades;

import java.util.Scanner;

public class Act1c {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Cual es la altura?");
        float altura = reader.nextInt();
        System.out.println("Cual es la base?");
        int base = reader.nextInt();
        float area = ((base * altura) / 2);
        System.out.println("El area del triangulo es " + area);
    }
}
