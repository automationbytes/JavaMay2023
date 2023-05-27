package Day3;

public class NoArgConst {
    String univname;

    public NoArgConst(){
        univname = "DevLabs University";
    }
    public static void main(String[] args) {
        NoArgConst n = new NoArgConst();
        System.out.println("University Name: "+n.univname);
    }
}
