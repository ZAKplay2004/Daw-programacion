package Trimestre1.T05.pruebas;
import java.util.Scanner;

public class GestionPeliculas {
    // Constantes para los nombres de usuario y contraseñas
    private static final String USUARIO = "usuario";
    private static final String CONTRASENA_USUARIO = "usuario";
    private static final String ADMIN = "admin";
    private static final String CONTRASENA_ADMIN = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario, contrasena;

        // Sistema de login
        System.out.print("Usuario: ");
        nombreUsuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        contrasena = scanner.nextLine();

        // Comprobar credenciales
        if (nombreUsuario.equals(USUARIO) && contrasena.equals(CONTRASENA_USUARIO)) {
            menuUsuario();
        } else if (nombreUsuario.equals(ADMIN) && contrasena.equals(CONTRASENA_ADMIN)) {
            menuAdmin();
        } else {
            System.out.println("Credenciales incorrectas. Saliendo del programa.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Menú para el usuario normal
    public static void menuUsuario() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.- Películas");
            System.out.println("2.- Configuración usuario");
            System.out.println("0.- Salir");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuPeliculasUsuario();
                    break;
                case 2:
                    menuConfiguracionUsuario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    }

    // Menú para el usuario normal - Películas
    public static void menuPeliculasUsuario() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.- Casablanca");
            System.out.println("2.- El padrino");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    break; // Volver al menú anterior
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    }

    // Menú para el usuario normal - Configuración
    public static void menuConfiguracionUsuario() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.- Cambiar nombre usuario");
            System.out.println("2.- Cambiar contraseña");
            System.out.println("0.- Volver");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    break; // Volver al menú anterior
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    }

    // Menú para el administrador
    public static void menuAdmin() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.- Administrar películas");
            System.out.println("2.- Administrar usuarios");
            System.out.println("0.- Salir");
            System.out.println("-------------------------");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    }
}

    // Menú para el administrador - Administrar películas
