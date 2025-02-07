package tasks;

public class Task01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=45;
        int max=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        String max= (a>b || a>c) ? "A is max" : "b or c is max";
//        System.out.println(max);
//        String max1= (b>a || b>c) ? "b is max" : "a or c is max";
//        System.out.println(max1);
        System.out.println("MAX is= " +max );

    }
}
