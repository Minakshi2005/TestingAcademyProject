package operators;

public class Lab11 {
    public static void main(String[] args) {
        // !, && , || Logical Operator
        boolean a = true;
        boolean b = true;
//        boolean c= true && true;
        boolean c= true || false;
//        System.out.println(c);
//        System.out.println(!b);
//        System.out.println(!c);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
