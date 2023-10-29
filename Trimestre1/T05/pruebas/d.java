package Trimestre1.T05.pruebas;

import java.util.Scanner;
public class d {
    public static void main(String[] args) {

    }

    static void  menuPelis(String[] args) {
        int opcion;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Menú de Películas:");
            System.out.println("1.- Casablanca");
            System.out.println("2.- El padrino");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = reader.nextInt();

            switch (opcion) {
                case 0:
                    break; // Volver al menú anterior
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner

    }

}

