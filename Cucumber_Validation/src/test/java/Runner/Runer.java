package Runner;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"C:\\Users\\aarchie.dhawan\\eclipse-workspace\\Cucumber_Validation\\src\\test\\java\\Feature"},
glue="StepDefinition",
tags="@tag1",
plugin= {
	"pretty",
	"html:target/cucumber-reports/cucumber.html",
	"json:target/cucumber-reports/CucumberTestReport.json",
	"junit:target/cucumber-reports/CucumberTestReport1 .xml"
}
)

public class Runer extends AbstractTestNGCucumberTests {
}
