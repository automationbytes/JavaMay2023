package Day6;

public class Palindrome3 {
    static boolean isPalindarome(String str){
        for (int i = 0,j = str.length()-1;i<j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "madam1";
        if(isPalindarome(string)){
            System.out.println("Its palindrome");
        }else {
            System.out.println("Its not a palindrome");
        }
    }
}
