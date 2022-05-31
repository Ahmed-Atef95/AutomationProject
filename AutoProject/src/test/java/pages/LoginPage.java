package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
     public LoginPage(WebDriver driver){
          this.driver=driver;
          PageFactory.initElements(driver,this);
     }
     public WebElement getEMailElement() {

          return driver.findElement(By.id("Email"));
     }
     public WebElement getPasswordElement() {

          return driver.findElement(By.id("Password"));
     }
}
