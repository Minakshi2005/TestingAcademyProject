package abstraction;

class PrintMyBook extends Book{


    @Override
    void getDetails(String name,String author,int price) {
        System.out.println("Name="+name);
        System.out.println("Author="+author);
        System.out.println("price="+price);
    }
}
