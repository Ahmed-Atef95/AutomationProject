package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Currency {
    @When("user select Euro currency")
    public void selectCurrency(){
        WebElement customerCurrency = Hooks.currencyPage.CurrencyElement();
        Select drpCurrency = new Select(customerCurrency);
        drpCurrency.selectByVisibleText("Euro");
    }
    @Then("user could see product with Euro currency")
    public void selectCurrencySuccessfully(){

    }
}
