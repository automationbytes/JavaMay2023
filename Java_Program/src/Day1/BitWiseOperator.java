package Day1;

public class BitWiseOperator {
    public static void main(String[] args) {

        int a = 5; //     0101
        int b = 9; //     1001

        //32168421

        System.out.println(a & b); // 0001
        System.out.println(a | b); //1101 8 + 4+ 0+1
        /*
        1 and 1 = 1
        1 and 0 = 0
        0 and 1 = 0
        0 and 0 = 0

        1 or 1 = 1
        1 or 0 = 1
        0 or 1 = 1
        0 or 0 = 0

         */

    }

}
