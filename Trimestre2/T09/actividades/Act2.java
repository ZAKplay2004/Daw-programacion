package Trimestre2.T09.actividades;

import java.util.List;

public class Act2 {
    private static List<Product> productilst = List.of(
            new Book(1234, 23, "Dross", "Luna de plutón"),
            new Clothe(1235, 25,"Camiseta", "M","rojo"),
            new Book(1236, 15, "Kentaro Miura", "Maximum berserk")
    );

    public static void main(String[] args) {
        System.out.println(productilst);
    }
   /* public static void  showProducts() {
        for(Product product);
    }*/
}
