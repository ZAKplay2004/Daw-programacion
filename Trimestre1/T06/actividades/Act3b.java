package Trimestre1.T06.actividades;

import java.util.Scanner;
public class Act3b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        int num1 = reader.nextInt();
        System.out.print("Dime el segundo numero: ");
        int num2 = reader.nextInt();

        int Mayor =numMayor(num1, num2);
        System.out.println("El numero mas grande es "+ Mayor);
    }
    public static int numMayor(int num1, int num2){
        if (num1>num2){
            return 1;
        }else if (num1<num2) {
            return -1;
        } else return 0;
    }
}

