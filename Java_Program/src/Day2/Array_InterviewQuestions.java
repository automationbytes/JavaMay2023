package Day2;

import java.util.Arrays;

public class Array_InterviewQuestions {
    public static void main(String[] args) {
        int arr[] = {7,8,7,1,4,3,6,8,9};
        int temp = 0;
/*
Ascending order
 */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        /*
Descending order
// */
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        /*

        Find the second largest number -> arr[arr.length-n]
        second Smallest number -> arr[n-1]
         */

        System.out.println(arr[arr.length-1]);
        System.out.println(arr[2-1]);

        int myarr[] = {7,8,7,1,4,3,6,8,9};
        Arrays.sort(myarr);
        System.out.println(Arrays.toString(myarr));
    }
}


/*
Removing duplicates from an array
reversing an array

 */