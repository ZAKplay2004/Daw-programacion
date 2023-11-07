package Trimestre1.Examenes;

import java.util.*;

public class Examen1 {
    public static int opcion;
    public static int opcionMenu;

    public static void main(String[] args) {
        do {
            Scanner reader = new Scanner(System.in);
            showMenu();
            opcion = reader.nextInt();
            ejecuta();
        } while (opcion != 0);
    }

    static void showMenu() {
        System.out.println("Menú examen: ");
        System.out.println("1.- Numeros pares");
        System.out.println("2.- Listamayores de edad");
        System.out.println("3.- Matriz");
        System.out.println("4.- Cifrar texto");
        System.out.println("5.- Superhéroes");
        System.out.println("0.- Salir");
        System.out.println("-------------------------");
        System.out.print("Opción: ");
    }

    static void ejecuta() {
        switch (opcion) {
            case 1 -> muestraPares();
            case 2 -> edad();
            case 3 -> matriz();
            case 4 -> Cifrado();
            case 5 -> Supers();
        }
    }

    static void muestraPares() {
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Menú examen: ");
            System.out.println("1.- Mostrar numeros pares hasta el 100");
            System.out.println("2.- Mostrar numeros pares hasta un numero elegido");
            System.out.println("0.- Atras");
            System.out.println("-------------------------");
            System.out.print("Opción: ");
            opcionMenu = reader.nextInt();
            if (opcionMenu == 1) {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                        i++;
                    }
                    ;
                }
                System.out.println();
            } else if (opcionMenu == 2) {
                System.out.print("Introduce un numero: ");
                int numero = reader.nextInt();
                for (int i = 1; i <= numero; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                        i++;
                    }
                    ;
                }
                System.out.println();
            }
        } while (opcionMenu != 0);
    }

    static void edad() {
        Map<String, Integer> personas = new HashMap<>();
        personas.put("Juan", 25);
        personas.put("María", 18);
        personas.put("Luis", 30);
        personas.put("Ana", 16);
        personas.put("Carlos", 22);
        personas.put("Elena", 21);


        StringBuilder nombresMayores = new StringBuilder("Personas mayores de edad: ");
        for (Map.Entry<String, Integer> entry : personas.entrySet()) {
            if (entry.getValue() >= 18) {
                nombresMayores.append(entry.getKey()).append(" ");
            }
        }
        System.out.println(nombresMayores.toString().trim());
    }

    static void matriz() {
        int[][] miMatriz = creaMatriz();
        muestraMatriz(miMatriz);
    }

    public static int[][] creaMatriz() {
        int[][] matriz = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else if (i < j) {
                    matriz[i][j] = random.nextInt(5) * 2 + 1;
                    if (matriz[i][j] == 1) {
                        matriz[i][j] = matriz[i][j] + 2;
                    }
                } else {
                    matriz[i][j] = random.nextInt(4) * 2 + 2;
                }
            }
        }
        System.out.println();
        return matriz;
    }

    public static void muestraMatriz(int[][] matriz) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void Cifrado() {
        Scanner reader=new Scanner(System.in);
        System.out.print("Introduce un texto a cifrar: ");
        String texto = reader.nextLine();

        String textoCifrado = cifrarCesar(texto, 3);

        System.out.println("Texto cifrado: " + textoCifrado);

    }
    public static String cifrarCesar(String texto, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                caracter = (char) (base + (caracter - base + desplazamiento) % 26);
            }

            resultado.append(caracter);
        }

        return resultado.toString();
    }

    static void Supers() {
        List<String> Aliados = new ArrayList<>();
        List<String> Enemigos = new ArrayList<>();
        do {

            Scanner reader = new Scanner(System.in);
            System.out.println("1.- Añadir aliado");
            System.out.println("2.- Añadir enenmigo");
            System.out.println("0.- Salir");
            System.out.println("--------------");
            System.out.print("Opción: ");
            opcionMenu = reader.nextInt();
           switch (opcionMenu) {
                case 1:
                    System.out.print("Nombre del aliado: ");
                    String aliado = reader.next();
                    Aliados.add(aliado);
                    break;
                case 2:
                    System.out.print("Nombre del enemigo: ");
                    String enemigo = reader.next();
                    Enemigos.add(enemigo);
                    break;
                case 0:
                    System.out.print("Lista de aliados:");
                    for (String aliados : Aliados) {
                        System.out.print(aliados +" ");
                    }System.out.println();
                    System.out.print("Lista de enemigos:");
                    for (String enemigos : Enemigos) {
                        System.out.print(enemigos +" ");
                    }System.out.println();
                    break;
            }
        }while (opcionMenu != 0);
    }
}


