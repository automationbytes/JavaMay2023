package org.example;

import org.testng.annotations.*;

public class AnnotationDemo {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }


    @BeforeTest
    public void beforTest(){
        System.out.println("Before Test");
    }


    @BeforeClass
    public void beforecls(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMd(){
       System.out.println("Before Method");
    }

    @Test
    public void xyz(){
        System.out.println("Test 1");
    }

    @Test
    public void abc(){
        System.out.println("Test 2");
    }

    @AfterSuite
    public void Aftersuite(){
        System.out.println("After Suite");
    }


    @AfterTest
    public void Aftertest(){
        System.out.println("After Test");
    }


    @AfterClass
    public void Aftercls(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void AfterMd(){
        System.out.println("After Method");
    }


}
