package whenIWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObject.WhenIWork.HomePageAndSchedulePom;
import setup.TestSetupHooks;

public class TestAddSchedule extends TestSetupHooks {

	public String AzetaEmail = "azetaworks@gmail.com";
	public String Password = "Test1234567";	
	
	@Test
	public void addNewShift() throws InterruptedException {

		//login to add new shift
		functions.login(driver, AzetaEmail, Password);
		
		// click on schedule a shift link
		HomePageAndSchedulePom.scheduleShiftDashboard_link(driver).click();
		
		// grab first cell for ee Azeta 
		driver.findElement(By.xpath("//*[@id=\"user-row-33090782\"]/div[2]/div[3]/div[1]")).click();
		
		// wait for assign shift popup to appear
		functions.waitForElementToBeClickable(driver, HomePageAndSchedulePom.newScheduleShift_popup(), "cssSelector");
		
		//click on edit pencil
		HomePageAndSchedulePom.newShiftPencilEdit_btn(driver).click();
		
		//wait for the shift time textbox to appear
		functions.waitForElementToBeClickable(driver, HomePageAndSchedulePom.shiftTime_txtbx(), "cssSelector");
		
		// sendkeys a shift time to the textbox
		HomePageAndSchedulePom.shiftTime_txtbx(driver).sendKeys("10a-5p");
		
		// if the shift position does not contain Manager, always make sure the driver selects Manager option from dropdown
        if (!HomePageAndSchedulePom.shiftPosition_dropdown().contains("Managers")) {
            functions.selectDropdownOption(driver, HomePageAndSchedulePom.shiftPosition_dropdown(driver), "Managers");
        }
		
        // send keys to textbox
        HomePageAndSchedulePom.textAreaNotes_txtbx(driver).sendKeys("Hello World!");
        
	
	}

}
