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
		
}
