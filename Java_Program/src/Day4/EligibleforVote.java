package Day4;

import java.util.Scanner;

public class EligibleforVote {

    static void toCheckEligibility(int age) throws Exception {
        if(age >= 18){
            System.out.println("Eligible for Voting");
        }else{
            //System.out.println("Not Eligible");
            throw new Exception("Not Eligible");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        toCheckEligibility(age);
    }
}
