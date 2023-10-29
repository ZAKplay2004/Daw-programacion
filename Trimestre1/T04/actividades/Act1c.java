package Trimestre1.T04.actividades;

import java.util.Scanner;
public class Act1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        float  NUMERO1 = reader.nextInt();
        System.out.println("Intriduce el segundo número");
        float NUMERO2 = reader.nextInt();
        System.out.println("Suma =" + String.format("%.2f",(NUMERO1+NUMERO2)));
        System.out.println("Resta =" + String.format("%.2f",(NUMERO1-NUMERO2)));
        System.out.println("Multiplicación=" + String.format("%.2f",(NUMERO1*NUMERO2)));
        System.out.println("Division=" + String.format("%.2f",(NUMERO1/NUMERO2)));
        System.out.println("Resto=" + String.format("%.2f",(NUMERO1%NUMERO2)));
    }
}
