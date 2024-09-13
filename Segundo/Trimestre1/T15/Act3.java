package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act3 {
    //Dada una lista de cadenas, convierte todas a mayúsculas usando programación funcional.

    public static void main(String[] args) {
        List <String> palabras = Arrays.asList("una", "cadena", "de", "caracteres");
        List<String> mayusculas = palabras.stream()
                .map(String::toUpperCase)
                .toList();



        System.out.println(mayusculas);
    }
}
