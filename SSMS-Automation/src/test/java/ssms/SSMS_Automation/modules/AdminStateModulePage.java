package ssms.SSMS_Automation.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;

/**
 * @author uma.Sasmal
 *
 */
public class AdminStateModulePage extends Base {
	public final String adminTabLink_xpath="//mat-icon[contains(text(),'apps')]/following::mat-icon[2]";
	public final String locationLink_xpath="//mat-panel-title[contains(text(),'Location')]";
	public final String state_Link_xpath="//span[contains(text(),'State')]";
	public final String addNew_Button_xpath="//mat-icon[contains(text(),'add')]";
	public final String codeTextBox_xpath="//span[text()='Save']/preceding::input[3]";
	public final String tinTextBox_xpath="//span[text()='Save']/preceding::input[2]";
	public final String nameTextBox_xpath="//span[text()='Save']/preceding::input[1]";
	public final String saveState_xpath="//span[text()='Save']";
	public final String stateCancel_Button_xpath="//span[text()='Cancel']";
	public final String errorMsgCodeTinLessThan2_xpath="//mat-error[contains(text(),'less than 2')]";
	public final String errorMsgCodeTinMorethan2_xpath="//mat-error[contains(text(),'more than 2')]";
	public final String validMsgCodeTinExact2Entry_xpath="//mat-hint[contains(text(),'2/2')]";
	public final String errorMsgNameMoreThan100Char_xpath="//mat-error[contains(text(),'more than 100')]";
	public final String validMsgNameUnder100_xpath="//mat-hint[contains(text(),'/100')]";
	public final String isActiveSwitchCheckboxFirstRow_xpath="//mat-header-cell[contains(text(),'Active')]/following::div[1]";
	public final String restoreSwitchCheckbox_xpath="//mat-header-cell[contains(text(),'Res')]/following::div[6]";
	public final String editRecordFirstRow_xpath="(//mat-icon[contains(text(),'edit')])[1]";
	public final String ViewTimeLineFirstRecord_xpath="(//mat-icon[contains(text(),'schedule')])[1]";
	public final String deleteYes_xpath="//p[contains(text(),'Are you sure?')]/following::span[1]";
	public final String nameFirstRow_xpath="(//mat-icon[contains(text(),'delete')])[1]/preceding::span[7]";
	public final String errorMsgNameNonAlphabet_xpath="//mat-error[contains(text(),'Only alph')]";

	public final String errorAlreadyStateExists_xpath="//mat-error[contains(text(),'already exists')]";

