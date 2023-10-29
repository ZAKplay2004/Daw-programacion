package Trimestre1.T07.actividades;

import  java.util.Scanner;
import  java.util.HashSet;
public class Act4b {
    public static void main(String[] args) {
        int numero;
        Scanner reader =new Scanner(System.in);
        HashSet<Integer> conjunto = new HashSet<>();
        do {
            System.out.print("Introduce un nu meroentero:");
            numero = reader.nextInt();
            if (numero !=0){
                conjunto.add(numero);
            }
        }while (numero !=0);
        System.out.println("El conjunto final es: " + conjunto);
    }
}