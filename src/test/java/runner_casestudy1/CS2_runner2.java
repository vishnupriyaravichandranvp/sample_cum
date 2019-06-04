package runner_casestudy1;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="Feature_casestudy/cs2_example2.feature",glue="stepDefinition_casestudy",
	plugin="html:c:\\cucumber-html-report")


public class CS2_runner2 {

}
