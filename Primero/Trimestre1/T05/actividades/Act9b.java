package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act9b {
    public static void main(String[] args) {
        int opcion = 1;
        while (opcion > 0) {
            System.out.println("0.- Salir");
            System.out.println("1.- Opcion A");
            System.out.println("2.- Opcion B");
            System.out.println("3.- Opcion C");
            System.out.println("--------------------");
            Scanner reader = new Scanner(System.in);
            System.out.print("Opcion: ");
             opcion = reader.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Ha elegido la opcion A");
                case 2 -> System.out.println("Ha elegido la opcion B");
                case 3 -> System.out.println("Ha elegido la opcion C");
            }
        }
    }
}
