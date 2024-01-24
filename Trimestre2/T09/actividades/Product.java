package Trimestre2.T09.actividades;

public class Product {
    protected int id;
    protected float price;

    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


