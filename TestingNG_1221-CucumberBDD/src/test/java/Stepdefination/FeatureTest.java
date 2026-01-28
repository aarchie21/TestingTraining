package Stepdefination;

import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/java/Stepdefination/feature1.feature"},
	glue="Stepdefination",
	tags="@tag1 and not @tag2",
	plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json"
	}
)

public class FeatureTest extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
  }
}
