package org.example;

import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters({"x","y"})
    public void add(int x, int y){
        System.out.println(x+y);
    }

    @Test
    @org.testng.annotations.Parameters({"x","y"})
    public void sub(int x, int y){
        System.out.println(x-y);
    }
}
