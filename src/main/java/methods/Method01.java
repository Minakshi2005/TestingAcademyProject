package methods;

public class Method01 {
    int age=23;
    void details()
    {
        System.out.println("Method with no return type no arguments ");
    }
    int details1(){
        System.out.println("Method with return type with no arguments ");
        return 4;
    }

    void details2(int a,int b){
        System.out.println("Method with no return type with arguments");
    }
    String details4(String a,int b){
        System.out.println("Method with return type with arguments");
        return "Minu";
    }

    public static void main(String[] args) {
        Method01 obj=new Method01();
        obj.details();
        int a=obj.details1();
        System.out.println(a);
        obj.details2(1,5);
        obj.details4("Minakshi",30);
    }
}
