package abstraction;

public class Test2 extends Base implements iam{
        public void stat(){
            System.out.println("stat");
        }
        public void fat(){
            System.out.println("fat");
        }

    @Override
    void d1() {
        System.out.println("base class");
    }
}

