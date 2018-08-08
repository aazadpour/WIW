package whenIWork;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.WhenIWork.LoginPagePom;
import setup.TestSetupHooks;
import utils.Functions_WIW;

public class TestAddSchedule extends TestSetupHooks {

	public String AzetaEmail = "azetaworks@gmail.com";
	public String Password = "Test1234567";	
	
	@Test
	public void addNewShift() throws InterruptedException {

		//login to add new shift
		functions.login(driver, AzetaEmail, Password);
		
		// wait for page to load
		
		// 
	
	}

}
