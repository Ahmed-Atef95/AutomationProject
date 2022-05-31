package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class ResetPassword {
    String email=Hooks.email;
    String pass=Hooks.password;
    @Given("user is logged in with email and password")
    public void loggedUser() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();

        Hooks.loginPage.getEMailElement().sendKeys(email);
        Hooks.loginPage.getPasswordElement().sendKeys(pass);
        Thread.sleep(1000);
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }

    @When("user should click on my account link then click on change password")
    public void changePasswordLink(){
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).click();
        Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/changepassword\"]")).click();//change password
    }
    @And("^user fills old pass \"(.*)\" and new pass$")
    public void changeToNewPassword(String password){
        String NewPassword="111111";
        Hooks.driver.findElement(By.id("OldPassword")).sendKeys(password);
        Hooks.driver.findElement(By.id("NewPassword")).sendKeys(NewPassword);
        Hooks.driver.findElement(By.id("ConfirmNewPassword")).sendKeys(NewPassword);

    }

    @And ("user click on Change password button")
    public void ChangePassBtn(){
        Hooks.resetPasswordPage.resetElement().click();

    }
    @Then("user has changed his-her password successfully")
    public void PassChangedSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        String actRes = Hooks.driver.findElement(By.className("content")).getText();
        softAssert.assertEquals(actRes.contains("Password was changed"),true, "1st assertion");//relative
        softAssert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("Password was changed"),true,"2nd assertion");

        softAssert.assertAll();

    }

}

