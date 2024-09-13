package Primero.Trimestre1.Examenes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenLuis {

    public static int opcion;
    public static int opcionMenu;

    public static void main(String[] args) {
        do {
            Scanner reader = new Scanner(System.in);
            showMenu();
            opcion = reader.nextInt();
            executeOption();
        } while (opcion != 0);
    }

    static void showMenu() {
        System.out.println("Menú examen: ");
        System.out.println("1.- Mostrar números primos hasta el 100");
        System.out.println("2.- Contar una letra en una frase");
        System.out.println("3.- Dibujar cara");
        System.out.println("4.- Palabras B/V");
        System.out.println("5.- Contar herramientas");
        System.out.println("0.- Salir");
        System.out.println("-------------------------");
        System.out.print("Opción: ");
    }

    static void executeOption() {
        switch (opcion) {
            case 1 -> muestraPrimos();
            case 2 -> contarLetra();
            case 3 -> dibujarCara();
            case 4 -> Palabras();
            case 5 -> contarHerramientas();
        }
    }

    static void muestraPrimos() {
        do {
            System.out.println("Números primos del 1 al 100:");

            for (int i = 2; i <= 100; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
        } while (opcionMenu != 0);
        System.out.println();
    }

    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void contarLetra(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);
        int contador = contarLetraEnFrase(frase, letra);
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
    private static int contarLetraEnFrase(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
    static void dibujarCara() {
        int numCara = 0;
        System.out.print("Selecciona una expresión (1 - contento, 2 - triste): ");
        Scanner reader = new Scanner(System.in);
        numCara = reader.nextInt();
        if (numCara == 1) {
            int[][] carafeli = {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 2, 0, 0, 2, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0}
            };
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    if (carafeli[i][j] == 0) {
                        System.out.print("  ");
                    } else if (carafeli[i][j] == 1) {
                        System.out.print("X ");
                    } else if (carafeli[i][j] == 2) {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
        } else {
            int[][] caratris = {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 2, 0, 0, 2, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0}
            };
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    if (caratris[i][j] == 0) {
                        System.out.print("  ");
                    } else if (caratris[i][j] == 1) {
                        System.out.print("X ");
                    } else if (caratris[i][j] == 2) {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
        }
    }
    static void Palabras(){
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
    static void contarHerramientas(){
        String[] tools = {"martillo", "destornillador", "clavo", "martillo", "taladro", "martillo",
                "destornillador"};
        int numMartillo=0;
        int numDestornillador=0;
        int numClavo=0;
        int numTaladro=0;
        for (int i=0;i< tools.length;i++){
            if (tools[i].startsWith("m")) {
                numMartillo++;
            } else if (tools[i].startsWith("d")) {
                numDestornillador++;
            } else if ((tools[i].startsWith("c"))){
                numClavo++;
            }else {
                numTaladro++;
            }
        }
        System.out.println("Recuento de herramientas:");
        System.out.println("Clavos: " +numClavo);
        System.out.println("Martillos: " +numMartillo);
        System.out.println("Destornilladores: " +numDestornillador);
        System.out.println("Taladros: " +numTaladro);
    }
}
