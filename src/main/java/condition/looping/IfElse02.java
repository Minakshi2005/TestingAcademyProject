package condition.looping;

public class IfElse02 {
    public static void main(String[] args) {
        int a=17;
        int b=17;
        if(a<b){
            System.out.println("a is less than b");
        }
        else if(b<a) {
            System.out.println("b is less than a");
        }
        else{
            System.out.println(" both are equal");
        }
    }
}
