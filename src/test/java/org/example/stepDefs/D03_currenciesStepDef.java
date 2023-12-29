package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D03_currenciesStepDef
{
    P01_Home home = new P01_Home();
    @When("User changes the currency to Euro from the dropdown list")
    public void userChangesTheCurrencyToEuroFromTheDropdownList() throws InterruptedException
    {
        Thread.sleep(3000);
        Select sel = new Select(home.Change_Currencies_Locator());
        sel.selectByIndex(1); // any index inside array or list starting with 0

        //Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


    }

    @Then("The Euro symbol is appeared on the products details in the home page")
    public void theEuroSymbolIsAppearedOnTheProductsDetailsInTheHomePage() throws InterruptedException
    {
        JavascriptExecutor javaEx = (JavascriptExecutor) Hooks.driver;
        javaEx.executeScript("arguments[0].scrollIntoView();",home.Scroll_Locator());


        Thread.sleep(3000);

        //Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(home.Products_Prices_Locator().get(1)));

        for (int i = 0; i <home.Products_Prices_Locator().size(); i++)
        {
            System.out.println(home.Products_Prices_Locator().get(i).getText());

            String Prices = home.Products_Prices_Locator().get(i).getText();
            boolean ActualResult = Prices.contains("€");
            Assert.assertTrue(ActualResult);

        }

    }
}
