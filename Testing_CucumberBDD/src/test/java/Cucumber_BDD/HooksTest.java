package Cucumber_BDD;

import io.cucumber.java.*;

public class HooksTest {
	    @Before
	    public void beforeTest() {
	        System.out.println("Before Test");
	    }

	    @After
	    public void afterTest() {
	        System.out.println("After Test");
	    }

	    @Before("@tag3")
	    public void beforeTag() {
	        System.out.println("Before tag3");
	    }

	    @After("@tag3")
	    public void afterTag() {
	        System.out.println("After tag3");
	    }

	    
	    @Before("@tag3 or @tag2")
	    public void beforeWTag() {
	        System.out.println("Before tag3 or tag2");
	    }

	   
	    @After("@tag3 or @tag2")
	    public void afterWTag() {
	        System.out.println("After tag3 or tag2");
	    }


	    @Before("@tag3 and not @tag2")
	    public void beforeATag() {
	        System.out.println("Before tag3 and not tag2");
	    }

	    @After("@tag3 and not @tag2")
	    public void afterATag() {
	        System.out.println("After tag3 and not tag2");
	    }

	    @BeforeStep
	    public void beforeStep() {
	        System.out.println("Before step");
	    }

	    @AfterStep
	    public void afterStep() {
	        System.out.println("After step");
	    }
	}


