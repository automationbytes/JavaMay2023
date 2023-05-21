package Day2;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        int number = 1234;
        int revnum = 0;

        while (number != 0){
            int remainder = number % 10; //1234%10 = 4; 123%10=3
            revnum = revnum * 10 + remainder; //0+4;40+3;430+2
            number = number/10;
        }
        System.out.println(revnum);

    }
}


/*

sum of the numbers between 1-10
factorial of numbers
sum of only even numbers

1-100 | 3 - fizz
5 - buzz
3*5 - fizzbuzz

 */