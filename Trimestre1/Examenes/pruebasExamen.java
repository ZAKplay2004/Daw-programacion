package Trimestre1.Examenes;
import java.util.ArrayList;
import java.util.Scanner;
public class pruebasExamen {
    public static void main(String[] args) {
        ArrayList<String> palabrasB = new ArrayList<>();
        ArrayList<String> palabrasV = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comience con B o V (o escriba 'salir' para terminar): ");
        while (true) {
            String palabra = scanner.nextLine().toLowerCase();

            if (palabra.equals("salir")) {
                break;
            }

            if (palabra.startsWith("b")) {
                palabrasB.add(palabra);
            } else if (palabra.startsWith("v")) {
                palabrasV.add(palabra);
            } else {
                System.out.println("La palabra no comienza con B o V. Inténtelo de nuevo.");
            }
        }
        System.out.println("Palabras que comienzan con B:");
        for (String palabra : palabrasB) {
            System.out.println(palabra);
        }
        System.out.println("Palabras que comienzan con V:");
        for (String palabra : palabrasV) {
            System.out.println(palabra);
        }
    }
}



