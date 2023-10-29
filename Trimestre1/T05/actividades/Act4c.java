package Trimestre1.T05.actividades;

import java.util.Scanner;
public class Act4c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime un color");
        String color = reader.nextLine();
        color =color.trim();
        switch (color.toLowerCase()) {
            case ("rojo") -> System.out.println("El color de la sangre");
            case "azul" -> System.out.println("El color del cielo");
            case "amarillo" -> System.out.println("El color del sol");
            default -> System.out.println("Ese color es muy aburrido");
        }
    }
}