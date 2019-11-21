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
public class AdminModulePage extends Base {
	public final String adminTabLink_xpath="//span[contains(text(),'Admin')]";
	public final String locationLink_xpath="//mat-panel-title[contains(text(),'Location')]";
	public final String state_Link_xpath="//span[contains(text(),'State')]";
	public final String addNew_Button_xpath="//mat-icon[contains(text(),'add')]";
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
	/*
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
	public final String saveState_xpath="//span[text()='Save']";
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
	public void addState(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(adminTabLink_xpath)));
		Assert.assertTrue(driver.findElement(By.xpath(adminTabLink_xpath)).isDisplayed(),"Admin Tab Not Displaying");
		driver.findElement(By.xpath(adminTabLink_xpath)).click();
		Assert.assertTrue(driver.findElement(By.xpath(locationLink_xpath)).isDisplayed(),"Location Link Not Displaying");
		Assert.assertTrue(driver.findElement(By.xpath(state_Link_xpath)).isDisplayed(),"State Link Not Displaying");
		driver.findElement(By.xpath(addNew_Button_xpath)).click();
	}
	
	public void adminAppearanceOfCreateStateUI() {
		try {   
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("1");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			String errorMsg = driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).isDisplayed(),"Code TextBox Less than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("123");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
			String errorMsg2 = driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).isDisplayed(),"Code TextBox More than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(codeTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(codeTextBox_xpath)));
			driver.findElement(By.xpath(codeTextBox_xpath)).sendKeys("48");
			driver.findElement(By.xpath(tinTextBox_xpath)).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("1");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			String errorMsg = driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinLessThan2_xpath)).isDisplayed(),"TIN TextBox Less than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("123");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			String errorMsg2 = driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgCodeTinMorethan2_xpath)).isDisplayed(),"TIN TextBox More than 2 Error Message is Not Displaying");
			driver.findElement(By.xpath(tinTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tinTextBox_xpath)));
			driver.findElement(By.xpath(tinTextBox_xpath)).sendKeys("99");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("TestingindiaIsAGoodCountryTestingindiaIsAGoodCountryTestingindiaIsAGoodCountryTestingindiaIsAGoodCountry");
			driver.findElement(By.xpath(nameTextBox_xpath)).click();
			String errorMsg = driver.findElement(By.xpath(errorMsgNameMoreThan100Char_xpath)).getText();
			System.out.println(errorMsg);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsgNameMoreThan100Char_xpath)).isDisplayed(),"Name TextBox More than 100 Char Error Message is Not Displaying");
			driver.findElement(By.xpath(nameTextBox_xpath)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nameTextBox_xpath)));
			driver.findElement(By.xpath(nameTextBox_xpath)).sendKeys("Virat Kohli");
			String errorMsg2 = driver.findElement(By.xpath(validMsgNameUnder100_xpath)).getText();
			System.out.println(errorMsg2);
			Assert.assertTrue(driver.findElement(By.xpath(validMsgNameUnder100_xpath)).isDisplayed(),"Name TextBox Less than 100 Valid Message is Not Displaying");
			
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	}
	

