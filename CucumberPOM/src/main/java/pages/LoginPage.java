package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement username_webEdit;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    WebElement password_webEdit;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement login_button;

    @FindBy(xpath = "//h1")
    WebElement logo_webElement;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this); //findby

    }

    public void enterUserName(String username){
        username_webEdit.clear();
        username_webEdit.sendKeys(username);
    }

    public void enterPassword(String password){
        password_webEdit.clear();
        password_webEdit.sendKeys(password);
    }

    public void clickLogin(){
        login_button.click();
    }

    public boolean logoisDisplayed(){
        return logo_webElement.isDisplayed();
    }


}
