package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMWebApplication.feature",
glue="com.StepDefinition" // will connect the Feature file with
                         //  the User-defined methods class - which will
                         // perform the actions related to statements of
                         //  the Scenario
//monochrome=true // Will remove the Junk data from the Test Result - in Console
//dryRun=true // will compare the Feature file Scenarios with the Methods Class
             // - if the Steps of the Scenarios are not found in mthods class
             //   the it creates the Methods without executing the Steps of
             //    all the Scenarios

)

public class TestRunner {

}