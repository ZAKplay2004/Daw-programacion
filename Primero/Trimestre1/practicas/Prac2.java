package Primero.Trimestre1.practicas;

import java.util.Scanner;
public class Prac2 {

    public static String user;
    public static String contra;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fallos = 3;
        while (fallos > 0) {

            System.out.print("Introduce si eres usuario o admin: ");
            user = scanner.nextLine();
            System.out.print("Contraseña: ");
            contra = scanner.nextLine();
            int resultado = checkUser(user, contra);
            switch (resultado) {
                case 0:
                    buildMainMenu(scanner,"user");
                    break;
                case 1:
                    buildMainMenu(scanner, "admin");
                    break;
                default:
                    fallos--;
            }

        }if (fallos == 0) {
            System.out.println("Has agotado tus intentos. Saliendo del programa.");
        }
    }

    public static int checkUser(String user, String contra) {
        switch (user) {
            case "usuario":
                if (user.equals(contra)) {
                    return 0;
                } else {
                    return -1;
                }
            case "admin":
                if (user.equals(contra)) {
                    return 1;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
    }
    public static void buildMainMenu (Scanner scanner, String rol) {
        int nivelMenu = 0;
        int opcion;

        while (true) {
            switch (rol) {
                case "user":
                    nivelMenu = buildUserMenu(nivelMenu, scanner);
                    break;
                case "admin":
                    nivelMenu = buildAdminMenu(nivelMenu, scanner);
                    break;
            }
            if (nivelMenu == -1) {
                return;
            }
        }
    }
    public static int buildUserMenu(int nivelMenu, Scanner scanner) {
        switch (nivelMenu) {
            case 0:
                System.out.println("Menú de Usuario");
                System.out.println("1.- Películas");
                System.out.println("2.- Configuración usuario");
                System.out.println("0.- Salir");
                break;
            case 1:
                System.out.println("Menú de Películas");
                System.out.println("1.- Casablanca");
                System.out.println("2.- El Padrino");
                System.out.println("0.- Volver");
                break;
            case 2:
                System.out.println("Menú de Configuración de Usuario");
                System.out.println("1.- Cambiar nombre de usuario");
                System.out.println("2.- Cambiar contraseña");
                System.out.println("0.- Volver");
                break;
        }
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());

        if (nivelMenu == 0) {
            if (opcion == 1) {
                return 1;
            } else if (opcion == 2) {
                return 2;
            } else if (opcion == 0) {
                return -1;
            }
        } else if (nivelMenu == 1) {
            if (opcion == 0) {
                return 0;
            }
        } else if (nivelMenu == 2) {
            if (opcion == 0) {
                return 0;
            }
        }
        return nivelMenu;
    }

    public static int buildAdminMenu(int nivelMenu, Scanner scanner) {
        switch (nivelMenu) {
            case 0:
                System.out.println("Menú de Administrador");
                System.out.println("1.- Administrar películas");
                System.out.println("2.- Administrar usuarios");
                System.out.println("0.- Salir");
                break;
            case 1:
                System.out.println("Menú de Administración de Películas");
                System.out.println("1.- Añadir película");
                System.out.println("2.- Modificar película");
                System.out.println("3.- Borrar película");
                System.out.println("0.- Volver");
                break;
            case 2:
                System.out.println("Menú de Administración de Usuarios");
                System.out.println("1.- Añadir usuario");
                System.out.println("2.- Borrar usuario");
                System.out.println("0.- Volver");
                break;
        }
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());

        if (nivelMenu == 0) {
            if (opcion == 1) {
                return 1;
            } else if (opcion == 2) {
                return 2;
            } else if (opcion == 0) {
                return -1;
            }
        } else if (nivelMenu == 1 || nivelMenu == 2) {
            if (opcion == 0) {
                return 0;
            }
        }

        return nivelMenu;
    }
}


