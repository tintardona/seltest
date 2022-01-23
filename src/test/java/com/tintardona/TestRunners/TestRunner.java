package com.tintardona.TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith((Cucumber.class))
@CucumberOptions(
		features = "src/test/resources/com/tintardona/Features/NewUser.feature"
		,glue={"com.tintardona.StepDefinitions"}
		)

public class TestRunner {

}