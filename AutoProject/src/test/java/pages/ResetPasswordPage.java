package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {
    WebDriver driver;
    public ResetPasswordPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement resetElement(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 change-password-button\"]"));

    }
}
