package ssms.SSMS_Automation.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;

/**
 * @author uma.Sasmal
 *
 */
public class FieldVerificationStateOfAdminModulePage extends Base {
	
	public final String codeTextBox_xpath="//span[text()='Save']/preceding::input[3]";
	public final String tinTextBox_xpath="//span[text()='Save']/preceding::input[2]";
	public final String nameTextBox_xpath="//span[text()='Save']/preceding::input[1]";
	public final String saveState_xpath="//span[text()='Save']";
	public final String stateCancel_Button_xpath="//span[text()='Save']/following::span[1]";
	public final String errorMsgCodeTinLessThan2_xpath="//mat-error[contains(text(),'less than 2')]";
	public final String errorMsgCodeTinMorethan2_xpath="//mat-error[contains(text(),'more than 2')]";
	public final String validMsgCodeTinExact2Entry_xpath="//mat-hint[contains(text(),'2/2')]";
	public final String errorMsgNameMoreThan100Char_xpath="//mat-error[contains(text(),'more than 100')]";
	public final String validMsgNameUnder100_xpath="//mat-hint[contains(text(),'/100')]";
	
	public final String errorMsgNameNonAlphabet_xpath="//mat-error[contains(text(),'Only alph')]";
	
	public final String errorAlreadyStateExists_xpath="//mat-error[contains(text(),'already exists')]";
	
	public final String emptyCodeErrorMsg_xpath="(//mat-error[@class='mat-error'])[1]";
	
	public final String clearIcon_xpath="//mat-icon[contains(text(),'close')]";
	/*public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	
	*/
	
	
	
	
	
	
	
	
	
	/*Modular Methods*/
	
		//Appearance of Create State UI
	/**
	 * @author uma.Sasmal
	 */
	
	
	
	
	
	public void codeInputValidationAlphaNumeric(){
		try{
			
			
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
	
	public void nameFieldInputValidationAlphaNumericSpecialChar(){
		try{
			
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
	}
	
	public void clearTextBoxState(){
		try{
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
	
	public void validStateEnter(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveState_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("93");
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("MH");
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Maharastra");
			Assert.assertTrue(driver.findElement(By.xpath(saveState_xpath)).isDisplayed(),"Save Button is Not Displaying");
			driver.findElement(By.xpath(saveState_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	}
	

