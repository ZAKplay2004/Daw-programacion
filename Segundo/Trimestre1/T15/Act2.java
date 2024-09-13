package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act2 {
    //Dada una lista de enteros, devuelve una lista con solo los números pares.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(pares);
    }
}
