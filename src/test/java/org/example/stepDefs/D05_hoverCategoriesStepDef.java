package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D05_hoverCategoriesStepDef
{
    P01_Home home = new P01_Home();
    SoftAssert softAssert = new SoftAssert();

    @When("User hover on main category computers and clicks on a sub-category")
    public void userHoverOnMainCategoryComputersAndClicksOnASubCategory()throws InterruptedException
    {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(home.MainCategoryComputerLocator()).perform();

        String SubCategoryTitle_Desktop = home.SubCategoryLocator().getText().toLowerCase();
        Thread.sleep(3000);
        home.SubCategoryLocator().click();
        Thread.sleep(3000);
        String SubCategoryPageTitle = home.SubCategory_PageTitleLocator().getText().toLowerCase();
        softAssert.assertEquals(SubCategoryPageTitle,SubCategoryTitle_Desktop);
        softAssert.assertAll();
    }

    @Then("the sub-category title is \\(equal or contains) while selecting software")
    public void theSubCategoryTitleIsEqualOrContainsWhileSelectingSoftware()
    {
        System.out.println("Kolllllllollllllllllll ^^ ");
    }


}
