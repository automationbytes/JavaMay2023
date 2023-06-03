package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {

    public static void main(String[] args) {
        String[] names = {"Apple","Elephant","Balloon","Zebra","Parrot","Lion","Tiger"};
        //method1
        List<String> list1 = Arrays.asList(names);
        System.out.println(list1);
//        list1.add("Stawberry");
//        System.out.println(list1);

        //approach 2
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,names);
        System.out.println(list2);
        list2.add("Stawberry");
        System.out.println(list2);

        //approach 3
        List<String> list3 = new ArrayList<>();
        for (String n: names) {
            list3.add(n);
        }
        System.out.println(list3);

        list3.add("Monkey");
        System.out.println(list3);
    }

}
