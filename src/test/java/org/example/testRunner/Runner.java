package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {

    @CucumberOptions
            (
                    features = "src\\main\\resources\\features",
                    glue =  {"org.example.stepDefs"},
                    plugin = {"pretty","html:target/CucumberReport.html",
                            "json:target/CucumberJsonReport.json",
                            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
                    tags = "@smoke"
            )


    public static class runners extends AbstractTestNGCucumberTests
    {

    }


}
