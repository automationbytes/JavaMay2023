package pageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BaseTestClass {

    By filterDropdown = By.xpath("//select[@data-test='product_sort_container']");
    By menutButton = By.xpath("//button[@id=\"react-burger-menu-btn\"]");
    By logOutButton = By.xpath("//a[@id=\"logout_sidebar_link\"]");

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this); //findby
        BaseTestClass.driver = driver; //by method
    }

    public void SelectFilter(String value){
        Select dropdwn  = new Select(driver.findElement(filterDropdown));
        dropdwn.selectByVisibleText(value);
    }

    public void LogOut(){
        driver.findElement(menutButton).click();
        driver.findElement(logOutButton).click();

    }

}
