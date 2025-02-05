package condition.looping;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int age = s.nextInt();
        while (age >= 18) {
            System.out.println("I can Vote");
            break;
        }

    }
}
