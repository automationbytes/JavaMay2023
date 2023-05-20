package Day1;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;

        System.out.println(a<b && a<c);

        System.out.println(a<b || a<c);


        /*
            true and true = true
            true and false = false
            false and true = false
            false and false = false

            true or true = true
            true or false = true
            false or true = true
            false or false = false


         */

        System.out.println( !(a== b));
    }
}
