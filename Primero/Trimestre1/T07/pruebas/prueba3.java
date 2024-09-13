package Primero.Trimestre1.T07.pruebas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prueba3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Introduce un texto a cifrar: ");
        String texto = reader.nextLine();

        String textoCifrado = cifradoCesar(texto, 3);

        System.out.println("Texto cifrado: " + textoCifrado);
    }
    public static String cifradoCesar(String texto, int desplazamiento) {
        // Crea un mapa que mapea las letras del alfabeto a sus posiciones.
        Map<Character, Integer> alfabeto = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alfabeto.put((char) (i + 'a'), i);
        }

        // Cifra el texto.
        StringBuilder cifrado = new StringBuilder();
        for (char letra : texto.toCharArray()) {
            int posicion = alfabeto.get(letra);
            cifrado.append((char) ((posicion + desplazamiento) % 26 + 'a'));
        }

        return cifrado.toString();
    }
}