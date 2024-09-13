package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un numero para calcular su factorial");
        int numero = reader.nextInt();
        if (numero<0){
            System.out.println("El factorial no está definido para números negativos");
        } else {
        int factorial = 1;
        while (numero>0){
            factorial *= numero;
            numero--;
        }
            System.out.println("El factorial es " + factorial);
        }
    }
}
