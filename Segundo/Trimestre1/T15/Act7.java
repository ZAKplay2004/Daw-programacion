package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;


public class Act7 {
    //Dada una lista de enteros, devuelve una lista con los cuadrados de cada número.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> cuadrados = numeros.stream()
                .map(n-> n*n)
                .toList();
        System.out.print(cuadrados);
    }
}
