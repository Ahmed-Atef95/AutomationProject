package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TagsPage {
    WebDriver driver;
    public TagsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement TagsElement(){
        return driver.findElement(By.cssSelector("[class=\"page-title\"] h1"));

    }
}
