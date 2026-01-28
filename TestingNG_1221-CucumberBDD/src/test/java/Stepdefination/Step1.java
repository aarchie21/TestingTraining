package Stepdefination;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class Step1 {
	@Given("I am holding the calculator")
	public void step() {
		System.out.println("I am holding the calculator");
	}
    @When ("I enter the first number")
	public void step2() {
		System.out.println("I enter the first number");
	}
    @And ("I click on + symbol")
	public void step3() {
		System.out.println("I enter the first number");
	}
    @And ("I enter the second number")
	public void step4() {
		System.out.println("I enter the first number");
	}
    @Then ("I must be able to view the sum of the numbers")
	public void step5() {
		System.out.println("I enter the first number");
	}
	@Given("I want to write a step with")
	public void step6() {
		System.out.println("I want to write a step with");
	}

}
