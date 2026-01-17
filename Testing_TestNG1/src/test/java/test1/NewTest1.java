package test1;

import org.testng.annotations.Test;

public class NewTest1 {
//  @Test(groups={"retest","smoketest"})
//  public void zebra() {
//	  System.out.println("I am inside the zebra");
//  }
  
 @Test(dependsOnMethods={"apple","smoke1"})
 public void cat() {
	 System.out.println("I am inside the cat");
 }
 
 @Test(groups={"smoketest"})
 public void apple() {
	 System.out.println("I am inside the apple");
 }
}
  

