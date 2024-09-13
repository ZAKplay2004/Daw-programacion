package Primero.Trimestre2.T09.actividades;

import java.util.List;
import java.util.Scanner;

public class Act2 {
    public static int opcion;
    private static List<Product> productilst = List.of(
            new Book(1234, 23, "Dross", "Luna de plutón"),
            new Clothe(1235, 25,"Camiseta", "M","rojo"),
            new Book(1236, 15, "Kentaro Miura", "Maximum berserk")
    );

    public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            showMenu();
            opcion = reader.nextInt();
            ejecuta();

    }
   /* public static void  showProducts() {
        for(Product product);
    }*/
    static void showMenu(){
        System.out.println("Que productos quieres?");
        System.out.println("  1.- Todo");
        System.out.println("  2.- Libros");
        System.out.println("  3.- Ropa");
        System.out.println("  0.- Salir");
        System.out.println("---------------");
        System.out.print("Opción: ");
    }
    static void ejecuta(){
        switch (opcion) {
            case 1 -> todos();
            case 2 -> libros();
            case 3 -> ropa();
        }
    }
    static void todos(){
        System.out.println(productilst);
    }
    static void libros(){
        for (Product product : productilst) {
            if (product instanceof Book) {
                System.out.println(product);
            }
        }
    }
    static void ropa(){
        for (Product product : productilst) {
            if (product instanceof Clothe) {
                System.out.println(product);
            }
        }
    }
}


