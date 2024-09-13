package Primero.Trimestre2.T08.POO1.actividades;

public class Act4 {
    public static void main(String[] args) {
        Coche miCoche=new Coche("kia","Niro","gris",123456);
        miCoche.aumentarVelocidad2(8);
        miCoche.reducirVelocidad2(3);
        System.out.println("Velocidad: "+miCoche.obtenerVelocidad());
    }
}
