package Trimestre2.T08.POO1;

public class Coche {
    private String marca, modelo, color, frase;
    private int NumeroBastidor, velocidad = 0;

    public Coche(String marca, String modelo, String color, int NumeroBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.NumeroBastidor = NumeroBastidor;
        this.velocidad = 0;
    }

    public String Informacion() {
        return "Mi coche es un " + marca + " " + modelo + " de color " + color + " con número de bastidor " + NumeroBastidor;
    }
    public void aumentarVelocidad() {
        velocidad += 5;
    }
    public void reducirVelocidad() {
        velocidad -= 5;
        velocidad = Math.max(0, velocidad);
    }
    public void aumentarVelocidad2(int incremento) {
        velocidad += incremento;
    }
    public void reducirVelocidad2(int decrecimiento) {
        velocidad -= decrecimiento;
        velocidad = Math.max(0, velocidad);
    }
    public int obtenerVelocidad() {
        return velocidad;
    }

    public int getNumeroBastidor() {
        return NumeroBastidor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", frase='" + frase + '\'' +
                ", NumeroBastidor=" + NumeroBastidor +
                ", velocidad=" + velocidad +
                "} \n";
    }
}
