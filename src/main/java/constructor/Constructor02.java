package constructor;

public class Constructor02 {
    public static void main(String[] args) {
        new Employee();
        Employee emp=new Employee("minu",30);
        Employee e=new Employee();
        System.out.println(e.age);
        System.out.println(e.name);
    }
}
