package runner_casestudy1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="Feature_casestudy/cs1_example1.feature",glue="stepDefinition_casestudy",
	plugin="json:target/cucumber1.json")

	public class CS1_runner1 {
		
		

	}



