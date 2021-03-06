package whenIWork;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.WhenIWork.HomePageAndSchedulePom;
import pageObject.WhenIWork.LoginPagePom;
import setup.TestSetupHooks;
import org.testng.Assert;

public class TestLoginAndSchedule extends TestSetupHooks  {

	public String wiwLoginPage = "https://login.wheniwork.com/";
	public String AzetaEmail = "azetaworks@gmail.com";
	public String correctPassword = "Test1234567";
	public String incorrectPassword = "Test123456";
	
	@Test
	public void checkLoginTitle() throws InterruptedException {
		
		// print out test kicking off
		System.out.println("Beginning checkLoginTitle Test ");
		
		// 	@Given User is on Login Page
		// have the driver obtain the url of the page
		driver.get(wiwLoginPage);
		
		// @When User loads login page
		// get the title of the page
		String loginPageTitle = driver.getTitle();
		
		// 	@ Then Title of Page is Displayed Successfully
		// assert that the page title is correct
		Assert.assertTrue(loginPageTitle.equals("When I Work :: Schedule, Track, Communicate"), "Error: the login title was not correctly being reflected.");
		
		// print out test finished running
		System.out.println("checkLoginTitle test has finished running");
		
	}
	
	@Test
	public void loginCorrectCredentials() throws InterruptedException {
		
		
		// print out test kicking off
		System.out.println("Beginning loginCorrectCredentials Test ");
		
		// 	@Given User is on Login Page
		// @When User is attempting to Login

		// call login method
		functions.login(driver, AzetaEmail, correctPassword);
		
		// @Then user will land on dashboard
		functions.waitForElementToBeClickable(driver, LoginPagePom.dashboardNavLink_btn(), "id");
		Assert.assertTrue(LoginPagePom.dashboardGreetingTitle_txt(driver).getText().equals("Hi Azeta! Today's Schedule for QA Engineering Sample"),"Error: The URL does not match the landing page's correct URL");
		
		// print out test finished running
		System.out.println("loginCorrectCredentials test has finished running");
	}
	
	@Test
	public void loginFaultyCredentials() throws InterruptedException {
		
		// print out test kicking off
		System.out.println("Beginning loginFaultyCredentials Test ");
		
		// 	@Given User is on Login Page
		// @When User is attempting to Login with faulty credentials
		// use login method from Functions_WIW but pass in the invalid password
		functions.login(driver, AzetaEmail, incorrectPassword);
		
		// click login button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div[1]/div/form/div[3]/div/button")).click();
		
		//  @Then Error appears that User Entered Faulty Credentials
		// wait for red popup to appear
		functions.waitForElementToBeClickable(driver, LoginPagePom.errorLoginRed_popup(), "cssSelector");
		
		// Set the error warning text in a variable to be compared to
		String errorWarningText = LoginPagePom.errorLoginRed_popup(driver).getText();
		
		// assert that the error popup appeared
		Assert.assertTrue(errorWarningText.equals("Incorrect username and/or password. Please try again."), "Error: unable to successfully login with elevated credentials.");
		
		// print out test finished running
		System.out.println("loginFaultyCredentials test has finished running");
		
	}
	
	@Test
	public void viewMySchedule() throws InterruptedException {
		
		// print out test kicking off
		System.out.println("Beginning viewMySchedule Test ");
		
		// @Given User is on Login PAge
		//@When User logs in successfully and goes to My Schedule

		// Use existing login method in Functions_WIW to login to WIW
		functions.login(driver, AzetaEmail, correctPassword);
		
		// wait for hover to view my schedule button appears
		functions.waitForElementToBeClickable(driver, HomePageAndSchedulePom.avatarHomepageHover_btn(), "cssSelector");
		
		// hover on avatar
		Actions builder = new Actions(driver);
		builder.moveToElement(HomePageAndSchedulePom.avatarHomepageHover_btn(driver)).perform();
		driver.findElement(By.cssSelector("[class='avatar has-menu menu-icon']")).click();
		
		// click on my schedule
		builder.moveToElement(HomePageAndSchedulePom.avatarMySchedule_btn(driver)).perform();
		driver.findElement(By.cssSelector("[href='/myschedule/']")).click();
		
		// wait for schedule calendar table to load
		functions.waitForElementToBeClickable(driver, HomePageAndSchedulePom.myScheduleCalendar_tbl(), "cssSelector");
		
		// @Then User can see their current schedule
		// assert that the calendar table is displaying and that there is no error displaying
		Assert.assertTrue(HomePageAndSchedulePom.myScheduleCalendar_tbl(driver).isDisplayed(), "Error: The calendar is not displaying and/or is unable to load successfully");
		
		// print out test finished running
		System.out.println("viewMySchedule test has finished running");
		
		// sleep thread so that page is viewable before driver is killed, for video recording purposes
		Thread.sleep(3000);
	}
	
}
	