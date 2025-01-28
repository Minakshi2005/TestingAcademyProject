package operators;

public class Lab09 {
    public static void main(String[] args) {

        String first_name = "Minakshi";
        String last_name = "Dutta";
        int a=2;
        int b=5;

        // Concatenation Operator  +
        // + -> int + int -> math
        // + -> String -> combine -> concat

        System.out.println(first_name + last_name);
        System.out.println(first_name + last_name + a + b);
        System.out.println(first_name + last_name + (a + b));
        System.out.println(a + b + first_name + last_name);
    }
}
