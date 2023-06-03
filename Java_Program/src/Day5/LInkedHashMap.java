package Day5;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LInkedHashMap
{
    public static void main(String[] args) {
        //maintain insertion order for key
        LinkedHashMap map = new LinkedHashMap();
        map.put("1","One");
        map.put("11","Eleven");
        map.put("100","Hundred");
        map.put("5","Five");
        map.put("4","Four");
        map.put("11","Eleven");

        System.out.println(map);

    }
}
