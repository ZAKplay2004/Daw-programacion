package Primero.Trimestre1.T07.actividades;

import java.util.Scanner;
public class Act3c {
    public static void main(String[] args) {
        boolean[][] matriz1 = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };
        boolean[][] matriz2 = {
                {false, false, false, false, true},
                {false, false, false, true, true},
                {false, false, true, false, true},
                {false, true, false, false, true},
                {true, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario: ");
        String numeroBinario = scanner.nextLine();

             for (int i = 0; i < 10; i++) {
            char bit = (i < numeroBinario.length()) ? numeroBinario.charAt(numeroBinario.length() - 1 - i) : ' ';

            if (bit == '0') {
                mostrarMatriz(matriz1);
            } else if (bit == '1') {
                mostrarMatriz(matriz2);
            } else {
                System.out.println(" ");
            }
        }
    }
    public static void mostrarMatriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}