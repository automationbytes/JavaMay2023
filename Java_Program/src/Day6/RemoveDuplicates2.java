package Day6;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< str.length();i++){
            char currentChar = str.charAt(i);
            boolean duplicate = false;

            for(int j = i+1; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                   duplicate = true;
                   break;
                }
            }
            if(!duplicate){
                result.append(currentChar);
            }
        }
        System.out.println(result);
    }

}


// Hello
/*
h- 1
e-1
l-2

 */