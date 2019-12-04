package ssms.SSMS_Automation.modules;

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
public class AdminCityModulePage extends Base {

	public final String cityLink_xpath="//span[contains(text(),'City')]";
	public final String addCityButton_xpath="//mat-icon[text()='add']";
	public final String searchButton_xpath="//mat-icon[text()='search']";
	public final String nameField_xpath="//input[@placeholder='Name']";
	public final String stateDropDown_xpath="//span[text()='Save']/preceding::mat-select";
	public final String saveCity_xpath="//span[text()='Save']";
	public final String cancelCity_xpath="//span[text()='Cancel']";
	public final String errorMsg_NameField_xpath="//input[@placeholder='Name']/following::mat-error[1]";
	public final String hintEnter_warningMsg_xpath="//mat-hint[contains(text(),'/100')]";
	public final String singleStateSelectionMesg_xpath="//span[text()='Save']/preceding::mat-hint[1]";
	public final String closeButton_xpath="//mat-icon[text()='close']";
	public final String cityFirstRow_xpath="(//mat-icon[text()='edit'])[1]";
	public final String searchCityTextBox_xpath="//input[@placeholder='Search']";
	public final String deleteYes_xpath="//p[contains(text(),'Are you sure?')]/following::span[1]";
	public final String deleteStateYesUndo_xpath="(//*[text()='Item Deleted.'])[2]/following::button[1]";
	/**************************************************Modular Methods****************************************************/




	/**
	 * @author uma.Sasmal
	 */
	
	AdminStateModulePage adminstatemodule = new AdminStateModulePage();
	
