package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    WebDriver driver;
    public ShoppingCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement shoppingElement(){
        return driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]"));

    }
}
