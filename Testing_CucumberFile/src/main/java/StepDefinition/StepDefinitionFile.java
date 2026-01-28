package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFile {
		@Given("I want to write a step with {string}")
		public void f1(String name) {
			System.out.println("I want to write a step with "+name);
		}
		@When("I want to enter {int} id as num")
		public void f2(int id) {
			System.out.println("I want to enter "+id+" id as num");
		}
		 @And("I want to enter {double} as salary")
		public void f3(double salary) {
			System.out.println("I want to enter "+salary+" as salary");
		}
		
		 @Given("The user is in Login Form")
		 public void f1(){
			 System.out.println("The user is in Login Form");
		 }
		 
		  @When("The user enters {string} in username field")
		  public void f2(String uName) {
				System.out.println("The user enters "+uName+" in username field");
		}
		  
		 @And("The user enters {string} in password field")
		 public void f3(String pass) {
			 System.out.println("The user enters "+pass+" in password field");
		 }
		 @And("The user clicks on Login button")
		 public void f4() {
			 System.out.println("The user clicks on Login button");
		 }
		 @Then("The user get the status message as {string} in alert")
		 public void f5(String status) {
			 System.out.println("The user get the status message as "+status+" in alert");
		 }
}
