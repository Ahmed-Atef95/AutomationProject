package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SuccessOrder {

    @When ("user click on shopping cart")
    public void clickShoppingCart() {
        Hooks.successOrderPage.successOrderElement().click();


    }
    @And ("user accept terms of service")
    public void accepttermsofservice() {
        Hooks.driver.findElement(By.id("termsofservice")).click();

    }
    @And ("user choose checkout")
    public void checkout() {
        Hooks.driver.findElement(By.id("checkout")).click();

    }

    @And ("user fills all checkout data")
    public void fillcheckoutdata() {
        if(Hooks.driver.findElement(By.id("billing-address-select")).isDisplayed()) {
            WebElement new_webElement = Hooks.driver.findElement(By.id("billing-address-select"));
            Select new_select = new Select(new_webElement);
            new_select.selectByVisibleText("New Address");
        }

        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).clear();
        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("nadeen");
        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).clear();
        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("serag");
        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).clear();
        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("email@gmail.com");
        WebElement Country_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select Country_select = new Select(Country_webElement);
        Country_select.selectByValue("1");
        WebElement StateProvince_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select StateProvince_select = new Select(StateProvince_webElement);
        StateProvince_select.selectByValue("1");
        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("newyork");
        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("street 5,building 4");
        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("null");
        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01001100111");

    }

    @And ("user click on continue")
    public void continueCheckout() {
        Hooks.driver.findElement(By.cssSelector("button[name=\"save\"]")).click();

    }
    @And ("user click on continue-shipping")
    public void continueShipping() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();

    }

    @And ("user click on continue-payment-method")
    public void continuePaymentMethod() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();

    }
    @And ("user click on continue-payment-info")
    public void continuePaymentInfo() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();

    }
    @And ("user click on confirm-order")
    public void confirmOrderNext() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]\n")).click();
    }

    @Then("user order products successfully")
    public void checkoutSuccessfully() {
        Hooks.driver.findElement(By.cssSelector("div[class=\"details-link\"]")).click();
    }
}
