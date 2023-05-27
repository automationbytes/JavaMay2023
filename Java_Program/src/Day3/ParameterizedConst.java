package Day3;

public class ParameterizedConst {
    String course;
    String duration;
    ParameterizedConst(String course, String duration){
        this.course = course;
        this.duration = duration;
    }

    void toDisplay(){
        System.out.println(this.course+ " will go for " + this.duration);
    }

    public static void main(String[] args) {
        ParameterizedConst p1 = new ParameterizedConst("Java with Selenium", "9 Weeks");
        p1.toDisplay();
    }
}
