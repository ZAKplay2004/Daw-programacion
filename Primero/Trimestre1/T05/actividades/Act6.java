package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un nuero y te dire todos los numeros pares que hay desde 1 hasta ese numero");
        int numero = reader.nextInt();
        while (numero>=1){
            if (numero %2==0)
            {
                System.out.println(numero);
                numero--;
            } else numero--;
        }
    }
}
