package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features= "src//test//resources//Feature//Act.feature",
		glue={"stepdef"},
		monochrome=true,
				 plugin = {
					        "pretty",                                            // readable console output
					        "html:target/cucumber-reports.html",                 // HTML report
					        "json:target/cucumber.json",                         // JSON report
					        "junit:target/cucumber.xml"                          // JUnit report
					    } 
		)


public class TestRunner {

}
