package Primero.Trimestre1.practicas;
import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fallos = 3;


        while (fallos>0) {
            System.out.print("Introduce si eres usuario o admin: ");
            String user = reader.nextLine();
            switch (user) {
                case "usuario":
                    System.out.print("Contraseña: ");
                    String contraUs = reader.nextLine();
                    if (user.equals(contraUs)) {
                        MenuUsuario();
                        break;
                    } else {
                        fallos--;
                    }
                    break;
                case "admin":
                    System.out.print("Contraseña: ");
                    String contraAdm = reader.nextLine();
                    if (user.equals(contraAdm)) {
                        MenuAdmin();
                        break;
                    } else {
                        fallos--;
                    }
                    break;
                default: fallos--;
            }
            if (fallos == 0) {
                System.out.println("Has agotado tus intentos. Saliendo del programa.");
            }
        }

        }public static void MenuUsuario (){
        int opcion;
        Scanner reader = new Scanner(System.in);

        System.out.println("Menú de Usuario:");
        System.out.println("1.- Películas");
        System.out.println("2.- Configuración usuario");
        System.out.println("0.- Salir");
        System.out.println("-------------------------");
        System.out.print("Opción: ");

        opcion = reader.nextInt();

        switch (opcion) {
            case 1:
                MenuUsuPelis();
                break;
            case 2:
                MenuUsuConfiguracion();
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void  MenuUsuPelis (){
        int opcion;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Menú de Peliculas:");
            System.out.println("1.- Casablanca");
            System.out.println("2.- El padrino");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = reader.nextInt();

            switch (opcion) {
                case 0:
                    MenuUsuario();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion !=0);
    }
    public static void MenuUsuConfiguracion () {
        int opcion;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Menú de Configuracion de usuario:");
            System.out.println("1.- Cambiar nombre de usuario");
            System.out.println("2.- Cambiar password ");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = reader.nextInt();

            switch (opcion) {
                case 0:
                    MenuUsuario();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion !=0);
    }
    public static void MenuAdmin () {
        int opcion;
        Scanner reader = new Scanner(System.in);

        System.out.println("Menú de Administrador:");
        System.out.println("1.- Administrar películas");
        System.out.println("2.- Administrar usuarios");
        System.out.println("0.- Salir");
        System.out.println("-------------------------");
        System.out.print("Opción: ");


        opcion = reader.nextInt();

        switch (opcion) {
            case 1:
                MenuAdmPelis();
                break;
            case 2:
                MenuAdmUsuarios();
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static void MenuAdmPelis () {
        int opcion;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Menú de administracion de peliculas:");
            System.out.println("1.- Añadir pelicula");
            System.out.println("2.- Modificar pelicula ");
            System.out.println("3.- Borrar pelicula");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = reader.nextInt();

            switch (opcion) {
                case 0:
                    MenuAdmin();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion !=0);
    }
    public static void MenuAdmUsuarios () {
        int opcion;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Menú de administracion de usuarios:");
            System.out.println("1.- Añadir usuario");
            System.out.println("2.- Borrar usuario ");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = reader.nextInt();

            switch (opcion) {
                case 0:
                    MenuAdmin();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion !=0);
    }
}