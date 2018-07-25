package pageObject.WhenIWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPagePom {

	private static WebElement element = null;
	private static String id = null;
	private static String xpath = null;
	
	// signinUsername txtbx								
		public static WebElement dashboardNavLink_btn(WebDriver driver){								
			element = driver.findElement(By.id("dashboard-nav-link"));							
			return element;							
		}								
		public static String dashboardNavLink_btn(){								
			id = "dashboard-nav-link";							
			return id;							
		}
	
		// schedule title							
		public static WebElement dashboardGreetingTitle_txt(WebDriver driver){								
			element = driver.findElement(By.xpath("//*[@id=\"today-schedule\"]/div[1]/div"));							
			return element;							
		}								
		public static String dashboardGreetingTitle_txt(){								
			xpath = "//*[@id=\"today-schedule\"]/div[1]/div";							
			return xpath;							
		}
}
