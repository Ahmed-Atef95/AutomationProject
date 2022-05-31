package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class FilterColour {
    @When("user could select Apparel")
    public void selectApparel(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]")).click();
        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/shoes\"]")).click();


    }
    @And("user could select color gray")
    public void selectColorGray(){
        Hooks.driver.findElement(By.id("attribute-option-14")).click();

    }
}
