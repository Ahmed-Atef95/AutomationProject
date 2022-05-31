package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SuccessOrderPage {
    WebDriver driver;
    public SuccessOrderPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement successOrderElement(){
        return driver.findElement(By.cssSelector("a[href=\"/cart\"]"));

    }
}
