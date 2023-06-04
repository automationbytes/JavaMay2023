package Day6;

public class Palindrome {
    static boolean isPalindarome(String str){
        for (int i = 0; i< str.length()/2   ;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
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
