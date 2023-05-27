package Day3;

public class staticMetds_eg {
    static String univname = "Devlabs";

    static void setUnivname(){
        univname = "Devops University";
        System.out.println(univname);
    }

    public static void main(String[] args) {
        setUnivname();
    }

}
