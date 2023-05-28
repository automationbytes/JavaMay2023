package Day4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/*

SimpleDateFormat - used for date formating
date/time

com.text

 */
public class DateFunctions {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy,W";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
