package Primero.Trimestre2.T08.POO1.actividades;

public class Act3 {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Kia", "Niro", "gris", 123456);
        miCoche.aumentarVelocidad();
        miCoche.aumentarVelocidad();
        System.out.println("Velocidad: " + miCoche.obtenerVelocidad());
        miCoche.reducirVelocidad();
        System.out.println("Velocidad: " + miCoche.obtenerVelocidad());
    }
}
