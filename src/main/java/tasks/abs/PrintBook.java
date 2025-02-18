package tasks.abs;

public class PrintBook extends Book{

    public PrintBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println("name="+name);
        System.out.println("author="+author);
        System.out.println("price="+price);
    }
}
