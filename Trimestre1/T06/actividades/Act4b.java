package Trimestre1.T06.actividades;

public class Act4b{
    public static int SumaNume(int... numeros) {
        int suma = 0;
        for (int numero: numeros) {
            if (numero %2 !=0){
                suma += numero;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int resultados1= SumaNume(1,2,3,4,5);
        System.out.println("La suma de los numeros es " +resultados1);
    }
}
