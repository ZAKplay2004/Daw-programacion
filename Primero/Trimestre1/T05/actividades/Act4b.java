package Primero.Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act4b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un color");
        String color = reader.nextLine();
        switch (color.toLowerCase()) {
            case "rojo" -> System.out.println("El color de la sangre");
            case "azul" -> System.out.println("El color del cielo");
            case "amarillo" -> System.out.println("El color del sol");
            default -> System.out.println("Ese color es muy aburrido");
        }
    }
}