package pageObject.WhenIWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAndSchedulePom {

	private static WebElement element = null;
	private static String id = null;
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
	
	//  schedule shift dashboard
	public static WebElement scheduleShiftDashboard_link(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[href='/scheduler']"));
		return element;
	}
	
	public static String scheduleShiftDashboard_link() {
		cssSelector = "[href='/scheduler']";
		return cssSelector;
	}
	
	// new shift popup
	public static WebElement newScheduleShift_popup(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[href='/scheduler']"));
		return element;
	}
	
	public static String newScheduleShift_popup() {
		cssSelector = "[href='/scheduler']";
		return cssSelector;
	}
	
	// new shift pencil edit btn
	public static WebElement newShiftPencilEdit_btn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[class='icon fa fa-pencil']"));
		return element;
	}
	
	public static String newShiftPencilEdit_btn() {
		cssSelector = "[class='icon fa fa-pencil']";
		return cssSelector;
	}
	
	// shift time txtbx
	public static WebElement shiftTime_txtbx(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[class='field-time ui-autocomplete-input']"));
		return element;
	}
	
	public static String shiftTime_txtbx() {
		cssSelector = "[class='field-time ui-autocomplete-input']";
		return cssSelector;
	}
	
	// shift positon dropdown
	public static WebElement shiftPosition_dropdown(WebDriver driver) {
		element = driver.findElement(By.id("s2id_autogen45"));
		return element;
	}
	
	public static String shiftPosition_dropdown() {
		id = "s2id_autogen45";
		return id;
	}
	
	// text area notes
	public static WebElement textAreaNotes_txtbx(WebDriver driver) {
		element = driver.findElement(By.cssSelector("textarea[name='notes']"));
		return element;
	}
	
	public static String textAreaNotes_txtbx() {
		cssSelector = "textarea[name='notes']";
		return cssSelector;
	}
	
	// create and publish button
	public static WebElement createPublish_btn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[class='button-kit small green right button-save-publish']"));
		return element;
	}
	
	public static String createPublish_btn() {
		cssSelector = "[class='button-kit small green right button-save-publish']";
		return cssSelector;
	}
	
}

