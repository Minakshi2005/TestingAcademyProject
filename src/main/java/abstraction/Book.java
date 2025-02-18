package abstraction;

public abstract class Book {
    String name;
    String author;
    int price;
    abstract void getDetails(String name,String author,int price);
}
