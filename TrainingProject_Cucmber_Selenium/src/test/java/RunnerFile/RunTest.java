package RunnerFile;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/FeaturesFile"},
glue="StepsFile",
tags="@tag1")

public class RunTest extends AbstractTestNGCucumberTests{

}
