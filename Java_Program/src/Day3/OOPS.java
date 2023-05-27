package Day3;

public class OOPS {

    String name;
    int age;

    OOPS(String name, int age){
        this.name = name;
        this.age = age;
    }

    void toStudy(){
        System.out.println(this.name+ " studing and his age is "+this.age);
    }

    public static void main(String[] args) {
        OOPS o = new OOPS("Tom",5);
        o.toStudy();
    }
}
