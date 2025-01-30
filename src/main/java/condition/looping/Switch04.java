package condition.looping;

public class Switch04 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            default:
                System.out.println("None");
                System.out.println("None");
                break;
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            case 003,000:
                System.out.println("This is chem");
                break;
        }

    }
}
