package org.example;

import org.testng.annotations.*;

public class Priority {

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
        public void first(){
            System.out.println("Test 1");
        }

        @Test(priority = -3)
        public void second(){
            System.out.println("Test 2");
        }

    @Test(timeOut = 2000)
    public void third() throws InterruptedException {
            Thread.sleep(5000);
        System.out.println("Test 3");
    }

    @Test(priority = 4)
    public void fourth(){
        System.out.println("Test 4");
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


