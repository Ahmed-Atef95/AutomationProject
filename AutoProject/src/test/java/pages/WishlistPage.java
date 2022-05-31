package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
    WebDriver driver;
    public WishlistPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement wishlistElement(){
        return driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }
}
