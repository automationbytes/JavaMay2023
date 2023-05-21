package Day2;

import java.util.Arrays;
import java.util.Locale;
import java.util.SortedMap;

public class String_Eg {
    public static void main(String[] args) {
        /*
        Literal way - String pool memory
        New Keyword way - Java heap memory

         */
    //literal
        String a = "Hello";
        String b = "Hello";

        //new keyword way
        String c = new String("Hello");
        String d = new String("HELLO");

        //== value and also memory address
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(d == c);

        //equals - checks the value
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        //equalsignorecase
        System.out.println(a.equalsIgnoreCase(d));

        //compareTo
        String e = "abcd";//97 98 99 100
        String f = "Abfz";//65 98 102 100
        System.out.println(e.compareTo(f));

        //comparetoIgnorecase
        System.out.println(e.compareToIgnoreCase(f));

        //starts-with
        String h = "Hello Everyone Good Night";
        System.out.println(h.startsWith("Hello"));

        //ends-with
        System.out.println(h.endsWith("Night"));

        //contains
        System.out.println(h.contains("Everyone"));

        //length
        String i = "elephant";
        System.out.println(i.length());

        //index of

        System.out.println(i.indexOf("e",1));

        //last index of
        System.out.println(i.lastIndexOf("e"));

        //charAt
        System.out.println(i.charAt(2));

        //replace
        System.out.println(i.replace("e","E"));

        //split
        String txt = "Java is most popular language";
        String[] arr = txt.split(" ");
        System.out.println(Arrays.toString(arr));

        //trim

        String k = "   Hello World  ";
        System.out.println(k.trim());

        //Strip -
        System.out.println(k.strip());

        //leading strip - lstrip
        System.out.println(k.stripLeading());

        //trailing strip - rstrip
        System.out.println(k.stripTrailing());

        //concat-
        String l = "lion";
        String m = "king";
        System.out.println(l+m);
        System.out.println(l.concat(m));

        //upper
        System.out.println(l.toUpperCase());

        //lower
        System.out.println(l.toLowerCase());

        //substring
        String n = "Nature";
        System.out.println(n.substring(3));

        char[] carr = n.toCharArray();
        System.out.println(Arrays.toString(carr));

        /*
        Calculate how many vowels
        Palindrome or not -madam
        reversing a string
         */
    }
}
