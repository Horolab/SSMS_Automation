package ssms.SSMS_Automation.modules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;

import ssms.SSMS_Automation.Base;

public class ReceiveSearchModulePage extends Base{
	
	public final String receiveSearch_xpath="//mat-icon[contains(text(),'search')]";
	public final String name_xpath="//input[@placeholder='Name']";
	public final String mobile_xpath="//input[@placeholder='Mobile No']";
	public final String email_xpath="//input[@placeholder='Email']";
	public final String search_xpath="//span[contains(text(),'Search')]";
	
	public final String searchName_xpath="//span[text()='CBA']";
	
	public void clickReceiveSearch() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(receiveSearch_xpath)).click();
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void searchByName(String name) {
		try {
			driver.findElement(By.xpath(name_xpath)).sendKeys(name);
			driver.findElement(By.xpath(search_xpath)).click();
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"'"+ name+"'"+"]")).isDisplayed(),"Search Name is Not Displaying");
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void searchByMobile(String mobile) {
		try {
			driver.findElement(By.xpath(mobile_xpath)).sendKeys(mobile);
			driver.findElement(By.xpath(search_xpath)).click();
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"' "+ mobile+" '"+"]")).isDisplayed(),"Search Mobile No. is Not Displaying");
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void searchByEmail(String email) {
		try {
			driver.findElement(By.xpath(email_xpath)).sendKeys(email);
			driver.findElement(By.xpath(search_xpath)).click();
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"' "+ email+" '"+"]")).isDisplayed(),"Search Email is Not Displaying");
			
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void searchCustomer(String name, String mobile,String email) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(name_xpath)).clear();
			driver.findElement(By.xpath(name_xpath)).sendKeys(name);
			driver.findElement(By.xpath(mobile_xpath)).clear();
			driver.findElement(By.xpath(mobile_xpath)).sendKeys(mobile);
			driver.findElement(By.xpath(email_xpath)).clear();
			driver.findElement(By.xpath(email_xpath)).sendKeys(email);
			driver.findElement(By.xpath(search_xpath)).click();
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"'"+ name+"'"+"]")).isDisplayed(),"Search Name is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"'"+ mobile+"'"+"]")).isDisplayed(),"Search Mobile No is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()="+"'"+ email+"'"+"]")).isDisplayed(),"Search Email is Not Displaying");
			
			
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}
	
	public void searchByPartial(String name) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(name_xpath)).clear();
			driver.findElement(By.xpath(name_xpath)).sendKeys(name);
			driver.findElement(By.xpath(search_xpath)).click();
			Thread.sleep(3000);
			assertFalse(driver.getTitle().contains("404"));
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}

}
