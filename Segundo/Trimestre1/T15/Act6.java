package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Act6 {
    //Dada una lista de cadenas, usa programación funcional para concatenar todas las cadenas en una sola.
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("super","cali","fragil","istico","espialidoso");
        List<String> palabra = Collections.singletonList(palabras.stream()
                .reduce("", (n, n2) -> n + n2));
                System.out.println(palabra);

    }
}
