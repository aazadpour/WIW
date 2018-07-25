package whenIWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.WhenIWork.LoginPagePom;
import setup.TestSetupHooks;
import utils.Functions_WIW;

import org.testng.Assert;

public class TestLogin extends TestSetupHooks {

	public RemoteWebDriver driver;
	String driverPath = "C:\\chromedriver.exe";
	public String wiwLoginPage = "https://login.wheniwork.com/";
	
	@Test
	public void checkLoginTitle() {
		
		// print out test kicking off
		System.out.println("Beginning goToLoginPage Test");
		
		// set the sys property for the driver path
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// start up the driver
		driver = new ChromeDriver();
		
		// have the driver obtain the url of the page
		driver.get(wiwLoginPage);
		
		// get the title of the page
		String loginPageTitle = driver.getTitle();
		
		// assert that the page title is correct
		Assert.assertTrue(loginPageTitle.equals("When I Work :: Schedule, Track, Communicate"), "Error: the login title was not correctly being reflected.");
		
		// kill the driver + close window
		driver.close();
		
		// print out test finished running
		System.out.println("checkLoginTitle test has finished running");
		
	}
	
	@Test
	public void loginCorrectCredentials() throws InterruptedException {
		
		// print out test kicking off
		System.out.println("Beginning loginCorrectCredentials Test ");
		
		// start up the driver
		driver = new ChromeDriver();
		
		// have the driver obtain the url of the page
		driver.get(wiwLoginPage);
		
		// sending email to email textbox
		driver.findElement(By.id("email")).sendKeys("azetaworks@gmail.com");
		
		// send password to password textbox
		driver.findElement(By.id("password")).sendKeys("Test1234567");
		
		// click login button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div[1]/div/form/div[3]/div/button")).click();
		
		// assert that the page landed on app.wheniwork.com
		
		functions.waitForElementToBeClickable(driver, LoginPagePom.dashboardNavLink_btn(), "id");
		Assert.assertTrue(LoginPagePom.dashboardGreetingTitle_txt(driver).getText().equals("Hi Azeta! Today's Schedule for QA Engineering Sample"),"Error: The URL does not match the landing page's correct URL");
		
		// kill the driver + close window
		driver.quit();
		
		// print out test finished running
		System.out.println("loginCorrectCredentials test has finished running");
	}
	
	@Test
	public void loginFaultyCredentials() throws InterruptedException {
		
		// print out test kicking off
		System.out.println("Beginning loginFaultyCredentials Test ");
		
		// start up the driver
		driver = new ChromeDriver();
		
		// have the driver obtain the url of the page
		driver.get(wiwLoginPage);
		
		// sending email to email textbox
		driver.findElement(By.id("email")).sendKeys("azetaworks@gmail.com");
		
		// send password to password textbox
		driver.findElement(By.id("password")).sendKeys("Test123");
		
		// click login button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div[1]/div/form/div[3]/div/button")).click();
		
		// Set the error warning text in a variable to be compared to
		String errorWarningText = LoginPagePom.errorLoginRed_popup(driver).getText();
		
		// assert that the error popup appeared
		Assert.assertTrue(errorWarningText.equals("Incorrect username and/or password. Please try again."), "Error: unable to successfully login with elevated credentials.");
		
		// kill the driver
		driver.close();
		
		// print out test finished running
		System.out.println("loginFaultyCredentials test has finished running");
	}
	
}
	