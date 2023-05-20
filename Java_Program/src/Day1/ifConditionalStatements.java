package Day1;

public class ifConditionalStatements {
    public static void main(String[] args) {
        /*
        if(condition = true){
        block
        }else{
        block
        }

         */

        int a = 5;
        int b = 5;

        if (a<b){
            System.out.println("A is lesser than B");
        }

        else if (b<a){
            System.out.println("B is lesser than A");
        }else{
            System.out.println("Both are equal");
        }



    }
}
