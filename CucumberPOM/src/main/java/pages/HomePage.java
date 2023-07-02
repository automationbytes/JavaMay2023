package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "(//img[@alt=\"logo.png\"])[2]")
    WebElement logo_webElement;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logout_WebElement;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this); //findby

    }

    public void clickLogout(){
        logout_WebElement.click();
    }

    public boolean homepagelogoisDisplayed(){
        return logo_webElement.isDisplayed();
    }


}
