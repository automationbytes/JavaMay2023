package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups_Eg {



    @Test(groups = {"Regression"})
    public void first(){
        Assert.assertEquals(2, 1);
        System.out.println("Test 1");
    }

    @Test(groups = {"Sanity"})
    public void second(){

        System.out.println("Test 2");
    }

    @Test(groups = {"Regression"})
    public void third(){
        System.out.println("Test 3");
    }

    @Test(groups = {"Sanity"})
    public void fourth(){
        System.out.println("Test 4");
    }

}
