package constructor;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    // Default Con
    Dog(){
        System.out.println("I am DC");
    }


    Dog(String breed){
        System.out.println("I am PC");
        this.breed = breed;
    }

    Dog(String breed,String name,int age, int legs){
        System.out.println("I am PC");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    void walk(){
    }
}