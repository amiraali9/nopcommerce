package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_Home { //we will put locator related to this page here
    public WebElement Registration_link_locator()
    {
       return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement Login_link_locator()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement Change_Currencies_Locator ()
    {
        return Hooks.driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]"));
    }
    public List<WebElement> Products_Prices_Locator ()
    {
       return Hooks.driver.findElements(By.cssSelector("[class=\"price actual-price\"]"));

       // return Hooks.driver.findElements(By.cssSelector("[class=\"details\"]"));
    }

    public WebElement Scroll_Locator ()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/build-your-own-computer\"]"));
    }

    public WebElement SearchTextBox_Locator()
    {
        return Hooks.driver.findElement(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]"));

    }

    public WebElement SearchButton_Locator()
    {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> ProductsDetailsList_Locator()
    {
        return Hooks.driver.findElements(By.cssSelector("[class=\"details\"]"));
    }

    public WebElement SearchKeyword_Locator()
    {
        return Hooks.driver.findElement(By.className("search-text"));
    }

    public WebElement SKUNumber_Locator()
    {
        return Hooks.driver.findElement(By.cssSelector(".sku .value"));
    }

    public WebElement SKUResult()
    {
        return Hooks.driver.findElement(By.cssSelector(".product-title a"));
    }

    public WebElement MainCategoryComputerLocator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement SubCategoryLocator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"top-menu notmobile\"] [class=\"sublist first-level\"] [href=\"/desktops\"] "));
    }

    public WebElement SubCategory_PageTitleLocator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"page category-page\"] [class=\"page-title\"]"));
    }

    public List<WebElement> homeSliders_Locators()
    {
        return Hooks.driver.findElements(By.cssSelector("[class=\"nivoSlider\"] a "));
    }

    public List<WebElement> followUs_Links_Locator()
    {
        return Hooks.driver.findElements(By.cssSelector("[class=\"networks\"] li "));
    }

    public WebElement Wishlist_Locator()
    {
        return Hooks.driver.findElement(By.xpath("(//button[@type=\"button\"])[9]"));
        //return Hooks.driver.findElement(By.cssSelector(".item-box:nth-child(3) .add-to-wishlist-button"));
        //(//button[@type="button"])[9]
    }

    public WebElement SuccessMessage_Locator()
    {
        return Hooks.driver.findElement(By.cssSelector(".bar-notification-container .bar-notification.success"));
    }

    public WebElement Wishlist_Tab_Locator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"wishlist-label\"]"));
    }

    public WebElement Check_Qty_of_Wishlist()
    {
        return Hooks.driver.findElement(By.className("qty-input"));
    }


}
