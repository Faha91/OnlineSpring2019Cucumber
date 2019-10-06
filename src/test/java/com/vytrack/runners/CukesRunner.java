package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


// @Runwith annotation comes from JUnit. Means we gonna execute cucumber class.
//This annotation is specified on top of runner;
//CucumberOptions comes from Cucumber  whatever is inside stands for configuration


@RunWith(Cucumber.class)
@CucumberOptions(
     //   tags = {"@negative"},
        // we specify location location of feature file.
        features = {
            "src/test/resources/features" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        //glue indicates path to step definitions
        glue = {"com/vytrack/step_definitions"},
        //dry tun - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)
public class CukesRunner {
}
