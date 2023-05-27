package Day3;
/*
 Constructor used to create the instance of the class
 Constructor will be very similar to method
 but differs in 2 ways
 1) it has same class name
 2) it doesnt hav return type

 3 types of constructor

 1) Default Constructor
 2) No Arg constructor
 3) Parameterized constructor

 */
public class Constructor_Eg {

    int a;
    String b;

    public Constructor_Eg(){
        System.out.println("Constructor is initiated");
    }
    public static void main(String[] args) {
        Constructor_Eg c = new Constructor_Eg();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
