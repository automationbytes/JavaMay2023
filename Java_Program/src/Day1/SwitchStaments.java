package Day1;

public class SwitchStaments {
    public static void main(String[] args) {
        int week = 3;
        switch (week){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tueday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input - provide 1-7");
                break;


        }
    }
}
