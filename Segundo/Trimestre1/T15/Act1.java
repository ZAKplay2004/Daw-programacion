package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3);

        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("La suma es: " + suma);
    }

}
