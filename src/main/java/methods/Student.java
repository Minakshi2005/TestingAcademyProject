package methods;

public class Student {
    String name="Minakshi";
    int age=32;
    long roll_no;

    void details(){
        System.out.println("student name="+name);
    }
    void emps(int a,long l){
        roll_no=l;
        System.out.println("Roll no="+roll_no);
        System.out.println("age="+age);
    }


    public static void main(String[] args) {
    Student s=new Student();
    s.details();
    s.emps(56,774994);
    }
}
