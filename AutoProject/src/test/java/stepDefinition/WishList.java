package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class WishList {

    @And ("user click add to Wishlist")
    public void addToWishlist() {
        Hooks.wishlistPage.wishlistElement().click();
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
    }
    @Then("added successfully to Wishlist")
    public void addToWishlistSuccessfully(){
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);

    }
}
