package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareList {

    @And ("user click add to compare list")
    public void addToComparelist() {
        Hooks.compareListPage.CompareElement().click();
    }
    @Then("added successfully to compare list")
    public void addToComparelistSuccessfully(){
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);

    }
}
