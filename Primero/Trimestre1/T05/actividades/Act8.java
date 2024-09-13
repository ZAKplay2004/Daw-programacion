package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su tabla de multiplicar");
        int numero = reader.nextInt();
        for (int i =1; i <=10; i++){
            int resultado =numero*i;
            System.out.println(numero+ "*"+ i+ "="+ resultado);
        }
    }
}
