package Day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String> ();
        map.put("1","One");
        map.put("11","Eleven");
        map.put("100","Hundred");
        map.put("5","Five");
        map.put("4","Four");
        map.put("11","Eleven");

        System.out.println(map);

        //entry
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
        //just by iterating using key alone
        for(String k : map.keySet()){
            System.out.println(k+"---"+map.get(k));
        }


        //for each
        map.forEach((k,v)-> System.out.println(k+"**"+v));

        //iterator
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+"--->>"+entry.getValue());
        }
    }
}
