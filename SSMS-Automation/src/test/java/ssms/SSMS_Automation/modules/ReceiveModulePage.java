package ssms.SSMS_Automation.modules;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import ssms.SSMS_Automation.Base;

public class ReceiveModulePage extends Base {
	
	//Receive UI Elements xpath
	public final String receiveTabLink_xpath="//*[@role='img']/following-sibling::span[contains(text(),'Receive')]";
	public final String receive_Link_xpath="//span[text()=' Receive ']";
	public final String customerClarification_Link_xpath="//span[contains(text(),' Customer Clarification ')]";
	public final String pendingReceiveFromVendor_Link_xpath="//span[contains(text(),' Pending/Receive from Vendor ')]";
	public final String pendingCheckFromInternetCustomer_xpath="//span[contains(text(),' Pending Check from Internet Customer ')]";
	public final String extraDetailsTabLink_xpath="//mat-panel-title[contains(text(),' Extra Details ')]";
	public final String uploadKML_Link_xpath="//span[contains(text(),'Upload KML')]";
	public final String uploadBills_Link_xpath="//span[contains(text(),'Upload Bills')]";
	public final String dealerSatisfactionForm_Link_xpath="//span[contains(text(),' Dealer Satisfaction Form ')]";
	
	//Add, Search and Refresh
	public final String addButton_xpath="//mat-icon[contains(text(),'add')]";
	public final String searchButton_xpath="//mat-icon[contains(text(),'search')]";
	public final String autoRenew_xpath="//mat-icon[contains(text(),'autorenew')]";
	
	public final String productSale_xpath="//span[text()='Product Sale']";
	public final String quickRepair_xpath="//span[text()='Quick Repair']";
	public final String receive_xpath="//span[text()='Receive']";
	public final String partSale_xpath="//span[text()='Part Sale']";
	public final String bookProduct_xpath="//span[text()='Book Product']";
	public final String bookPart_xpath="//span[text()='Book Part']";
	public final String editCustomer_xpath="//span[text()='Edit Customer']";
	public final String print_xpath="//span[text()='Print']";
	
	//Create new customer
	public final String name_xpath="//input[@placeholder='Name']";
	public final String userName_xpath="//input[@placeholder='Username']";
	public final String mobileNo_xpath="//input[@placeholder='Mobile No']";
	public final String email_xpath="//input[@placeholder='Email']";
	public final String isWalkinCheckBox_xpath="//input[@type='checkbox']";
	public final String password_xpath="//input[@placeholder='Password']";
	public final String ConfirmPwd_xpath="//input[@placeholder='Confirm Password']";
	public final String gstnNo_xpath="//input[@placeholder='GSTIN No']";
	public final String altMobileNo_xpath="//input[@placeholder='Alt Mobile No']";
	public final String birthDate_xpath="//input[@placeholder='Birth Date']";
	public final String gender_xpath="//*[contains(@class,'mat-select-arrow')]";
	//public final String maritalStatus_xpath="//input[@placeholder='Name']";
	//public final String anniversaryDate_xpath="//input[@placeholder='Name']";
	//public final String branch_xpath="//input[@placeholder='Name']";
	//public final String addressType_xpath="//input[@placeholder='Name']";
	public final String addressLine1_xpath="//input[@placeholder='Address Line 1']";
	public final String addressLine2_xpath="//input[@placeholder='Address Line 2']";
	public final String nearestLandMark_xpath="//input[@placeholder='Nearest LandMark']";
	public final String phoneNo_xpath="//input[@placeholder='Phone No']";
	public final String faxNo_xpath="//input[@placeholder='Fax No']";
	//public final String state_xpath="//input[@placeholder='Name']";
	//public final String city_xpath="//input[@placeholder='Name']";
	//public final String area_xpath="//input[@placeholder='Name']";
	public final String pinCode_xpath="//input[@placeholder='Pin Code']";
	//public final String addMoreCustAddress="//span[contains(test(),' Add More Customer  Address')]";
	public final String save_xpath="//span[text()='Save']";
	public final String cancel_xpath="//span[text()='Cancel']";
	public final String receiveError_xpath="//*[contains(@class,'mat-error')]";
	
	//Error messages
	public final String errorMsgNameMoreThan100Char_xpath="//mat-error[contains(text(),'more than 100')]";
	public final String errorMsgNameOnlyAlphaAllow_xpath="//mat-error[contains(text(),' Only alphabets allowed, dots and spaces allowed in between alphabets')]";
	public final String errorMsgMobileMoreThan13Digit_xpath="//mat-error[contains(text(),'more than 13')]";
	public final String errorMsgMobileLessThan10Digit_xpath="//mat-error[contains(text(),'less than 10 characters')]";
	public final String errorMsgMobile_xpath="//mat-error[contains(text(),'Can only be prefixed with optional')]";
	public final String errorMsgFax_xpath="//mat-error[contains(text(),'Fax No cannot have more than 20 characters')]";
	public final String errorMsgFax1_xpath="//mat-error[contains(text(),'Can only be prefixed with optional')]";
	public final String errorMsgPinCodeLessThan4_xpath="//mat-error[contains(text(),'Pin Code cannot have less than 4 characters')]";
	public final String errorMsgPinCodeMorethan10_xpath="//mat-error[contains(text(),'more than 10')]";
	public final String errorMsgOnlyNumAllowed_xpath="//mat-error[contains(text(),' Only numbers are allowed')]";
	public final String errorMsgValidEmail_xpath="//mat-error[contains(text(),'valid email id')]";

