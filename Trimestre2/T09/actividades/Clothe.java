package Trimestre2.T09.actividades;

public class Clothe extends Product{
    String type;
    String size;
    String color;

    public Clothe(int id, float price, String type, String size, String color) {
        super(id, price);
        this.type = type;
        this.size =size;
        this.color =color;
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}'+ "\n";
    }
}
