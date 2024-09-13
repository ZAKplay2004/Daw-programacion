package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act10 {
    //Dada una lista de cadenas, cuenta cuántas empiezan con una letra específica.
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("casa","arbol","fragil","calle","farola");

        List<String> comienzanPorLaC = palabras.stream()
                .filter(name -> name.startsWith("c"))
                .toList();
        System.out.println(comienzanPorLaC);
    }
}
