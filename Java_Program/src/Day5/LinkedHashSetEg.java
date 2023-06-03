package Day5;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
Ordered will be maintained
 */
public class LinkedHashSetEg {
    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();
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
