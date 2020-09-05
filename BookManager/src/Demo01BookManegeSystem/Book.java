package Demo01BookManegeSystem;

public class Book {
    private String name;
    private String author;
    private float price;

    public Book() {
    }

    public Book(String name, String author, float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    public void setBook(String name, String author, float price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
