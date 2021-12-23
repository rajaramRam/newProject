package org.testrun2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\insta.feature",monochrome = true,plugin = {"pretty"},glue = "org.step2")
public class Runnerclass {

	
}
