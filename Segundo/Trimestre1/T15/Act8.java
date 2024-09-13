package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act8 {
    //Dada una lista de enteros, elimina los duplicados usando programación funcional.
    public static void main(String[] args) {
        List<Integer> numerosRepetidos = Arrays.asList(1,2,2,3,4,5,5,6,7,8,8,9,10);
        List<Integer> numeros = numerosRepetidos.stream()
                .distinct()
                .toList();
        System.out.println(numeros);
    }
}
