package Primero.Trimestre2.T08.POO1.actividades;

public class Conductor{
    String nombre;
    Coche coche;

    public Conductor (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public Coche getCoche(){
        return coche;
    }

    public void setCoche(Coche coche){
        this.coche= coche;
    }

    public void asignarCoche(int numeroBastidor, Flota flota) {
        Coche coche = flota.comprobarCoche(numeroBastidor);
        if (coche != null) {
            this.coche = coche;
        }
    }
    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", coche=" + coche +
                '}';
    }
}
