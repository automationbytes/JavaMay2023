package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*

Try
Catch
Finally
Throws


 */
public class TryCatchEg {
    public static void main(String[] args) throws IOException, InterruptedException {
//        FileInputStream file = new FileInputStream("C:/sample.txt");
//        file.read();
//        Thread.sleep(500);

        try{
            int a = 10;
            System.out.println(a/0);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }

        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Hello");

    }
}
