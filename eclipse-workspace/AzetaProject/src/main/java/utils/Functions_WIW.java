package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions_WIW {
	
	// Wait for element to be clickable
		@SuppressWarnings("unused")
		public synchronized void waitForElementToBeClickable(RemoteWebDriver driver, String field, String locatorType) throws InterruptedException
		{
			
			System.out.println("Wait for element " + field);
			
			// Wait for element
			WebDriverWait wait = new WebDriverWait(driver, 40);
			if (locatorType.equals("id"))
			{
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(field)));
			}
			else if (locatorType.contains("css"))
			{
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(field)));
			}
			else if (locatorType.equals("linkText"))
			{
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(field)));
			}
			else if (locatorType.equals("xpath"))
			{
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(field)));
			}
			
		} // end waitForElementToBeClickable
		
		// login to WIW
		@SuppressWarnings("unused")
		public synchronized void login(RemoteWebDriver driver, String username, String password) throws InterruptedException
		{
			
			// print out test kicking off
			System.out.println("Beginning loginCorrectCredentials Test ");
			
			// have the driver obtain the url of the page
			driver.get("https://login.wheniwork.com");
			
			// sending email to email textbox
			driver.findElement(By.id("email")).sendKeys(username);
			
			// send password to password textbox
			driver.findElement(By.id("password")).sendKeys(password);
			
			// click login button
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div[1]/div/form/div[3]/div/button")).click();
			
		} // end waitForElementToBeClickable
		
}
