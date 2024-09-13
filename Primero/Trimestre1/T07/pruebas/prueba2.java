package Primero.Trimestre1.T07.pruebas;

import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto a cifrar: ");
        String texto = scanner.nextLine();

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
}