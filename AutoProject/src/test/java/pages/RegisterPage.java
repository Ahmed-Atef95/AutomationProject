package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    //start constructor
    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //end of constructor

    public WebElement getFNameElement() {

        return driver.findElement(By.cssSelector("input[id^=FirstName]"));
    }
    public WebElement getLNameElement() {

        return driver.findElement(By.cssSelector("input[id^=LastName]"));

    }
    public WebElement getEMailElement() {

        return driver.findElement(By.cssSelector("input[id^=Email]"));
    }
}
