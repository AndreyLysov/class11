package com.company;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.company.Steps"
//        tags = "@Test"
)

public class MySuites{
//    Leave me empty
}