package Primero.Trimestre1.T06.actividades;

public class Act5 {
    public static double CalcArea ( double lado){
        return lado*lado;
    }
    public static double CalcArea (double base, double altura){
        return  (base*altura)/2;
    }

    public static void main(String[] args) {
        double ladoTriangulo=5.0;
        double baseCuadrado=4.0;
        double alturaCuadrado=3.0;

        double AreaTriangulo =CalcArea(ladoTriangulo);
        System.out.println("El area del triangulo es= " +AreaTriangulo);

        double AreaCuadrado = CalcArea(baseCuadrado, alturaCuadrado);
        System.out.println("El area del triangulo es= " +AreaCuadrado);
    }
}
