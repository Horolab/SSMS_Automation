package ssms.SSMS_Automation.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;
import ssms.SSMS_Automation.modules.AdminModulePage;
import ssms.SSMS_Automation.modules.HomePage;
import ssms.SSMS_Automation.modules.Login;
import ssms.SSMS_Automation.modules.ReceiveModulePage;
import ssms.SSMS_Automation.modules.ReceiveSearchModulePage;

public class ReceiveModule extends Base {
	
	static Login login = new Login();
	static ReceiveModulePage receiveModlePage = new ReceiveModulePage();
	static ReceiveSearchModulePage receiveSearchPage = new ReceiveSearchModulePage();
	static HomePage homePage = new HomePage();
	
	/*
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
	
	@Test(priority=7, description="Verify Tab, undo-redo, copy-paste feature applicable or not")
	public void Tc_Receive_008()  {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.validationLengthOfTextbox();
	} 
	
	@Test(priority=8, description="Create Receive with valid data")
	private void Tc_Receive_009() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer("Adapatil", "8861212915", "ada_patil@gmail.com", "123654", "123654789", "01/14/1994");

	}
	
	@Test(priority=9, description="Create Receive with invalid data")
	private void Tc_Receive_010() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer(" ", "8861212915", "ada_patil@gmail.com", "123654", "123654789", "01/14/1994");
		receiveModlePage.validateReceiveErrorMsg();

	} 
	
	@Test(priority=10, description="Cancel Receive")
	private void Tc_Receive_011() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.addCustomer(" ", "8861212915", "ada_patil@gmail.com", "123654", "123654789", "01/14/1994");
		receiveModlePage.cancelReceive();

	}
	
	
	@Test(priority=11, description="Check add more address button")
	private void Tc_Receive_012() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveModlePage.clickAdd();
		receiveModlePage.customerAddMoreAddress("home");

	}
	
	@Test(priority=12, description="Search an Existing customer by name")
	private void Tc_Receive_013() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveSearchPage.clickReceiveSearch();
		receiveSearchPage.searchByName("CBA");

	}
	
	@Test(priority=13, description="Search an Existing customer by mobile no.")
	private void Tc_Receive_014() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveSearchPage.clickReceiveSearch();
		receiveSearchPage.searchByMobile("1232343454");

	}
	
	@Test(priority=14, description="Search an Existing customer by email id")
	private void Tc_Receive_015() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveSearchPage.clickReceiveSearch();
		receiveSearchPage.searchByEmail("CBA@GMAIL.COM");

	}*/
	
	@Test(priority=15, description="Search an Existing customer by partial search")
	private void Tc_Receive_016() {
		login.logIn("pawan", "punshegde");
		receiveModlePage.clickReceive();
		receiveSearchPage.clickReceiveSearch();
		receiveSearchPage.searchByPartial("CB@%");

	}
	

}
