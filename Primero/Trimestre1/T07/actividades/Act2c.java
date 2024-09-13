package Primero.Trimestre1.T07.actividades;

import  java.util.Scanner;
public class Act2c {
    public static int tamaño=0;
    public static int[] numeros;
    public static void main(String[] args) {
        tam();
        mostrar();
    }
    public static void tam(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el tmañano del array: ");
        tamaño = reader.nextInt();
        numeros = new int[tamaño];
        for (int i= 0; i < tamaño; i++){
            System.out.print("Ingrese el valor de " +(i+1) +": ");
            numeros[i] = reader.nextInt();
        }
    }
    public static void mostrar(){
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
