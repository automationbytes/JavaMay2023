package Day4;

class Student{
    private String CollegeName;

    public String getCollegeName(){
        return CollegeName;
    }

    public void setCollegeName(String name){
        this.CollegeName = name;
    }
}


public class EncapsulationEg {
    public static void main(String[] args) {
        Student s = new Student();
        s.setCollegeName("DevLabs University");
        System.out.println(s.getCollegeName());
    }

}
