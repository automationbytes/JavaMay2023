package testCases;

import baseClass.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TestSauceDemo extends BaseTestClass {

    public LoginPage lp;
    public HomePage hp;
    @Test(alwaysRun = true)
    public void urlTest(){
        lp = new LoginPage(driver);
        initializeBrowser();
        Assert.assertEquals(lp.pageTitle(),"Swag Labs");
    }
    @Test(priority = 1,dependsOnMethods = "urlTest")
    public void loginScreen(){
        lp = new LoginPage(driver);
        lp.enterUsername("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLogin();
    }

    @Test(priority = 2,dependsOnMethods = "loginScreen")
    public void filterOption(){
        hp = new HomePage(driver);
        hp.SelectFilter("Price (low to high)");
    }

    @Test(priority = 99,dependsOnMethods = "loginScreen")
    public void logout(){
        hp = new HomePage(driver);
        Assert.assertTrue(1 == 2);
     //   hp.LogOut();

    }


}
