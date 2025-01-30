package condition.looping;

public class Switch02 {
    public static void main(String[] args) {
        int a=10,b=30;
        char ch='*';
        switch(ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println("Multiplication of Number " +(a*b));
                break;
            default :
                System.out.println("Nothing to print");
                break;
        }
    }
}
