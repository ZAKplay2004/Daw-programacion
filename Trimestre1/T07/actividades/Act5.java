package Trimestre1.T07.actividades;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        String[] Alumnos = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        double[] notas = new double[Alumnos.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Alumnos.length; i++) {
            System.out.print("Introduce la nota para " + Alumnos[i] + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < Alumnos.length; i++) {
            if (notas[i] >= 5.0) {
                System.out.println("El alumno " + Alumnos[i] + " está aprobado con nota " + notas[i]);
            }
        }
    }
}