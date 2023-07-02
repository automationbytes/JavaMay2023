package StepDefn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

public class Steps {

    private ConfigReader configReader = new ConfigReader();
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Given("the user launches the NOPAdmin URL")
    public void the_user_launches_the_nop_admin_url() {
        DriverFactory.getDriver().get(configReader.getConfigProperty("url"));
            }
    @Then("the user verifies the logo")
    public void the_user_verifies_the_logo() {
        Assert.assertTrue(loginPage.logoisDisplayed());
    }
    @When("the user enters the username and password")
    public void the_user_enters_the_username_and_password() {
        loginPage.enterUserName(configReader.getConfigProperty("username"));
        loginPage.enterPassword(configReader.getConfigProperty("password"));
    }
    @When("the user clicks on signin button")
    public void the_user_clicks_on_signin_button() {
        loginPage.clickLogin();
    }
    @Then("the user verifies the homepage")
    public void the_user_verifies_the_homepage() {
        Assert.assertTrue(homePage.homepagelogoisDisplayed());
    }



    @Then("the user performs logout")
    public void the_user_performs_logout() {
        homePage.clickLogout();
    }

}
