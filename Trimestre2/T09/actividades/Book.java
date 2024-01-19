package Trimestre2.T09.actividades;

public class Book extends Product{
    String author;
    String title;

    public Book(int id, float price, String author, String title ) {
       super(id, price);
        this.author = author;
        this.title =title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}'+ "\n";
    }
}
