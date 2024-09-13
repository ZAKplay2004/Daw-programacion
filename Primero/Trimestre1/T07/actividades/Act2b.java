package Primero.Trimestre1.T07.actividades;

import java.util.Scanner;
public class Act2b {
    public static int tamaño = 0;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el tmañano del array: ");
        tamaño = reader.nextInt();
        int[] numeros =  new int[tamaño];
        for (int i= 0; i < tamaño; i++){
            System.out.print("Ingrese el valor de " +(i+1) +": ");
            numeros[i] = reader.nextInt();
        }
        System.out.print("El arrays ingreado es : {");
        for (int i= 0; i < tamaño; i++){
            System.out.print(numeros[i]);
            if (i<(tamaño-1)){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
