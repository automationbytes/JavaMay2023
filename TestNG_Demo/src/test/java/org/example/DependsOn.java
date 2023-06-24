package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {


    @Test
    public void first(){
        Assert.assertEquals(2, 1);
        System.out.println("Test 1");
    }

    @Test(dependsOnMethods = "first")
    public void second(){

         System.out.println("Test 2");
    }

    @Test(dependsOnMethods = "first")
    public void third(){
        System.out.println("Test 3");
    }

    @Test
    public void fourth(){
        System.out.println("Test 4");
    }

}
