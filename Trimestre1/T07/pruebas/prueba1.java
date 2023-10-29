package Trimestre1.T07.pruebas;

public class prueba1 {
    public static void main(String[] args) {
        boolean[][] matri = {
                {true, true, true, true, true, false, false, true, false, false, false, true, false, false, true,true,true,true,true, false, false,true, true, true, true, true},
                {true, false, false, false, true, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false,true, false, false, false, true},
                {true, false, false, false, true, false, false, true, false, false, false, true, false, false, false, false,true, false, false, false, false,true, false, false, false, true},
                {true, true, true, true, true, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false,true, false, false, false, true},
                {true, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false,true, false, false, false, true},
                {true, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false,true, false, false, false, true},
                {true, false, false, false, false, false, false, true,false, false, false, true, false, false, false, false, true, false, false, false, false,true, false, false, false, true},
                {true, false, false, false, false, false, false, true, true, true, true, true, false, false, false, false, true, false, false, false, false,true, true, true, true, true}
        };
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                if (matri[i][j]) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
