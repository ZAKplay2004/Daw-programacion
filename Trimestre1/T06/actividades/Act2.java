package Trimestre1.T06.actividades;

import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        Scanner reader = new Scanner(System.in);
        System.out.println("1.- Opcion A");
        System.out.println("2.- Opcion B");
        System.out.println("3.- Opcion C");
        System.out.println("--------------------");
        System.out.print("Opcion: ");

        opcion = reader.nextInt();

        switch (opcion){
            case 1 -> System.out.println("Ha elegido la opcion A");
            case 2 -> System.out.println("Ha elegido la opcion B");
            case 3 -> System.out.println("Ha elegido la opcion C");
        }

    }
}
