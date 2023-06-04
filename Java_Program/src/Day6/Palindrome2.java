package Day6;

public class Palindrome2 {
    static String reverseString(String str) {
        StringBuilder rev = new StringBuilder();
        for (int j = str.length() - 1; j >= 0; j--) {
           // System.out.println(str.charAt(j));
            rev.append(str.charAt(j));
        }
        System.out.println(rev.toString());
        return rev.toString();
    }

    public static void main(String[] args) {
        String input = "madam";
        if(input.equals(reverseString("madam"))){
            System.out.println("its palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
