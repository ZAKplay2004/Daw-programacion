package Primero.Trimestre1.T07.actividades;

import  java.util.Scanner;
import  java.util.HashSet;
public class Act4 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.print("Introduce el tamaño del conujunto: ");
        int tamañoConjunto = reader.nextInt();
        HashSet<Integer> conjunto = new HashSet<>();
        while (conjunto.size()<tamañoConjunto){
            System.out.print("Introduce un numeroentero:");
            int numero = reader.nextInt();
            conjunto.add(numero);
        }
        System.out.println("El conjunto final es: " + conjunto);
    }
}
