package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Register { //we will put locator related to this page here

    public WebElement Gender_locator()
    {
       return Hooks.driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
    }

    public WebElement FirstName_locator()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
    }

    public WebElement LastName_locator()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
    }

    public WebElement Day_locator()
    {
           return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
    }

    public WebElement Month_locator()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
    }

    public WebElement Year_locator()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
    }


    public WebElement Email_locator()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id=\"Email\"]"));
    }

    public WebElement Company_locator()
    {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement Password_locator()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPass_locator()
    {
        return Hooks.driver.findElement(By.name("ConfirmPassword"));
    }

    public WebElement Registration_Button()
    {
        return Hooks.driver.findElement(By.cssSelector(".button-1#register-button"));
    }

    public WebElement SuccessMessage_Locator()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"result\"]"));
    }
}
