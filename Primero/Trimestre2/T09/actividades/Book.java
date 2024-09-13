package Primero.Trimestre2.T09.actividades;

public class Book extends Product{
    String author;
    String title;
    double discount;
    public Book(int id, float price, String author, String title ) {
       super(id, price);
        this.author = author;
        this.title =title;
    }
    public double getPrice(float price) {
         discount = 0.8;
        double finalp = price * discount;
        return finalp;
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", price=" + getPrice(price) +
                '}'+ "\n";
    }
}
