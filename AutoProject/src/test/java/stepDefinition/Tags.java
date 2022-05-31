package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Tags {
    @When("user search using the name of the product")
    public void searchProduct(){
        Hooks.searchPage.getSearchTerms().sendKeys("camera");
        Hooks.searchPage.getSearchTerms().sendKeys(Keys.ENTER);

    }
    @And("^user could select \"(.*)\" tag$")
    public void selectTag(String tagName){
//        WebElement tag = Hooks.driver.findElement(By.cssSelector("[class=\"tags\"] ul"));
        Hooks.driver.findElement(By.cssSelector("[class=\"tags\"] ul li a[href=\"/"+ tagName +"\"]")).click();
        Assert.assertEquals(Hooks.tagsPage.TagsElement().getText().toLowerCase().contains(tagName),true);
    }
}
