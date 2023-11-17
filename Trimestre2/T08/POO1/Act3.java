package Trimestre2.T08.POO1;

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
