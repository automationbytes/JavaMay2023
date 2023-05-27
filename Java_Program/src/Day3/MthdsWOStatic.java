package Day3;

public class MthdsWOStatic {
    public int sum(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        MthdsWOStatic m = new MthdsWOStatic();
        System.out.println(m.sum(5,5));
        System.out.println(m.sub(5,9));
    }
}
