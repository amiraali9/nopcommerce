package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.time.Duration;

public class Hooks {

   public static WebDriver driver;
   public static String URL ="https://demo.nopcommerce.com/";

    @Before
     public void Open_Browser()
    {
//        ChromeOptions optObject = new ChromeOptions();
//        optObject.addArguments("--remote-allow--origins=*");
//        driver = new ChromeDriver(optObject);

        //System.setProperty("webdriver.chrome.driver","E:\\Amira Ali\\Software testing\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @After
    public static void closeBrowser(Scenario scenario) throws InterruptedException
    {
        Thread.sleep(2000);

        if (scenario.isFailed())
        {
            Allure.addAttachment(scenario.getName(), "image/png", new ByteArrayInputStream(
                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)), "png");
        }
        driver.quit();
    }
}
