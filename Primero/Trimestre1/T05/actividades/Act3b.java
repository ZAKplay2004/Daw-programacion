package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act3b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = reader.nextInt();
        String frase = (numero %2==0)? "Es par":"Es impar";
        System.out.printf(frase);
    }
}