package Day2;

public class ForLoop {
    public static void main(String[] args) {
        /*
            start; stop ; step
        for(init; condition; increment/decrement)

         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------");

        for(int i = 10; i >=1 ; i--){
            System.out.println(i);
        }

        System.out.println("---------");

        for (int i = 0; i < 5; i++) {

            System.out.println(i+"Outerloop");

            for (int j = 0; j < 3; j++) {

                System.out.println(j + "Inner loop");

            }
        }


    }
}
