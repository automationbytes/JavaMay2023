package Day4;

public class Regex_Eg {

    public static void main(String[] args) {
        String transnum = "abc1234xyz";

        String num = transnum.replaceAll("[a-zA-Z]","");
        System.out.println(num);

        String alpha = transnum.replaceAll("[0-9]","");
        System.out.println(alpha);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < transnum.length(); i++) {
            char c = transnum.charAt(i);
                if(Character.isAlphabetic(c)){
                    s.append(c);
                 //   System.out.print(c);
                }
            }
        System.out.println(s);



        String num1 = transnum.replaceAll("\\D","");
        System.out.println(num1);

        String alpha1 = transnum.replaceAll("\\d","");
        System.out.println(alpha1);



    }




    }

