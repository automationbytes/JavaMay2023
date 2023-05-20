package Day1;

/*
Variables - Container to store values
datatypes - to determine what of data to be stored

Primitive Datatype - start with small letter

byte - 1 byte - 8 bits -> 2^8 -> 256 => -128 to 127
short - 2 byte - 16bits
int - 4 byte
long - 8 bytes
float - 4 bytes
double - 8 bytes
boolean - 1 bit - true/false
char - 2 bytes


Non Primitive Datatype - starts with capital letters


 */

public class Variables {
    public static void main(String[] args) {

        byte b = (byte) 130; //127 -128 -127 -126 -125 ...
        System.out.println(b);


        short s = 6544;
        System.out.println(s);

        int i = 599798;
        System.out.println(i);

        long l = 687879797657L;
        System.out.println(l);

        float f = 3.145549f;
        System.out.println(f);

        double d = 789799.978;
        System.out.println(d);

        char c = 'q';
        System.out.println(c);
        
        boolean bool = true;
        System.out.println(bool);
    }
}
