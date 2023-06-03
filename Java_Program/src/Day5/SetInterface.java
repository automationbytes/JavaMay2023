package Day5;

import java.util.HashSet;

/*
Duplicates are not allowed
Growable in nature
Homo and hetro data elements
Insertion order is not guaranteed
Random access is not possible
Only one null value is possible]

3 implementing classes are
1) Hashset
2) LinkedHashSet
3) Treeset

Hash Set
========
Performance great
tech used is Hashtable datastructure

 */
public class SetInterface {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(5);
        hs.add(15);
        hs.add(50);
        hs.add(25);
        hs.add(25);
        hs.add(25);
        hs.add(35);
        hs.add(45);

        System.out.println(hs);


        System.out.println(hs.contains(50));

        hs.remove(50);
        System.out.println(hs);

        for(Object h : hs){
            System.out.println(h);
        }

    }
}
