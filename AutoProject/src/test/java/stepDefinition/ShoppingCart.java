package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart {

    @And ("user click add item to cart")
    public void addToCart() {
        Hooks.shoppingCartPage.shoppingElement().click();
        //addToCartSuccessfully
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
        Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]")).click();
        //addToCartSuccessfully
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
    }
}
