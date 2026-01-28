package Cucumber_BDD;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\java\\Cucumber_BDD"},
glue="Cucumber_BDD",
tags="@tag2 or @tag3",
plugin= {
	"pretty",
	"html:target/cucumber-reports/cucumber.html",
	"json:target/cucumber-reports/CucumberTestReport.json"
}
)
public class RunnerFile extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
  }
}
 