package org.testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\base.feature",glue = "org.steprun",monochrome = true,strict = true)
public class TestRunner {
	
	
	
	

}
