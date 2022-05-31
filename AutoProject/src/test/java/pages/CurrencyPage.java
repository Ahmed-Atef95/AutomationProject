package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CurrencyPage {
    WebDriver driver;
    public CurrencyPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement CurrencyElement(){
        return driver.findElement(By.xpath("//*[@id='customerCurrency']"));

    }
}
