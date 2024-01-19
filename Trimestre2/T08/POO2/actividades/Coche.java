package Trimestre2.T08.POO2.actividades;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int NumeroBastidor;

    public Coche(String marca, String modelo, String color, int NumeroBastidor) {
        this.modelo = modelo;
        this.marca=marca;
        this.color=color;
        this.NumeroBastidor=NumeroBastidor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroBastidor() {
        return NumeroBastidor;
    }

    public void setNumeroBastidor(int numeroBastidor) {
        NumeroBastidor = numeroBastidor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
