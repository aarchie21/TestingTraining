package test1;

import org.testng.annotations.Test;

public class NewTest {
//  @Test(groups={"retest"})
//  public void f() {
//  System.out.println("My name is ");
//  }
  @Test(groups= {"smoketest"})
  public void smoke1() {
	  System.out.println("Smoke 1");
  }
  
  public void dummyData() {
	  System.out.println("hello1");
  }
  
}
