package Polymorphism;

public class Emp2 extends Employee{

    public void emp_details(int s,int a){
        int age=s;
        int salary=a;
        super.emp_details(12,5849);
        System.out.println("i am derived class");
    }

    public static void main(String[] args) {
        Emp2 e1=new Emp2();
        e1.emp_details(21,46655);
    }
}
