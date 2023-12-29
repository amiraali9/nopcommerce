package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef
{
    P01_Home home = new P01_Home();
    SoftAssert softAssert = new SoftAssert();

    @When("User clicks on the first slider")
    public void userClicksOnTheFirstSlider()
    {
        home.homeSliders_Locators().get(0).click();
    }


    @Then("direct user to first url {string}")
    public void directUserToFirstUrl(String firstSliderURL)
    {
      softAssert.assertEquals(Hooks.driver.getCurrentUrl(),firstSliderURL,"First Slider Assertion will fail ...!!");
      softAssert.assertAll();
    }

    @When("User clicks on the second slider")
    public void userClicksOnTheSecondSlider()throws InterruptedException
    {
        Thread.sleep(5000);
        home.homeSliders_Locators().get(1).click();
    }

    @Then("direct user to second url {string}")
    public void directUserToSecondUrl(String secondSliderURL)
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains(secondSliderURL));

        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),secondSliderURL,"Second Slider Assertion will fail ...!!");
        softAssert.assertAll();
    }
}
