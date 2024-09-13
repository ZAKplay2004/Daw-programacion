package Primero.Trimestre1.T07.actividades;

public class Act1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < numeros.length; i++) {
            int cuadrado = numeros[i] * numeros[i];
            System.out.println("El cuadrado de " + numeros[i] + " es " + cuadrado);
        }
    }
}