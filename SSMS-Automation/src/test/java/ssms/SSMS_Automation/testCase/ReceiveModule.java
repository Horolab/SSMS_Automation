package ssms.SSMS_Automation.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;
import ssms.SSMS_Automation.modules.AdminModulePage;
import ssms.SSMS_Automation.modules.HomePage;
import ssms.SSMS_Automation.modules.Login;
import ssms.SSMS_Automation.modules.ReceiveModulePage;

public class ReceiveModule extends Base {
	
	static Login login = new Login();
	static ReceiveModulePage receiveModlePage = new ReceiveModulePage();
	static HomePage homePage = new HomePage();
	
	
	@Test(priority=0, description="Verify that when ESSMS user login and click on Receive Module they can able to view the existing customer ")
	public void Tc_Receive_001()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.receiveAppearanceOfUI();
	}
	
	@Test(priority=1, description="Verify that ESSMS user can able to view the existing register customer details")
	public void Tc_Receive_002()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		//TODO
	}
	
	@Test(priority=2, description="Verify that ESSMS user can able to view the create Receive page")
	public void Tc_Receive_003() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		//TODO
	}
	
	@Test(priority=3, description="Verify that by entering all the mandatory fields")
	public void Tc_Receive_004()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer("Ada", "8861012914", "abc@gmail.com", "123654", "123654789", "01/14/1994");
		
		//TODO
	}
	
	@Test(priority=4, description="Verify that by leaving one or all mandatory fields")
	public void Tc_Receive_005()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer("Ada", "8861012914", "abc@gmail.com", "123654", "123654789", "01/14/1994");
		receiveModlePage.validateReceiveErrorMsg();
	}
	
	@Test(priority=5, description="Verify that by leaving one or all mandatory fields")
	public void Tc_Receive_006()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer("Ada", "8861012914", "abc@gmail.com", "123654", "123654789", "01/14/1994");
		receiveModlePage.validateReceiveErrorMsg();
	}

	@Test(priority=6, description="Validation on Data type of the textbox")
	public void Tc_Receive_007()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.validationLengthOfTextbox();
	}
	
	@Test(priority=7, description="")
	public void Tc_Receive_008()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.validationLengthOfTextbox();
		//TODO
	}

}
