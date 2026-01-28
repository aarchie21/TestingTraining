package RunnerPackage;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\java\\FeaturesPackage"},
glue="StepDefinitionPackage",
tags="@tag1",
plugin= {
	"pretty",
	"html:target/cucumber-reports/cucumber.html",
	"json:target/cucumber-reports/CucumberTestReport.json",
	"junit:target/cucumber-reports/CucumberTestReport1 .xml"
}
)

public class runner extends AbstractTestNGCucumberTests {

}
