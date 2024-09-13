package Segundo.Trimestre1.T15;

import java.util.Arrays;
import java.util.List;

public class Act9 {
    //Dada una lista de enteros, devuelve el primer número que sea mayor a un valor dado.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer valor= 6;

        List<Integer> mayor = numeros.stream()
                .filter(n -> n > valor)
                .limit(1)
                .toList();
        System.out.println(mayor);


    }
}
