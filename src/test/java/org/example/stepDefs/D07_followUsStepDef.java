package org.example.stepDefs;

import io.cucumber.java.an.Y;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class D07_followUsStepDef
{
    P01_Home home = new P01_Home();
    SoftAssert softAssert = new SoftAssert();
    String ActualCurrentURL;

    @When("user opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException
    {
        Thread.sleep(3000);
        home.followUs_Links_Locator().get(0).click();
        Thread.sleep(3000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        System.out.println("The Facebook URL Equals: " + ActualCurrentURL);
        Thread.sleep(3000);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));

 }

    @Then("facebook link {string} is opened in new tab")
    public void facebookLinkIsOpenedInNewTab(String FacebookURL)
    {
        softAssert.assertEquals(ActualCurrentURL, FacebookURL , "Facebook Tab Assertion Will Fail ...!!");
        softAssert.assertAll();
    }


    @When("user opens twitter link")
    public void userOpensTwitterLink()throws InterruptedException
    {
        Thread.sleep(3000);
        home.followUs_Links_Locator().get(1).click();
        Thread.sleep(3000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        System.out.println("The Twitter URL Equals: " + ActualCurrentURL);
        Thread.sleep(3000);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }

    @Then("twitter link {string} is opened in new tab")
    public void twitterLinkIsOpenedInNewTab(String TwitterURL)
    {
        softAssert.assertEquals(ActualCurrentURL,TwitterURL, "Twitter Tab Assertion Will Fail ..!!");
        softAssert.assertAll();
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws AWTException, InterruptedException
    {

        Actions act_Right_Click = new Actions(Hooks.driver);
        act_Right_Click.contextClick(home.followUs_Links_Locator().get(2)).perform();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        System.out.println("The RSS URL Equals: " + ActualCurrentURL);
        Thread.sleep(3000);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));


    }

    @Then("rss link {string} is opened in new tab")
    public void rssLinkIsOpenedInNewTab(String rssURL)
    {
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),rssURL, "Rss Tab Assertion Will Fail ..!!");
        softAssert.assertAll();

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink()throws InterruptedException
    {
        home.followUs_Links_Locator().get(3).click();
        Thread.sleep(3000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        System.out.println("The Youtube URL Equals: " + ActualCurrentURL);
        Thread.sleep(3000);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }

    @Then("youtube link {string} is opened in new tab")
    public void youtubeLinkIsOpenedInNewTab(String YoutubeURL)
    {
        softAssert.assertEquals(ActualCurrentURL,YoutubeURL, "Youtube Tab Assertion Will Fail ..!!");
        softAssert.assertAll();

    }

}
