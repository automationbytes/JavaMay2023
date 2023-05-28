package Day4;
/*

| = cat|dog|lion
\s - spaces
ta*

 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static void main(String[] args) {
        String email = "tes@gmail.com";
        String email1 = "testnlkhoig@gmail.com";

        String regex = "^[A-Za-z0-9._]{3,}+@[A-Za-z]+\\.[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email1);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        if (matcher.matches()){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
    }

}
