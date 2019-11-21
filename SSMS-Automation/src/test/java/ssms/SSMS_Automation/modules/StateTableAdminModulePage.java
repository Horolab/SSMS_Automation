package ssms.SSMS_Automation.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;

public class StateTableAdminModulePage extends Base {
	public final String isActiveSwitchCheckboxFirstRow_xpath="//mat-header-cell[contains(text(),'Active')]/following::div[1]";
	public final String restoreSwitchCheckbox_xpath="//mat-header-cell[contains(text(),'Res')]/following::div[6]";
	public final String editRecordFirstRow_xpath="(//mat-icon[contains(text(),'edit')])[1]";
	public final String deleteRecordFirstRow_xpath="(//mat-icon[contains(text(),'delete')])[1]";
	public final String ViewTimeLineFirstRecord_xpath="(//mat-icon[contains(text(),'schedule')])[1]";
	public final String deleteYes_xpath="//p[contains(text(),'Are you sure?')]/following::span[1]";

	public void stateTableIconsValidation(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(isActiveSwitchCheckboxFirstRow_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(isActiveSwitchCheckboxFirstRow_xpath)).isDisplayed(),"Is Active Switch Check Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(restoreSwitchCheckbox_xpath)).isDisplayed(),"Restore Switch Check Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(editRecordFirstRow_xpath)).isDisplayed(),"Edit icon is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).isDisplayed(),"Delete icon is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(ViewTimeLineFirstRecord_xpath)).isDisplayed(),"View TimeLine icon is Not Displaying");
			deleteNewlyCreatedState();
			
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void deleteNewlyCreatedState(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteRecordFirstRow_xpath)));
			driver.findElement(By.xpath(deleteRecordFirstRow_xpath)).click();
			driver.findElement(By.xpath(deleteYes_xpath)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteRecordFirstRow_xpath)));
			
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	}
