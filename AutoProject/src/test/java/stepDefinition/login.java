package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class login {
    @Given("user should go to login page")
    public void loginLink() {Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
    }

    @When("^user login with valid \"(.*)\" and \"(.*)\"$")
    public void validData(String username, String password)
    {
        Hooks.loginPage.getEMailElement().sendKeys(username);
        Hooks.loginPage.getPasswordElement().sendKeys(password);
    }

    @And("user press on login button")
    public void loginBtn()
    {Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void loginSuccessMsg()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"]")).isDisplayed());

    }
}
