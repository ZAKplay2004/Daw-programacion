package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = reader.nextInt();
        String frase= (edad>=18)? "Puedes pasar":"No puedes pasar" ;
        System.out.printf(frase);
    }
}
