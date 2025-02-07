package constructor;

public class Constructor01 {
    int id;
    String name;
    int age;

    void m1(){
        System.out.println("In Method");
    }
    Constructor01(){
        System.out.println("Default constructor");
    }
    Constructor01(int a,String n){
        this.name=n;
        System.out.println(name);
        System.out.println("Parameterized constructor");
    }
    Constructor01(int i,int a){
        this.age=i;
        this.id=a;
        System.out.println(age);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Constructor01 obj=new Constructor01();
        new Constructor01(4,"Minakshi");
        Constructor01 a=new Constructor01(30,1345);
    }
}
