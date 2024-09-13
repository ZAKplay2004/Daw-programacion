package Primero.Trimestre1.T07.actividades;

import java.util.Scanner;

public class Act3d {
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

        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroBinario = decimalToBinary(numeroDecimal);

        for (int i = 0; i < 8; i++) {
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

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "00000000";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        while (binary.length() < 8) {
            binary.insert(0, '0');
        }

        return binary.toString();
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