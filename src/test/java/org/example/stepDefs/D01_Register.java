package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.pages.P01_Home;
import org.example.pages.P02_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_Register { //we will put actions here
    P02_Register reg = new P02_Register();
    P01_Home home = new P01_Home();

    Select sel ; // this for drop down list


    @Given("User go to registration page")
     public void User_go_to_registration_page()
    {
        home.Registration_link_locator().click();
    }

    @When("User select the gender")
    public void user_select_the_gender()
    {
        reg.Gender_locator().click();
    }
    @And("User write the first name {string} and write last name {string}")
    public void user_write_the_first_name_and_write_last_name(String firstName , String lastName)
    {
      reg.FirstName_locator().sendKeys(firstName);
      reg.LastName_locator().sendKeys(lastName);
    }
    @And("User select the Date of Brith")
    public void user_select_the_date_of_brith()
    {
        sel = new Select(reg.Day_locator());
        sel.selectByIndex(5);

        sel = new Select(reg.Month_locator());
        sel.selectByVisibleText("July");

        sel = new Select(reg.Year_locator());
        sel.selectByValue("1999");

    }
    @And("User write the Email address {string}")
    public void user_write_the_email_address(String Email)
    {
    reg.Email_locator().sendKeys(Email);
    }
    @And("User write company name")
    public void user_write_company_name()
    {
     reg.Company_locator().sendKeys("MHE");
    }
    @And("User Write {string} and {string}")
    public void user_write_password_and_confirm_password(String password , String confirmpassword )
    {
      reg.Password_locator().sendKeys(password);
      reg.ConfirmPass_locator().sendKeys(confirmpassword);
    }
    @And("User clicks on Register Button")
    public void user_clicks_on_register_button() throws InterruptedException
    {
        Thread.sleep(8000);
        reg.Registration_Button().click();
    }


    @Then("User Register successfully")
    public void user_register_successfully()
    {
        SoftAssert softAssertobject = new SoftAssert();
        softAssertobject.assertEquals(reg.SuccessMessage_Locator().isDisplayed(), true);

//        String ActualColor = reg.SuccessMessage_Locator().getCssValue("color");
//        String colorConvertedtohex = Color.fromString(ActualColor).asHex();
//        System.out.println("The actual value =  "+ ActualColor);
//        System.out.println("The hex value =  "+ colorConvertedtohex);
        softAssertobject.assertEquals(Color.fromString(reg.SuccessMessage_Locator().getCssValue("color")).asHex(),"#4cb17c");
        softAssertobject.assertAll();
    }

}
