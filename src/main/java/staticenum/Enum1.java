package staticenum;

public class Enum1 {
    public static void main(String[] args) {
        System.out.println(Color.blue.gethexcode());

    }
}


enum Color {
    red("#2145"),
    blue("#1234"),
    green("#2123");

    String hexcode;
    Color(String hexcode){
        this.hexcode=hexcode;
    }
    String gethexcode(){
        return this.hexcode;
    }
}