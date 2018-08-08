package pageObject.WhenIWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAndSchedulePom {

	private static WebElement element = null;
	private static String cssSelector = null;

	// avatar homepage hover button
	public static WebElement avatarHomepageHover_btn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[class='avatar has-menu menu-icon']"));
		return element;
	}

	public static String avatarHomepageHover_btn() {
		cssSelector = "[class='avatar has-menu menu-icon']";
		return cssSelector;
	}

	// my schedule button in avatar dropdown
	public static WebElement avatarMySchedule_btn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[href='/myschedule/']"));
		return element;
	}
	
	public static String avatarMySchedule_btn() {
		cssSelector = "[href='/myschedule/']";
		return cssSelector;
	}
	
	// my schedule calendar table
	public static WebElement myScheduleCalendar_tbl(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[class='calendar-table']"));
		return element;
	}
	
	public static String myScheduleCalendar_tbl() {
		cssSelector = "[class='calendar-table']";
		return cssSelector;
	}
	
	// my schedule calendar table
	public static WebElement scheduleShiftDashboard_link(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[href='/scheduler']"));
		return element;
	}
	
	public static String scheduleShiftDashboard_link() {
		cssSelector = "[href='/scheduler']";
		return cssSelector;
	}
}

