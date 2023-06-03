package Day5;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        String[] names = {"Apple","Elephant","Balloon","Zebra","Parrot","Lion","Tiger"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list,names);
        System.out.println(list);

        System.out.println("Using For Loop");
        for(String l : list){
            System.out.println(l);
        }
        System.out.println("Using For Iterator");

        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }
    }


}
