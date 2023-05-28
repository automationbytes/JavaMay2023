package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
Throwable class

Error - which is not recoverable
Exception - can be recoverable

Checked Exception - Compile time exceptions
Unchecked Exception - Run time exceptions

 */
public class Exceptions_Handling {
    public static void main(String[] args) throws FileNotFoundException {
    //unchecked
        int a = 10;
        System.out.println(a/0);

        System.out.println("Hello");
    //checked exceptions
        FileInputStream file = new FileInputStream("C:/sample.txt");


    }

}
