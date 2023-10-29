package Trimestre1.T07.actividades;

import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        int[] numeros =  new int[5];
        Scanner reader = new Scanner(System.in);
        for (int i= 0; i < 5; i++){
            System.out.print("Ingrese el valor de " +(i+1) +": ");
            numeros[i] = reader.nextInt();
        }
        System.out.print("El arrays ingreado es : {");
        for (int i= 0; i < 5; i++){
            System.out.print(numeros[i]);
            if (i<4){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
