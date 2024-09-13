package Primero.Trimestre2.T08.POO1.actividades;

public class Act6 {
    public static void main(String[] args) {
        Flota flota = new Flota();

        Coche coche1 = new Coche("Kia", "Niro", "gris", 123456);
        Coche coche2 = new Coche("Toyota", "Corolla", "azul", 789012);
        Coche coche3 = new Coche("Fiat", "Mini", "negro", 234567);

        flota.agregarCoche(coche1);
        flota.agregarCoche(coche2);
        flota.agregarCoche(coche3);

        System.out.println("Antes de eliminar:");
        System.out.println(flota);

        flota.eliminarCoche(789012);

        System.out.println("\nDespués de eliminar:");
        System.out.println(flota);
    }
}