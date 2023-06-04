package Day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Hello World";
        Set<Character> uniquechar = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            if(uniquechar.add(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
