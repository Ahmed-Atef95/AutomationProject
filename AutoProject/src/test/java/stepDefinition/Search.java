package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class Search {

    @When("user search using the name")
    public void searchProduct(){
        Hooks.searchPage.getSearchTerms().sendKeys("camera");
        Hooks.searchPage.getSearchTerms().sendKeys(Keys.ENTER);

    }
    @Then("user could find camera")
    public void searchResults(){
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(count > 0);
        for (int i = 0; i < count ; i++) {
            softAssert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(i).getText().toLowerCase().contains("camera"));
        }
        softAssert.assertAll();

    }
}
