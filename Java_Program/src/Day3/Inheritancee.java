package Day3;

class Animal{
    void eat(){
        System.out.println("Animal Eat Method");
    }
    void sleep(){
        System.out.println("Animal Sleep Method");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog sound method");
    }
}

class Bulldog extends Dog{
    void breed(){
        System.out.println("Bulldog breed method");
    }
}


public class Inheritancee {
    public static void main(String[] args) {
        Bulldog d = new Bulldog();
        d.eat();
        d.sound();
        d.sleep();

        Animal a = new Animal();

    }
}
