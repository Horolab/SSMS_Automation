package ssms.SSMS_Automation.modules;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;

/**
 * @author uma.Sasmal
 *
 */
public class AdminAreaModulePage extends Base {

	public final String areaLink_xpath="//span[contains(text(),'Area')]";
	public final String nameField_xpath="//input[@placeholder='Name']";
	public final String addButton_xpath="//mat-icon[text()='add']";
	public final String stateDropdown_xpath="//span[text()='Save']/preceding::mat-select[2]";
	public final String citydropdownErrorMsg_xpath="//mat-error[contains(text(),'Require')]";
	public final String errorMsg_NameField_xpath="//input[@placeholder='Name']/following::mat-error[1]";
	public final String cityDropDown_xpath="//span[text()='Save']/preceding::mat-select[1]";
	public final String closeButton1_xpath="(//mat-icon[text()='close'])[1]";
	public final String noneDrop_xpath="//span[contains(text(),'None')]";
	public final String save_button_xpath="//span[text()='Save']";
	public final String searchCityTextBox_xpath="//input[@placeholder='Search']";
	public final String cityReqErrormsg_xpath="//span[text()='Save']/preceding::mat-error";
	public final String more100AreaNameErrorMsg_xpath="//span[text()='Save']/preceding::mat-error[2]";
	public final String areaReqErrorMsg_xpath="//span[text()='Save']/preceding::mat-error[2]";
	/**************************************************Modular Methods****************************************************/

	/**
	 * @author uma.Sasmal
	 */
	
	AdminCityModulePage admincity = new AdminCityModulePage();
	
	public void adminAreaEditUIValidation(){
		try{
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(nameField_xpath)).isDisplayed(),"Name Text Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(stateDropdown_xpath)).isDisplayed(),"State Dropdown is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(cityDropDown_xpath)).isDisplayed(),"City Dropdown is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Cancel']")).isDisplayed(),"Cancel is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(save_button_xpath)).isDisplayed(),"Save is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void areaName_CityErrorMsgValidation(){
		try{
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath(more100AreaNameErrorMsg_xpath)).isDisplayed(),"Name Error Message is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(more100AreaNameErrorMsg_xpath)).isDisplayed(),"City Error Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void areaAddInvalidSelectErrorMsgValidation(){
		try{
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath(cityReqErrormsg_xpath)).isDisplayed(),"City Error Message is Not Displaying");

		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void areaSearch(){
		try{
			Thread.sleep(3000);
			admincity.adminCitySearchButtonClick();
			Thread.sleep(5000);
			String randomArea = getPropertyData("AreaName");

			driver.findElement(By.xpath(searchCityTextBox_xpath)).sendKeys(randomArea);
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void entertextintodropdownNegativeValidation(){
		try{
			admincity.stateSelect();
			driver.findElement(By.xpath(cityDropDown_xpath)).sendKeys("fjdkfjkdjfkd");
			Assert.assertTrue(driver.findElement(By.xpath(cityDropDown_xpath)).isDisplayed(),"User able to write text into Dropdown Successfully");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	
	public void duplicateAreaValidation(String areanameExisting, String ExistingcityName){
		try{
			driver.findElement(By.xpath(nameField_xpath)).sendKeys(areanameExisting);
			admincity.stateSelect();
			selectOnlyCity(ExistingcityName);
			driver.findElement(By.xpath(save_button_xpath)).click();
			errorMesgValidationEnteringInvalidAreaName();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void areaClearCloseButtonClick(){
		try{
			driver.findElement(By.xpath(closeButton1_xpath)).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(closeButton1_xpath)).click();
			driver.findElement(By.xpath(noneDrop_xpath)).click();
			Thread.sleep(5000);
			Robot robot = new Robot();
			
//			Thread.sleep(5000);
			driver.findElement(By.xpath(closeButton1_xpath)).click();
//			driver.findElement(By.xpath(noneDrop_xpath)).click();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		}
		catch(Exception e){
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	
	public void selectCityWithState(){
		try{
			admincity.stateSelect();
			Thread.sleep(5000);
			Assert.assertTrue(driver.findElement(By.xpath(cityDropDown_xpath)).isDisplayed(),"City Dropdown is Not Displaying");
			driver.findElement(By.xpath(cityDropDown_xpath)).click();
			driver.findElement(By.xpath("//span[contains(text(),'VARANASI')]")).click();
		}catch(Exception e){
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void selectOnlyCity(String ExistingcityName){
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath(cityDropDown_xpath)).click();
			driver.findElement(By.xpath("//span[contains(text(),'"+ExistingcityName+"')]")).click();
		}catch(Exception e){
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	
	public void errorMesgValidationEnteringInvalidAreaName(){
		try{
			Thread.sleep(7000);
			System.out.println(driver.findElement(By.xpath(errorMsg_NameField_xpath)).getText());
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"Name Error Message is Not Displaying");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void errorMsgValidationArea(){
		try{
			admincity.ErrorMessageCityNameMorethan100();
			Assert.assertTrue(driver.findElement(By.xpath(citydropdownErrorMsg_xpath)).isDisplayed(),"City Dropdown Error Message is Not Displaying");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void areaAddUIValidation(){
		try{
		admincity.adminCityUIValidation();
		Assert.assertTrue(driver.findElement(By.xpath(stateDropdown_xpath)).isDisplayed(),"State Dropdown is Not Displaying");
	}catch(Exception e){
		System.out.println(e);
		Assert.fail("Fail due to exception "+e.getMessage());
	}
	}
	public void areaNameClear(){
		try{	
			driver.findElement(By.xpath(nameField_xpath)).clear();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	public void areaNameEnter(){
		try{	
			randomAreaNameGenerator();
			Thread.sleep(5000);
			String areaname = getPropertyData("AreaName");
			driver.findElement(By.xpath(nameField_xpath)).sendKeys(areaname);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public String randomAreaNameGenerator(){
		String randomArea="";
		try{	
			randomArea=randomName();
			String area = randomArea;
			storeData("AreaName", area);
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		return (randomArea);
	}
	public void adminAreaAddClick(){
		try{
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(addButton_xpath)).isDisplayed(),"Area Add Button is not displaying properly");
			driver.findElement(By.xpath(addButton_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void adminAreeaLinkClick(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(areaLink_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(areaLink_xpath)).isDisplayed(),"City Link is not displaying properly");
			driver.findElement(By.xpath(areaLink_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
}


