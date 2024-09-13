package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Act4 {
    //Dada una lista de enteros, usa programación funcional para encontrar el número máximo.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,40,9);

        List<Integer> numMax = numeros.stream()
                .max(Integer::compareTo)
                .map(Collections::singletonList)
                .orElse(Collections.emptyList());
        System.out.println(numMax);
    }
}
