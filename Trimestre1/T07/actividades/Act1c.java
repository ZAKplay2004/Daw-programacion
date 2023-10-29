package Trimestre1.T07.actividades;

public class Act1c {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = numeros[i] * numeros[i];
            }

            System.out.print("El array con los cuadrados de los números es: {");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                if (i < numeros.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }

