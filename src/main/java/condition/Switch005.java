package condition;

public class Switch005 {
    public static void main(String[] args) {
        String browser="edge";
        switch(browser){
            case "chrome"-> System.out.println("Open chrome browser");
            case "edge"-> System.out.println("Open edge browser");
            case "opera"-> System.out.println("Open opera browser");
            default ->System.out.println("no browser to open");
        }
    }
}
