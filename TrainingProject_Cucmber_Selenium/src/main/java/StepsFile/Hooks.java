package StepsFile;

import ExcelRead.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	BaseClass base=new BaseClass();
	
	@Before
	public void LaunchHook() {
		base.invokeBrowser();
	}
	@After
	public void quitDriver() {
		base.quit_browser();
	}
	
	
}
