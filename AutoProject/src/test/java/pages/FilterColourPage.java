package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FilterColourPage {
    WebDriver driver;
    public FilterColourPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
