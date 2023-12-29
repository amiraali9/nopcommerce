package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.css.model.Value;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef
{
    P01_Home home = new P01_Home();
    SoftAssert softAssert = new SoftAssert();
    @When("User Enter {string}")
    public void userEnter(String Product_Name)
    {
        home.SearchTextBox_Locator().sendKeys(Product_Name);
    }

    @And("User clicks on Search Button")
    public void userClicksOnSearchButton()
    {
        home.SearchButton_Locator().click();
    }

    @Then("url contains {string} And search shows relevant results")
    public void urlContainsAndSearchShowsRelevantResults(String URL)
    {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains(URL));
        int NumberOfProducts_ListSize =  home.ProductsDetailsList_Locator().size();
        int Count = 0;

        for (int i = 0; i < NumberOfProducts_ListSize; i++)
        {
            String ProductDetails = home.ProductsDetailsList_Locator().get(i).getText();
            System.out.println("Product Details =" +ProductDetails);
            Count++;

            String SearchTextValue = home.SearchKeyword_Locator().getAttribute("value").toLowerCase();
            boolean ActualResult = ProductDetails.toLowerCase().contains(SearchTextValue);
            softAssert.assertTrue(ActualResult);
            System.out.println("Search Value = " +SearchTextValue);
        }
        softAssert.assertEquals(NumberOfProducts_ListSize, Count);
        softAssert.assertAll();

    }

    @When("User Search With {string}")
    public void userSearchWith(String SKU_Number)
    {
        home.SearchTextBox_Locator().sendKeys(SKU_Number);
    }

    @Then("SKU Numbers Used in Search equals SKU Numbers in the Product Page")
    public void skuNumbersUsedInSearchEqualsSKUNumbersInTheProductPage()
    {
        String SearchTextValue_SKU = home.SearchKeyword_Locator().getAttribute("value").toLowerCase();
        home.SKUResult().click();

        boolean ActualResult = home.SKUNumber_Locator().getText().toLowerCase().contains(SearchTextValue_SKU);
        Assert.assertTrue(ActualResult);

    }

}