	public final String emptyCodeErrorMsg_xpath="(//mat-error[@class='mat-error'])[1]";
	public final String deleteRecordFirstRow_xpath="(//mat-icon[contains(text(),'delete')])[1]";
	public final String clearIcon_xpath="//mat-icon[contains(text(),'close')]";
	public final String isActive_xpath="(//*[contains(@id,'mat-slide-toggle')])[1]";
	public final String isActive2_xpath="(//*[contains(@id,'mat-slide-toggle')])[5]";
	public final String delete_popUpMessage_xpath="(//*[text()='Item Deleted.'])[2]";
	public final String deleteStateYesUndo_xpath="(//*[text()='Item Deleted.'])[2]/following::button[1]";
	public final String deleteNoButton_xpath="//span[text()='No']";
	public final String viewTimeLines_xpath="(//mat-icon[contains(text(),'schedule')])[1]";
	public final String searchButton_xpath="//mat-icon[text()='search']";
	public final String searchLocationTextBox_xpath="//input[@placeholder='Search']";
	
	
	/*****************************************Modular Methods*************************************************************/
	/**
	 * @author uma.Sasmal
	 */
	//Appearance of Create State UI
	
	
	
	
	public void searchTextBoxLocationEnter(String stateName){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchLocationTextBox_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(searchLocationTextBox_xpath)).isDisplayed(),"Search Box is not displaying properly");
			driver.findElement(By.xpath(searchLocationTextBox_xpath)).sendKeys(stateName);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void searchLocationClick(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchButton_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(searchButton_xpath)).isDisplayed(),"Search Button is not displaying properly");
			driver.findElement(By.xpath(searchButton_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void undoFunctionDeleteYesState(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteStateYesUndo_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(deleteStateYesUndo_xpath)).isDisplayed(),"Delete Success Message is not displaying properly");
			driver.findElement(By.xpath(deleteStateYesUndo_xpath)).click();
			Thread.sleep(4000);
			driver.navigate().refresh();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void validateDeleteStateSuccessMsg() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete_popUpMessage_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(delete_popUpMessage_xpath)).isDisplayed(),"Delete Success Message is not displaying properly");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	
	
	public void codeInputValidationAlphaNumeric(){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("4A");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			String successMsg = driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).getText();
			System.out.println(successMsg);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"Code TextBox Alphanumeric char Valid Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}

	public void tinInputValidationAlphaNumeric(){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("A1");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			String successMsg = driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).getText();
			System.out.println(successMsg);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"TIN TextBox Alphanumeric Valid Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}
	public void createStateInvalidData(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("93232");
			driver.findElement(By.xpath(saveState_xpath)).click();
			for(int i=1; i<=3; i++){
				String errorMsg = driver.findElement(By.xpath("(//mat-error[@class='mat-error'])["+i+"]")).getText();
				System.out.println(errorMsg);
				Assert.assertTrue(driver.findElement(By.xpath("(//mat-error[@class='mat-error'])["+i+"]")).isDisplayed(),"Invalid State Create Error Message is Not Displaying");
			}
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}
	public void cancelWithAllDataFilled(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("88");
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("MH");
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("WestBengal");
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(),"Cancel Button is Not Displaying");
			driver.findElement(By.xpath(stateCancel_Button_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void cancelWithoutDataFieldsEntry(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stateCancel_Button_xpath)));
			driver.findElement(By.xpath(stateCancel_Button_xpath)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteRecordFirstRow_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).isDisplayed(),"State Add table Element Delete icon is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void nameFieldInputValidationAlphaNumericSpecialChar(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("12345 AAAaaa ZZZzzz");
			driver.findElement(By.xpath(codeTextBox_xpath)).click();
			String errorMsg = driver.findElement(By.xpath(errorMsgNameNonAlphabet_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameNonAlphabet_xpath)).isDisplayed(),"Name TextBox Non Alphabet Error Message is Not Displaying");
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("@@@@@ ZZZzzz");
			driver.findElement(By.xpath(codeTextBox_xpath)).click();
			String errorMsg2 = driver.findElement(By.xpath(errorMsgNameNonAlphabet_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameNonAlphabet_xpath)).isDisplayed(),"Name TextBox Special Char Error Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}

	public void duplicateStateValidation(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("KA");
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("01");
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("KARNATAKAA");
			driver.findElement(By.xpath(saveState_xpath)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorAlreadyStateExists_xpath)));
			String errorMsg = driver.findElement(By.xpath(errorAlreadyStateExists_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorAlreadyStateExists_xpath)).isDisplayed(),"State already exists Error Message is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void mandatoryFieldsWithoutData(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			if(driver.findElement(By.xpath(saveState_xpath)).isDisplayed()){
				driver.findElement(By.xpath(saveState_xpath)).click();
				for(int i=1; i<=3; i++){
					String errorMsg = driver.findElement(By.xpath("(//mat-error[@class='mat-error'])["+i+"]")).getText();
					System.out.println(errorMsg);
					Assert.assertTrue(driver.findElement(By.xpath("(//mat-error[@class='mat-error'])["+i+"]")).isDisplayed(),"Field Required Error Message is Not Displaying");
				}
			}
			else{
				Assert.assertFalse(driver.findElement(By.xpath(emptyCodeErrorMsg_xpath)).isDisplayed(), "Code Field Required Error Message is Not Displaying");
			}
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void clearTextBoxState(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("93");
			driver.findElement(By.xpath(clearIcon_xpath)).click();
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("MH");
			driver.findElement(By.xpath(clearIcon_xpath)).click();
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Maharastra");
			driver.findElement(By.xpath(clearIcon_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(emptyCodeErrorMsg_xpath)).isDisplayed(),"Code Field Required Error Message is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public String validStateEnter(){
		String stateName=null;
		try{	
			stateName=randomString();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("AZ");
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("TN");
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys(stateName);
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(),"Save Button is Not Displaying");
			driver.findElement(By.xpath(saveState_xpath)).click();
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		return (stateName);
	}

	public void verifyCreatedStateName(String stateName){
		
		try{
			Thread.sleep(4000);
			String stateNameInTable = driver.findElement(By.xpath(nameFirstRow_xpath)).getText().trim();
			Assert.assertTrue(stateName.toUpperCase().contentEquals(stateNameInTable),"State Name Not Matching");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void sendSpecialChar(WebElement element, Keys key){
		try{
			element.sendKeys(key);
			//Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"TIN TextBox Alphanumeric Valid Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}

	public void toggleISActivate(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(isActive_xpath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(isActive_xpath)));
			//if(!driver.findElement(By.xpath(isActive_xpath)).getAttribute("class").contains("checked"))
			String status=driver.findElement(By.xpath(isActive_xpath)).getAttribute("class");
			System.out.println(status);
			driver.findElement(By.xpath(isActive_xpath)).click();
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(isActive_xpath)).isDisplayed(),"Radio Checked button is Not Displaying");
			//negative validation
//			Assert.assertTrue(driver.findElement(By.xpath(isActive_xpath)).getAttribute("class").contains(status), "Radio Button is working properly");
			//Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"TIN TextBox Alphanumeric Valid Message is Not Displaying");
//			driver.findElement(By.xpath(isActive_xpath)).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}

	}
	
	public void toogle2Active(){
		try{
			toggleISActivate();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(isActive2_xpath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(isActive2_xpath)));
			//if(!driver.findElement(By.xpath(isActive_xpath)).getAttribute("class").contains("checked"))
			String status=driver.findElement(By.xpath(isActive2_xpath)).getAttribute("class");
			System.out.println(status);
			driver.findElement(By.xpath(isActive2_xpath)).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(isActive2_xpath)).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(isActive_xpath)).click();
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath(isActive2_xpath)).isDisplayed(),"Radio Checked button is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void updateStateValidEntry(){
		try{
			Thread.sleep(10000);
			String curentNameValue = driver.findElement(By.xpath("//button[text()='Name']/following::span[6]")).getText();
			String curentCodeValue = driver.findElement(By.xpath("//button[text()='Code']/following::span[2]")).getText();
			String curentTINValue = driver.findElement(By.xpath("//button[text()='TIN']/following::span[4]")).getText();
			System.out.println("OLD values"+curentNameValue +" "+curentCodeValue+" "+curentTINValue);
			String updatedNameValue = "KOLKATAWESTBENGAL";
			String updatedCodeValue = "11";
			String updateTINValue = "WB";
			AdminStateModulePage adminModulePage = new AdminStateModulePage();
			adminModulePage.editClickFirstState();

			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			//Thread.sleep(5000);
			if(curentCodeValue.contains(updatedCodeValue)){
				driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("37");
			}else{
				driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys(updatedCodeValue);
			}
			//Thread.sleep(5000);

			if(curentTINValue.contains(updateTINValue)){
				driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("KA");
			}else{
				driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys(updateTINValue);
			}
			//Thread.sleep(5000); 

			if(curentNameValue.contains(updatedNameValue)){
				driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Marathahalli");
			}else{
				driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys(updatedNameValue);
			}
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(),"Save Button is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void updateDataSave(){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(saveState_xpath)).click();
			Thread.sleep(5000);
			String newcurentNameValue = driver.findElement(By.xpath("//button[text()='Name']/following::span[6]")).getText();
			String newcurentCodeValue = driver.findElement(By.xpath("//button[text()='Code']/following::span[2]")).getText();
			String newcurentTINValue = driver.findElement(By.xpath("//button[text()='TIN']/following::span[4]")).getText();
			System.out.println("New values "+newcurentNameValue +" "+newcurentCodeValue+" "+newcurentTINValue);
			Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Name']/following::span[6]")).isDisplayed(),"Save Button is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void updateDataCancel(){
		try{
			Thread.sleep(5000);
			

			Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Name']/following::span[6]")).isDisplayed(),"Save Button is Not Displaying");
			driver.findElement(By.xpath(stateCancel_Button_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void updateStateInValidEntry(){
		try{
			Thread.sleep(10000);
			String curentNameValue = driver.findElement(By.xpath("//button[text()='Name']/following::span[6]")).getText();
			String curentCodeValue = driver.findElement(By.xpath("//button[text()='Code']/following::span[2]")).getText();
			String curentTINValue = driver.findElement(By.xpath("//button[text()='TIN']/following::span[4]")).getText();
			System.out.println("OLD values"+curentNameValue +" "+curentCodeValue+" "+curentTINValue);
			AdminStateModulePage adminModulePage = new AdminStateModulePage();
			adminModulePage.editClickFirstState();

			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			Thread.sleep(10000);
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("@@@@37");
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("K12213A");
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Ma121212@@@ rathahalli");
			mandatoryFieldsWithoutData();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	
	
	
	
		//Appearance of Create State UI
	/**
	 * @author uma.Sasmal
	 */
	public void adminTableLinkClick(){
		try{
		Thread.sleep(15000);
		Assert.assertTrue(driver.findElement(By.xpath(adminTabLink_xpath)).isDisplayed(),"Location Link Not Displaying");
		driver.findElement(By.xpath(adminTabLink_xpath)).click();
		Thread.sleep(7000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void addState(){
		try {  
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(12000);
		driver.findElement(By.xpath(adminTabLink_xpath)).click();
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath(locationLink_xpath)).isDisplayed(),"Location Link Not Displaying");
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath(state_Link_xpath)).isDisplayed(),"State Link Not Displaying");
		driver.findElement(By.xpath(addNew_Button_xpath)).click();
	}
		catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void adminAppearanceOfCreateStateUI() {
		try {   
			Thread.sleep(12000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(codeTextBox_xpath)).isDisplayed(),"Code TextBox Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(tinTextBox_xpath)).isDisplayed(),"TIN TextBox Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(nameTextBox_xpath)).isDisplayed(),"Name Text Box Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(),"Save Button Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(stateCancel_Button_xpath)).isDisplayed(),"Cancel Button Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void validationLengthOfTextbox(){
		codeInputValidation();
		tinInputValidation();
		nameFieldInputValidation();
	}
	
	public void codeInputValidation(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("1");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			Thread.sleep(5000);
			String errorMsg = driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).isDisplayed(),"Code TextBox Less than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("123");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			Thread.sleep(5000);
			String errorMsg2 = driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).isDisplayed(),"Code TextBox More than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("48");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			Thread.sleep(5000);
			String successMsg = driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).getText();
			System.out.println(successMsg);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"Code TextBox Exact 2 char Valid Message is Not Displaying");
			
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void tinInputValidation(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("1");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			Thread.sleep(5000);
			String errorMsg = driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).isDisplayed(),"TIN TextBox Less than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("123");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			Thread.sleep(5000);
			String errorMsg2 = driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).isDisplayed(),"TIN TextBox More than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("99");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			Thread.sleep(5000);
			String successMsg = driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).getText();
			System.out.println(successMsg);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgCodeTinExact2Entry_xpath)).isDisplayed(),"TIN TextBox Exact 2 char Valid Message is Not Displaying");
			
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void nameFieldInputValidation(){
		try{
			Thread.sleep(12000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("TestingindiaIsAGoodCountryTestingindiaIsAGoodCountryTestingindiaIsAGoodCountryTestingindiaIsAGoodCountry");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			Thread.sleep(5000);
			String errorMsg = driver.findElement(By.xpath(errorMsgNameMoreThan100Char_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameMoreThan100Char_xpath)).isDisplayed(),"Name TextBox More than 100 Char Error Message is Not Displaying");
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Virat Kohli");
			Thread.sleep(5000);
			String errorMsg2 = driver.findElement(By.xpath(validMsgNameUnder100_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgNameUnder100_xpath)).isDisplayed(),"Name TextBox Less than 100 Valid Message is Not Displaying");
			
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void stateTableIconsValidation(){
		try{
			Thread.sleep(15000);
			Assert.assertTrue(driver.findElement(By.xpath(isActiveSwitchCheckboxFirstRow_xpath)).isDisplayed(),"Is Active Switch Check Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(restoreSwitchCheckbox_xpath)).isDisplayed(),"Restore Switch Check Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(editRecordFirstRow_xpath)).isDisplayed(),"Edit icon is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).isDisplayed(),"Delete icon is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(ViewTimeLineFirstRecord_xpath)).isDisplayed(),"View TimeLine icon is Not Displaying");
			//deleteNewlyCreatedState();
			
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void deleteNewlyCreatedState(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteRecordFirstRow_xpath)));
			driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).click();
			driver.findElement(By.xpath(deleteYes_xpath)).click();
			Thread.sleep(8000);
			
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void editClickFirstState(){
		try{
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editRecordFirstRow_xpath)));
			driver.findElement(By.xpath(editRecordFirstRow_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(), "Save State Button is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void uiValidationEditState(){
		try{
			Thread.sleep(5000);
			
			Assert.assertTrue(driver.findElement(By.xpath(codeTextBox_xpath)).isDisplayed(), "Code Field is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(tinTextBox_xpath)).isDisplayed(), "TIN is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(nameTextBox_xpath)).isDisplayed(), "Name Field is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(), "Save State Button is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(stateCancel_Button_xpath)).isDisplayed(), "Cancel State Button is Not Displaying");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void deleteParagraphValidation(){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).click();
			String deleteParagraphHeader = driver.findElement(By.xpath("//h1[text()='Delete']")).getText();
			String deleteParagraphBody = driver.findElement(By.xpath("//h1[text()='Delete']/following::td[2]")).getText();
//			String yes = driver.findElement(By.xpath("//span[text()='Yes']")).getText();
//			String no = driver.findElement(By.xpath("//span[text()='No']")).getText();
			System.out.println(deleteParagraphHeader +" & "+deleteParagraphBody);
			Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Delete']")).isDisplayed(), "Delete Header is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Delete']/following::td[2]")).isDisplayed(), "Delete Paragraph is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Yes']")).isDisplayed(), "Yes Button is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='No']")).isDisplayed(), "No Button is Not Displaying");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void deleteNoValidation(){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(deleteNoButton_xpath)).isDisplayed(), "No Button is Not Displaying");
			driver.findElement(By.xpath(deleteNoButton_xpath)).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void viewTimeLinesFirstRecordClick(){
		try{
			Assert.assertTrue(driver.findElement(By.xpath(viewTimeLines_xpath)).isDisplayed(), "View Timelines Button is Not Displaying");
			driver.findElement(By.xpath(viewTimeLines_xpath)).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void viewTimeLinesFirstRecordAssertion(){
		try{
			Thread.sleep(7000);
//				String noRecord = driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::p")).getText();
//				String timeago = driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::i[1]")).getText();
			if(driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::p")).isDisplayed())
			{
				Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::p")).isDisplayed(), "Old Record is not Displaying");
			}else{
				Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::i[1]")).isDisplayed(), "Last Modified Record is not Displaying");
			}
			
			driver.navigate().refresh();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void viewTimeLinesOldRecordAssertion(){
		try{
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[contains(text(),'Items per page')]/preceding::button[1]")).click();
			String timeago = driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::i[1]")).getText();
			Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::i[1]")).isDisplayed(), "Last update Record is not Displaying");
			System.out.println(timeago);
			driver.navigate().refresh();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	}
	

