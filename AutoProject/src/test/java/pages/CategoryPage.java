package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

public class CategoryPage {
    WebDriver driver;
    public CategoryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement CategoryElement(){
        return driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));

    }
}
