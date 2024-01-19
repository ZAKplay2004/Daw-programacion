package Trimestre2.T08.POO2.actividades;

public class Act2 {
    public static void main(String[] args) {
        Coche coche = new Coche("kia", "mini", "rojo", 123456);
        System.out.println("La marca es "+ coche.getMarca() + ", el modelo es "+ coche.getModelo()+ ", el color es "+ coche.getColor()+" y el numero de bastidor es "+ coche.getNumeroBastidor());
    }
}
