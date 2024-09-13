package Primero.Trimestre1.T06.actividades;
import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int suma = sumar(num1, num2);
        int resta = restar(num1, num2);
        int multiplicacion = multiplicar(num1, num2);
        float division = dividir(num1, num2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static float dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0.0f;
        }
        return (float) a / b;
    }
}