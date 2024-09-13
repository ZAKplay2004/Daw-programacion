package Primero.Trimestre1.T07.actividades;

public class Act3b {
    public static void main(String[] args) {
        boolean[][] matriz1 = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };
        boolean[][] matriz2 = {
                {false, false, false, false, true},
                {false, false, false, true, true},
                {false, false, true, false, true},
                {false, true, false, false, true},
                {true, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true}
        };

        System.out.println("Primera Matriz:");
        mostrarMatriz(matriz1);
                System.out.println("\nSegunda Matriz:");
        mostrarMatriz(matriz2);
    }
    public static void mostrarMatriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
