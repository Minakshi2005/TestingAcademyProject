package Polymorphism;

public class Emp1 extends Employee {

    void emp_details(int a,String s,int n){
        int age=a;
        int sal=n;
        String name=s;
    }

    public static void main(String[] args) {
        Emp1 e=new Emp1();
        e.emp_details(34,"minakshi",36739);
        e.emp_details(23,378);
    }
}