/*
List can be modifable
List can index based
List is ordered
List allow duplicates
List can store both homo and hetro

 */

package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Eg {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(5);
        al.add(3.5);
        al.add("Hello");

        System.out.println(al);

        al.add(2,56);
        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);

        al.addAll(al1);
        System.out.println(al);

        //clone - copy content into new list
        ArrayList newList = (ArrayList) al.clone();
        System.out.println(newList);

        //remove
        newList.remove("Hello");
        newList.remove(0);
        System.out.println(newList);

        //contains
        System.out.println(newList.contains("56"));

        //index of
        System.out.println(al.indexOf(56));

        //get
        System.out.println(al.get(2));

        //set
        al.set(3,99);
        System.out.println(al);

        al.set(6,56);
        System.out.println(al);
        System.out.println(al.indexOf(56));

        System.out.println(al.lastIndexOf(56));

        //sort
        al.remove(3.5);
        System.out.println(al);

        //ascending order
//        Collections.sort(al);
//        System.out.println(al);

        //descending order
//        Collections.reverse(al);
//        System.out.println(al);
//

        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);


    }
}
