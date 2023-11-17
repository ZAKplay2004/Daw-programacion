package Trimestre2.T08.POO1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Flota {
    private List<Coche> listadecoches;
    public Flota(){
        listadecoches=new ArrayList<>();
    }
    public void agregarCoche (Coche coche){
        listadecoches.add(coche);
    }
    public void eliminarCoche (int numeroBastidor){
        Iterator<Coche> iterator = listadecoches.iterator();
        while(iterator.hasNext()){
            Coche coche = iterator.next();
            if (coche.getNumeroBastidor()== numeroBastidor){
                iterator.remove();
                System.out.println("Coche con número de bastidor " + numeroBastidor + " eliminado de la flota.");
                return;
            }

        }
    }
   public void mostrarFlota(){
        if (listadecoches.isEmpty()){
            System.out.println("La flota esta vacia.");
        }else {
            System.out.println("Lista de los coches de la flota:");

        }for (Coche coche:listadecoches){
           System.out.println(listadecoches);
       }
   }
}
