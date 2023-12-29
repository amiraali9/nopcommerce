package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.example.pages.P01_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.Colors;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P01_Home home = new P01_Home();

    SoftAssert softAssert = new SoftAssert();

    @When("User clicks on wishlist button to add any product")
    public void userClicksOnWishlistButtonToAddAnyProduct() throws InterruptedException {
        Thread.sleep(3000);
        home.Wishlist_Locator().click();

    }

    @Then("User will see success message The product has been added to your wishlist")
    public void userWillSeeSuccessMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(home.SuccessMessage_Locator()));

        boolean ActualResults = home.SuccessMessage_Locator().isDisplayed();
        softAssert.assertEquals(ActualResults, true);

        String Actual_Color = home.SuccessMessage_Locator().getCssValue("background-color");
        String Color_Converted_to_Hex = Color.fromString(Actual_Color).asHex();
        softAssert.assertEquals(Color_Converted_to_Hex, "#4bb07a");

        System.out.println("Wrong Value = " + Color.fromString("#4bb07a"));
        System.out.println("Actual_Color Value = " + Actual_Color);
        System.out.println("Color_Converted_to_Hex Value = " + Color_Converted_to_Hex);


        softAssert.assertAll();


    }

    @And("After User add products to wishlist wait until this success message with green color to disappear and clicks on Wishlist Tab on the top of the page")
    public void afterUserAddProductsToWishlistWaitUntilThisSuccessMessageWithGreenColorToDisappearAndClicksOnTabOnTheTopOfThePage() {
        //Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); Take care UI Frontend will be applied to all ayahhhhhagggg

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(home.SuccessMessage_Locator()));
        home.Wishlist_Tab_Locator().click();


    }

    @Then("User verify if the product added to wishlist and check qty value it's bigger than Zero")
    public void userVerifyIfTheProductAddedToWishlistAndCheckQtyValueItSBiggerThan() {
        String Value = home.Check_Qty_of_Wishlist().getAttribute("value");
        int newQuantity = Integer.parseInt(Value);

        softAssert.assertEquals(newQuantity > 0, true);
        softAssert.assertAll();

        System.out.println("The New Quantity = "+( newQuantity + 10));
    }
}

