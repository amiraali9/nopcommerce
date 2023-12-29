package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Login { //we will put locator related to this page here

    public WebElement Email_Locator()
    {
       return Hooks.driver.findElement(By.className("email"));
    }

    public WebElement Password_Locator()
    {
        return Hooks.driver.findElement(By.className("password"));
    }
    public WebElement LoginButton_Locator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"button-1 login-button\"]"));
    }

    public WebElement myaccountLocator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"ico-account\"]"));
    }

    public WebElement ErrorMassage()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"message-error validation-summary-errors\"]"));
    }


}
