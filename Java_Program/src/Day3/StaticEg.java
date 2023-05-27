package Day3;

public class StaticEg {
    static int count = 0;

    StaticEg(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticEg s1 = new StaticEg();
        StaticEg s2 = new StaticEg();
        StaticEg s3 = new StaticEg();

    }
}
