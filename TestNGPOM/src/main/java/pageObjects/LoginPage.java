package pageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTestClass {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username_webEdit;

    By userName_editbox = By.xpath("//input[@id='user-name']");
    By password_editbox = By.xpath("//input[@id='password']");
    By login_button = By.xpath("//input[@id='login-button']");

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this); //findby
        BaseTestClass.driver = driver; //by method
    }

    //findby
    public void enterUsername(String user){
        username_webEdit.sendKeys(user);
    }

    //normal by
    public void enterPassword(String password){
        driver.findElement(password_editbox).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(login_button).click();
    }

    public String pageTitle(){
        return driver.getTitle();
    }
}
