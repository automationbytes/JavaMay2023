package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

    @DataProvider(name = "singleDP")
    public Object[][] SingleDPMetd(){
        return new Object[][]{{7},{18}};
    }

    @DataProvider(name = "MultiDP")
    public Object[][] MultiDP(){
        return new Object[][]{{2,3},{5,10}};
    }

    @Test(dataProvider = "MultiDP")
    public void add(int a, int b){
        System.out.println(a+b);
    }


    @Test(dataProvider = "singleDP")
    public void num(int num){
        System.out.println("Number to be displayed" + num);
    }
}
