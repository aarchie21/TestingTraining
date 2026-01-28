package Cucumber_BDD;

import io.cucumber.java.en.Given;

public class StepDefinitionFile {
	@Given("I want to write a step with {string}")
	public void f1() {
		System.out.println("I want to write a step with {string}");
	}

}
