package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act5b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero para calcular su factorial");
        int numero = reader.nextInt();
        if (numero<0){
            System.out.println("El factorial no está definido para números negativos");
        } else {
            int factorial = 1;
            for (int i = 1; i<= numero; i++){
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
