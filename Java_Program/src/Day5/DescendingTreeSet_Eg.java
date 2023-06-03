package Day5;

import java.util.TreeSet;

public class DescendingTreeSet_Eg {
    public static void main(String[] args) {
        TreeSet hs = (TreeSet) new TreeSet().descendingSet();
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
