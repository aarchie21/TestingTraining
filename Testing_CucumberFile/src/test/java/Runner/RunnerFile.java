package Runner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\java\\Feature"},
glue="StepDefinition",
tags="@tag2 or @tag3",
plugin= {
	"pretty",
	"html:target/cucumber-reports/cucumber.html",
	"json:target/cucumber-reports/CucumberTestReport.json",
	"junit:target/cucumber-reports/CucumberTestReport1 .xml"
}
)
public class RunnerFile extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
  }
}
