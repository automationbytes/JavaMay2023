package Day3;

public class SOuterClass {
    static int outerdata = 5;

    static class InnerClass{
        public void accessOuterData(){
            System.out.println(outerdata);
        }
    }

    public static void main(String[] args) {
        SOuterClass.InnerClass obj = new SOuterClass.InnerClass();
        obj.accessOuterData();
        //System.out.println();
    }
}
