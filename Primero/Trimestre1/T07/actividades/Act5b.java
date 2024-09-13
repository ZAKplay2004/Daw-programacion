package Primero.Trimestre1.T07.actividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act5b {
    public static void main(String[] args) {
        String[] Alumnos = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        List<String> aprobados = new ArrayList<>();

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < Alumnos.length; i++) {
            System.out.print("Introduce la nota para " + Alumnos[i] + ": ");
            double notas = reader.nextDouble();
            if (notas >4.0){
                aprobados.add(Alumnos[i]);
            }
        }

        if (!aprobados.isEmpty()) {
            System.out.println("Alumnos aprobados:");
            for (String alumno : aprobados) {
                System.out.println(alumno);
            }
        } else {
            System.out.println("Ningún alumno aprobado.");
        }
    }
}