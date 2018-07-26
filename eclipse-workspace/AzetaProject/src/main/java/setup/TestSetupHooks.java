package setup;

import utils.Functions_WIW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestSetupHooks {
	
	// shorthand name so that it can be called easily in other classes that extend this one
	public static Functions_WIW functions = new Functions_WIW();
	
	// set driver
	public RemoteWebDriver driver;

	
	// this begins and sets up the driver before every scenario 
	@BeforeMethod //@Before in Cucumber
	public void beforeScenario() {
		
		// @Given The test is about to begin
		// @When the Driver is set and the path is correctly set
		
		// set driverpath variable
		String driverPath = "C:\\chromedriver.exe";
		System.out.println("Begin @Before Setup");
		// set the sys property for the driver path
		System.setProperty("webdriver.chrome.driver", driverPath);
		// @Then start up the driver
		driver = new ChromeDriver();
		
	}
	
	// this kills the driver at the end of every scenario 
	@AfterMethod() //@After in Cucumber
	public void afterScenario() throws Exception {
		// @Given tests have finished running 
		// @When tests are not throwing compile errors
		
		// print out end of test setup
		System.out.println("End @After Setup");
		// @Then the driver will be stopped
		driver.quit();
	}
	
	
}
