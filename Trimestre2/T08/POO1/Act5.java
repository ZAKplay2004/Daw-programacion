package Trimestre2.T08.POO1;

public class Act5 {
    public static void main(String[] args) {
        Flota flota = new Flota();

        Coche coche1 = new Coche("Kia", "Niro", "gris", 123456);
        Coche coche2 = new Coche("Toyota", "Corolla", "azul", 789012);

        flota.agregarCoche(coche1);
        flota.agregarCoche(coche2);

        System.out.println("Antes de eliminar:");
        flota.mostrarFlota();

       flota.eliminarCoche(789012);

        System.out.println("\nDespués de eliminar:");
        flota.mostrarFlota();
    }
}