package Trimestre1.T07.actividades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Act6 {

    public static void main(String[] args) {
        // Crear un mapa para almacenar nombres y notas de alumnos
        Map<String, Double> registroNotas = new HashMap<>();

        registroNotas.put("Juan", 8.5);
        registroNotas.put("María", 9.0);
        registroNotas.put("Pedro", 7.2);
        registroNotas.put("Ana", 8.8);

        Scanner scanner = new Scanner(System.in);

        for (String alumno : registroNotas.keySet()) {
            System.out.print("Ingrese la nota de " + alumno + ": ");
            double nota = scanner.nextDouble();
            registroNotas.put(alumno, nota);
        }
        System.out.println("Registro de notas de los alumnos:");
        for (Map.Entry<String, Double> entry : registroNotas.entrySet()) {
            String nombre = entry.getKey();
            double nota = entry.getValue();
            System.out.println(nombre + ": " + nota);
        }
    }
}