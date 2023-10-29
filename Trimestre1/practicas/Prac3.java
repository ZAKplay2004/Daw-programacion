package Trimestre1.practicas;

import java.util.Scanner;
import java.util.Random;
public class Prac3 {
    public static int TamañoMapa=8;
    public static int[][] tablero=  new int[TamañoMapa][TamañoMapa];
    public static int Barcos=6;
    public static int BarcosUndidos=0;
    public static int Disparos=20;
    public static int DisparosUsados=0;

    public static void main(String[] args) {
     IniciarMapa();
     ColocarBarcos();
     tablero();
     Scanner reader = new Scanner(System.in);

     while (DisparosUsados<Disparos && BarcosUndidos!=Barcos){
         System.out.println("Disparos restantes: " +(Disparos-DisparosUsados));
         System.out.print("Seleccion una columna entre (1-" +TamañoMapa +"): ");
         int columna= reader.nextInt();
         System.out.print("Seleccion una fila entre (1-" +TamañoMapa +"): ");
         int fila= reader.nextInt();

         if (Disparar(fila, columna)){
             DisparosUsados++;
             if (tablero[fila - 1][columna - 1] == 1) {
                 System.out.println("¡Barco hundido!");
                 tablero[fila - 1][columna - 1] = 3;
                 BarcosUndidos++;
             } else {
                 System.out.println("Agua.");
                 tablero[fila - 1][columna - 1] = 2;
             }
             tablero();
         }else {
             System.out.println("Error: Disparo inválido. Introduce una fila y columna válidas.");
         }

     }
    }
    static void IniciarMapa(){
        for (int i = 0; i < TamañoMapa; i++) {
            for (int j = 0; j < TamañoMapa; j++) {
                tablero[i][j] = 0;
            }
        }
    }
    static void ColocarBarcos(){
        Random random =new Random();
        int barcosColocados =0;
        while (barcosColocados<Barcos){
            int fila= random.nextInt(TamañoMapa);
            int columna = random.nextInt(TamañoMapa);
            if (tablero[fila][columna]==0){
                tablero[fila][columna]=1;
                barcosColocados++;
            }
        }

    }
    static void tablero (){
        System.out.println("Tablero:");
        for (int i = 0; i<TamañoMapa;i++){
            for (int j =0; j<TamañoMapa; j++){
                if (tablero[i][j] == 0 || tablero[i][j] == 1) {
                    System.out.print("X ");
                } else if (tablero[i][j] == 2) {
                    System.out.print("- ");
                } else if (tablero[i][j] == 3) {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    static boolean Disparar(int fila, int columna){
        return fila >= 1 && fila <= TamañoMapa && columna >= 1 && columna <= TamañoMapa
                && tablero[fila - 1][columna - 1] != 2 && tablero[fila - 1][columna - 1] != 3;
    }
}