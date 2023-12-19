package Trimestre2.T08.POO1;
import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Flota flota = new Flota();

        Coche coche1 = new Coche("Kia", "Niro", "gris", 123456);
        Coche coche2 = new Coche("Toyota", "Corolla", "azul", 789012);
        Coche coche3 = new Coche("Fiat", "Mini", "negro", 234567);

        flota.agregarCoche(coche1);
        flota.agregarCoche(coche2);
        flota.agregarCoche(coche3);

        Conductor conductor1 = new Conductor("Pepe");
        Conductor conductor2 = new Conductor("Dario");
        System.out.println(conductor1);
        System.out.println(conductor2);
        conductor1.asignarCoche(123456,flota);
        conductor2.asignarCoche(234567,flota);
        System.out.println(conductor1);
        System.out.println(conductor2);
    }
}
