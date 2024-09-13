package Primero.Trimestre2.T08.POO3.actividades;

public class Calculadora {

    private static int resultado;
    public static int sumar (int numero1, int numero2){
        resultado = numero1+numero2;
        return resultado;
    }
    public static int restar (int numero1, int numero2){
        resultado = numero1-numero2;
        return resultado;
    }
    public static int dividir (int numero1, int numero2){
        resultado = numero1/numero2;
        return resultado;
    }
    public static int multiplicar(int numero1, int numero2){
        resultado = numero1*numero2;
        return resultado;
    }
}
