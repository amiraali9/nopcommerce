package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.example.pages.P03_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_Login
{
    P03_Login log = new P03_Login ();
    P01_Home home = new P01_Home();

    SoftAssert softAssert = new SoftAssert();

    @Given("User Go to Login Page")
    public void user_go_to_login_page()
    {
      home.Login_link_locator().click();
    }
    @When("User write the email address {string}")
    public void user_write_the_email_address(String Email)
    {
      log.Email_Locator().sendKeys(Email);
    }
    @And("User Write password {string}")
    public void user_write_password(String password)
    {
     log.Password_Locator().sendKeys(password);
    }
    @And("User clicks on Login Button")
    public void user_clicks_on_login_button()
    {
        log.LoginButton_Locator().click();
    }

    @Then("User Login successfully")
    public void user_login_successfully()
    {

        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        softAssert.assertEquals(log.myaccountLocator().isDisplayed(), true);

        softAssert.assertAll();

    }


    @Then("User cannot login successfully due to wrong username or password")
    public void userCannotLoginSuccessfullyDueToWrongUsernameOrPassword()
    {
     softAssert.assertEquals(log.ErrorMassage().getText().contains("Login was unsuccessful."),true);

     softAssert.assertEquals(Color.fromString(log.ErrorMassage().getCssValue("color")).asHex(),"#e4434b");
     softAssert.assertAll();

    }
}
