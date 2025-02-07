package constructor;

public class Employee {
    String name;
    long salary=39000;
    int age;
    long phone_no=73793903;
    Employee(){
        System.out.println("Default constructor");
        System.out.println("Employee salary="+salary);
    }
    Employee(String s,int age){
        this.name=s;
        this.age=age;
        System.out.println("Employee name="+name);
        System.out.println("Employee age="+age);
    }

}
