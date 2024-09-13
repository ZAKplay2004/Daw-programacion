package Primero.Trimestre1.T07.actividades;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act5c {
    public static List<String> aprobados = new ArrayList<>();
    public static List<String> suspendidos = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner reader = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1.- Añadir alumno");
            System.out.println("0.- Salir");
            System.out.println("--------------");
            System.out.print("Opción: ");
            opcion= reader.nextInt();
            switch (opcion){
                case 1:
                    AñadirAlumno();
                    break;
                case 0:
                    System.out.println("Alumnos aprobados:");
                    for (String alumno : aprobados) {
                        System.out.println(alumno);
                    }
                    System.out.println("Alumnos suspendidos:");
                    for (String alumno : suspendidos) {
                        System.out.println(alumno);
                    }break;
                default:
                    System.out.println("Opción invalda");
            }
        }while (opcion!=0);
    }
    public static void AñadirAlumno (){
        Scanner reader = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String alumno = reader.next();
        System.out.print("Nota de " +alumno +": ");
        int nota = reader.nextInt();
        if (nota >= 5) {
            aprobados.add(alumno);
        } else {
            suspendidos.add(alumno);
        }
    }
}