	/*
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	
	*/
	
	public void clickReceive() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(receiveTabLink_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(receiveTabLink_xpath)).isDisplayed(),"Receive Tab Is Not Displaying");
			Thread.sleep(5000);
			driver.findElement(By.xpath(receiveTabLink_xpath)).click();
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
			
	}

	
	public void receiveAppearanceOfUI(){
		try {
			Assert.assertTrue(driver.findElement(By.xpath(receive_Link_xpath)).isDisplayed(),"Receive Link Not Displaying");
			//driver.findElement(By.xpath(receive_Link_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(customerClarification_Link_xpath)).isDisplayed(),"Customer Clarification Link Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(pendingReceiveFromVendor_Link_xpath)).isDisplayed(),"Pending/Receive from Vendor Link Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(pendingCheckFromInternetCustomer_xpath)).isDisplayed(),"Pending Check From Internet Customer Link Not Displaying");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(extraDetailsTabLink_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(extraDetailsTabLink_xpath)).isDisplayed(),"Extra Details Tab is Not Displaying");
			Thread.sleep(5000);;
			driver.findElement(By.xpath(extraDetailsTabLink_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(uploadKML_Link_xpath)).isDisplayed(),"Upload KML Link is Not Displaying ");
			Assert.assertTrue(driver.findElement(By.xpath(uploadBills_Link_xpath)).isDisplayed(),"Upload Bills is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(dealerSatisfactionForm_Link_xpath)).isDisplayed(),"Dealer Satisfaction Form is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(addButton_xpath)).isDisplayed(),"add Button Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(searchButton_xpath)).isDisplayed(),"Search Button Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(autoRenew_xpath)).isDisplayed(),"auto renew Button Not Displaying");
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		 
	}
	
	public void clickAdd() {
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath(addButton_xpath)).click();
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void addCustomer(String name, String mobile, String email, String gstnNo,String altMobileNo, String dob) {
		try {
			driver.findElement(By.xpath(name_xpath)).clear();
			driver.findElement(By.xpath(name_xpath)).sendKeys(name);
			driver.findElement(By.xpath(mobileNo_xpath)).clear();
			driver.findElement(By.xpath(mobileNo_xpath)).sendKeys(mobile);
			driver.findElement(By.xpath(email_xpath)).clear();
			driver.findElement(By.xpath(email_xpath)).sendKeys(email);
			//Thread.sleep(5000);
			//if ( !driver.findElement(By.xpath(isWalkinCheckBox_xpath)).isSelected() )
			//{
				//Thread.sleep(5000);
			     //driver.findElement(By.xpath(isWalkinCheckBox_xpath)).click();
			//}
			driver.findElement(By.xpath(gstnNo_xpath)).clear();
			driver.findElement(By.xpath(gstnNo_xpath)).sendKeys(gstnNo);
			driver.findElement(By.xpath(altMobileNo_xpath)).clear();
			driver.findElement(By.xpath(altMobileNo_xpath)).sendKeys(altMobileNo);
			driver.findElement(By.xpath(birthDate_xpath)).clear();
			driver.findElement(By.xpath(birthDate_xpath)).sendKeys(dob);
			//WebElement dropropDown = driver.findElement(By.xpath(gender_xpath));
			driver.findElement(By.xpath(save_xpath)).click();
			
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void validateReceiveErrorMsg() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(receiveError_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(receiveError_xpath)).isDisplayed()," Error Message is not displaying properly");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void validationLengthOfTextbox(){
		nameInputValidation();
		mobileInputValidation();
		emailFieldInputValidation();
		phoneInputValidation();
		faxInputValidation();
		pincodeFieldInputValidation();
	}
	
	public void nameInputValidation(){
		try{
			String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			String name1= "123asddd";
			driver.findElement(By.xpath(name_xpath)).clear();
			driver.findElement(By.xpath(name_xpath)).sendKeys(name);
			driver.findElement(By.xpath(save_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameMoreThan100Char_xpath)).isDisplayed(),"Error not Displayed Properly");
			
			driver.findElement(By.xpath(name_xpath)).clear();
			driver.findElement(By.xpath(name_xpath)).sendKeys(name1);
			driver.findElement(By.xpath(save_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameOnlyAlphaAllow_xpath)).isDisplayed(),"Error not Displayed Properly");
			
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
		public void mobileInputValidation(){
			try{
				String mobile = "99999999999999";
				String mobile1 = "9-9999999212";
				String mobile2="2222";
				driver.findElement(By.xpath(mobileNo_xpath)).clear();
				driver.findElement(By.xpath(mobileNo_xpath)).sendKeys(mobile);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobileMoreThan13Digit_xpath)).isDisplayed(),"Error not Displayed Properly");
				driver.findElement(By.xpath(mobileNo_xpath)).clear();
				driver.findElement(By.xpath(mobileNo_xpath)).sendKeys(mobile1);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobile_xpath)).isDisplayed(),"Error not displaying properly");
				driver.findElement(By.xpath(mobileNo_xpath)).clear();
				driver.findElement(By.xpath(mobileNo_xpath)).sendKeys(mobile2);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobileLessThan10Digit_xpath)).isDisplayed(),"Error not displaying properly");
			}catch(Exception e){
				System.out.println(e);
				Assert.fail("Fail due to exception "+e.getMessage());
			}
		}
		
		public void faxInputValidation(){
			try{
				String fax = "99999999999999999999555";
				String fax1 = "22-9999";
				driver.findElement(By.xpath(faxNo_xpath)).clear();
				driver.findElement(By.xpath(faxNo_xpath)).sendKeys(fax);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgFax_xpath)).isDisplayed(),"Error not Displayed Properly");
				driver.findElement(By.xpath(faxNo_xpath)).clear();
				driver.findElement(By.xpath(faxNo_xpath)).sendKeys(fax1);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgFax1_xpath)).isDisplayed(),"Error not displaying properly");
			}catch(Exception e){
				System.out.println(e);
				Assert.fail("Fail due to exception "+e.getMessage());
			}
		}
		
		public void phoneInputValidation(){
			try{
				String phone = "99999999999999";
				String phone1 = "9-9999999212";
				String phone2 = "9000";
				driver.findElement(By.xpath(phoneNo_xpath)).clear();
				driver.findElement(By.xpath(phoneNo_xpath)).sendKeys(phone);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobileMoreThan13Digit_xpath)).isDisplayed(),"Error not Displayed Properly");
				driver.findElement(By.xpath(phoneNo_xpath)).clear();
				driver.findElement(By.xpath(phoneNo_xpath)).sendKeys(phone1);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobile_xpath)).isDisplayed(),"Error not displaying properly");
				driver.findElement(By.xpath(phoneNo_xpath)).clear();
				driver.findElement(By.xpath(phoneNo_xpath)).sendKeys(phone2);
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgMobileLessThan10Digit_xpath)).isDisplayed(),"Error not displaying properly");
			}catch(Exception e){
				System.out.println(e);
				Assert.fail("Fail due to exception "+e.getMessage());
			}
		}
		
		public void emailFieldInputValidation() {
			try {
				driver.findElement(By.xpath(email_xpath)).clear();
				driver.findElement(By.xpath(email_xpath)).sendKeys("abc@gmaiccc");
				driver.findElement(By.xpath(save_xpath)).click();
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgValidEmail_xpath)).isDisplayed(),"Valid Email Id error message is not displaying");
				
			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Fail due to exception "+e.getMessage());
			}
			
		}
		
		public void pincodeFieldInputValidation(){
			try{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pinCode_xpath)));
				driver.findElement(By.xpath(pinCode_xpath)).sendKeys("1");
				driver.findElement(By.xpath(save_xpath)).click();
				String errorMsg = driver.findElement(By.xpath(errorMsgPinCodeLessThan4_xpath)).getText();
				System.out.println(errorMsg);
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgPinCodeLessThan4_xpath)).isDisplayed(),"Pin Code TextBox Less than 4 Error Message is Not Displaying");
				driver.findElement(By.xpath(pinCode_xpath)).clear();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pinCode_xpath)));
				driver.findElement(By.xpath(pinCode_xpath)).sendKeys("123123123456");
				driver.findElement(By.xpath(save_xpath)).click();
				String errorMsg2 = driver.findElement(By.xpath(errorMsgPinCodeMorethan10_xpath)).getText();
				System.out.println(errorMsg2);
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgPinCodeMorethan10_xpath)).isDisplayed(),"Pin Code TextBox More than 10 Error Message is Not Displaying");
				driver.findElement(By.xpath(pinCode_xpath)).clear();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pinCode_xpath)));
				driver.findElement(By.xpath(pinCode_xpath)).sendKeys("asdcv");
				driver.findElement(By.xpath(save_xpath)).click();
				String successMsg = driver.findElement(By.xpath(errorMsgOnlyNumAllowed_xpath)).getText();
				System.out.println(successMsg);
				Assert.assertTrue(driver.findElement(By.xpath(errorMsgOnlyNumAllowed_xpath)).isDisplayed(),"Pin Code TextBox Only Numbers Allowed Message is Not Displaying");
				
			}catch(Exception e){
				System.out.println(e);
				Assert.fail("Fail due to exception "+e.getMessage());
			}
			
		}


}
