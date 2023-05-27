package Day3;

public class Factorial {

    static int calculateFact(int n){
        if(n == 0){
            return 1;
        }
        else {
            return n* calculateFact(n-1);// 5 * 4 * cal(3)
        }
    }

}
