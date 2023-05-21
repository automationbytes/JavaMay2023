package Day2;

import java.util.Arrays;

public class Arrays_Eg {
    public static void main(String[] args) {
        /*
        Array refers to data structure
        one variable will be storing multiple values
        same datatype (primitive datatypes)
        insertion order will be preserved
        Dynamic access is possible
        Duplicates are allowed

        Adv:
        Easy storage of data/manipulation
        random access

        DisAdv:
        Array are fixed in size (increase/decrease)
         */

        //int[] arr = new int[5];
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 2;
        arr[3]= 4;
        arr[4] = 7;
        //arr[5] = 8;

        int myarr[] = {5,4,2,4,7};
        System.out.println(Arrays.toString(myarr));

        //for loop
        for (int i = 0; i < myarr.length; i++) {
            System.out.println(myarr[i]);
        }

        //for each
        for(int m : myarr){
            System.out.println(m);
        }

        String[] names = {"Apple","Banana","Stawberry"};
        for(String n : names){
            System.out.println(n);
        }
    }
}
