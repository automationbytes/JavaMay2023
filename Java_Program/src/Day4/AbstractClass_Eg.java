package Day4;
/*
Abstraction- process of hiding certain details and showing only essential info

Abstract class
Interfaces

Abstract class - 0-100% abstraction
Abstract methods - method w/o body
Non Abstract methods - normal methds



 */


abstract class parent{

    //abstract class
    abstract void marriageProposal();
    //non abstract class
    void prop(){
        System.out.println("House, Gold etc");
    }
}

class child extends parent {

    @Override
    void marriageProposal() {
        System.out.println("ABC");
    }
}


public class AbstractClass_Eg {

    public static void main(String[] args) {
        child p = new child() ;
        p.marriageProposal();
        p.prop();


    }}
