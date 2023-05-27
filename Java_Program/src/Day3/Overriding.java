package Day3;

class parent{
    void marriageProposal(){
        System.out.println("ABC");
    }
    void prop(){
        System.out.println("House, Gold etc");
    }
}

class child extends parent{
    void marriageProposal(){
        System.out.println("XYZ");
    }
}



public class Overriding {
    public static void main(String[] args) {
        child c = new child();
        c.marriageProposal();
        parent p = new parent();
        p.marriageProposal();
    }
}
