package Day5;

import java.util.Map;
import java.util.TreeMap;

public class DescendingTreeMap_Eg {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<String,String>().descendingMap();
        map.put("1","One");
        map.put("11","Eleven");
        map.put("100","Hundred");
        map.put("5","Five");
        map.put("4","Four");
        map.put("11","Eleven");

        System.out.println(map);
    }
}
