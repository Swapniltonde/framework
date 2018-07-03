package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src\\test\\java\\testcases"	,
				glue = "stepdef",
				monochrome=true,
				dryRun=false,
				tags= {"@nestedframes"},
				plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/report.json"}
					
		)
public class Runner 
{
	
}
