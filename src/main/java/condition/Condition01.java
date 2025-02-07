package condition;

public class Condition01
{
    public static void main(String[] args) {

        // condition ? expression_if_true : expression_if_false
        int num1 =10;
        int num2=6;
        int a=(num2>num1) ? num1 : num2;
        System.out.println(a);
    }
}