	public void viewTimeLinesFirstRecordAssertion(){
		try{
			Thread.sleep(7000);
				String noRecord = driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::tbody")).getText();
//				String timeago = driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::i[1]")).getText();
				Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Timelines')]/following::tbody")).isDisplayed(),"timeLine History message is Not Displaying");
			
			driver.navigate().refresh();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void deleteNoFuncNewCity(){
		try{
			adminstatemodule.deleteNoValidation();
			Thread.sleep(4000);
			String randomNameCity = getPropertyData("CityName");
			driver.findElement(By.xpath(searchCityTextBox_xpath)).clear();
			driver.findElement(By.xpath(searchCityTextBox_xpath)).sendKeys(randomNameCity);
			Thread.sleep(4000);
			
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	
	public void undoDeleteUIvalidationNewCity(){
		try{
			adminstatemodule.deleteParagraphValidation();
			driver.findElement(By.xpath(deleteYes_xpath)).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(deleteStateYesUndo_xpath)).click();
			Thread.sleep(4000);
			String randomNameCity = getPropertyData("CityName");
			driver.findElement(By.xpath(searchCityTextBox_xpath)).clear();
			driver.findElement(By.xpath(searchCityTextBox_xpath)).sendKeys(randomNameCity);
			Thread.sleep(4000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void deleteUIvalidationNewCity(){
		try{
			adminstatemodule.deleteParagraphValidation();
			driver.findElement(By.xpath(deleteYes_xpath)).click();
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void ErrorMessageCityNameMorethan100(){
		try{
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"City Name Error message is Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void citySearch(){
		try{
			Thread.sleep(3000);
			adminCitySearchButtonClick();
			Thread.sleep(5000);
//			String newvalue = randomCityGenerator();
			String randomNameCity = getPropertyData("CityName");

			driver.findElement(By.xpath(searchCityTextBox_xpath)).sendKeys(randomNameCity);

		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void editCityClickFirstRow(){
		try{
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath(cityFirstRow_xpath)).isDisplayed(),"Edit button is Not Displaying");
			driver.findElement(By.xpath(cityFirstRow_xpath)).click();
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void invalidCityAddErrorMessageGet(){
		try{
			Thread.sleep(3000);
			stateSelect();
			saveCityClick();
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"City Name Error message is Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void closeButtonClick(){
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath(closeButton_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(singleStateSelectionMesg_xpath)).isDisplayed(),"City Name Error message is Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void mandatoryFieldsWithoutDataSaveErrorMessageValidation(){
		try{
			Thread.sleep(3000);
			//driver.findElement(By.xpath(saveCity_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"City Name Error message is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Name']/following::mat-error[2]")).isDisplayed(),"State selection Error message is Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void duplicateCityEnteredUnderSameStateErrorMessageValidation(){
		try{
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"Duplicate City Name Error message is Not Displaying");
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void saveCityClick(){
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath(saveCity_xpath)).click();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void cancelCityClick(){
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath(cancelCity_xpath)).click();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void stateSelect(){
		try{
			Thread.sleep(8000);

			driver.findElement(By.xpath(stateDropDown_xpath)).click();
			driver.findElement(By.xpath("(//span[contains(text(),'UTTAR PRADESH')])[1]")).click();


			//			Select dropdown = new Select(driver.findElement(By.xpath(stateDropDown_xpath)));
			//			dropdown.selectByVisibleText(state);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void cityNameClear() {
		try {         
			driver.findElement(By.xpath(nameField_xpath)).clear();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void cityNameFieldValidation(){
		try {    
			Thread.sleep(3000);
			driver.findElement(By.xpath(singleStateSelectionMesg_xpath)).click();
			Assert.assertTrue(driver.findElement(By.xpath(errorMsg_NameField_xpath)).isDisplayed(),"City Name Error message is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(singleStateSelectionMesg_xpath)).isDisplayed(),"State Selection warning is Not Displaying");
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void cityNameEnter(String cityname) {
		try {         
			driver.findElement(By.xpath(nameField_xpath)).sendKeys(cityname);
			//			driver.findElement(By.xpath(hintEnter_warningMsg_xpath)).click();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

//	public String randomCityGenerator(){
//		String randomCity=null;
//		try{	
//			randomCity=randomString();
//			String randomNameCity = randomCity;
//			storeData("CityName", randomNameCity);
//			Thread.sleep(5000);
//		}
//		catch(Exception e){
//			System.out.println(e);
//			Assert.fail("Fail due to exception "+e.getMessage());
//		}
//		return (randomCity);
//	}
	public String randomCityGenerator(){
		String randomCity="";
		try{	
			randomCity=randomName();
			String randomNameCity = randomCity;
			storeData("CityName", randomNameCity);
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		return (randomCity);
	}
	
	public void randomCityNameEnter(){
		try{	
			Thread.sleep(5000);
			driver.findElement(By.xpath(nameField_xpath)).sendKeys(randomCityGenerator());
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
		
	}

	public void cityNameValidationAftrModification(){
		try { 
			Thread.sleep(8000);
			String newCity = driver.findElement(By.xpath("//button[text()='Name']/following::span[1]")).getText();
			String newConvertedCity = newCity.toLowerCase();
			String randomNameCity = getPropertyData("CityName");
			Assert.assertTrue(newConvertedCity.contains(randomNameCity),"Correct City Not Displaying");

		}catch(Exception e) {
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void adminCityUIValidation(){
		try{
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(nameField_xpath)).isDisplayed(),"Name Text Box is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(stateDropDown_xpath)).isDisplayed(),"State Dropdown is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(saveCity_xpath)).isDisplayed(),"Save Button is Not Displaying");
			Assert.assertTrue(driver.findElement(By.xpath(cancelCity_xpath)).isDisplayed(),"Cancel is Not Displaying");
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void adminCitySearchButtonClick(){
		try{
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(searchButton_xpath)).isDisplayed(),"City Search Button is not displaying properly");
			driver.findElement(By.xpath(searchButton_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}

	public void adminCityAddClick(){
		try{
			Thread.sleep(8000);
			Assert.assertTrue(driver.findElement(By.xpath(addCityButton_xpath)).isDisplayed(),"City Add Button is not displaying properly");
			driver.findElement(By.xpath(addCityButton_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}
	public void adminCityLinkClick(){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cityLink_xpath)));
			Assert.assertTrue(driver.findElement(By.xpath(cityLink_xpath)).isDisplayed(),"City Link is not displaying properly");
			driver.findElement(By.xpath(cityLink_xpath)).click();
		}
		catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail due to exception "+e.getMessage());
		}
	}


}


