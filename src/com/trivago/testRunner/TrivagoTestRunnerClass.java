package com.trivago.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources/features",
		glue={"com/trivago/useCases"},
		monochrome=true,
		format = {"pretty","html:Reports"}
		)
public class TrivagoTestRunnerClass {

}
