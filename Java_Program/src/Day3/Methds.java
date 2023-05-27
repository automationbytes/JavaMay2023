package Day3;
/*
A method/functions is a block of code which only runs when its called
We can pass data - parameters
return stmt

Use:
Reusability

access modifiers nonaccess modifiers returndatatype methdname{
return statement
}


 */
public class Methds {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {

        System.out.println(sum(9,5));

        System.out.println(sub(8,2));

    }
}
