package Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act6b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un nuero y te dire todos los numeros pares que hay desde 1 hasta ese numero");
        int numero = reader.nextInt();
        for (int i =1; i<=numero; i++) {
            if (i %2==0)
            {
                System.out.println(i);
                i++;
            } ;
        }
    }
}
