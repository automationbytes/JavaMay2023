package Day3;

public class OverLoading {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(float a, float b){
        System.out.println(a+b);
    }

    void add(String  a, String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        OverLoading o = new OverLoading();
        o.add(5.5f,7.5f);
        o.add("Hello","World");
    }

}
