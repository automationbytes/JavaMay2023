package Day5;

import java.util.Collections;
import java.util.LinkedList;

/*
LinkedList works on doubly linked list concept
growable in nature
store both homo n hetro data elements
Duplicates are allowed
Insertion order will be preserved
Random access is not possible


 */
public class LinkedList_Eg {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);

        //add
        fruits.add("Banana");
        System.out.println(fruits);

        //add on specific index
        fruits.add(1,"Stawberry");
        System.out.println(fruits);

        //Accessing first element
        System.out.println(fruits.getFirst());

        //Accessing last element
        System.out.println(fruits.getLast());

        //accessing based on index
        System.out.println(fruits.get(3));

        //remove
        System.out.println(fruits.removeFirst());

        System.out.println(fruits.removeLast());

        System.out.println(fruits.remove(0));

        System.out.println(fruits.contains("Apple"));

        System.out.println(fruits.indexOf("Orange"));

        Collections.sort(fruits);
        System.out.println(fruits);

        Collections.reverse(fruits );
        System.out.println(fruits);
    }

}
