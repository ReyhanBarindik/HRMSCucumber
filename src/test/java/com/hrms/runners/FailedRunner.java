package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "@target/failed.txt" // specify which feature file to run
		// in our case we do say to run all features inside features package

		, glue = "com/hrms/steps" // where we can find implementation code for gherkin steps?
									// we specify just package

		, monochrome = true
		
		, plugin = {
				"pretty", // prints gherkin steps in
						
				
		}
		)



public class FailedRunner {

}
