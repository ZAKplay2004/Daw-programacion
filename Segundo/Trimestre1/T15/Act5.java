package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act5 {
    //Dada una lista de enteros y un valor, cuenta cuántos elementos son mayores a ese valor.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer valor = 5;

        long count = numeros.stream()
                .filter(n -> n > valor)
                .count();

        System.out.println(count);
    }
}
