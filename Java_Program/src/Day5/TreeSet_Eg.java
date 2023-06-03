package Day5;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
It will store in ascending order
Null values is not allowed

 */
public class TreeSet_Eg {
    public static void main(String[] args) {
        TreeSet hs = new TreeSet();
        hs.add(5);
        hs.add(15);
        hs.add(50);
        hs.add(25);
        hs.add(25);
        hs.add(25);
        hs.add(35);
        hs.add(45);

        System.out.println(hs);
    }
}
