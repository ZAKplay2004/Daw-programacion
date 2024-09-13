package Primero.Trimestre1.T07.actividades;

import  java.util.Scanner;
import  java.util.HashSet;
public class Act4d {
    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        HashSet<Integer> pares = new HashSet<>();
        HashSet<Integer> impares = new HashSet<>();
        do {
            System.out.print("Introduce un numero entero:");
            numero = reader.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    if (pares.contains(numero)) {
                        System.out.println("El número está repetido y no se añadirá al conjunto");
                    } else {
                        pares.add(numero);
                    }
                } else {
                    if (impares.contains(numero)) {
                        System.out.println("El número está repetido y no se añadirá al conjunto");
                    } else {
                        impares.add(numero);
                    }
                }
            }
        } while (numero != 0);
        System.out.println("El conjunto final de números pares es: " + pares);
        System.out.println("El conjunto final de números impares es: " + impares);
    }
}