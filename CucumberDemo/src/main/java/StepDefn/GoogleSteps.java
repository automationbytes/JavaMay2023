package StepDefn;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSteps {

    WebDriver driver;

    @Before()
    public void initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @After()
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
    @Given("the user launches the application")
    public void the_user_launches_the_application() {


        driver.get("https://www.google.com/");

    }
    @Then("the user verifies the google logo")
    public void the_user_verifies_the_google_logo() {

        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Google\"]")).isDisplayed());
    }


    @When("the user enters {string} in google search")
    public void the_user_enters_in_google_search(String searchname) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(searchname);
    }


    @When("the user enters Cucumber in google search")
    public void the_user_enters_cucumber_in_google_search() {
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Cucumber");
    }
    @When("the user clicks on search button")
    public void the_user_clicks_on_search_button() {
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
    }
    @Then("the user verifies the google page result")
    public void the_user_verifies_the_google_page_result() {
        System.out.println(driver.getTitle());
    }
}
