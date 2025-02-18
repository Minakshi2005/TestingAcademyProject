package staticenum;

public class Statickeyword {
    String name;
    int age;
    static String state="Maharashtra";
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }

    public Statickeyword(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Statickeyword s=new Statickeyword("minu",23);
        Statickeyword s1=new Statickeyword("rajesh",34);
        System.out.println(Statickeyword.state);
    }
}
