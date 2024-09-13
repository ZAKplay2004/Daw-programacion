package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act8b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su tabla de multiplicar");
        int numero = reader.nextInt();
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "*" + i + "=" + resultado);
            for (int e = 1; e <= resultado; e++) {
                suma += e;
            }
            System.out.println("Suma: " + suma);
            suma = 0;
        }
    }
}
