package Day5;

import java.util.HashMap;

/*

Used to store in key value pair
Key - will not allow duplicates
Value - allow duplicates
only one null insertion possible in key

implementing classes are:
HashMap
LinkedHashMap
TreeMap

 */
public class MapInterface {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("1","One");
        map.put("11","Eleven");
        map.put("100","Hundred");
        map.put("5","Five");
        map.put("4","Four");
        map.put("11","Eleven");

        System.out.println(map);

        //accessing the map
        System.out.println(map.get("4"));

        //contains
        System.out.println(map.containsKey("11"));

        System.out.println(map.containsValue("Eleven"));

        map.put("11","new Eleven");
        System.out.println(map);


    }
}
